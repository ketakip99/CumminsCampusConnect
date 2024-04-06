package com.example.cumminscampusconnect10;

import androidx.appcompat.app.AppCompatActivity;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
public class fysubjects extends AppCompatActivity {
    Button syllabus1;
    Button syllabus2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fysubjects);

        syllabus1 = (Button) findViewById(R.id.button);
        syllabus2 = (Button) findViewById(R.id.button2);
        Intent intent = new Intent(Intent.ACTION_VIEW);

        syllabus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                intent.setData(Uri.parse("https://drive.google.com/file/d/15-YMlq1oepYilGfasbjPp3puzSCSyp_g/view"));
                startActivity(intent);
            }
        });
        syllabus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                intent.setData(Uri.parse("https://drive.google.com/file/d/15-YMlq1oepYilGfasbjPp3puzSCSyp_g/view"));
                startActivity(intent);
            }
        });
    }
}