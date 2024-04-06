package com.example.cumminscampusconnect10;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ImagePagerAdapter extends FragmentPagerAdapter {
    private int[] imageResourceIds;

    public ImagePagerAdapter(FragmentManager fm, int[] imageResourceIds) {
        super(fm);
        this.imageResourceIds = imageResourceIds;
    }

    @Override
    public Fragment getItem(int position) {
        ImageFragment fragment = new ImageFragment(imageResourceIds[position]);
        return fragment;
    }

    @Override
    public int getCount() {
        return imageResourceIds.length;
    }
}


