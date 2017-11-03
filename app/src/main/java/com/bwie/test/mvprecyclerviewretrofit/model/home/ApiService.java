package com.bwie.test.mvprecyclerviewretrofit.model.home;

import com.bwie.test.mvprecyclerviewretrofit.model.bean.MyBean;
import com.bwie.test.mvprecyclerviewretrofit.model.bean.Produce;

import retrofit2.http.GET;
import rx.Observable;


/**
 * 刘海峰.18:51
 */

public interface ApiService {
    @GET("type/1/p/1")
    Observable<MyBean> getNoParams();

}
