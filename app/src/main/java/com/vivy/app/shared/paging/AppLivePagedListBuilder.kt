package com.vivy.app.shared.paging

import androidx.lifecycle.LiveData
import androidx.paging.DataSource
import androidx.paging.LivePagedListBuilder
import androidx.paging.PagedList

class AppLivePagedListBuilder {

    private var pageSize = 10

    fun pageSize(pageSize: Int): AppLivePagedListBuilder {
        this.pageSize = pageSize
        return this
    }

    fun <T, R> build(factory: DataSource.Factory<T, R>): LiveData<PagedList<R>> {
        return LivePagedListBuilder(
                factory,
                PagedList.Config.Builder()
                        .setPageSize(pageSize)
                        .setEnablePlaceholders(false)
                        .build())
                .build()
    }


}
