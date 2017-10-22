package com.example.administrator.yintaidemo.ui.settlement;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import com.example.administrator.yintaidemo.R;

public class PayActivity extends AppCompatActivity {

    private TextView zhifubaotext;
    private CheckBox pay_zhifubaocheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay);
        initView();

        pay_zhifubaocheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pay_zhifubaocheck.isChecked()){
                    CharSequence text = zhifubaotext.getText();
                    Toast.makeText(PayActivity.this, text, Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent();
                    intent.putExtra("text",text);
                    setResult(15,intent);
                    finish();


                }



            }
        });



    }

    private void initView() {
        zhifubaotext = (TextView) findViewById(R.id.zhifubaotext);
        pay_zhifubaocheck = (CheckBox) findViewById(R.id.pay_zhifubaocheck);
    }
}
