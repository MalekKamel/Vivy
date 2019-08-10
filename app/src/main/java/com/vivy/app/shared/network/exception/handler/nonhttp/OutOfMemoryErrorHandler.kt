package com.vivy.app.shared.network.exception.handler.nonhttp

import com.vivy.app.R

class OutOfMemoryErrorHandler : NonHttpExceptionHandler() {

    override fun supportedThrowables(): List<Class<*>> {
        return listOf<Class<*>>(OutOfMemoryError::class.java)
    }

    override fun handle() {
        presenter.showMessageInFlashBar(R.string.no_memory_free_up_space)

    }
}
