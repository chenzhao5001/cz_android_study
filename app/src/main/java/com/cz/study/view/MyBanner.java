package com.cz.study.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

public class MyBanner extends ViewGroup {
    final String TAG = "MyBanner";
    int viewCount = 0;
    int viewWidth = 0;
    int viewHeight = 0;
    int tmpX = 0;

    public MyBanner(Context context) {
        super(context);
    }

    public MyBanner(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyBanner(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }




    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        viewCount = getChildCount();

        if (viewCount == 0) {
            setMeasuredDimension(0, 0);
        } else {
            measureChildren(widthMeasureSpec, heightMeasureSpec);
            Log.i(TAG, "widthMeasureSpec=" + widthMeasureSpec + " heightMeasureSpec=" + heightMeasureSpec);
            View view = getChildAt(0);
            viewWidth = view.getMeasuredWidth();
            viewHeight = view.getMeasuredHeight();
            setMeasuredDimension(viewWidth * viewCount, viewHeight);
        }

    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        if (changed) {
            int leftMargin = 0;
            for (int i = 0; i < viewCount; i++) {
                View view = getChildAt(i);
                view.layout(leftMargin, 0, leftMargin + viewWidth, viewHeight);
                leftMargin += viewWidth;
            }
        }
    }

    // return=true 处理拦截，false不处理拦截，继续向下传递该事件,真正处理的是onTouchEvent
    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
//        return super.onInterceptTouchEvent(ev);
        return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN: {
                Log.i(TAG, "onTouchEvent: 1");
                tmpX = (int) event.getX();
                break;
            }
            case MotionEvent.ACTION_MOVE: {
                Log.i(TAG, "onTouchEvent: 2");
                int moveX = (int) event.getX();
                int distance = moveX - tmpX;
                scrollBy(distance,0);
                break;
            }
            case MotionEvent.ACTION_UP: {
                Log.i(TAG, "onTouchEvent: 3");
                int scrollX = getScrollX();
                int index = (scrollX + viewWidth / 2) / viewWidth;
                if(index < 0) {
                    index = 0;
                } else if(index > viewCount -1) {
                    index = viewCount - 1;
                }
                scrollBy(index * viewWidth, 0);
                break;
            }
        }
        return true;
    }
}
