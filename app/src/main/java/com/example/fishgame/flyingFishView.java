package com.example.fishgame;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.view.View;

public class flyingFishView extends View
{

    private Bitmap fish;
    private  Bitmap backgroundImage;
    private Paint scorepaint = new Paint();
    private Bitmap life[] = new  Bitmap[2];

    public flyingFishView(Context context) {
        super(context);

        fish = BitmapFactory.decodeResource(getResources(), R.drawable.fish1);
        backgroundImage = BitmapFactory.decodeResource(getResources(),R.drawable.background);
        scorepaint.setColor(Color.WHITE);
        scorepaint.setTextSize(70);
        scorepaint.setTypeface(Typeface.DEFAULT_BOLD);
        scorepaint.setAntiAlias(true);

        life[0] = BitmapFactory.decodeResource(getResources(),R.drawable.hearts);
        life[1] = BitmapFactory.decodeResource(getResources(),R.drawable.heart_grey);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);


        canvas.drawBitmap(backgroundImage,0,0,null);
        canvas.drawBitmap(fish, 0, 0, null);
        canvas.drawText("Score : ", 20, 60, scorepaint);

        canvas.drawBitmap(life[0],400,10,null);
        canvas.drawBitmap(life[0],500,10,null);
        canvas.drawBitmap(life[0],600,10,null);
    }
}
