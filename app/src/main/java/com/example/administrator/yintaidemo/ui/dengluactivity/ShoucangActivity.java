package com.example.administrator.yintaidemo.ui.dengluactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.administrator.yintaidemo.R;
import com.example.administrator.yintaidemo.ui.fragemnts.MineYinTaiFragment;

public class ShoucangActivity extends Activity {

    private ImageView shoucang_img_fanhui;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoucang);
        initView();
    }

    private void initView() {
        shoucang_img_fanhui = (ImageView) findViewById(R.id.shoucang_img_fanhui);
        shoucang_img_fanhui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ShoucangActivity.this, MineYinTaiFragment.class));
                finish();
            }
        });
    }
}
