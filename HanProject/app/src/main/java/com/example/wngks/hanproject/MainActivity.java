package com.example.wngks.hanproject;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import java.nio.channels.InterruptedByTimeoutException;

public class MainActivity extends AppCompatActivity {

    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources res = getResources();
        img = findViewById(R.id.img_main);
        Intent i = getIntent();
        String str = i.getStringExtra("img");
        int resID = res.getIdentifier(str, "drawable", getPackageName());
        Drawable drawable = getDrawable(resID);
        img.setBackground(drawable);
    }
}
