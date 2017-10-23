package com.example.administrator.yintaidemo.ui.settlement;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.administrator.yintaidemo.R;
import com.example.administrator.yintaidemo.adapters.ListviewAdapter2;
import com.example.administrator.yintaidemo.entity.ShopCartEntity;
import com.j256.ormlite.logger.Log;

import java.util.ArrayList;

import retrofit2.http.POST;

import static android.R.attr.name;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

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
    private ArrayList<ShopCartEntity> list;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initView();
        tool.setTitle("结算中心");

        setSupportActionBar(tool);


        Intent intent = getIntent();

        list = intent.getParcelableArrayListExtra("jihe");
        int judge = intent.getIntExtra("judge", 7);
        int count = intent.getIntExtra("count", 7);

        ListviewAdapter2 listviewAdapter2 = new ListviewAdapter2(list,SettlementscenterActivity.this);
        listView.setAdapter(listviewAdapter2);
      //  Toast.makeText(this, count, Toast.LENGTH_SHORT).show();







        settlement_shop_numamount.setText(count + "件");
        tv_address.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1 = new Intent(SettlementscenterActivity.this, AdressActivity.class);
                startActivityForResult(intent1, 12);

            }
        });
        tv_paymentmethod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(SettlementscenterActivity.this, PayActivity.class);
                startActivityForResult(intent1, 14);
            }
        });

        tv_sendtime.setOnClickListener(new View.OnClickListener() {
            private Button po_button;
            private CheckBox po_three;
            private CheckBox po_two;
            private CheckBox po_one;

            @Override
            public void onClick(View v) {
                View inflate = LayoutInflater.from(SettlementscenterActivity.this).inflate(R.layout.popupertime, null);
                final PopupWindow popupWindow = new PopupWindow(inflate, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT, true);
                popupWindow.setBackgroundDrawable(new ColorDrawable(0x00000000));
                popupWindow.showAsDropDown(inflate, 100, 220);
                // popupWindow.setFocusable(true);
                popupWindow.setTouchable(true);

                Button button = inflate.findViewById(R.id.po_button);
                final CheckBox checkBoxone = inflate.findViewById(R.id.po_one);
                final CheckBox checkBoxtwo = inflate.findViewById(R.id.po_two);
                final CheckBox checkBoxthree = inflate.findViewById(R.id.po_three);

                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popupWindow.dismiss();
                    }
                });

                checkBoxone.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        tv_sendtime.setText(checkBoxone.getText());
                        popupWindow.dismiss();


                    }
                });
                checkBoxtwo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        tv_sendtime.setText(checkBoxtwo.getText());
                        popupWindow.dismiss();


                    }
                });

                checkBoxthree.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        tv_sendtime.setText(checkBoxthree.getText());
                        popupWindow.dismiss();


                    }
                });


            }
        });


        tv_receipt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(SettlementscenterActivity.this, WantPicketActivity.class);
                startActivityForResult(intent1, 80);
            }
        });
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
//        //图片
//        settlement_shop_image = (ImageView) findViewById(R.id.settlement_shop_image);
//        //name
//        settlement_shop_name = (TextView) findViewById(R.id.settlement_shop_name);
//        //颜色尺码
//        colororsize = (TextView) findViewById(R.id.colororsize);
//        //num
//        num = (TextView) findViewById(R.id.num);
//        //price
//        settlement_shop_price = (TextView) findViewById(R.id.settlement_shop_price);

        listView = (ListView) findViewById(R.id.listview2);

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

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {


        if (requestCode == 80 && resultCode == 90) {
            String text = data.getStringExtra("text");
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
            tv_receipt.setText("索要发票(" + text + ")");

        }


        if (requestCode==14&&resultCode==15){
            String text = data.getStringExtra("text");

            tv_paymentmethod.setText("支付方式  "+text);
        }




        super.onActivityResult(requestCode, resultCode, data);


    }
}
