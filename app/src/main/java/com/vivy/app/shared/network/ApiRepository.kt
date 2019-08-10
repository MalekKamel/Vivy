package com.vivy.app.shared.network

import com.vivy.app.shared.data.model.LoginRequest
import com.vivy.app.shared.data.model.SearchRequest
import com.vivy.app.shared.data.model.SearchResponse
import com.vivy.app.shared.data.model.LoginResponse
import io.reactivex.Flowable


class ApiRepository(private val api: ApiInterface) {

    fun login(request: LoginRequest): Flowable<LoginResponse> {
       return api.login(userName = request.username, password = request.password)
    }

    fun searchDoctors(
            request: SearchRequest
    ): Flowable<SearchResponse> {
        return api.searchDoctors(
                search = request.search,
                lat = request.lat,
                lng = request.lng,
                lastKey = request.lastKey
        )
    }


}
