package com.vivy.app.shared.data.model

import com.google.gson.annotations.SerializedName

data class LoginResponse(
        @SerializedName("access_token")
        var accessToken: String,
        @SerializedName("refresh_token")
        var refreshToken: String
)