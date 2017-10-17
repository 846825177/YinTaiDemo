package com.example.administrator.yintaidemo.ui.startpage;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;

import com.example.administrator.yintaidemo.R;
import com.example.administrator.yintaidemo.adapters.StartPageAdapter;
import com.example.administrator.yintaidemo.entity.StartBean;
import com.example.administrator.yintaidemo.http.BaseParams;
import com.example.administrator.yintaidemo.ui.BaseActivity;
import com.example.administrator.yintaidemo.ui.homepage.HomePageActivity;
import com.example.administrator.yintaidemo.ui.startpage.presenter.StartPresenter;
import com.example.administrator.yintaidemo.ui.startpage.views.StartView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StartActivity extends BaseActivity implements StartView<StartBean> {

    private ProgressBar mStart_progressBar;
    private SharedPreferences startpage;
    private SharedPreferences.Editor edit;
    private ViewPager mStartViewPager;
    private ImageView mStartPage;
    private LinearLayout mViewPagerNumber;
    private Button mStartJump;
    private ArrayList<View> mNumber = new ArrayList<>();

    @Override
    public void init() {
        setShowHeader(false);
        setShowNotScollBody(true);
        setShowFooter(false);

    }

    @Override
    public void run() {
        setBody(R.layout.startpage_layout);
        initView();
    }

    private void initView() {
        mStartPage = bodyzong.findViewById(R.id.mStartPage);
        mStart_progressBar = bodyzong.findViewById(R.id.mStart_ProgressBar);
        mStartViewPager = bodyzong.findViewById(R.id.mStartViewPager);
        mViewPagerNumber = bodyzong.findViewById(R.id.mViewPagerNumber);
        mStartJump = bodyzong.findViewById(R.id.mStartJump);
        mStartPage.setBackgroundResource(R.mipmap.welcome);
        mStart_progressBar.setVisibility(View.VISIBLE);
        startpage = getSharedPreferences("startpage", MODE_PRIVATE);
        edit = startpage.edit();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                StartPresenter presenter = new StartPresenter(StartActivity.this);
                Map<String, String> mParams = new HashMap<>();
                BaseParams.getParams(mParams, StartActivity.this);
                mParams.put("method", "sys.public.getkey");
                presenter.request(mParams);
            }
        }, 2000);
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
        String page = startpage.getString("page", "");
        if (page == null || page.equals("")) {
            mViewPagerNumber.setVisibility(View.VISIBLE);
            mStartPage.setVisibility(View.GONE);
            mStartViewPager.setVisibility(View.VISIBLE);
            ArrayList<View> integers = new ArrayList<>();
            integers.add(new ImageView(StartActivity.this));
            integers.add(new ImageView(StartActivity.this));
            integers.add(new ImageView(StartActivity.this));
            integers.add(new ImageView(StartActivity.this));
            integers.add(new ImageView(StartActivity.this));
            integers.get(0).setBackgroundResource(R.mipmap.start_one);
            integers.get(1).setBackgroundResource(R.mipmap.start_two);
            integers.get(2).setBackgroundResource(R.mipmap.start_three);
            integers.get(3).setBackgroundResource(R.mipmap.start_four);
            integers.get(4).setBackgroundResource(R.mipmap.start_five);
            StartPageAdapter startPageAdapter = new StartPageAdapter(integers);
            mStartViewPager.setAdapter(startPageAdapter);
            for (int i = 0; i < integers.size(); i++) {
                ImageView imageView = new ImageView(StartActivity.this);
                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(20, 20);
                imageView.setLayoutParams(params);
                params.setMargins(5, 5, 5, 15);
                if (i == 0) {
                    imageView.setBackgroundResource(R.drawable.startpage_image_ok);
                } else {
                    imageView.setBackgroundResource(R.drawable.startpage_image_not);
                }
                mNumber.add(imageView);
                mViewPagerNumber.addView(imageView);
            }
            mStartViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                @Override
                public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                }

                @Override
                public void onPageSelected(int position) {
                    for (int i = 0; i < mNumber.size(); i++) {
                        if (i == position) {
                            mNumber.get(i).setBackgroundResource(R.drawable.startpage_image_ok);
                        } else {
                            mNumber.get(i).setBackgroundResource(R.drawable.startpage_image_not);
                        }
                    }
                    if (position == mNumber.size() - 1) {
                        mStartJump.setVisibility(View.VISIBLE);
                        mViewPagerNumber.setVisibility(View.GONE);
                    } else {
                        mStartJump.setVisibility(View.GONE);
                        mViewPagerNumber.setVisibility(View.VISIBLE);
                    }

                }

                @Override
                public void onPageScrollStateChanged(int state) {

                }
            });

        } else {
            startActivity(new Intent(StartActivity.this, HomePageActivity.class));
        }


    }

    @Override
    public void failure(Exception e) {

    }
}
