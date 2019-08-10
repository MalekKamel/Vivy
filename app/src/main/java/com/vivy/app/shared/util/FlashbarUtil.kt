package com.vivy.app.shared.util

import android.app.Activity

import androidx.annotation.ColorRes

import com.andrognito.flashbar.Flashbar
import com.vivy.app.R

object FlashbarUtil {

    fun show(
            message: String,
            @ColorRes color: Int,
            activity: Activity
    ) {
        try {
            Flashbar.Builder(activity)
                    .message(message)
                    .gravity(Flashbar.Gravity.TOP)
                    .duration(6000)
                    .messageAppearance(R.style.TextStyleFlashBar)
                    .backgroundColorRes(color)
                    .dismissOnTapOutside()
                    .enableSwipeToDismiss()
                    .build()
                    .show()
        } catch (e: Exception) {
            e.printStackTrace()
            CrashlyticsUtil.log(e)
        }

    }
}
