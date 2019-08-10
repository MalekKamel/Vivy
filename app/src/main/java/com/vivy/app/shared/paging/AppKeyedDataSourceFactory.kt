package com.vivy.app.shared.paging

import androidx.paging.DataSource

class AppKeyedDataSourceFactory<K, V>(private val dataSource: DataSource<K, V>) : DataSource.Factory<K, V>() {

    override fun create(): DataSource<K, V> {
        return dataSource
    }

}
