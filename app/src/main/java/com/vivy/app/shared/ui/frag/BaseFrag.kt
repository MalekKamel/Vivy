package com.vivy.app.shared.ui.frag

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.trello.rxlifecycle2.RxLifecycle
import com.trello.rxlifecycle2.android.FragmentEvent
import com.vivy.app.R
import com.vivy.app.shared.ui.activity.BaseActivity
import com.vivy.app.shared.ui.view.BaseView
import com.vivy.app.shared.util.CrashlyticsUtil
import com.vivy.app.shared.vm.BaseViewModel
import io.reactivex.ObservableTransformer
import kotlinx.android.synthetic.main.include_recycler_view_refreshable.*

abstract class BaseFrag<VM: BaseViewModel> : Fragment(), BaseView {

    abstract val vm: VM

    abstract var layoutId: Int
    protected open fun setupUi() {}
    protected open fun doOnViewCreated() {}
    protected fun doOnResume() {}

    open var hasBackNavigation = false
    open var hasSwipeRefresh = false

    override fun navController(): NavController?  = Navigation.findNavController(view!!)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        try {
            vm.view = this

        } catch (e: Exception) {
            CrashlyticsUtil.logAndPrint(e)
        }

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(layoutId, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        try {
            setupUi()
            doOnViewCreated()
            setupSwipeRefresh()
            enableBackNavigation()
        } catch (e: Exception) {
            CrashlyticsUtil.logAndPrint(e)
        }

    }

    private fun setupSwipeRefresh() {
        if (hasSwipeRefresh) {
            if (swipeRefresh == null)
                throw IllegalStateException("The fragment implements `HasSwipeRefresh` but no SwipeRefreshLayout found")
            swipeRefresh.setOnRefreshListener { this.onSwipeRefresh() }
        }
        else {
            if (swipeRefresh == null) return
            swipeRefresh.isEnabled = false
        }
    }

    /**
     * Designed to be overridden in Fragments that implement [HasSwipeRefresh]
     */
    protected open fun onSwipeRefresh() {}


    override fun onResume() {
        super.onResume()
        try {
            doOnResume()
        } catch (e: Exception) {
            CrashlyticsUtil.logAndPrint(e)
        }
    }

    override fun activity(): BaseActivity<*>? {
        return activity as? BaseActivity<*>
    }

    override fun fragment(): BaseFrag<*> {
        return this
    }

    override fun baseViewModel(): BaseViewModel? {
        return vm
    }

    private fun enableBackNavigation() {
        if (!hasBackNavigation || view == null) return

        val backButton: View = view!!.findViewById(R.id.btnBack)
                ?: throw IllegalStateException("back button not found!")

        backButton.visibility = View.VISIBLE
        backButton.setOnClickListener { activity()?.onBackPressed() }
    }
}