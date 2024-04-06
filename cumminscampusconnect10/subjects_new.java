package com.example.cumminscampusconnect10;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.TextView;

public class subjects_new extends AppCompatActivity {
    Button syllabus1;
    Button syllabus2;
    Button structure1;
    Button structure2;
    TextView titleTextView;
    TextView sem1TextView;
    TextView sem2TextView;
    AlertDialog.Builder builder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subjects_new);
        syllabus1 = findViewById(R.id.button);
        structure1 = findViewById(R.id.button4);
        syllabus2 = findViewById(R.id.button2);
        structure2 = findViewById(R.id.button3);
        titleTextView = findViewById(R.id.textView2);
        sem1TextView=findViewById(R.id.textView);
        sem2TextView=findViewById(R.id.textView3);
        builder = new AlertDialog.Builder(this);
// Retrieve the title from the intent
        String title = getIntent().getStringExtra("title");
        String sem1 = getIntent().getStringExtra("sem1");
        String sem2 = getIntent().getStringExtra("sem2");
        String syl1 = getIntent().getStringExtra("syl1");
        String syl2 = getIntent().getStringExtra("syl2");
        String str1 = getIntent().getStringExtra("str1");
        String str2 = getIntent().getStringExtra("str2");

// Set the title in the TextView
        titleTextView.setText(title);
        sem1TextView.setText(sem1);
        sem2TextView.setText(sem2);
        Intent intent = new Intent(Intent.ACTION_VIEW);

        syllabus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(syl1.equals("")){
                    syllabus1.setOnClickListener(new View.OnClickListener() {

                        @Override
                        public void onClick(View view) {
                            builder.setTitle("Syllabus Currently Unavailable!")
                                    .setMessage("Sorry for the inconvenience!")
                                    .setIcon(R.drawable.alert)
                                    .setCancelable(false)
                                    .setPositiveButton("OK", new

                                            DialogInterface.OnClickListener() {

                                                @Override
                                                public void onClick(DialogInterface

                                                                            dialogInterface, int i) {

                                                    dialogInterface.cancel();
                                                }
                                            })
                                    .show();

                        }
                    });
                }
                else {
                    intent.setData(Uri.parse(syl1));
                    startActivity(intent);
                }
            }
        });
        structure1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.setData(Uri.parse(str1));
                startActivity(intent);
            }
        });
        syllabus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.setData(Uri.parse(syl2));
                startActivity(intent);
            }
        });
        structure2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.setData(Uri.parse(str2));
                startActivity(intent);

            }
        });
    }
}