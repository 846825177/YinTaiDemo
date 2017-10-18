package com.example.administrator.yintaidemo.ui.fragemnts.homefragment.presenters;

import android.content.Context;

import com.example.administrator.yintaidemo.ui.fragemnts.homefragment.models.HomeFragmentModel;
import com.example.administrator.yintaidemo.ui.fragemnts.homefragment.models.HomeFragmentModelImp;
import com.example.administrator.yintaidemo.ui.fragemnts.homefragment.views.HomeFragmentView;

import java.util.Map;

/**
 * Created by Mr Chen on 2017/10/17.
 */

public class HomeFragmentPresenter {
    private HomeFragmentView view;
    private HomeFragmentModel model;

    public HomeFragmentPresenter(HomeFragmentView view) {
        this.view = view;
        this.model = new HomeFragmentModelImp();
    }

    public void request(Context context,Map<String, String> mParams) {
        model.request(context, mParams, view);
    }
}
