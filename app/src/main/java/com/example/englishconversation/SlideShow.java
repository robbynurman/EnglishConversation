package com.example.englishconversation;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;


public class SlideShow extends Fragment {

    public SlideShow(){}
    RelativeLayout view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = (RelativeLayout) inflater.inflate(R.layout.slide_show, container, false);

        getActivity().setTitle("Slideshow");
        Log.e("Slideshow", "Slideshow");

        return view;
    }
}
