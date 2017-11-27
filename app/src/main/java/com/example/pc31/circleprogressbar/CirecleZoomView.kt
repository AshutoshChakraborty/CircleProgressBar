package com.example.pc31.circleprogressbar

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View
import android.view.Window

/**
 * Created by pc31 on 27-11-2017.
 */
class CirecleZoomView(context: Context?) : View(context) {
    var paint:Paint?= null
    var height:Float?=null
    var width:Float?=null
    var radius: Float= 0.0f
    val maxRadius:Float=40.0f
    var iszoomin:Boolean=true


    override fun onDraw(canvas: Canvas?) {
        paint = Paint()
        paint!!.color = Color.BLUE
        height = resources.displayMetrics.heightPixels.toFloat()
        width = resources.displayMetrics.widthPixels.toFloat()
        if (iszoomin){
            radius++
            canvas?.drawCircle(width!!/2, height!!/2, radius, paint)
            invalidate()
            if (radius.equals(maxRadius)) {
                iszoomin = false

            }
        }else{
            canvas?.drawCircle(width!!/2, height!!/2, radius, paint)
            radius--
            invalidate()
            if (radius == 0.0f) {
                iszoomin = true

            }
        }







        super.onDraw(canvas)

    }
}