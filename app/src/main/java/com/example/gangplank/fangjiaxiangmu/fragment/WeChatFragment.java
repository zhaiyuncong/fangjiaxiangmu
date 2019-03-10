package com.example.gangplank.fangjiaxiangmu.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gangplank.fangjiaxiangmu.MainMoudlePresenter.MainPresenterIml;
import com.example.gangplank.fangjiaxiangmu.MainView.MainView;
import com.example.gangplank.fangjiaxiangmu.Moudle.MainModuleIml;
import com.example.gangplank.fangjiaxiangmu.News;
import com.example.gangplank.fangjiaxiangmu.R;
import com.example.gangplank.fangjiaxiangmu.adapter.MyAdapter;
import com.jcodecraeer.xrecyclerview.XRecyclerView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class WeChatFragment extends Fragment implements MainView, XRecyclerView.LoadingListener {


    @BindView(R.id.xrl)
    XRecyclerView xrl;
    Unbinder unbinder;
    private MyAdapter myAdapter;
    private List<News.RESULTBean.NewsListBean> newsListBeans = new ArrayList<>();
    private MainPresenterIml mainPresenter;


    private int page=1;
    public WeChatFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View  view =inflater.inflate(R.layout.fragment_we_chat, container, false);
        unbinder = ButterKnife.bind(this, view);
        initView(view);
        return  view;
    }

    private void initView(View view) {
        xrl.setLayoutManager(new LinearLayoutManager(getActivity()));
        xrl.addItemDecoration(new DividerItemDecoration(getActivity(), DividerItemDecoration.VERTICAL));
        myAdapter = new MyAdapter(newsListBeans, getActivity());
        xrl.setAdapter(myAdapter);
        mainPresenter = new MainPresenterIml(new MainModuleIml(), this);
        mainPresenter.getData(page);

        xrl.setLoadingListener(this);
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

}
