package com.example.administrator.yintaidemo.ui.startpage;

import android.widget.ImageView;

import com.example.administrator.yintaidemo.R;
import com.example.administrator.yintaidemo.ui.BaseActivity;

public class StartActivity extends BaseActivity {

    @Override
    public void init() {
        setShowHeader(true);
        setShowNotScollBody(true);
        setShowFooter(true);

    }

    @Override
    public void run() {
        setBody(R.layout.startpage_layout);
        ImageView mStartPage = bodyzong.findViewById(R.id.mStartPage);
        mStartPage.setBackgroundResource(R.mipmap.ic_launcher);
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
