package com.example.administrator.yintaidemo.ui.dengluactivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.yintaidemo.R;


public class XiaoxiActivity extends Activity {

    private ImageView xiaoxi_img_fanhui;
    private TextView xiaoxi_textview_bianji;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xiaoxi);
        initView();
    }

    private void initView() {
        xiaoxi_img_fanhui = (ImageView) findViewById(R.id.xiaoxi_img_fanhui);
        xiaoxi_textview_bianji = (TextView) findViewById(R.id.xiaoxi_textview_bianji);
    }
}
