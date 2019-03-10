package com.example.gangplank.fangjiaxiangmu.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gangplank.fangjiaxiangmu.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ShezhiFragment extends Fragment {


    public ShezhiFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View   view  =inflater.inflate(R.layout.fragment_shezhi, container, false);
        return view;
    }

}
