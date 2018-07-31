package com.example.wngks.hanproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class Setting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
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
            Intent i = new Intent(Setting.this, Main3Activity.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.calendar){
            Toast.makeText(this, "Calendar", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(Setting.this,  Calendar.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.setting){
            Toast.makeText(this, "Setting", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
