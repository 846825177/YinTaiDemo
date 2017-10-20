package com.example.administrator.yintaidemo.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.administrator.yintaidemo.R;

public class LoginActivity extends Activity implements View.OnClickListener {

    private TextView login_textview_zhuce;
    private EditText login_name;
    private EditText login_pass;
    private LinearLayout linearLayout1;
    private Button login_submit;
    private LinearLayout login_qq;
    private LinearLayout login_alipay;
    private LinearLayout login_weibo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
    }

    private void initView() {
        login_textview_zhuce = (TextView) findViewById(R.id.login_textview_zhuce);
        login_name = (EditText) findViewById(R.id.login_name);
        login_pass = (EditText) findViewById(R.id.login_pass);
        linearLayout1 = (LinearLayout) findViewById(R.id.linearLayout1);
        login_submit = (Button) findViewById(R.id.login_submit);
        login_qq = (LinearLayout) findViewById(R.id.login_qq);
        login_alipay = (LinearLayout) findViewById(R.id.login_alipay);
        login_weibo = (LinearLayout) findViewById(R.id.login_weibo);

        login_submit.setOnClickListener(this);
        login_textview_zhuce.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.login_submit:

                break;
            case R.id.login_textview_zhuce:
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
                break;
        }
    }

    private void submit() {
        // validate
        String name = login_name.getText().toString().trim();
        if (TextUtils.isEmpty(name)) {
            Toast.makeText(this, "name不能为空", Toast.LENGTH_SHORT).show();
            return;
        }

        String pass = login_pass.getText().toString().trim();
        if (TextUtils.isEmpty(pass)) {
            Toast.makeText(this, "pass不能为空", Toast.LENGTH_SHORT).show();
            return;
        }

        // TODO validate success, do something


    }
}
