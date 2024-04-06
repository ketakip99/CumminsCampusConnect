package com.example.cumminscampusconnect10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ImageButton b1 = (ImageButton) findViewById(R.id.imageButton1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent explicitIntent = new Intent(home.this, navHome.class);
                startActivity(explicitIntent);
            }
        });
        ImageButton b2 = (ImageButton) findViewById(R.id.imageButton5);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent explicitIntent = new Intent(home.this, festsHome.class);
                startActivity(explicitIntent);
            }
        });

        ImageButton b3 = (ImageButton) findViewById(R.id.imageButton6);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent explicitIntent = new Intent(home.this, clubs.class);
                startActivity(explicitIntent);
            }
        });

        ImageButton b4 = (ImageButton) findViewById(R.id.imageButton4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent explicitIntent = new Intent(home.this, essentials.class);
                startActivity(explicitIntent);
            }
        });

        ImageButton b5 = (ImageButton) findViewById(R.id.imageButton3);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent explicitIntent = new Intent(home.this, faculty.class);
                startActivity(explicitIntent);
            }
        });

        ImageButton b6 = (ImageButton) findViewById(R.id.imageButton2);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent explicitIntent = new Intent(home.this, subjects.class);
                startActivity(explicitIntent);
            }
        });
    }
}