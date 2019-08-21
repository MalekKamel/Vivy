package com.vivy.app.shared.util.app

import android.annotation.SuppressLint
import android.content.Context
import androidx.annotation.StringRes
import androidx.multidex.MultiDexApplication
import com.crashlytics.android.Crashlytics
import com.sha.kamel.navigator.NavigatorOptions
import com.vivy.app.R
import com.vivy.app.shared.koin.KoinHelper
import com.vivy.app.shared.util.CrashlyticsUtil
import io.fabric.sdk.android.Fabric

/**
 * Created by Sha on 13/04/17.
 */

class MyApp : MultiDexApplication() {

    override fun onCreate() {
        super.onCreate()
        try {

            context = applicationContext

            KoinHelper.start(this)

            NavigatorOptions.instance().frameLayoutId = R.id.mainFrame

        } catch (e: Exception) {
            CrashlyticsUtil.logAndPrint(e)
        }

    }

    companion object {

        @SuppressLint("StaticFieldLeak")
        public lateinit var context: Context

        @JvmStatic
        fun string(@StringRes res: Int): String {
            return context.getString(res)
        }

    }
}
