package com.zcb.levelbarapplication.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.zcb.levelbarapplication.R;

/**
 * ================================
 * 作   者:  zcb
 * 邮   箱:   zhang-cb@foxmail.com
 * 创建时间:    2017/5/17 18:18
 * 版   本: 1.0
 * 描   述:
 * =================================
 */

public class RecView extends View {
    public RecView(Context context) {
        super(context);
    }

    public RecView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public RecView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        // 创建画笔
        Paint p = new Paint();
        p.setColor(Color.RED);// 设置红色
        //画圆角矩形
        p.setStyle(Paint.Style.FILL);//充满
        p.setColor(getResources().getColor(R.color.jihao_start));
        p.setAntiAlias(true);// 设置画笔的锯齿效果
        canvas.drawText("画圆角矩形:", 10, 260, p);
        RectF oval3 = new RectF(80, 260, 200, 350);// 设置个新的长方形
        canvas.drawRoundRect(oval3, 20, 15, p);//第二个参数是x半径，第三个参数是y半径

        canvas.drawText("画三角形：", 10, 200, p);
        // 绘制这个三角形,你可以绘制任意多边形
        Path path = new Path();
        path.moveTo(80, 310);// 此点为多边形的起点
        path.lineTo(180, 310);
        path.lineTo(130, 360);
        path.close(); // 使这些点构成封闭的多边形
        canvas.drawPath(path, p);
    }
}
