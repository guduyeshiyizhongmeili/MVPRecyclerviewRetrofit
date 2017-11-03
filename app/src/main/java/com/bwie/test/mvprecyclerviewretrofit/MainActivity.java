package com.bwie.test.mvprecyclerviewretrofit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.bwie.test.mvprecyclerviewretrofit.model.adapter.Myadpter;
import com.bwie.test.mvprecyclerviewretrofit.model.bean.MyBean;
import com.bwie.test.mvprecyclerviewretrofit.model.bean.Produce;
import com.bwie.test.mvprecyclerviewretrofit.presenter.ProducePresenter;
import com.bwie.test.mvprecyclerviewretrofit.view.ProduceView;

import java.util.ArrayList;
import java.util.List;

import static android.R.id.list;

public class MainActivity extends AppCompatActivity implements ProduceView{

    private RecyclerView mrv;
    private Myadpter md;
    private ProducePresenter producePresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        producePresenter=new ProducePresenter(this);
        producePresenter.product();
        mrv=(RecyclerView)findViewById(R.id.recy);

    }

    @Override
    public void Sucess(MyBean produce) {
        /*list.addAll(produce.getData().get(0).getList());
        System.out.println(list.size());
        md.notifyDataSetChanged();*/
        List<MyBean.DataBean> data = produce.getData();
        md=new Myadpter(this, data);
        mrv.setAdapter(md);
        mrv.setLayoutManager(new LinearLayoutManager(this));
    }
}
