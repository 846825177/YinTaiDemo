package com.example.administrator.yintaidemo.ui.dengluactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.administrator.yintaidemo.R;
/**
 * 手机号注册页面
 *
 */

public class RegisterActivity extends Activity {

    private EditText phone1_edittext;
    private Button phone1_button;
    private String strPhoneNumber;
    private ImageView zhuce_img_fanhui;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        initView();

    }

    private void initView() {
        phone1_edittext = (EditText) findViewById(R.id.phone1_edittext);
        phone1_button = (Button) findViewById(R.id.phone1_button);
        zhuce_img_fanhui =(ImageView)findViewById(R.id.zhuce_img_fanhui);
        phone1_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                submit();
            }
        });
        zhuce_img_fanhui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RegisterActivity.this,LoginActivity.class));
                finish();
            }
        });
    }


    private void submit() {

        strPhoneNumber = phone1_edittext.getText().toString();
        if (null == strPhoneNumber || "".equals(strPhoneNumber) || strPhoneNumber.length() != 11) {
            Toast.makeText(this, "电话号码输入有误", Toast.LENGTH_SHORT).show();
            return;
        }else {
            Intent intent = new Intent(RegisterActivity.this,VerificationActivity.class);
            intent.putExtra("phone",strPhoneNumber);
            startActivity(intent);
            finish();
          //  startActivity(new Intent(RegisterActivity.this,VerificationActivity.class));
        }




    }
}
