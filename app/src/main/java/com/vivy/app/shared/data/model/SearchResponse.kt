package com.vivy.app.shared.data.model

data class SearchResponse (
        var doctors: List<Doctor>,
        var lastKey: String?
)