package com.example.englishconversation;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;


/**
 * Created by Kuncoro on 22/03/2016.
 */
public class Gallery extends Fragment {

    public Gallery(){}
    RelativeLayout view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = (RelativeLayout) inflater.inflate(R.layout.gallery, container, false);

        getActivity().setTitle("Gallery");
        Log.e("Gallery", "Gallery");

        return view;
    }
}
