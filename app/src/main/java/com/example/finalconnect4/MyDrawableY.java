package com.example.finalconnect4;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PixelFormat;
import android.graphics.drawable.Drawable;

public class MyDrawableY extends Drawable {
    private final Paint yel;

    public MyDrawableY() {

        yel = new Paint();
        yel.setColor(Color.YELLOW);
    }

    @Override
    public void draw(Canvas canvas) {
        int width= getBounds().width();
        int height = getBounds().height();
        float r = Math.min(width,height)/2;
        canvas.drawCircle(width/2,height/2,r,yel);
    }

    @Override
    public void setAlpha(int alpha) {

    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {

    }

    @Override
    public int getOpacity() {
        return PixelFormat.OPAQUE;
    }
}
