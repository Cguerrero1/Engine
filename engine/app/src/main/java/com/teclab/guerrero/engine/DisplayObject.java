package com.teclab.guerrero.engine;

import android.graphics.Canvas;
import android.view.MotionEvent;

/**
 * Created by Heat on 01/11/2016.
 */
public class DisplayObject {

    public int x,y;
    public DisplayObject parent;
    public Resources resources;

    int heinght;
    float opacity;

    DisplayObject parent;

    int pivotX;
    int pivotY;

    int rotation;

    float scaleX;
    float scaleY;

    Transformations transformation;

    boolean visible;

    int width;

    public void dispathEvent (Even a)



    public DisplayObject(Resources resources){
        this.resources = resources;
    }

    public void onDraw(Canvas canvas){
        this.update();
    }

    public void update(){

    }

    public void onTouchEvent(MotionEvent event) {

    }
}
