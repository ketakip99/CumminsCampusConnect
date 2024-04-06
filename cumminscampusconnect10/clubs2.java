package com.example.cumminscampusconnect10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class clubs2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clubs2);
        ImageView imageView = findViewById(R.id.imageView);
        String selectedOption = getIntent().getStringExtra("selected_option");

        if (selectedOption != null) {
            if (selectedOption.equals("Ecell Yukta")) {
                imageView.setImageResource(R.drawable.ecell);
            } else if (selectedOption.equals("GDSC")) {
                imageView.setImageResource(R.drawable.gdsc);
            } else if (selectedOption.equals("Baja")) {
                imageView.setImageResource(R.drawable.baja);}
            else if (selectedOption.equals("Debating Club")) {
                imageView.setImageResource(R.drawable.debate);
            }else if (selectedOption.equals("Loop")) {
                imageView.setImageResource(R.drawable.loop);
            }else if (selectedOption.equals("Insia")) {
                imageView.setImageResource(R.drawable.insia);
            }else if (selectedOption.equals("Swarashree")) {
                imageView.setImageResource(R.drawable.music);
            }else if (selectedOption.equals("AICVS")) {
                imageView.setImageResource(R.drawable.aicvs);
            }else if (selectedOption.equals("Code Club")) {
                imageView.setImageResource(R.drawable.code);
            }else if (selectedOption.equals("Math Club")) {
                imageView.setImageResource(R.drawable.math);
            }
        }
    }
}

