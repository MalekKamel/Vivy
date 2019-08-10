package com.vivy.app.shared.data.model

data class SearchRequest (
        var search: String,
        var lat: Double,
        var lng: Double,
        var lastKey: String = ""
) {
    fun lastKey(lastKey: String): SearchRequest {
        this.lastKey = lastKey
        return this
    }
}