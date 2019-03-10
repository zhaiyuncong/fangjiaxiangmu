package com.example.gangplank.fangjiaxiangmu.android.P;





import com.example.gangplank.fangjiaxiangmu.android.Android_Bean;
import com.example.gangplank.fangjiaxiangmu.android.M.IMoudel;
import com.example.gangplank.fangjiaxiangmu.android.M.IMoudelImp;
import com.example.gangplank.fangjiaxiangmu.android.V.IView;

import java.util.List;

/**
 * Created by GANGPLANK on 2018/12/27.
 */

public class IPersenerImp implements IPersener,IPersener.ICallBack{
    private IMoudel iMoudel;
    private IView iView;

    public IPersenerImp( IView iView) {
        iMoudel = new IMoudelImp();
        this.iView = iView;
    }

    @Override
    public void GetBean(int num, int page) {
        iMoudel.MGetBean(this,num,page);
    }


    @Override
    public void Success(List<Android_Bean.ResultsBean> list) {
        iView.ShowXRecyclerView(list);
    }
}
