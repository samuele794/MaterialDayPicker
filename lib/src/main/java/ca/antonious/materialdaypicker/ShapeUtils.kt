package ca.antonious.materialdaypicker

import android.content.Context
import android.graphics.drawable.GradientDrawable
import android.graphics.drawable.GradientDrawable.OVAL
import androidx.annotation.ColorRes
import androidx.core.content.ContextCompat

object ShapeUtils {
    internal fun getOvalShape(context: Context, @ColorRes colorRes: Int): GradientDrawable {

        return GradientDrawable().apply {
            shape = OVAL
            context.resources.getDimensionPixelSize(R.dimen.background_circle_dim).let {
                setSize(it, it)
            }
            setColor(ContextCompat.getColor(context, colorRes))
        }
    }
}