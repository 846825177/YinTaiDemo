package com.example.administrator.yintaidemo.ui.startpage.presenter;

import android.content.Context;

import com.example.administrator.yintaidemo.ui.startpage.models.StartModel;
import com.example.administrator.yintaidemo.ui.startpage.models.StartModelImp;
import com.example.administrator.yintaidemo.ui.startpage.views.StartView;

import java.util.Map;

/**
 * Created by Mr Chen on 2017/10/17.
 */

public class StartPresenter {
    private StartView view;
    private StartModel model;

    public  StartPresenter(StartView view){
        this.view=view;
       this. model =new StartModelImp();
    }

    public void request(Map<String,String> mParams){
        model.request((Context) view,mParams,view);
    }
}
