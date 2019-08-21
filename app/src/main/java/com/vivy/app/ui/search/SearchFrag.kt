package com.vivy.app.ui.search

import androidx.lifecycle.Observer
import com.jakewharton.rxbinding2.widget.RxTextView
import com.sha.kamel.rxlocation.RxLocation
import com.vivy.app.R
import com.vivy.app.shared.data.model.SearchRequest
import com.vivy.app.shared.rx.disposeBy
import com.vivy.app.shared.ui.frag.BaseFrag
import com.vivy.app.ui.search.adapter.DoctorsAdapter
import io.reactivex.android.schedulers.AndroidSchedulers
import kotlinx.android.synthetic.main.frag_search.*
import kotlinx.android.synthetic.main.include__nav_view.*
import kotlinx.android.synthetic.main.include_recycler_view_refreshable.*
import org.koin.android.viewmodel.ext.android.viewModel
import java.util.concurrent.TimeUnit
import android.location.Location
import com.vivy.app.shared.util.*


class SearchFrag : BaseFrag<SearchVm>() {

    override val vm: SearchVm by viewModel()
    override var layoutId: Int = R.layout.frag_search

    lateinit var adapter: DoctorsAdapter
    private var currentLocation: Location? = null

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
                .filter {
                    val hasLocation = currentLocation != null
                    if (!hasLocation) {
                        getCurrentLocation()
                    }
                    hasLocation
                }
                .debounce(200, TimeUnit.MILLISECONDS)
                .map { it.toString() }
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(AndroidSchedulers.mainThread())
                .subscribe { searchDoctors()  }
                .disposeBy(vm.disposables)

    }

    private fun searchDoctors() {
        val search = etSearch.textString()
        if (!vm.isValidSearchString(search)) return

        val request = SearchRequest(
                search = search,
                lat = currentLocation!!.latitude,
                lng = currentLocation!!.longitude
        )

        vm.searchDoctors(request)
                .observe(
                        this,
                        Observer{ list ->
                            rv.adapter = adapter
                            adapter.submitList(list)
                        })
    }

    private fun getCurrentLocation() {
        RxLocation()
                .retrieveCurrentLocation(activity)
                .subscribe { location ->
                    currentLocation = location
                    searchDoctors()
                }.disposeBy(vm.disposables)
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
