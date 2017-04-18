package com.teclab.guerrero.engine;

import android.graphics.Bitmap;
import android.graphics.Canvas;




public class Image extends DisplayObject {

    private Bitmap bmp;
    int Source;
    String key;
    String _tag;

    public void Image(String key, String _tag, int source, Resources _resources)
    {

        this.resources = _resources;
        this.key = _key;
        this.resources.LoadTexture(this.key, _resources);

    }


    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawBitmap(bmp, x, y, null);
    }

}







//EL RECURSO(IAMGEN) TE LO CARGA EL RESOURCE MANAGER

/*Image (string key, int source, Resources)

res.LoudTexture (          );

onDraw(Cnavas C)
C.(-----res.gett())

"bad1" ----> png

*/