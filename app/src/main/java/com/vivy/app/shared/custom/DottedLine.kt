package com.vivy.app.shared.custom

import android.annotation.TargetApi
import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Path
import android.graphics.PathDashPathEffect
import android.os.Build
import android.util.AttributeSet
import android.view.View
import androidx.core.content.ContextCompat
import com.vivy.app.R

/**
 * Created by Sha on 9/20/17.
 */

class DottedLine : View {

    private var mPaint: Paint? = null

    constructor(context: Context) : super(context) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        init()
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int, defStyleRes: Int) : super(context, attrs, defStyleAttr, defStyleRes) {
        init()
    }

    private fun init() {
        val res = resources
        mPaint = Paint()

        mPaint!!.color = ContextCompat.getColor(context, R.color.semi_black)
        val size = res.getDimensionPixelSize(R.dimen.divider_size_vert)
        val gap = res.getDimensionPixelSize(R.dimen.divider_gap_vert)
        mPaint!!.style = Paint.Style.FILL

        // To get actually round dots, we define a circle...
        val path = Path()
        path.addCircle(0f, 0f, size.toFloat(), Path.Direction.CW)
        // ...and use the path with the circle as our path effect
        mPaint!!.pathEffect = PathDashPathEffect(path, gap.toFloat(), 0f, PathDashPathEffect.Style.ROTATE)

        // If we don't render in software mode, the dotted line becomes a solid line.
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
            setLayerType(View.LAYER_TYPE_SOFTWARE, null)
        }
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        canvas.drawLine((width / 2).toFloat(), 0f, (width / 2).toFloat(), height.toFloat(), mPaint!!)
    }
}