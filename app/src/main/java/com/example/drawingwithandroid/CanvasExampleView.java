package com.example.drawingwithandroid;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;

public class CanvasExampleView extends View {
    private Drawable mIcon;
    private float mPosx;
    private float mPosy;
    private float mLastTouchX;
    private float mLastTouchY;

    public CanvasExampleView(Context context) {
        super(context);
        mIcon = context.getDrawable(R.drawable.icon);
        mIcon.setBounds(0, 0, mIcon.getIntrinsicWidth(), mIcon.getIntrinsicHeight());
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.translate(mPosx, mPosy);
        mIcon.draw(canvas);
    }

    public boolean onTouchEvent(MotionEvent ev) {
        final int action = ev.getAction();
        switch (action) {
            case MotionEvent.ACTION_DOWN:
                mLastTouchX = ev.getX();
                mLastTouchY = ev.getY();
                break;
            case MotionEvent.ACTION_MOVE:
                final float dx = ev.getX() - mLastTouchX;
                final float dy = ev.getY() - mLastTouchY;
                mLastTouchX = ev.getX();
                mLastTouchY = ev.getY();
                mPosx += dx;
                mPosy += dy;
                invalidate();
                break;
            case MotionEvent.ACTION_UP:
                mPosx = this.getWidth() / 2;
                mPosy = this.getHeight() / 2;
                invalidate();
                break;
        }
        return true;
    }
}
