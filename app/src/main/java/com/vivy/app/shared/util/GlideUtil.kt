package com.vivy.app.shared.util

import android.graphics.drawable.Drawable
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.target.Target
import com.vivy.app.shared.util.app.MyApp

object GlideUtil {

    fun load(url: String, imageView: ImageView) {
        Glide
                .with(MyApp.context)
                .load(url)
                .into(imageView)
    }

    fun load(url: String?, onResourceReady: ((Drawable) -> Unit)?) {
        if (url == null) return
        val builder = Glide
                .with(MyApp.context)
                .load(url)

        if (onResourceReady != null)
            builder.listener(object : RequestListener<Drawable> {
                override fun onLoadFailed(e: GlideException?, model: Any, target: Target<Drawable>, isFirstResource: Boolean): Boolean {
                    return false
                }

                override fun onResourceReady(resource: Drawable, model: Any, target: Target<Drawable>, dataSource: DataSource, isFirstResource: Boolean): Boolean {
                    ThreadUtil.runOnUiThread { onResourceReady(resource) }
                    return false
                }
            })

        builder.submit()
    }

}
