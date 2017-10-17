package com.example.administrator.yintaidemo.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.administrator.yintaidemo.R;

public class MainActivity extends BaseActivity{

    @Override
    public void init() {

        setShowHeader(true);
        setShowScollBody(true);
        setShowFooter(true);

    }


    @Override
    public void run() {
       setHeader(R.layout.header);
        setBody(R.layout.body);
        setFooter(R.layout.footer);



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
