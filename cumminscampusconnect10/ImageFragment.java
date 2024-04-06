package com.example.cumminscampusconnect10;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import android.widget.ImageView;

public class ImageFragment extends Fragment {
    private int imageResourceId;

    public ImageFragment(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_image, container, false);
        ImageView imageView = view.findViewById(R.id.imageView);
        imageView.setImageResource(imageResourceId);
        return view;
    }
}


