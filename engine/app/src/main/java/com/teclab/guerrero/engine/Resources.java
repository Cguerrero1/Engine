package com.teclab.guerrero.engine;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.util.HashMap;

/**
 * Created by Heat on 02/11/2016.
 */
public class Resources {

 public HasMap texturePool;
    public SoundManager sounds;
    public Context mContext;
    public  int fps;
    public Canvas canvas;
    public PointF aspect;
    public String hasKey;
    public Resources(Context _context)
    {
        fps =32;
        haskey="";
        mContext= _context;
        texturePool = new HasMap();
        sound = new SoundManager(_context);
    }
    public void loadTexture(String key, int resource)
    {
        if(!texturePool.contaisnKey(key))
        {
            Bitmap bmp=null;
            bmp=BitmapFactory.decodeResource(mContext.getRresources(), resource);
            texturePool.put(key, bmp);
        }
    }
    public void unloadTexture(String Key)
    {
        ((Bitmap)texturePool.get(key)).recycle();
        texturePool.remove(key);

    }
    public Bitmap getTexture(String key)
    {
        return (Bitmap)texturePool.get(key);

    }
    public boolean isOnline()
    {
        ConnectivityManager cm= (ConnectivityManager)mContext.getSystemService
    }


}
