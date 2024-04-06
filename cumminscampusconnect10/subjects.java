package com.example.cumminscampusconnect10;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
public class subjects extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subjects);
        Button buttonFy = findViewById(R.id.button8);
        Button buttonSy = findViewById(R.id.button5);
        Button buttonTy = findViewById(R.id.button9);
        Button buttonBtech = findViewById(R.id.button10);
        buttonFy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(subjects.this, fysubjects.class);
                startActivity(intent);
            }
        });
// Set a click listener for all buttons
        View.OnClickListener buttonClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title = "";
                String syl1 = "";
                String syl2 ="";
                String str1="";

                String str2="";
                String sem1="";
                String sem2="";
// Determine the title based on which button was clicked
                int viewId = view.getId();
                if (viewId == R.id.button5) {
                    title = "SECOND YEAR";
                    sem1="Semester III";
                    sem2="Semester IV";

                    syl1="https://drive.google.com/file/d/1KP5VXNufZHQvf3ceNBNp8Wip75pUDu3G/view";
                    syl2="https://drive.google.com/file/d/1Ia2o3etbpfuesWQLXWw8OMKEDgjfcpHO/view";
                    str1="https://drive.google.com/file/d/1xD0B7AdNMgywBCPAuvvzq9munte9CZom/view";
                    str2="https://drive.google.com/file/d/1Ze1Qqcz5Gk4Ra_DN9WfDZWtBCx73qjWL/view";

                } else if (viewId == R.id.button9) {
                    title = "THIRD YEAR";
                    sem1="Semester V";
                    sem2="Semester VI";

                    syl1="https://drive.google.com/file/d/1ACMVVRkrLzo_gNZT2A5RgJ2VNC3BAimP/view";
                    syl2="https://drive.google.com/file/d/1wPjIc8noghUEQvsdh4gD_GIYAjYOKA4D/view";
                    str1="https://drive.google.com/file/d/1ruSFhit91eERhi6TBpz3a6P6i_qI0bMd/view";
                    str2="https://drive.google.com/file/d/1WoeKqNX-UIXA6lhSnr8NO_lfsx9nbVxd/view";

                } else if (viewId == R.id.button10) {
                    title = "B TECH";
                    sem1="Semester VII";
                    sem2="Semester VIII";
                    syl1="";

                    syl2="https://drive.google.com/file/d/1bD2vIDoQTqvArUN8V15MvpwMGiMs-V7M/view";
                    str1="https://drive.google.com/file/d/1xJ9qnMU1rDxHZze7tzlMaUyn4mprk3xa/view";
                    str2="https://drive.google.com/file/d/1LDb73pOBtr0TpYERRfGtt6cIzez58pwv/view";

                }
// Launch the PdfViewerActivity with the selected title
                Intent intent = new Intent(subjects.this, subjects_new.class);
                intent.putExtra("title", title);
                intent.putExtra("sem1", sem1);
                intent.putExtra("sem2", sem2);
                intent.putExtra("syl1", syl1);

                intent.putExtra("syl2", syl2);
                intent.putExtra("str1", str1);
                intent.putExtra("str2", str2);
                startActivity(intent);
            }
        };

        buttonSy.setOnClickListener(buttonClickListener);
        buttonTy.setOnClickListener(buttonClickListener);
        buttonBtech.setOnClickListener(buttonClickListener);
    }
}