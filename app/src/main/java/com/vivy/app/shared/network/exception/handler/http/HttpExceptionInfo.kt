package com.vivy.app.shared.network.exception.handler.http

import com.vivy.app.shared.network.exception.ExceptionPresenter

data class HttpExceptionInfo (
        var throwable: Throwable,
        var presenter: ExceptionPresenter,
        var errorBody: String,
        var code: Int = 0
)
