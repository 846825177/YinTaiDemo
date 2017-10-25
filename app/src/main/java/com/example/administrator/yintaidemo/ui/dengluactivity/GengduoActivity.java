package com.example.administrator.yintaidemo.ui.dengluactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.administrator.yintaidemo.R;
import com.example.administrator.yintaidemo.ui.fragemnts.MineYinTaiFragment;

public class GengduoActivity extends Activity {

    private ImageView gengduo_img_fanhui;
    private LinearLayout gengduo_linear_bangzhu;
    private LinearLayout gengduo_linear_fankui;
    private LinearLayout gengduo_linear_guanyu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gengduo);
        initView();
    }

    private void initView() {
        gengduo_img_fanhui = (ImageView) findViewById(R.id.gengduo_img_fanhui);
        gengduo_linear_bangzhu = (LinearLayout) findViewById(R.id.gengduo_linear_bangzhu);
        gengduo_linear_fankui = (LinearLayout) findViewById(R.id.gengduo_linear_fankui);
        gengduo_linear_guanyu = (LinearLayout) findViewById(R.id.gengduo_linear_guanyu);
        gengduo_img_fanhui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GengduoActivity.this, MineYinTaiFragment.class));
                finish();
            }
        });
        gengduo_linear_bangzhu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });
        gengduo_linear_fankui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GengduoActivity.this,FankuiActivity.class));

            }
        });
        gengduo_linear_guanyu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GengduoActivity.this,GuanyuActivity.class));
            }
        });

    }

}
