package com.example.cumminscampusconnect10;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
public class essentials extends AppCompatActivity {
    Button compensation;
    Button planner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_essentials);
        compensation = findViewById(R.id.button);
        compensation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(essentials.this, compensation.class);
                startActivity(intent);
            }
        });
        Spinner spinner1 = (Spinner) findViewById(R.id.spinner);
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
           @Override
           public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
           {
               if(i==0)
               {

               }
               if(i==1){
                   Intent intent = new Intent(essentials.this, sgpa.class);
                   startActivity(intent);
               }
               else if (i==2){
                   Intent intent = new Intent(essentials.this, cgpa.class);
                   startActivity(intent);
               }
           }
           @Override
           public void onNothingSelected(AdapterView<?> adapterView) {
           }
       });
        planner = findViewById(R.id.button7);
        planner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(essentials.this, calend.class);
                startActivity(intent);
            }
        });
    }
}