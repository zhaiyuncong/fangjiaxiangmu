package com.example.gangplank.fangjiaxiangmu.fragment;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gangplank.fangjiaxiangmu.R;
import com.example.gangplank.fangjiaxiangmu.adapter.VAdapter;
import com.example.gangplank.fangjiaxiangmu.xiaofragment.RemenFragment;
import com.example.gangplank.fangjiaxiangmu.xiaofragment.RibaoFragment;
import com.example.gangplank.fangjiaxiangmu.xiaofragment.ZhuanlanFragment;
import com.example.gangplank.fangjiaxiangmu.xiaofragment.ZhutikFragment;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ZhihuFragment extends Fragment {


    private ArrayList<Fragment> list;
    private ArrayList<String> title;
    private VAdapter vAdapter;
    private TabLayout tb;
    private ViewPager vp;

    public ZhihuFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_zhihu, container, false);
        initView(view);
        return view;
    }

    private void initView(View view) {
        tb = (TabLayout) view.findViewById(R.id.tb);
        vp = (ViewPager) view.findViewById(R.id.vp);
        list =new ArrayList<>();
        list.add(new RibaoFragment());
        list.add(new ZhutikFragment());
        list.add(new ZhuanlanFragment());
        list.add(new RemenFragment());
        title =new ArrayList<>();
        title.add("日报");
        title.add("主题");
        title.add("专栏");
        title.add("热门");
        vAdapter =new VAdapter(getChildFragmentManager(),list,title);
        vp.setAdapter(vAdapter);
        tb.setupWithViewPager(vp);
    }
}
