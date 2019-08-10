package com.vivy.app.shared.network

import com.vivy.app.shared.data.model.SearchResponse
import com.vivy.app.shared.data.model.LoginResponse
import io.reactivex.Flowable
import retrofit2.http.*


/**
 * Created by @TallShahawi on 12/25/17
 */

interface ApiInterface {

    @FormUrlEncoded
    @POST
    fun login(
            @Url url: String = "https://auth.staging.vivy.com/oauth/token",
            @Field("username") userName: String,
            @Field("password") password: String,
            @Query("grant_type") grant: String = "password"
    ): Flowable<LoginResponse>

    @GET("users/me/doctors")
    fun searchForDoctor(
            @Query("search") search: String,
            @Query("lat") lat: Double,
            @Query("lng") lng: Double,
            @Query("lastKey") lastKey: String?
    ): Flowable<SearchResponse>

}