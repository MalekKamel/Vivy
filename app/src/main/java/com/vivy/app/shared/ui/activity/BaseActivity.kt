package com.vivy.app.shared.ui.activity

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import com.vivy.app.shared.ui.view.BaseView
import com.vivy.app.shared.util.CrashlyticsUtil
import com.vivy.app.shared.util.SharedPref
import com.vivy.app.shared.vm.BaseViewModel

abstract class BaseActivity<VM : BaseViewModel>
    : AppCompatActivity(), BaseView {

    var vm: VM? = null

    override fun navController(): NavController? = null

    lateinit var pref: SharedPref

    abstract var layoutId: Int

    protected open fun bindUi() {}
    protected open fun doOnCreate() {}
    protected open fun doOnCreate(savedInstanceState: Bundle?) {}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        try {
            vm?.view = this

            if (layoutId != 0)
                setContentView(layoutId)

            bindUi()
            doOnCreate()
            doOnCreate(savedInstanceState)

        } catch (e: Exception) {
            CrashlyticsUtil.logAndPrint(e)
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        try {

        } catch (e: Exception) {
            CrashlyticsUtil.logAndPrint(e)
        }

    }

    override fun context(): Context {
        return this
    }

    override fun activity(): BaseActivity<*> {
        return this
    }

    override fun baseViewModel(): BaseViewModel? {
        return vm
    }

}
