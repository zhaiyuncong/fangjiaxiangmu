package com.example.gangplank.fangjiaxiangmu.Moudle;



import com.example.gangplank.fangjiaxiangmu.News;

import java.util.List;

/**
 * Created by GANGPLANK on 2019/1/21.
 */

public interface MainModule {
    interface FInishHttp {

        void setLists(List<News.RESULTBean.NewsListBean> newsListBeans);
        void showError(String error);
    }

    void getList(int page, FInishHttp fInishHttp);
}
