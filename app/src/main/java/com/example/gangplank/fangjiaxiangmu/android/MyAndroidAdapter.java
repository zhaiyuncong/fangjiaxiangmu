package com.example.gangplank.fangjiaxiangmu.android;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.example.gangplank.fangjiaxiangmu.R;
import com.jcodecraeer.xrecyclerview.XRecyclerView;

import java.util.List;

/**
 * Created by GANGPLANK on 2018/12/27.
 */

public class MyAndroidAdapter extends XRecyclerView.Adapter<MyAndroidAdapter.ViewHolder> {
    private List<Android_Bean.ResultsBean> list;
    private Context context;

    public MyAndroidAdapter(List<Android_Bean.ResultsBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.andorid_item,null);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.time.setText(list.get(position).getPublishedAt().substring(0,10));
        holder.title.setText(list.get(position).getDesc());
        holder.zuozhe.setText(list.get(position).getWho());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView title,time,zuozhe;
        public ViewHolder(View itemView) {
            super(itemView);
            time = itemView.findViewById(R.id.Android_Time);
            zuozhe = itemView.findViewById(R.id.Android_Zuozhe);
            title = itemView.findViewById(R.id.Android_Title);
        }
    }
}
