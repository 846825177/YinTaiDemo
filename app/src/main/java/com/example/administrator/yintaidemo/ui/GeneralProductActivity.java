package com.example.administrator.yintaidemo.ui;

import android.content.Intent;
import android.widget.TextView;

import com.example.administrator.yintaidemo.R;
import com.example.administrator.yintaidemo.entity.GeneraProductBean;
import com.example.administrator.yintaidemo.http.BaseParams;
import com.example.administrator.yintaidemo.ui.customproduct.presenters.CustomPresenter;
import com.example.administrator.yintaidemo.ui.customproduct.views.CustomViews;
import com.example.administrator.yintaidemo.utils.PhoneParamsUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mr Chen on 2017/10/22.
 */

public class GeneralProductActivity extends BaseActivity implements CustomViews<GeneraProductBean>{
    @Override
    public void init() {
        setShowHeader(true);
        setShowErrorBody(true);
    }

    @Override
    public void run() {
        Intent intent = getIntent();
        String url = intent.getStringExtra("url");
        String name = intent.getStringExtra("name");
        setHeader(R.layout.generalproduct_headerview);
        setBody(R.layout.generalproduct_activity);
        TextView generalproduct_title = (TextView) findViewById(R.id.generalproduct_title);
        generalproduct_title.setText("商品详情");
        CustomPresenter customPresenter = new CustomPresenter(this);
        Map<String,String> mParam = new HashMap<>();
        BaseParams.getParams(mParam,this);
        HashMap<String, String> mParams = PhoneParamsUtils.signBusinessParameter(this, (HashMap<String, String>) mParam);
        mParams.put("ver","3.0");
        mParams.put("data","{\"itemcode\":\"21-467-4420\"}");
        mParams.put("method","products.getproduct");

        customPresenter.send("",mParams);
    }

    @Override
    public void onRefresh() {

    }

    @Override
    public void success(GeneraProductBean generaProductBean) {

    }

    @Override
    public void failure(Exception e) {

    }
}
