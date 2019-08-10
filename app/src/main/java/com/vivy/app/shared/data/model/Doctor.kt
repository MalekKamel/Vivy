package com.vivy.app.shared.data.model

data class Doctor(
        val id: String,
        val name: String,
        val address: String,
        val photoId: String?,
        var lastKey: String?
)
