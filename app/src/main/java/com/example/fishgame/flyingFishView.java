package com.example.fishgame;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.view.View;

public class flyingFishView extends View
{

    private Bitmap fish;
    public flyingFishView(Context context) {
        super(context);

        fish = BitmapFactory.decodeResource(getResources(), R.drawable.fish1);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawBitmap(fish, 0, 0, null);
    }
}
