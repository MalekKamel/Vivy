package com.vivy.app.shared.network.exception.handler.nonhttp

import com.vivy.app.shared.network.exception.ExceptionPresenter

class NonHttpExceptionInfo {
    lateinit var throwable: Throwable
    lateinit var presenter: ExceptionPresenter

    fun setThrowable(throwable: Throwable): NonHttpExceptionInfo {
        this.throwable = throwable
        return this
    }

    fun setPresenter(presenter: ExceptionPresenter): NonHttpExceptionInfo {
        this.presenter = presenter
        return this
    }
}
