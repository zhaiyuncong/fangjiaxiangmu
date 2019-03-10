package com.example.gangplank.fangjiaxiangmu.MainView;


import com.example.gangplank.fangjiaxiangmu.News;

import java.util.List;

/**
 * Created by GANGPLANK on 2019/1/21.
 */

public interface MainView {


    void showError(String error);

    void showList(List<News.RESULTBean.NewsListBean> newsListBeans);
}
