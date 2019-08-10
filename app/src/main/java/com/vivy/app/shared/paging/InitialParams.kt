package com.vivy.app.shared.paging

import androidx.paging.ItemKeyedDataSource

data class InitialParams<V>(
        var initialLoadSize: Int = 0,
        var callback: ItemKeyedDataSource.LoadInitialCallback<V>
)
