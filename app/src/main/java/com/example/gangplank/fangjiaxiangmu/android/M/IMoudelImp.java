package com.example.gangplank.fangjiaxiangmu.android.M;


import android.util.Log;


import com.example.gangplank.fangjiaxiangmu.android.Android_Bean;
import com.example.gangplank.fangjiaxiangmu.android.IInterface;
import com.example.gangplank.fangjiaxiangmu.android.P.IPersener;

import java.util.List;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.Observer;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by GANGPLANK on 2018/12/27.
 */

public class IMoudelImp implements IMoudel{
    @Override
    public void MGetBean(final IPersener.ICallBack iCallBack, int num, int page) {
        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .baseUrl(IInterface.base_url_Android)
                .build();
        IInterface iInterface = retrofit.create(IInterface.class);

        String s = "Android/"+num+"/"+ page;
        Log.e("bbbbbbbbbbbbbbbbbb",s);
        Observable<Android_Bean> Ob = iInterface.ObGetAndroidBean(s);
        Subscription subscribe = Ob.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Android_Bean>() {


                    @Override
                    public void onNext(Android_Bean value) {
                        List<Android_Bean.ResultsBean> list = value.getResults();
                        Log.e("cccccccccccccccccccc", list.toString());
                        iCallBack.Success(list);
                    }

                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.e("错误", e.getMessage());
                    }


                });
    }
}
