package com.example.gangplank.fangjiaxiangmu.android.P;





import com.example.gangplank.fangjiaxiangmu.android.Android_Bean;

import java.util.List;

/**
 * Created by GANGPLANK on 2018/12/27.
 */

public interface IPersener {
    void GetBean(int num, int page);
    interface ICallBack{
        void Success(List<Android_Bean.ResultsBean> list);
    }
}
