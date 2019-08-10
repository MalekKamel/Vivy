package com.vivy.app.shared.paging

import androidx.paging.ItemKeyedDataSource

class AppItemKeyedDataSource<K, V>(private var keyCallback: (V) -> K) : ItemKeyedDataSource<K, V>() {
    private var loadInitialCallback: ((InitialParams<V>) -> Unit)? = null
    private var loadAfterCallback: ((AfterParams<K, V>) -> Unit)? = null
    private var initialLoadSize = 20

    internal fun initialLoadSize(size: Int): AppItemKeyedDataSource<K, V> {
        initialLoadSize = size
        return this
    }

    override fun getKey(item: V): K {
        return keyCallback(item)
    }

    override fun loadInitial(params: LoadInitialParams<K>, callback: LoadInitialCallback<V>) {
        if (!isInvalid && loadInitialCallback != null)
            loadInitialCallback!!(
                    InitialParams(initialLoadSize = initialLoadSize, callback = callback)
            )
    }

    override fun loadAfter(params: LoadParams<K>, callback: LoadCallback<V>) {
        if (!isInvalid && loadAfterCallback != null && params.key != null && params.key.toString() != "")
            loadAfterCallback!!(
                    AfterParams(callback = callback, params = params)
            )
    }

    override fun loadBefore(params: LoadParams<K>, callback: LoadCallback<V>) {

    }

    fun loadInitialCallback(loadInitialCallback: (InitialParams<V>) -> Unit): AppItemKeyedDataSource<K, V> {
        this.loadInitialCallback = loadInitialCallback
        return this
    }

    fun loadAfterCallback(loadAfterCallback: (AfterParams<K, V>) -> Unit): AppItemKeyedDataSource<K, V> {
        this.loadAfterCallback = loadAfterCallback
        return this
    }

    fun keyCallback(keyCallback: (V) -> K): AppItemKeyedDataSource<K, V> {
        this.keyCallback = keyCallback
        return this
    }


}
