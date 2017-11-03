package com.bwie.test.mvprecyclerviewretrofit.presenter;

import com.bwie.test.mvprecyclerviewretrofit.model.bean.MyBean;
import com.bwie.test.mvprecyclerviewretrofit.model.bean.Produce;
import com.bwie.test.mvprecyclerviewretrofit.model.modle.ProductModel;
import com.bwie.test.mvprecyclerviewretrofit.view.ProduceView;

/**
 * 刘海峰.19:19
 */

public class ProducePresenter implements ProductModel.Shopping {
    private ProductModel productModel;
    private ProduceView produceView;

    public ProducePresenter(ProduceView produceView) {
        this.produceView = produceView;
        productModel = new ProductModel();
        productModel.setShop(this);

    }

    public void product() {
        productModel.getHasParams();
    }

    @Override
    public void result(MyBean t) {
        produceView.Sucess(t);
    }
}
