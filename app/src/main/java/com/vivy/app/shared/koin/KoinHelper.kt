package com.vivy.app.shared.koin

import android.content.Context
import com.vivy.app.ui.auth.login.loginModule
import com.vivy.app.ui.search.searchModule
import com.vivy.app.ui.navhost.navHostModule
import com.vivy.app.ui.splash.splashModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class KoinHelper {
    companion object {
        fun start(context: Context){
            // start Koin!
            startKoin {
                // Android context
                androidContext(context)
                // modules
                modules(listOf(
                        appModule,
                        splashModule,
                        searchModule,
                        loginModule,
                        navHostModule
                ))
            }
        }
    }
}