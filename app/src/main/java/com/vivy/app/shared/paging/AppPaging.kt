package com.vivy.app.shared.paging

import androidx.lifecycle.LiveData
import androidx.paging.PagedList

data class AppPaging<K, V>(
        var pageSize: Int = 10,
        var appPageKeyedDataSource: AppItemKeyedDataSource<K, V>
) {

    fun dataSource(appPageKeyedDataSource: AppItemKeyedDataSource<K, V>): AppPaging<K, V> {
        this.appPageKeyedDataSource = appPageKeyedDataSource.initialLoadSize(pageSize)
        return this
    }

    fun build(): LiveData<PagedList<V>> {
        return AppLivePagedListBuilder()
                .pageSize(pageSize)
                .build(AppKeyedDataSourceFactory(appPageKeyedDataSource))
    }

}
