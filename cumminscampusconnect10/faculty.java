package com.example.cumminscampusconnect10;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
public class faculty extends AppCompatActivity {
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty);

        viewPager = findViewById(R.id.viewPager);

        // Create an array of image resource IDs or URLs
        int[] imageResourceIds = { R.drawable.one, R.drawable.two, R.drawable.three, R.drawable.four, R.drawable.five, R.drawable.six, R.drawable.seven, R.drawable.eight, R.drawable.nine, R.drawable.ten, R.drawable.eleven, R.drawable.twelve, R.drawable.thirteen, R.drawable.fourteen};

        ImagePagerAdapter adapter = new ImagePagerAdapter(getSupportFragmentManager(), imageResourceIds);
        viewPager.setAdapter(adapter);
    }
}
