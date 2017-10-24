package com.example.administrator.yintaidemo.ui.fragemnts.forestallfragment.presenter;

import android.content.Context;

import com.example.administrator.yintaidemo.ui.fragemnts.forestallfragment.model.ForestallModel;
import com.example.administrator.yintaidemo.ui.fragemnts.forestallfragment.views.ForestallView;

import java.util.Map;

/**
 * Created by 张扬帆 on 2017/10/20.
 */

public class ForestallPresenter {
    private ForestallView view;
    private ForestallModel model;

    public ForestallPresenter(ForestallView view) {
        this.view = view;
        model=new ForestallModel();
    }

    public void request(Context  context,Map<String,String> mParams){
        model.request(context, mParams,view);
    }
}
