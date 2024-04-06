package com.example.cumminscampusconnect10;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

public class firstFloor extends AppCompatActivity {

    ImageView floorPlanImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_floor);

        floorPlanImageView = findViewById(R.id.imageView2);

        floorPlanImageView.setOnTouchListener((v, event) -> {
            int x = (int) event.getX();
            int y = (int) event.getY();

            if (event.getAction() == MotionEvent.ACTION_DOWN) {
                handleTouch(x, y);
            }

            return true;
        });
    }
    private void handleTouch(int x, int y) {
        Log.d("TOUCH_COORDINATES", "X: " + x + ", Y: " + y);
        if (isInArea(x, y, 26, 1561, 141, 1675)) {
            showAlert("T16","Anand Bewoor");
        } else if (isInArea(x, y, 26, 773, 135, 893)) {
            showAlert("T17","Sandeep Musale");
        }else if (isInArea(x, y, 1496, 764, 1612, 886)) {
            showAlert("T18","S Rajput");
        }else if (isInArea(x, y, 1494, 1556, 1606, 1674)) {
            showAlert("T19","Prachi Mukherji\n(IP cell)");
        }else if (isInArea(x, y, 1064, 1790, 1336, 1900)) {
            showAlert("Principal","Madhuri Khambete");
        }
        // Add more conditions for other rooms as needed
    }
    private boolean isInArea(int x, int y, int startX, int startY, int endX, int endY) {
        return x >= startX && x <= endX && y >= startY && y <= endY;
    }

    private void showAlert(String title, String message) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(title)
                .setMessage(message);

        AlertDialog alertDialog = builder.create();
        alertDialog.setCanceledOnTouchOutside(true); // Dismiss the dialog when clicked outside

        alertDialog.show();

//        TextView alertTitle = alertDialog.findViewById(getResources().getIdentifier("alertTitle", "id", "android"));
//        if (alertTitle != null) {
//            alertTitle.setTextSize(TypedValue.COMPLEX_UNIT_SP, 30); // Set the desired text size for the title
//        }

        TextView alertMessage = alertDialog.findViewById(android.R.id.message);
        if (alertMessage != null) {
            alertMessage.setTextSize(TypedValue.COMPLEX_UNIT_SP, 22);
        }

        // Adjust the height of the AlertDialog
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        Window window = alertDialog.getWindow();
        if (window != null) {
            layoutParams.copyFrom(window.getAttributes());
            layoutParams.width = WindowManager.LayoutParams.WRAP_CONTENT;
            layoutParams.height = 1000; // Change this value to adjust the height
            layoutParams.alpha = 0.9f;
            layoutParams.gravity = Gravity.CENTER;
            window.setAttributes(layoutParams);
            window.setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, 1000); // Change this value to adjust the height
            window.addFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
        }
    }


}