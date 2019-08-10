package com.vivy.app.shared.custom

import android.graphics.Typeface
import android.util.Log
import android.util.SparseArray
import androidx.core.content.res.ResourcesCompat
import com.vivy.app.R
import com.vivy.app.shared.util.app.MyApp


object FontCache {

    private val fontCache = SparseArray<Typeface>()

    interface Font {
        companion object {
            val DEFAULT = R.font.droid_sans_arabic
        }
    }

    fun defaultTypeface(): Typeface? {
        return typeface(Font.DEFAULT)
    }

    fun typeface(fontRes: Int): Typeface? {
        var typeface = fontCache[fontRes]

        if (typeface == null) {
            try {
                typeface = ResourcesCompat.getFont(MyApp.context, R.font.droid_sans_arabic)
            } catch (e: Exception) {
                Log.e("font", "not applied")
                return null
            }

            fontCache.setValueAt(fontRes, typeface!!)
        }
        return typeface
    }

}