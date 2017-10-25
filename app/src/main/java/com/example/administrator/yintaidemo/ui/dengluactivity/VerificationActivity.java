package com.example.administrator.yintaidemo.ui.dengluactivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.administrator.yintaidemo.R;
import com.mob.MobSDK;

import org.json.JSONObject;

import cn.smssdk.EventHandler;
import cn.smssdk.SMSSDK;
/*
* 短信验证*/
public class VerificationActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "SmsYanzheng";

    private TextView yanzheng_text_shoujihao;
    private Button yanzheng_btn_huoqu;
    private EditText yanzheng_edit_yanzhengma;
    private EditText yanzheng_edit_pass;
    private Button yanzheng_btn_tijiao;

    EventHandler eventHandler;
    String strPhoneNumber;
    private ImageView yanzheng_img_fanhui;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification);
        Intent intent = getIntent();
        String phone = intent.getStringExtra("phone");
        initView();
        yanzheng_text_shoujihao.setText(phone);
    }


    private void initView() {
        yanzheng_text_shoujihao = (TextView) findViewById(R.id.yanzheng_text_shoujihao);
        yanzheng_btn_huoqu = (Button) findViewById(R.id.yanzheng_btn_huoqu);
        yanzheng_edit_yanzhengma = (EditText) findViewById(R.id.yanzheng_edit_yanzhengma);
        yanzheng_edit_pass = (EditText) findViewById(R.id.yanzheng_edit_pass);
        yanzheng_btn_tijiao = (Button) findViewById(R.id.yanzheng_btn_tijiao);
        yanzheng_img_fanhui = (ImageView) findViewById(R.id.yanzheng_img_fanhui);
        yanzheng_btn_huoqu.setOnClickListener(this);
        yanzheng_btn_tijiao.setOnClickListener(this);
        yanzheng_img_fanhui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VerificationActivity.this,RegisterActivity.class));
                finish();
            }
        });
        //   SMSSDK.init(this, "1946473cf2db0", "6619774d8587a6eecdbd06f52abaa346");
        MobSDK.init(this, "1fa649caa0f2e", "5aa32796d717241e86d14939a4b0bc51");
        eventHandler = new EventHandler() {

            /**
             * 在操作之后被触发
             *
             * @param event  参数1
             * @param result 参数2 SMSSDK.RESULT_COMPLETE表示操作成功，为SMSSDK.RESULT_ERROR表示操作失败
             * @param data   事件操作的结果
             */

            @Override
            public void afterEvent(int event, int result, Object data) {
                Message message = myHandler.obtainMessage(0x00);
                message.arg1 = event;
                message.arg2 = result;
                message.obj = data;
                myHandler.sendMessage(message);
            }
        };

        SMSSDK.registerEventHandler(eventHandler);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        SMSSDK.unregisterEventHandler(eventHandler);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.yanzheng_btn_tijiao) {
            String strCode = yanzheng_edit_yanzhengma.getText().toString();
            if (null != strCode && strCode.length() == 4) {
                Log.d(TAG, yanzheng_edit_yanzhengma.getText().toString());
                SMSSDK.submitVerificationCode("86", strPhoneNumber, yanzheng_edit_yanzhengma.getText().toString());
            } else {
                Toast.makeText(this, "请输入验证码", Toast.LENGTH_SHORT).show();
            }
        } else if (v.getId() == R.id.yanzheng_btn_huoqu) {
            strPhoneNumber = yanzheng_text_shoujihao.getText().toString();
            if (null == strPhoneNumber || "".equals(strPhoneNumber) || strPhoneNumber.length() != 11) {
                Toast.makeText(this, "电话号码输入有误", Toast.LENGTH_SHORT).show();
                return;
            }
            SMSSDK.getVerificationCode("86", strPhoneNumber);
            yanzheng_btn_huoqu.setClickable(false);
            //开启线程去更新button的text
            new Thread() {
                @Override
                public void run() {
                    int totalTime = 60;
                    for (int i = 0; i < totalTime; i++) {
                        Message message = myHandler.obtainMessage(0x01);
                        message.arg1 = totalTime - i;
                        myHandler.sendMessage(message);
                        try {
                            sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    myHandler.sendEmptyMessage(0x02);
                }
            }.start();
        }
    }

    Handler myHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case 0x00:
                    int event = msg.arg1;
                    int result = msg.arg2;
                    Object data = msg.obj;
                    Log.e(TAG, "result : " + result + ", event: " + event + ", data : " + data);
                    if (result == SMSSDK.RESULT_COMPLETE) { //回调  当返回的结果是complete
                        if (event == SMSSDK.EVENT_GET_VERIFICATION_CODE) { //获取验证码
                            Toast.makeText(VerificationActivity.this, "发送验证码成功", Toast.LENGTH_SHORT).show();
                            Log.d(TAG, "get verification code successful.");
                        } else if (event == SMSSDK.EVENT_SUBMIT_VERIFICATION_CODE) { //提交验证码
                            Log.d(TAG, "submit code successful");
                            submit();
                            Toast.makeText(VerificationActivity.this, "提交验证码成功", Toast.LENGTH_SHORT).show();
//                            Intent intent = new Intent(VerificationActivity.this, Main2Activity.class);
//                            startActivity(intent);

                        } else {
                            Log.d(TAG, data.toString());
                        }
                    } else { //进行操作出错，通过下面的信息区分析错误原因
                        try {
                            Throwable throwable = (Throwable) data;
                            throwable.printStackTrace();
                            JSONObject object = new JSONObject(throwable.getMessage());
                            String des = object.optString("detail");//错误描述
                            int status = object.optInt("status");//错误代码
                            //错误代码：  http://wiki.mob.com/android-api-%E9%94%99%E8%AF%AF%E7%A0%81%E5%8F%82%E8%80%83/
                            Log.e(TAG, "status: " + status + ", detail: " + des);
                            if (status > 0 && !TextUtils.isEmpty(des)) {
                                Toast.makeText(VerificationActivity.this, des, Toast.LENGTH_SHORT).show();
                                return;
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }

                    break;
                case 0x01:
                    yanzheng_btn_huoqu.setText("重新发送(" + msg.arg1 + ")");
                    break;
                case 0x02:
                    yanzheng_btn_huoqu.setText("获取验证码");
                    yanzheng_btn_huoqu.setClickable(true);
                    break;
            }
        }
    };

    private void submit() {
        // validate
        String yanzhengma = yanzheng_edit_yanzhengma.getText().toString().trim();
        if (TextUtils.isEmpty(yanzhengma)) {
            Toast.makeText(this, "yanzhengma不能为空", Toast.LENGTH_SHORT).show();
            return;
        }else {

        String pass = yanzheng_edit_pass.getText().toString().trim();
        String name = yanzheng_text_shoujihao.getText().toString().trim();
        if (TextUtils.isEmpty(pass)) {

            Toast.makeText(this, "pass不能为空", Toast.LENGTH_SHORT).show();

            return;
        }else {
            SharedPreferences sp = getSharedPreferences("p", MODE_PRIVATE);
            SharedPreferences.Editor editor = sp.edit();
            editor.putString("uName", name);
            editor.putString("pWord", pass);

            //	 通过editor对象的commit方法把数据给提交过去,完成存储
            editor.commit();
            Intent intent = new Intent(VerificationActivity.this, LoginActivity.class);
            startActivity(intent);
            finish();
        }


    }}
}
