package com.example.administrator.yintaidemo.ui.dengluactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.administrator.yintaidemo.R;
import com.example.administrator.yintaidemo.ui.fragemnts.MineYinTaiFragment;

public class QuanbuActivity extends Activity {

    private ImageView quanbu_img_fanhui;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quanbu);
        initView();
    }

    private void initView() {
        quanbu_img_fanhui = (ImageView) findViewById(R.id.quanbu_img_fanhui);
        quanbu_img_fanhui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(QuanbuActivity.this, MineYinTaiFragment.class));
                finish();


            }
        });
    }
}
