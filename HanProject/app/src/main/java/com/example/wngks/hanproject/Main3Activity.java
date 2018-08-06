package com.example.wngks.hanproject;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.io.ByteArrayOutputStream;

public class Main3Activity extends AppCompatActivity {

    ImageView img1, img2, img3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        img3 = findViewById(R.id.img3);

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main3Activity.this, MainActivity.class);
                intent.putExtra("img", "img_a");
                startActivity(intent);
            }

        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main3Activity.this, MainActivity.class);
                intent.putExtra("img", "img_b");
                startActivity(intent);
            }

        });

        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main3Activity.this, MainActivity.class);
                intent.putExtra("img", "img_c");
                startActivity(intent);
            }

        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.today){
            Toast.makeText(this, "Today", Toast.LENGTH_SHORT).show();
        }
        if(item.getItemId()==R.id.calendar){
            Toast.makeText(this, "Calendar", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(Main3Activity.this, Calendar.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.setting){
            Toast.makeText(this, "Setting", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(Main3Activity.this, Setting.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }
}
