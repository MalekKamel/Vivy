package com.vivy.app.shared.network.exception.handler.http

import com.vivy.app.R
import java.util.*

class ServerErrorHandler : HttpExceptionHandler() {

    override fun supportedExceptions(): List<Int> {
        return Arrays.asList(500)
    }

    override fun handle() {
        presenter.showMessageInFlashBar(R.string.oops_something_went_wrong)
    }

}