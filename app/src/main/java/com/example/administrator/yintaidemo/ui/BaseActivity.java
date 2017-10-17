package com.example.administrator.yintaidemo.ui;

import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;

import com.example.administrator.yintaidemo.R;
import com.google.gson.Gson;

public abstract class BaseActivity extends AbstractActivity implements SwipeRefreshLayout.OnRefreshListener {
    protected LinearLayout headerlayout;
    protected LinearLayout footerlayouts;
    protected LinearLayout notground;
    protected LinearLayout ground;
    protected ScrollView scrollView;
    protected LinearLayout refreshlayout;
    protected SwipeRefreshLayout refresh;
    protected LinearLayout errorlayout;
    protected LinearLayout bodyzong;
    private RelativeLayout relative;

    private boolean isShowHeader = false;
    private boolean isShowFooter = false;

    public boolean isShowHeader() {
        return isShowHeader;
    }

    public void setShowHeader(boolean showHeader) {
        isShowHeader = showHeader;
    }

    public boolean isShowFooter() {
        return isShowFooter;
    }

    public void setShowFooter(boolean showFooter) {
        isShowFooter = showFooter;
    }

    private boolean isShowNotScollBody = false;
    private boolean isShowScollBody = false;
    private boolean isShowRrefshBody = false;
    private boolean isShowErrorBody = false;



    public boolean isShowNotScollBody() {
        return isShowNotScollBody;
    }

    public void setShowNotScollBody(boolean showNotScollBody) {
        isShowNotScollBody = showNotScollBody;
    }

    public boolean isShowScollBody() {
        return isShowScollBody;
    }

    public void setShowScollBody(boolean showScollBody) {
        isShowScollBody = showScollBody;
    }

    public boolean isShowRrefshBody() {
        return isShowRrefshBody;
    }

    public void setShowRrefshBody(boolean showRrefshBody) {
        isShowRrefshBody = showRrefshBody;
    }

    public boolean isShowErrorBody() {
        return isShowErrorBody;
    }

    public void setShowErrorBody(boolean showErrorBody) {
        isShowErrorBody = showErrorBody;
    }




    public abstract void init();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //设置加载哪个布局
        init();
        setContentView(R.layout.activity_base);
        initView();
        initViews();
        checkHeader();
        checkBody();
        checkFooter();
        run();



    }
    public abstract void run();

    public void checkHeader() {
        if (isShowHeader) {
            headerlayout.setVisibility(View.GONE);
        } else {
            headerlayout.setVisibility(View.VISIBLE);
        }


    }

    public void checkBody() {
        if (isShowScollBody){
            ground.setVisibility(View.VISIBLE);
            return;

        }else {
       ground.setVisibility(View.GONE);
        }

        if (isShowNotScollBody){
            notground.setVisibility(View.VISIBLE);
            return;
        }else {
            notground.setVisibility(View.GONE);
        }

        if (isShowErrorBody){
            errorlayout.setVisibility(View.VISIBLE);
            return;
        }else {
            errorlayout.setVisibility(View.GONE);
        }

        if (isShowRrefshBody){
            refreshlayout.setVisibility(View.VISIBLE);
            return;
        }else {
            refreshlayout.setVisibility(View.GONE);
        }




    }


    public void checkFooter() {
        if (isShowFooter) {
            footerlayouts.setVisibility(View.GONE);

        } else {
            footerlayouts.setVisibility(View.VISIBLE);
        }


    }


    private void initView() {
        bodyzong = (LinearLayout) findViewById(R.id.bodyzong);


        relative = (RelativeLayout) findViewById(R.id.relative);
        // relative.setOnClickListener(this);
    }

    private void initViews() {
        headerlayout = (LinearLayout) findViewById(R.id.headerlayout);
        footerlayouts = (LinearLayout) findViewById(R.id.footerlayouts);
        notground = (LinearLayout) findViewById(R.id.notground);
        ground = (LinearLayout) findViewById(R.id.ground);
        scrollView = (ScrollView) findViewById(R.id.scrollView);
        refreshlayout = (LinearLayout) findViewById(R.id.refreshlayout);
        refresh = (SwipeRefreshLayout) findViewById(R.id.refresh);
        refresh.setOnRefreshListener(this);
        errorlayout = (LinearLayout) findViewById(R.id.errorlayout);
    }
    public void setHeader(int id){
        if (isShowHeader){
            headerlayout.addView(infalter(id));
        }

    }
public void setBody(int id){
    if (isShowErrorBody){
        errorlayout.addView(infalter(id));
        return;
    }
    if (isShowNotScollBody){
        notground.addView(infalter(id));
        return;
    }
    if (isShowRrefshBody){
        refreshlayout.addView(infalter(id));
        return;
    }
    if (isShowScollBody){
        ground.addView(infalter(id));
        return;
    }



}
public void setFooter(int id){
    footerlayouts.addView(infalter(id));
}


}
