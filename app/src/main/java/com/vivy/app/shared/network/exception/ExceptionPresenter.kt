package com.vivy.app.shared.network.exception

import androidx.annotation.StringRes
import com.vivy.app.shared.data.model.StatusItem
import com.vivy.app.shared.network.RequestInfo
import com.vivy.app.shared.ui.view.BaseView
import com.vivy.app.shared.util.app.MyApp

/**
 * Created by Sha on 10/9/17.
 */

class ExceptionPresenter(var requestInfo: RequestInfo) {
    lateinit var view: BaseView
    lateinit var showMessageInFlashBar: (StatusItem) -> Unit

    val retryCallback: () -> Unit
        get() = requestInfo.retryCallback

    fun setView(view: BaseView): ExceptionPresenter {
        this.view = view
        return this
    }

    fun showMessageInFlashBar(id: Int, message: String) {
        showMessageInFlashBar(StatusItem(id, message))
    }

    fun setShowMessageInFlashBar(showMessageInFlashBar: (StatusItem) -> Unit): ExceptionPresenter {
        this.showMessageInFlashBar = showMessageInFlashBar
        return this
    }

    fun showMessageInFlashBar(@StringRes message: Int) {
        showMessageInFlashBar(MyApp.context.getString(message))
    }

    fun showMessageInFlashBar(message: String) {
        showMessageInFlashBar(StatusItem.ERROR, message)
    }
}
