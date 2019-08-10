package com.vivy.app.shared.network.exception.handler.nonhttp

import com.vivy.app.R
import java.util.*

class NoSuchElementHandler : NonHttpExceptionHandler() {

    override fun supportedThrowables(): List<Class<*>> {
        return listOf<Class<*>>(NoSuchElementException::class.java)
    }

    override fun handle() {
        presenter.showMessageInFlashBar(R.string.no_data_entered_yet)
    }
}
