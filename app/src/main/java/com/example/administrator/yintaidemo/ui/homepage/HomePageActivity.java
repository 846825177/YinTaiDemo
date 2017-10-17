package com.example.administrator.yintaidemo.ui.homepage;

import android.widget.ImageView;

import com.example.administrator.yintaidemo.R;
import com.example.administrator.yintaidemo.ui.BaseActivity;

public class HomePageActivity extends BaseActivity {


    @Override
    public void init() {
        setShowHeader(true);
        setShowErrorBody(true);
        setShowFooter(true);

    }

    @Override
    public void run() {
        setBody(R.layout.startpage_layout);
        setFooter(R.layout.footer);
        setHeader(R.layout.header);
        initView();
    }
    public void initView(){
        ImageView imageView = bodyzong.findViewById(R.id.mStartPage);
        imageView.setBackgroundResource(R.mipmap.ic_launcher);
    }
    @Override
    public void onRefresh() {
        if (refresh.isRefreshing()){
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    refresh.setRefreshing(false);
                }
            },500);
        }
    }

}
