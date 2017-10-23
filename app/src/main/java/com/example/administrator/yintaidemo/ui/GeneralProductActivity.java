package com.example.administrator.yintaidemo.ui;

import android.content.Intent;
import android.widget.TextView;

import com.example.administrator.yintaidemo.R;

/**
 * Created by Mr Chen on 2017/10/22.
 */

public class GeneralProductActivity extends BaseActivity {
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
    }

    @Override
    public void onRefresh() {

    }
}
