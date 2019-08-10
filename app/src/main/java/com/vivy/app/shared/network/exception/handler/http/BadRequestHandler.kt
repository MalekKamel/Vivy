package com.vivy.app.shared.network.exception.handler.http

import java.util.*

/**
 * Created by Sha on 10/9/17.
 */

class BadRequestHandler : HttpExceptionHandler() {

    override fun supportedExceptions(): List<Int> {
        return Arrays.asList(400)
    }

    override fun handle() {
        val contract = info.contract()
        val sb = StringBuilder()

        if (contract.message != null)
            sb.append(contract.message).toString()

        presenter.showMessageInFlashBar(sb.toString())
    }

}
