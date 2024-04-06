package com.example.cumminscampusconnect10;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class navSearch extends AppCompatActivity {

    EditText Name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav_search);

        // Retrieve the string array from strings.xml
        String[] items = getResources().getStringArray(R.array.navsearching);

        // Locate the spinner in the layout
        Spinner spinner = findViewById(R.id.spinner);

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, items);

        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);

        Name = findViewById(R.id.editTextText); // Initialize the EditText here

        Button b1 = (Button) findViewById(R.id.button2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = spinner.getSelectedItem().toString(); // Get the selected item from the spinner
                String name = Name.getText().toString(); // Get the text from the EditText

                Log.d("Intent", "Button Clicked");
                Intent explicitIntent = new Intent(navSearch.this, searchRes.class);
                explicitIntent.putExtra("type", text);
                explicitIntent.putExtra("name", name);
                startActivity(explicitIntent);
                Log.d("Intent", name);
            }
        });
    }
}
