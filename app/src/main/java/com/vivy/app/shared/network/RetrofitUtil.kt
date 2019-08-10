package com.vivy.app.shared.network

import com.google.gson.GsonBuilder
import com.vivy.app.shared.network.exception.HttpExceptionContract

/**
 * Created by Sha on 10/9/17.
 */

object RetrofitUtil {
    fun parseHttpExceptionModel(body: String): HttpExceptionContract {
        return GsonBuilder().create().fromJson(body, HttpExceptionContract::class.java)
    }


}
