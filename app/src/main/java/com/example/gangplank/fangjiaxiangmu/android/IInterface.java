package com.example.gangplank.fangjiaxiangmu.android;

import retrofit2.http.GET;
import retrofit2.http.Url;
import rx.Observable;

/**
 * Created by GANGPLANK on 2018/12/28.
 */

public interface IInterface {
    String base_url_Android = "http://gank.io/api/data/";
    @GET()
    Observable<Android_Bean> ObGetAndroidBean(@Url String key);

}
