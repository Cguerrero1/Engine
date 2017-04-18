package com.teclab.guerrero.engine;

import android.app.usage.UsageEvents;
import android.graphics.Canvas;
import android.graphics.Point;
import android.util.EventLog;
import android.view.MotionEvent;
import android.view.animation.Transformation;

/**
 * Created by Heat on 01/11/2016.
 */
public class DisplayObject {

    {
        x=y=0
    scaleX=scaleY=1.0F;
    rotation =0;
    pivotX= pivotY=0;
    opacity=1.0F;
    witdh=height=0;
    visible=true;
    parent=null;
    //transformation=new Transdormations(this);
    }




    public int x,y;
    public DisplayObject parent;
    public Resources resources;
    public int height;
    public float opacity;
    public int pivotX;
    public int pivotY;
    public int rotation;
    public float scaleX;
    public float scaleY;
    public Transformation transformation;
    public boolean visible;
    public int width;

    public void dispatchEvent(UsageEvents.Event e){}
    public void dispatchEvent(String type){}
    public void dispose(){}
    /*
    public Point globalToLocal(Point p){}
    public Point localToGlobal(Point p){}
    public abstract void onDraw(){}
    */
    public void primaryOperations(){}
    public void touchDown(Point p, int index){}
    public void touchMove(Point p, int index){}
    public void touchUp(Point p, int index){}

    public DisplayObject(Resources resources){
        this.resources = resources;
    }

    public void onDraw(){
        this.update();
    }

    public void update(){}

    public void onTouchEvent(MotionEvent event) {

    }
}
