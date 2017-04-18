package com.teclab.guerrero.engine;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.view.MotionEvent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Heat on 01/11/2016.
 */
public class DisplayContainer extends DisplayObject {

    private List children;
    public int numChildren;

    public DisplayContainer() {
        children = new ArrayList();
        numChildren = 0;
    }

    @Override
    public void onDraw() {
        for (int i = 0; i < numChildren; i++)
            ((DisplayObject) children.get(i)).onDraw();
    }

    public int addChild(DisplayObject child) {
        children.add(child);
        child.parent = this;
        numChildren = children.size();
        return numChildren;
    }

    public int addChildAt(DisplayObject child, int index) {
        children.add(index, child);
        child.parent = this;
        numChildren = children.size();
        return numChildren;
    }

    public boolean contains(DisplayObject child) {
        return children.contains(child);
    }

    public DisplayObject getChildAt(int index) {
        return (DisplayObject) children.get(index);
    }

    public int getChildIndex(DisplayObject child) {
        return children.indexOf(child);
    }

    public void removeChild(DisplayObject child) {
        children.remove(child);
    }

    public void removeChild(DisplayObject child, boolean _dispose) {
        children.remove(child);
        if (_dispose)
            child.dispose();
    }

    public DisplayObject removeChildAt(int index) {
        return (DisplayObject) children.remove(index);
    }

    public void removeChildAt(int index, boolean _dispose) {
        if (_dispose)
            ((DisplayObject) children.get(index)).dispose();
        children.remove(index);
    }

    public void removeChildrens() {
        children.clear();
    }

    public void removeChildrens(boolean _dispose) {
        if (_dispose) {
            for (int i = 0; i < numChildren; i++)
                ((DisplayObject) children.get(i)).dispose();
        }
        children.clear();
    }

    public void removeChildrens(int begin, int end) {
        for (int i = end; i > begin; i--)
            children.remove(i);
    }

    public void removeChildrens(int begin, int end, boolean _dispose) {
        for (int i = end; i > begin; i--) {
            if (_dispose)
                ((DisplayObject) children.get(i)).dispose();

        }
    }


