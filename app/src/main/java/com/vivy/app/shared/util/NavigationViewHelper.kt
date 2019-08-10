package com.vivy.app.shared.util

import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.Navigation
import com.google.android.material.navigation.NavigationView
import com.vivy.app.R
import com.vivy.app.shared.ui.dialog.confirmdialog.ConfirmDialog
import com.vivy.app.shared.ui.view.BaseView

class NavigationViewHelper(private val drawerLayout: DrawerLayout, private val view: BaseView?) {

    fun handleSelection():  NavigationView.OnNavigationItemSelectedListener {
        return NavigationView.OnNavigationItemSelectedListener {item ->
            drawerLayout.closeDrawer(GravityCompat.START)

            when (item.itemId) {

                R.id.ni_logout -> {
                    ConfirmDialog.newInstance(
                            view?.context()!!.getString(R.string.confirm_logout)
                    ) {
                        if (!it) return@newInstance

                        logout()

                    }.show(view.activity()!!)
                    true
                }

                else -> false
            }

        }

    }

    private fun logout() {
        view!!.baseViewModel()?.pref?.clear()
        Navigation.findNavController(view.fragment().view!!)
                .navigate(R.id.action_global_loginFrag)
    }

}