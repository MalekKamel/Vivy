package com.vivy.app.shared.network.exception.handler.http

import com.vivy.app.shared.data.model.LoginRequest

/**
 * Created by Sha on 10/9/17.
 */

class TokenExpiredHandler : HttpExceptionHandler() {

    override fun supportedExceptions(): List<Int> {
        return listOf(401)
    }

    override fun handle() {

        // Weird!
        // In a production code, this can't be implemented this way at all!
        // We must have a refresh token API that accepts a refresh token and returns the
        // valid access token
        val request = LoginRequest(
                username = "androidChallenge@vivy.com",
                password = "88888888"
        )
            view.baseViewModel()!!
                    .login(request) {
                       //  retry the current request
                        presenter.retryCallback()
                    }
    }

}
