package com.example.administrator.yintaidemo.ui;

import com.example.administrator.yintaidemo.R;

public class SearchActivity extends BaseActivity {

    @Override
    public void init() {
        setShowHeader(true);
        setShowErrorBody(true);
    }

    @Override
    public void run() {
        setBody(R.layout.activity_search);
    }

    @Override
    public void onRefresh() {

    }
}
