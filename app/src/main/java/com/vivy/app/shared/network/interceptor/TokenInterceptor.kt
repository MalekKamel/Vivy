package com.vivy.app.shared.network.interceptor

import com.vivy.app.shared.util.SharedPref
import okhttp3.Interceptor
import okhttp3.Response
import java.io.IOException

class TokenInterceptor(val pref: SharedPref) : Interceptor {


    @Throws(IOException::class)
    override fun intercept(chain: Interceptor.Chain): Response {
        var request = chain.request()

        // It's a dirty way to do this but it's just a demo and not a production code!
        val isAuth = request.url().host().contains("auth.staging.vivy.com")

        val accessToken =
                if (!isAuth) "Bearer ${pref.token}"
                else "Basic aXBob25lOmlwaG9uZXdpbGxub3RiZXRoZXJlYW55bW9yZQ=="

        request = request.newBuilder()
                .addHeader("Authorization", accessToken)
                .build()

        println("accessToken = $accessToken")

        return chain.proceed(request)
    }
}
