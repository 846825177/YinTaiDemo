package com.example.administrator.yintaidemo.ui;

import android.content.Intent;
import android.widget.TextView;

import com.example.administrator.yintaidemo.R;

/**
 * Created by Mr Chen on 2017/10/22.
 */

public class CustomProductAcitivity extends BaseActivity {
    @Override
    public void init() {
        setShowHeader(true);
        setShowNotScollBody(true);
    }

    @Override
    public void run() {
        Intent intent = getIntent();
        String url = intent.getStringExtra("url");
        String name = intent.getStringExtra("name");
        setHeader(R.layout.customproduct_headerview);
        setBody(R.layout.customproduct_activity);
        TextView customproduct_title = (TextView) findViewById(R.id.customproduct_title);
        customproduct_title.setText(name);
    }

    @Override
    public void onRefresh() {

    }
}
