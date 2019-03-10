package com.example.gangplank.fangjiaxiangmu.xiaofragment;


import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.Fragment;
import android.support.v4.widget.NestedScrollView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.gangplank.fangjiaxiangmu.R;
import com.jcodecraeer.xrecyclerview.XRecyclerView;

/**
 * A simple {@link Fragment} subclass.
 */
public class AndroidFragment extends Fragment {


    private ImageView Android_Img;
    private CollapsingToolbarLayout Android_collapsingToolbarLayout;
    private XRecyclerView Android_Xrecy;
    private NestedScrollView Android_scrollView;

    public AndroidFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_android, container, false);
        initView(view);
        return view;
    }

    private void initView(View view) {
        Android_Img = (ImageView) view.findViewById(R.id.Android_Img);
        Android_collapsingToolbarLayout = (CollapsingToolbarLayout) view.findViewById(R.id.Android_collapsingToolbarLayout);
        Android_Xrecy = (XRecyclerView) view.findViewById(R.id.Android_Xrecy);
        Android_scrollView = (NestedScrollView) view.findViewById(R.id.Android_scrollView);
    }
}
