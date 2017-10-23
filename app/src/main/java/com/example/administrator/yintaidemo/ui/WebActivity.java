package com.example.administrator.yintaidemo.ui;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import com.example.administrator.yintaidemo.R;

public class WebActivity extends AppCompatActivity {

    private WebView mWebView;
    private ProgressBar mProgressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        Intent intent = getIntent();
        String url = intent.getStringExtra("url");
        initView();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            mWebView.getSettings().setMixedContentMode(
                    WebSettings.MIXED_CONTENT_COMPATIBILITY_MODE);
        }
        geturl(url);
    }

    private void initView() {
        mWebView = (WebView) findViewById(R.id.mWebView);
        mProgressBar = (ProgressBar) findViewById(R.id.mProgressBar);
    }

    private void geturl(String url) {
        //获取一个webviewsetting对象
        WebSettings setting = mWebView.getSettings();
        //支持JavaScript
        setting.setJavaScriptEnabled(true);
        //显示缩放控制工具
        setting.setDisplayZoomControls(true);
        //设置webview支持缩放
        setting.setSupportZoom(true);
        setting.setBuiltInZoomControls(true);
        //设置加载进来的页面自适应手机屏幕
        //设置缓存
        setting.setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
        //设置适应Html5的一些方法
        setting.setDomStorageEnabled(true);
        setting.setUseWideViewPort(true);
        setting.setLoadWithOverviewMode(true);
        mWebView.setWebChromeClient(new WebChromeClient());
        mWebView.setWebViewClient(new WebViewClient());
//        rv_same.getSettings().setJavaScriptEnabled(true);
        mWebView.loadUrl(url);
//        WebSettings settings = rv_same.getSettings();
//        settings.setJavaScriptEnabled(true);
        mWebView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });
        mWebView.setWebChromeClient(new WebChromeClient() {
            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                if (newProgress == 100) {
                    mProgressBar.setVisibility(View.GONE);//加载完网页进度条消失
                } else {
                    mProgressBar.setVisibility(View.VISIBLE);//开始加载网页时显示进度条
                    mProgressBar.setProgress(newProgress);//设置进度值
                }

            }
        });
    }

}
