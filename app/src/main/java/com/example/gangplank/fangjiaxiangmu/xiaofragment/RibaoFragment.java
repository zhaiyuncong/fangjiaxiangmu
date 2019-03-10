package com.example.gangplank.fangjiaxiangmu.xiaofragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.gangplank.fangjiaxiangmu.Main2Activity;
import com.example.gangplank.fangjiaxiangmu.MainMoudlePresenter.MainPresenterIml;
import com.example.gangplank.fangjiaxiangmu.MainView.MainView;
import com.example.gangplank.fangjiaxiangmu.Moudle.MainModuleIml;
import com.example.gangplank.fangjiaxiangmu.News;
import com.example.gangplank.fangjiaxiangmu.R;
import com.example.gangplank.fangjiaxiangmu.adapter.MyAdapter;
import com.jcodecraeer.xrecyclerview.XRecyclerView;
import com.jude.rollviewpager.RollPagerView;
import com.jude.rollviewpager.adapter.StaticPagerAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class RibaoFragment extends Fragment implements View.OnClickListener, MainView, XRecyclerView.LoadingListener {

    @BindView(R.id.xrl)
    XRecyclerView xrl;
    Unbinder unbinder;
    private MyAdapter myAdapter;
    private List<News.RESULTBean.NewsListBean> newsListBeans = new ArrayList<>();
    private MainPresenterIml mainPresenter;
    private RollPagerView roll;


    private int page = 1;
    private FloatingActionButton fab_calender;

    public RibaoFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_ribao, container, false);
        unbinder = ButterKnife.bind(this, view);
        initView(view);
        return view;
    }

    private void initView(View view) {
        roll = (RollPagerView) view.findViewById(R.id.roll);
        roll.setAdapter(new FragAdapter());
        xrl.setLayoutManager(new LinearLayoutManager(getActivity()));
        xrl.addItemDecoration(new DividerItemDecoration(getActivity(), DividerItemDecoration.VERTICAL));
        myAdapter = new MyAdapter(newsListBeans, getActivity());
        xrl.setAdapter(myAdapter);
        mainPresenter = new MainPresenterIml(new MainModuleIml(), this);
        mainPresenter.getData(page);

        xrl.setLoadingListener(this);


        fab_calender = (FloatingActionButton) view.findViewById(R.id.fab_calender);
        fab_calender.setOnClickListener(this);

    }

    @Override
    public void onRefresh() {
        page = 1;
        mainPresenter.getData(page);
        xrl.refreshComplete();
    }

    @Override
    public void onLoadMore() {
        page++;
        mainPresenter.getData(page);
    }

    @Override
    public void showError(String error) {

    }

    @Override
    public void showList(List<News.RESULTBean.NewsListBean> newsListBeans) {
        myAdapter.setData(page, newsListBeans);
        xrl.loadMoreComplete();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.fab_calender:
                Intent intent =new Intent(getActivity(), Main2Activity.class);
                startActivity(intent);
                break;
        }
    }

    class FragAdapter extends StaticPagerAdapter {

        private int[] image = {R.drawable.a, R.drawable.zq, R.drawable.c};

        @Override
        public View getView(ViewGroup container, int position) {
            ImageView imageView = new ImageView(container.getContext());
            imageView.setImageResource(image[position]);
            return imageView;
        }

        @Override
        public int getCount() {
            return image.length;
        }
    }
}
