package com.vivy.app.ui.search

import androidx.lifecycle.LiveData
import androidx.paging.PagedList
import com.annimon.stream.Stream
import com.vivy.app.shared.data.DataManager
import com.vivy.app.shared.data.model.Doctor
import com.vivy.app.shared.data.model.SearchRequest
import com.vivy.app.shared.paging.AppItemKeyedDataSource
import com.vivy.app.shared.paging.AppPaging
import com.vivy.app.shared.rx.FlowableUtil
import com.vivy.app.shared.rx.disposeBy
import com.vivy.app.shared.vm.BaseViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module
import java.util.*

val searchModule = module {
    viewModel { SearchVm(get()) }
}

class SearchVm(dataManager: DataManager) : BaseViewModel(dataManager) {

    fun isValidSearchString(query: String): Boolean {
        return query.isNotEmpty()
    }

    fun searchDoctors(request: SearchRequest): LiveData<PagedList<Doctor>> {
        val dataSource = AppItemKeyedDataSource<String, Doctor> {  it.lastKey ?: "" }
                .loadInitialCallback { params ->
                    loadDoctors(request) { params.callback.onResult(it) }
                }
                .loadAfterCallback { params ->
                    loadDoctors(request.lastKey(params.params.key)
                    ) { params.callback.onResult(it) }
                }
        return AppPaging(appPageKeyedDataSource = dataSource)
                .dataSource(dataSource)
                .build()
    }

    private fun loadDoctors(request: SearchRequest, callback: (List<Doctor>) -> Unit) {
        loading(true)

        api.searchDoctors(request)
                .compose(FlowableUtil.handleException(rxError { loadDoctors(request, callback) }))
                .subscribe { response ->

                    if (response.doctors.isNullOrEmpty()) {
                        callback.invoke(ArrayList())
                        loading(false)
                        return@subscribe
                    }

                    Stream.of(response.doctors).forEach { item -> item.lastKey = response.lastKey }
                    callback(response.doctors)
                    loading(false)
                }.disposeBy(disposables)

    }

}

