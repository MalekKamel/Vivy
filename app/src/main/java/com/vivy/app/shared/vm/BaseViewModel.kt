package com.vivy.app.shared.vm

import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.ViewModel
import com.vivy.app.shared.data.DataManager
import com.vivy.app.shared.data.model.LoginRequest
import com.vivy.app.shared.data.model.LoginResponse
import com.vivy.app.shared.network.ApiRepository
import com.vivy.app.shared.network.RequestInfo
import com.vivy.app.shared.network.exception.ExceptionPresenter
import com.vivy.app.shared.network.exception.RxExceptionInterceptor
import com.vivy.app.shared.rx.FlowableUtil
import com.vivy.app.shared.rx.addSchedulers
import com.vivy.app.shared.rx.disposeBy
import com.vivy.app.shared.ui.view.BaseView
import com.vivy.app.shared.util.SharedPref
import com.vivy.app.shared.util.app.MyApp
import io.reactivex.Flowable
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.processors.PublishProcessor

open class BaseViewModel(dm: DataManager)
    : ViewModel() {

    lateinit var view: BaseView
    var pref: SharedPref = dm.pref
    var api: ApiRepository = dm.api

    val disposables: CompositeDisposable = CompositeDisposable()

    protected fun activity(): FragmentActivity? {
        return view.activity()
    }

    protected fun fragment(): Fragment? {
        return view.fragment()
    }

    protected fun getString(@StringRes res: Int): String {
        return MyApp.context.getString(res)
    }

    override fun onCleared() {
        disposables.dispose()
        super.onCleared()
    }

    fun loading(isLoading: Boolean) {
        if (isLoading) {
            view.showLoadingDialog()
            return
        }
        view.hideLoading()
    }

    fun <T> request(requestInfo: RequestInfo? = null, request: Request<T>): Flowable<T> {
        if (requestInfo?.showLoading != false)
            loading(true)

        val ps = PublishProcessor.create<T>()
        try {
            return ps
        } finally {
            doRequest(requestInfo, request, ps)
        }
    }

    private fun <T> doRequest(
            requestInfo: RequestInfo?,
            request: Request<T>,
            ps: PublishProcessor<T>
    ) {
        val info = requestInfo?.setRetryCallback { doRequest(requestInfo, request, ps) }
                ?: RequestInfo(
                        retryCallback = { doRequest(requestInfo, request, ps) }
                )

        Flowable.fromPublisher(request.invoke())
                .addSchedulers()
                .compose(FlowableUtil.handleException(rxError(
                        info.setRetryCallback { doRequest(info, request, ps) }
                )))
                .subscribe { response ->
                    loading(false)
                    ps.onNext(response)
                    ps.onComplete()
                }.disposeBy(disposables)
    }

    fun rxError(retryCallback: () -> Unit): RxExceptionInterceptor {
        return rxError(RequestInfo(
                retryCallback = retryCallback
        ))
    }

    private fun rxError(info: RequestInfo): RxExceptionInterceptor {
        val presenter = ExceptionPresenter(info)
                .setView(view)
                .setShowMessageInFlashBar {
                    loading(false)
                    view.showMessageInFlashBar(it)
                }
        return RxExceptionInterceptor(presenter)
    }

    fun login(request: LoginRequest, callback: (LoginResponse) -> Unit) {
        request {
            api.login(request = request)
        }.subscribe {
            pref.token = it.accessToken
            pref.refreshToken = it.refreshToken
            callback(it)
        }.disposeBy(disposables)
    }

}

typealias Request<T> = () -> Flowable<T>