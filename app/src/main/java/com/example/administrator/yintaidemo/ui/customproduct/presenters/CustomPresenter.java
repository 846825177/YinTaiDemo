package com.example.administrator.yintaidemo.ui.customproduct.presenters;

import android.content.Context;

import com.example.administrator.yintaidemo.ui.customproduct.models.CustomModel;
import com.example.administrator.yintaidemo.ui.customproduct.models.CustomModelImp;
import com.example.administrator.yintaidemo.ui.customproduct.views.CustomViews;

import java.util.Map;

/**
 * Created by Mr Chen on 2017/10/23.
 */

public class CustomPresenter {
    private CustomModel model;
    private CustomViews views;

    public CustomPresenter(CustomViews views) {
        this.views = views;
        model = new CustomModelImp();
    }
    public  void send(String path, Map<String,String> mParams){
        model.send((Context) views,path,mParams,views);
    }


}
