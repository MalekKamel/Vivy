package com.vivy.app.shared.network.exception.handler.http

import com.vivy.app.shared.network.RetrofitUtil
import com.vivy.app.shared.network.exception.ExceptionPresenter
import com.vivy.app.shared.network.exception.HttpExceptionContract

data class HttpExceptionInfo (
        var throwable: Throwable,
        var presenter: ExceptionPresenter,
        var errorBody: String,
        var code: Int = 0
){
    fun contract(): HttpExceptionContract {
        return RetrofitUtil.parseHttpExceptionModel(errorBody)
    }
}
