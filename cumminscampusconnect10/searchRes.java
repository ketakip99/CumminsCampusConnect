package com.example.cumminscampusconnect10;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class searchRes extends AppCompatActivity {

    TextView floor;
    TextView name;
    String retrievedFloor="";

    ImageView floorimgsearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_res);

        floor = findViewById(R.id.floorname);
        name = findViewById(R.id.textView24);
        floorimgsearch = findViewById(R.id.floorimage);

        String getType = getIntent().getStringExtra("type");
        String getName = getIntent().getStringExtra("name");

        name.setText(getName);

        // Create or open the database using the DatabaseHelper
        DatabaseHelper dbHelper = new DatabaseHelper(this);
        SQLiteDatabase database = dbHelper.getWritableDatabase();

        Log.d("Query Values", "Type: " + getType + ", Name: " + getName);

        // Search the database for the floor based on type and name
        String query = "SELECT " + dbHelper.COLUMN_FLOOR + " FROM " + DatabaseHelper.TABLE_NAME +
                " WHERE " + DatabaseHelper.COLUMN_TYPE + " = ? AND " + DatabaseHelper.COLUMN_NAME + " = ?";
        String[] selectionArgs = {getType, getName};

        Cursor cursor = database.rawQuery(query, selectionArgs);

        int imageResource;

        if (cursor.moveToFirst()) {
            retrievedFloor = cursor.getString(0); // Use the column index (0) to get the value
            floor.setText(retrievedFloor);

            if (retrievedFloor.equals("1st Floor")) {
                imageResource = R.drawable.first;
            } else if (retrievedFloor.equals("2nd Floor")) {
                imageResource = R.drawable.second;
            } else if (retrievedFloor.equals("3rd Floor")) {
                imageResource = R.drawable.third;
            } else if (retrievedFloor.equals("5th Floor")) {
                imageResource = R.drawable.fifth;
            } else if (retrievedFloor.equals("Ground Floor")) {
                imageResource = R.drawable.ground;
            } else {
                imageResource = R.drawable.error;
            }

            floorimgsearch.setImageResource(imageResource);

            Log.d("Load Image", "Image loaded");
        } else {
            // Handle when no matching data is found not working
            imageResource = R.drawable.error;
            floorimgsearch.setImageResource(imageResource);
            floor.setText("NO DATA");

            Log.d("No Data", "No matching data found");
        }


        cursor.close();
        database.close();

        Log.d("Intent", getType);
        Log.d("Intent", getName);
        Log.d("Floor", retrievedFloor);



    }
}