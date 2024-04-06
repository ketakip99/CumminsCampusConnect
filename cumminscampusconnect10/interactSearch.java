package com.example.cumminscampusconnect10;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class interactSearch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interact_search);

        // Retrieve the string array from strings.xml
        String[] items = getResources().getStringArray(R.array.floorsearch);

        // Locate the spinner in the layout
        Spinner spinner = findViewById(R.id.floorspinner);

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, items);

        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);

        Button b1 = findViewById(R.id.button4);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the selected item from the Spinner
                String selectedFloor = (String) spinner.getSelectedItem();

                // Check the selected floor and start the appropriate activity
                Intent explicitIntent;
                if ("1st Floor".equals(selectedFloor)) {
                    explicitIntent = new Intent(interactSearch.this, firstFloor.class);
                } else if ("2nd Floor".equals(selectedFloor)) {
                    explicitIntent = new Intent(interactSearch.this, secondFloor.class);
                } else if ("3rd Floor".equals(selectedFloor)) {
                    explicitIntent = new Intent(interactSearch.this, thirdFloor.class);
                } else if ("Ground Floor".equals(selectedFloor)) {
                    explicitIntent = new Intent(interactSearch.this, groundFloor.class);
                } else if ("5th Floor".equals(selectedFloor)) {
                    explicitIntent = new Intent(interactSearch.this, fifthFloor.class);
                } else {
                    // Handle the case when none of the expected values are selected
                    // You can show a toast message or handle it in some other way
                    return;
                }

                startActivity(explicitIntent);
            }
        });
    }
}
