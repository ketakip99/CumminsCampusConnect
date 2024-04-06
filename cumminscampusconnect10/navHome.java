package com.example.cumminscampusconnect10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class navHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav_home);
        ImageView b1 = (ImageView) findViewById(R.id.imageView5);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent explicitIntent = new Intent(navHome.this, navSearch.class);
                startActivity(explicitIntent);
            }
        });

        ImageView b2 = (ImageView) findViewById(R.id.imageView4);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent explicitIntent = new Intent(navHome.this, interactSearch.class);
                startActivity(explicitIntent);
            }
        });
    }
}