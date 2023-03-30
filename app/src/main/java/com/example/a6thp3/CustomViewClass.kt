package com.example.a6thp3

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View

class CustomViewClass(context: Context?, attrs: AttributeSet?) : View(context, attrs) {
        val paint= Paint(Paint.ANTI_ALIAS_FLAG)
        var circleColor= Color.YELLOW
        var borderColor= Color.BLACK
        var borderSize= 5.0f
        var size=320
    private var eyeColor= Color.BLACK
    private var mouthColor= Color.BLACK
    private var mouthPath= Path()



        override fun onDraw(canvas: Canvas?) {
            super.onDraw(canvas)
            drawCircle(canvas)
            drawEyes(canvas)
            drawMouth(canvas)
        }
        fun drawCircle(c: Canvas?)
        {
            paint.color=circleColor
            val radius= size/2f
            c?.drawCircle(size/2f,size/2f,radius,paint)
            paint.color=borderColor
            paint.style= Paint.Style.STROKE
            paint.strokeWidth= borderSize
            c?.drawCircle(size/2f,size/2f,radius-borderSize/2f,paint)

        }

    fun drawEyes(canvas: Canvas?) {
        paint.color= eyeColor
        paint.style= Paint.Style.FILL
        val left= RectF(size*0.30f, size*0.23f, size*0.43f,size*0.50f)
        canvas?.drawOval(left,paint)
        val right= RectF(size*0.55f, size*0.23f, size*0.68f,size*0.50f)
        canvas?.drawOval(right,paint)
    }

//    happy face
    fun drawMouth(canvas: Canvas?) {
        mouthPath.moveTo(size*0.22f,size*0.7f)
        mouthPath.quadTo(size*0.50f,size*0.80f,size*0.78f,size*0.70f)
        mouthPath.quadTo(size*0.50f,size*0.90f,size*0.22f,size*0.70f)
        paint.color=mouthColor
        paint.style=Paint.Style.FILL
        canvas?.drawPath(mouthPath,paint)
    }

    //sad face
//    fun drawMouth(canvas: Canvas?) {
//        mouthPath.moveTo(size*0.22f,size*0.7f)
//        mouthPath.quadTo(size*0.50f,size*0.53f,size*0.78f,size*0.70f)
//        mouthPath.quadTo(size*0.50f,size*0.60f,size*0.22f,size*0.70f)
//        paint.color=mouthColor
//        paint.style=Paint.Style.FILL
//        canvas?.drawPath(mouthPath,paint)
//    }
}
