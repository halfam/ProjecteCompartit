package com.example.drawingwithandroid;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;

public class BallExampleView extends View {
    private Drawable mIcon;
    private float mPosx;
    private float mPosy;
    private float mLastTouchX;
    private float mLastTouchY;
    private float yDirection;
    private float xDirection;

    public BallExampleView(Context context) {
        super(context);
        mIcon = context.getDrawable(R.drawable.icon);
        mIcon.setBounds(0, 0, mIcon.getIntrinsicWidth(), mIcon.getIntrinsicHeight());
        xDirection = 15;
        yDirection = 15;
    }

    public void onDraw(Canvas canvas) {

        canvas.translate(mPosx, mPosy);
        mIcon.draw(canvas);

        motion();
    }

    public void motion() {
        mPosx += xDirection;
        mPosy += yDirection;
        if (mPosx > this.getWidth() || mPosx < 0)
            xDirection = -xDirection;
        if (mPosy > this.getHeight() || mPosy < 0)
            yDirection = -yDirection;
        invalidate();
    }

}
