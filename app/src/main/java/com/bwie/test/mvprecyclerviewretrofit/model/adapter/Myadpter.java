package com.bwie.test.mvprecyclerviewretrofit.model.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bwie.test.mvprecyclerviewretrofit.R;
import com.bwie.test.mvprecyclerviewretrofit.model.bean.MyBean;
import com.bwie.test.mvprecyclerviewretrofit.model.bean.Produce;

import java.util.ArrayList;
import java.util.List;

/**
 * 刘海峰.19:27
 */

public class Myadpter extends RecyclerView.Adapter{
    private Context mcontext;
    private List<MyBean.DataBean> list;

    public Myadpter(Context mcontext, List<MyBean.DataBean> list) {
        this.mcontext = mcontext;
        this.list = list;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
       ViewHolder viewHolder = new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false));
return  viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        ViewHolder viewholder= (ViewHolder)holder;
        viewholder.textview.setText(""+list.get(position).getNews_title());

        Glide.with(mcontext).load(list.get(position).getPic_url()).into(viewholder.ima);


    }


    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
       TextView textview;
        ImageView ima;
        public ViewHolder(View itemView) {
            super(itemView);

            textview=(TextView)itemView.findViewById(R.id.title_item);
            ima=(ImageView)itemView.findViewById(R.id.image_item);
        }


    }

}
