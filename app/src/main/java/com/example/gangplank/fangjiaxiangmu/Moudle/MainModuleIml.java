package com.example.gangplank.fangjiaxiangmu.Moudle;



import com.example.gangplank.fangjiaxiangmu.HttpManager;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by GANGPLANK on 2019/1/21.
 */

public class MainModuleIml implements MainModule{
    @Override
    public void getList(int page, FInishHttp fInishHttp) {
        Map<String,String> map=new HashMap<>();
        map.put("appKey","25ffda53ed8d4ee69bd31837200ed4f5");
        map.put("page",""+page);
        map.put("category","娱乐");
        HttpManager.getInstance().get("list?",map,fInishHttp);
    }
}
