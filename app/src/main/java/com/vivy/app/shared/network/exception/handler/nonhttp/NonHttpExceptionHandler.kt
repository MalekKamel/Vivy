package com.vivy.app.shared.network.exception.handler.nonhttp

import com.annimon.stream.Stream
import com.vivy.app.shared.network.exception.ExceptionPresenter
import com.vivy.app.shared.ui.view.BaseView

/**
 * Created by Sha on 10/9/17.
 */

abstract class NonHttpExceptionHandler {

    private lateinit var info: NonHttpExceptionInfo
    protected lateinit var view: BaseView
    protected lateinit var throwable: Throwable
    protected lateinit var presenter: ExceptionPresenter

    protected abstract fun supportedThrowables(): List<Class<*>>

    protected abstract fun handle()

    fun handle(info: NonHttpExceptionInfo) {
        this.info = info
        this.throwable = info.throwable
        this.view = info.presenter.view
        this.presenter = info.presenter
        handle()
    }

    fun canHandle(throwable: Throwable): Boolean {
        val optThrowable = Stream.of(supportedThrowables())
                .filter { t -> t.isAssignableFrom(throwable.javaClass) }
                .findFirst()

        return optThrowable.isPresent
    }


}
