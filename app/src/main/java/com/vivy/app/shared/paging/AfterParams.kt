package com.vivy.app.shared.paging

import androidx.paging.ItemKeyedDataSource

data class AfterParams<K, V>(
        var callback: ItemKeyedDataSource.LoadCallback<V>,
        var params: ItemKeyedDataSource.LoadParams<K>
)