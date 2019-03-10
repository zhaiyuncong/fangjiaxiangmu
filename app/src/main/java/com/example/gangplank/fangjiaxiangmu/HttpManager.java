package com.example.gangplank.fangjiaxiangmu;

import com.example.gangplank.fangjiaxiangmu.Moudle.MainModule;

import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by GANGPLANK on 2019/3/3.
 */

public class HttpManager {
    private static HttpManager httpManager;
    private HttpManager(){

    }
    public static HttpManager getInstance() {
        if (httpManager == null) {
            synchronized (HttpManager.class) {
                if (httpManager == null) {
                    httpManager = new HttpManager();
                }
            }
        }
        return httpManager;
    }
    public void get(String url, Map<String,String> map, final MainModule.FInishHttp fInishHttp){
        final Retrofit retrofit=new Retrofit.Builder()
                .baseUrl(MyServer.URL)
                .addConverterFactory( GsonConverterFactory.create())
                .build();
        MyServer myServer = retrofit.create(MyServer.class);
        Call<News> data = myServer.getData(url, map);
        data.enqueue(new Callback<News>() {
            @Override
            public void onResponse(Call<News> call, Response<News> response) {
                fInishHttp.setLists(response.body().getRESULT().getNewsList());
            }

            @Override
            public void onFailure(Call<News> call, Throwable t) {
                fInishHttp.showError(t.getMessage());


            }
        });
    }
}
