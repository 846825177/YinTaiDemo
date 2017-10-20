package com.example.administrator.yintaidemo.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.administrator.yintaidemo.R;

public class RegisterActivity extends Activity {

    private EditText phone1_edittext;
    private TextView phone1_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        initView();

    }

    private void initView() {
        phone1_edittext = (EditText) findViewById(R.id.phone1_edittext);
        phone1_button = (TextView) findViewById(R.id.phone1_button);
        phone1_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                submit();
            }
        });
    }


    private void submit() {
        // validate
        String edittext = phone1_edittext.getText().toString().trim();
        if (TextUtils.isEmpty(edittext)) {
            Toast.makeText(this, "手机号不能为空", Toast.LENGTH_SHORT).show();
        }else {
            startActivity(new Intent(RegisterActivity.this,VerificationActivity.class));
        }




    }
}
