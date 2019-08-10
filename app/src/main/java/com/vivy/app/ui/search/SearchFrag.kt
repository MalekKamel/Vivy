package com.vivy.app.ui.search

import androidx.lifecycle.Observer
import com.jakewharton.rxbinding2.widget.RxTextView
import com.vivy.app.R
import com.vivy.app.shared.data.model.SearchRequest
import com.vivy.app.shared.rx.disposeBy
import com.vivy.app.shared.ui.frag.BaseFrag
import com.vivy.app.shared.util.DrawerLayoutUtil
import com.vivy.app.shared.util.NavigationViewHelper
import com.vivy.app.shared.util.ThreadUtil
import com.vivy.app.shared.util.linearLayoutManager
import com.vivy.app.ui.search.adapter.DoctorsAdapter
import io.reactivex.android.schedulers.AndroidSchedulers
import kotlinx.android.synthetic.main.frag_search.*
import kotlinx.android.synthetic.main.include__nav_view.*
import kotlinx.android.synthetic.main.include_recycler_view_refreshable.*
import org.koin.android.viewmodel.ext.android.viewModel
import java.util.concurrent.TimeUnit


class SearchFrag : BaseFrag<SearchVm>() {

    override val vm: SearchVm by viewModel()
    override var layoutId: Int = R.layout.frag_search

    lateinit var adapter: DoctorsAdapter

    override fun setupUi() {
        super.setupUi()
        rv.linearLayoutManager(context)
        setupAdapter()
        setupSearch()
        setupDrawerLayout()
    }

    private fun setupAdapter() {
        adapter = DoctorsAdapter(this)
    }

    private fun setupSearch() {

        RxTextView.textChanges(etSearch)
                .debounce(200, TimeUnit.MILLISECONDS)
//                .filter { it.isNotEmpty() }
                .map { it.toString() }
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(AndroidSchedulers.mainThread())
                .subscribe { searchDoctors(it)  }
                .disposeBy(vm.disposables)

    }

    private fun searchDoctors(search: String) {
        val request = SearchRequest(
                search = search,
                lat = 52.534709,
                lng = 13.3976972
        )

        vm.searchDoctors(request)
                .observe(
                        this,
                        Observer{ list ->
                            rv.adapter = adapter
                            adapter.submitList(list)
                        })
    }

    private fun setupDrawerLayout() {
        navigationView.setNavigationItemSelectedListener(
                NavigationViewHelper(drawerLayout, this).handleSelection()
        )
        setupToolbarAndDrawerToggle()
    }

    private fun setupToolbarAndDrawerToggle() {
        DrawerLayoutUtil.setup(
                drawerLayout,
                navigationView,
                activity(),
                view!!.findViewById(R.id.toolbar))
    }

    override fun showLoadingDialog() {
        ThreadUtil.runOnUiThread { swipeRefresh.isRefreshing = true }
    }

    override fun hideLoading() {
        ThreadUtil.runOnUiThread { swipeRefresh.isRefreshing = false }
    }


}
