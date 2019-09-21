package com.example.fishgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    private flyingFishView gameview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        gameview = new flyingFishView(this);
        setContentView(gameview);
    }
}
