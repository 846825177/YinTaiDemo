package com.example.administrator.yintaidemo.ui.dengluactivity;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.administrator.yintaidemo.R;
import com.example.administrator.yintaidemo.ui.fragemnts.MineYinTaiFragment;
import com.umeng.socialize.UMAuthListener;
import com.umeng.socialize.UMShareAPI;
import com.umeng.socialize.bean.SHARE_MEDIA;

import java.util.Map;

/**
 * 登录界面 第三方
 */

public class LoginActivity extends Activity implements View.OnClickListener {

    private TextView login_textview_zhuce;
    private EditText login_name;
    private EditText login_pass;
    private LinearLayout linearLayout1;
    private Button login_submit;
    private LinearLayout login_qq;
    private LinearLayout login_alipay;
    private LinearLayout login_weibo;
    private ImageView log_QQ;
    private String pWord, uName;
    private ImageView denglu_img_fanhui;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        SharedPreferences sh = getSharedPreferences("p", MODE_PRIVATE);
        pWord = sh.getString("pWord", null);
        uName = sh.getString("uName", null);
        if (Build.VERSION.SDK_INT >= 23) {
            String[] mPermissionList = new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.CALL_PHONE, Manifest.permission.READ_LOGS, Manifest.permission.READ_PHONE_STATE, Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.SET_DEBUG_APP, Manifest.permission.SYSTEM_ALERT_WINDOW, Manifest.permission.GET_ACCOUNTS, Manifest.permission.WRITE_APN_SETTINGS};
            ActivityCompat.requestPermissions(this, mPermissionList, 123);
        }
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
        denglu_img_fanhui = (ImageView) findViewById(R.id.denglu_img_fanhui);
        denglu_img_fanhui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        login_pass.setText(pWord);
        login_name.setText(uName);
        login_submit.setOnClickListener(this);
        login_textview_zhuce.setOnClickListener(this);
        log_QQ = (ImageView) findViewById(R.id.log_QQ);
        log_QQ.setOnClickListener(this);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        UMShareAPI.get(this).onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.login_submit:
                submit();
                break;
            case R.id.login_textview_zhuce:
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
                finish();
                break;
            case R.id.log_QQ:
                UMShareAPI.get(LoginActivity.this).doOauthVerify(LoginActivity.this, SHARE_MEDIA.QQ, new UMAuthListener() {
                    @Override
                    public void onStart(SHARE_MEDIA share_media) {

                    }

                    @Override
                    public void onComplete(SHARE_MEDIA share_media, int i, Map<String, String> map) {
                        Toast.makeText(LoginActivity.this, "登录成功", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onError(SHARE_MEDIA share_media, int i, Throwable throwable) {

                    }

                    @Override
                    public void onCancel(SHARE_MEDIA share_media, int i) {

                    }
                });
                break;

        }
    }

    private void submit() {
        // validate
        String name = login_name.getText().toString().trim();
        String pass = login_pass.getText().toString().trim();
        if (TextUtils.isEmpty(name) && TextUtils.isEmpty(pass)) {
            Toast.makeText(this, "用户名密码不能为空", Toast.LENGTH_SHORT).show();
            // return;
        } else {
            if (name.equals(uName) && pass.equals(pWord))
                //广播传值 怎么能广播呢现在注册好了 手机号密码都注册成功了 现在就剩登录了
                Toast.makeText(this, "登录成功", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, MineYinTaiFragment.class);
            intent.putExtra("name", name);
            intent.putExtra("password", pass);
            setResult(120, intent);
            finish();

        }
    }

}
