package com.vivy.app.shared.util

import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import com.vivy.app.R

/**
 * Created by Sha on 1/7/18.
 */

object DrawerLayoutUtil {

    fun setup(
            drawerLayout: DrawerLayout,
            navigationView: NavigationView,
            appCompatActivity: AppCompatActivity?,
            toolbar: Toolbar): ActionBarDrawerToggle {

        navigationView.itemIconTintList = null

        appCompatActivity?.setSupportActionBar(null)
        appCompatActivity?.setSupportActionBar(toolbar)
        appCompatActivity?.supportActionBar!!.setDisplayShowTitleEnabled(false)

        val toggle = ActionBarDrawerToggle(null,
                drawerLayout,
                toolbar,
                R.string.app_name,
                R.string.app_name)
        drawerLayout.addDrawerListener(toggle)

        toggle.syncState()
        return toggle
    }
}
