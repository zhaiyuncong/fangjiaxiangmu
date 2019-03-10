package com.example.gangplank.fangjiaxiangmu.MainMoudlePresenter;


import com.example.gangplank.fangjiaxiangmu.MainView.MainView;
import com.example.gangplank.fangjiaxiangmu.Moudle.MainModule;
import com.example.gangplank.fangjiaxiangmu.News;

import java.util.List;

/**
 * Created by GANGPLANK on 2019/1/21.
 */

public class MainPresenterIml implements MainPresenter, MainModule.FInishHttp{
    private MainModule mainModule;
    private MainView mainView;

    public MainPresenterIml(MainModule mainModule, MainView mainView) {
        this.mainModule = mainModule;
        this.mainView = mainView;
    }


    @Override
    public void setLists(List<News.RESULTBean.NewsListBean> newsListBeans) {
        if (mainView != null) {
            mainView.showList(newsListBeans);
        }
    }



    @Override
    public void showError(String error) {
        if (mainView != null) {
            mainView.showError(error);
        }
    }

    @Override
    public void getData(int page) {
        if (mainView != null) {
            mainModule.getList(page, this);
        }
    }
}

