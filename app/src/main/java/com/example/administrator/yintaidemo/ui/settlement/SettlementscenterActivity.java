package com.example.administrator.yintaidemo.ui.settlement;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.administrator.yintaidemo.R;

public class SettlementscenterActivity extends AppCompatActivity implements View.OnClickListener {

    private Toolbar tool;
    private TextView textView;
    private TextView tv_address;
    private TextView tv_paymentmethod;
    private TextView tv_sendtime;
    private TextView tv_receipt;
    private TextView tv_useCoupon;
    private TextView tv_uerremaining;
    private ImageView settlement_shop_image;
    private TextView settlement_shop_name;
    private TextView num;
    private TextView settlement_shop_price;
    private TextView settlement_shop_numamount;
    private TextView settlement_shopdiscounts;
    private TextView settlement_shopalreadyprice;
    private TextView settlement_ueryinyuan;
    private TextView settlement_ueryve;
    private TextView settlement_zhifuprice;
    private TextView settlement_getjifen;
    private Button button_tijiaodingdan;
    private TextView colororsize;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initView();
        tool.setTitle("结算中心");
        setSupportActionBar(tool);

//        intent.putExtra("name",name);
//        intent.putExtra("image",image);
//        intent.putExtra("color",color);
//        intent.putExtra("size",size);
//        intent.putExtra("num",num);
//        intent.putExtra("price",price);
//        intent.putExtra("judge",judge);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String image = intent.getStringExtra("image");
        String color = intent.getStringExtra("color");
        double price = intent.getDoubleExtra("price", 0);
        String size = intent.getStringExtra("size");
        int num = intent.getIntExtra("num", 1);
        intent.getIntExtra("judge",7);


        Glide.with(SettlementscenterActivity.this).load(image).into(settlement_shop_image);
        settlement_shop_name.setText(name);
        colororsize.setText(color+"|"+size);
        this.num.setText("数量:"+ num);
        settlement_shop_price.setText("价钱:"+price);
        settlement_shop_numamount.setText(num +"件");




    }

    private void initView() {
        tool = (Toolbar) findViewById(R.id.tool);
        textView = (TextView) findViewById(R.id.textView);
        tv_address = (TextView) findViewById(R.id.tv_address);
        tv_paymentmethod = (TextView) findViewById(R.id.tv_paymentmethod);
        tv_sendtime = (TextView) findViewById(R.id.tv_sendtime);
        tv_receipt = (TextView) findViewById(R.id.tv_receipt);
        tv_useCoupon = (TextView) findViewById(R.id.tv_useCoupon);
        tv_uerremaining = (TextView) findViewById(R.id.tv_uerremaining);
        //图片
        settlement_shop_image = (ImageView) findViewById(R.id.settlement_shop_image);
        //name
        settlement_shop_name = (TextView) findViewById(R.id.settlement_shop_name);
        //颜色尺码
        colororsize = (TextView) findViewById(R.id.colororsize);
        //num
        num = (TextView) findViewById(R.id.num);
        //price
        settlement_shop_price = (TextView) findViewById(R.id.settlement_shop_price);
        //件数
        settlement_shop_numamount = (TextView) findViewById(R.id.settlement_shop_numamount);
        settlement_shopdiscounts = (TextView) findViewById(R.id.settlement_shopdiscounts);
        settlement_shopalreadyprice = (TextView) findViewById(R.id.settlement_shopalreadyprice);
        settlement_ueryinyuan = (TextView) findViewById(R.id.settlement_ueryinyuan);
        settlement_ueryve = (TextView) findViewById(R.id.settlement_ueryve);
        settlement_zhifuprice = (TextView) findViewById(R.id.settlement_zhifuprice);
        settlement_getjifen = (TextView) findViewById(R.id.settlement_getjifen);
        button_tijiaodingdan = (Button) findViewById(R.id.button_tijiaodingdan);

        button_tijiaodingdan.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_tijiaodingdan:

                break;
        }
    }
}
