package com.example.administrator.yintaidemo.ui.startpage;

import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.example.administrator.yintaidemo.R;
import com.example.administrator.yintaidemo.entity.StartBean;
import com.example.administrator.yintaidemo.http.BaseParams;
import com.example.administrator.yintaidemo.ui.BaseActivity;
import com.example.administrator.yintaidemo.ui.homepage.HomePageActivity;
import com.example.administrator.yintaidemo.ui.startpage.presenter.StartPresenter;
import com.example.administrator.yintaidemo.ui.startpage.views.StartView;

import java.util.HashMap;
import java.util.Map;

public class StartActivity extends BaseActivity implements StartView<StartBean> {

    private ProgressBar mStart_progressBar;
    private SharedPreferences startpage;
    private SharedPreferences.Editor edit;

    @Override
    public void init() {
        setShowHeader(false);
        setShowNotScollBody(true);
        setShowFooter(false);

    }

    @Override
    public void run() {
        setBody(R.layout.startpage_layout);
        ImageView mStartPage = bodyzong.findViewById(R.id.mStartPage);
        mStart_progressBar = bodyzong.findViewById(R.id.mStart_ProgressBar);
        mStartPage.setBackgroundResource(R.mipmap.welcome);
        mStart_progressBar.setVisibility(View.VISIBLE);
        startpage = getSharedPreferences("startpage", MODE_PRIVATE);
        edit = startpage.edit();
        StartPresenter presenter = new StartPresenter(this);
        Map<String, String> mParams = new HashMap<>();
        BaseParams.getParams(mParams, StartActivity.this);
        mParams.put("method", "sys.public.getkey");
        presenter.request(mParams);
    }

    @Override
    public void onRefresh() {
        if (refresh.isRefreshing()) {
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    refresh.setRefreshing(false);
                }
            }, 500);
        }
    }

    @Override
    public void success(StartBean startBean) {
        mStart_progressBar.setVisibility(View.GONE);
        edit.putString("appkey", startBean.getData().getApp_data().getAppkey());
        edit.putString("secretkey", startBean.getData().getApp_data().getSecretkey());
        startActivity(new Intent(StartActivity.this, HomePageActivity.class));
    }

    @Override
    public void failure(Exception e) {

    }
}
