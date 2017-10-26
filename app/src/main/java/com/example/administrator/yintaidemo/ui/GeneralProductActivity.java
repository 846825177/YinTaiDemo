package com.example.administrator.yintaidemo.ui;

import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.example.administrator.yintaidemo.R;
import com.example.administrator.yintaidemo.entity.GeneraProductBean;
import com.example.administrator.yintaidemo.http.BaseParams;
import com.example.administrator.yintaidemo.ui.customproduct.presenters.CustomPresenter;
import com.example.administrator.yintaidemo.ui.customproduct.views.CustomViews;
import com.example.administrator.yintaidemo.utils.JumpActivityUtils;
import com.example.administrator.yintaidemo.utils.PhoneParamsUtils;
import com.recker.flybanner.FlyBanner;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static android.view.ViewGroup.LayoutParams;

/**
 * Created by Mr Chen on 2017/10/22.
 */

public class GeneralProductActivity extends BaseActivity implements CustomViews<GeneraProductBean>, View.OnClickListener {

    private FlyBanner banner_top_body;
    private TextView tv_price_market_body;
    private TextView tv_price_yintai_body;
    private TextView tv_name_left_body;
    private TextView tv_brand_body;
    private TextView tv_code_body;
    private Map<String, String> mTempMap = new HashMap<>();
    private TextView productdetail_property_label;

    @Override
    public void init() {
        setShowHeader(true);
        setShowErrorBody(true);
    }

    @Override
    public void run() {
        Intent intent = getIntent();
        String url = intent.getStringExtra("url");
        String name = intent.getStringExtra("name");
        String sku = intent.getStringExtra("sku");
        setHeader(R.layout.generalproduct_headerview);
        setBody(R.layout.activity_commodity_details);
        TextView generalproduct_title = (TextView) findViewById(R.id.generalproduct_title);
        banner_top_body = (FlyBanner) findViewById(R.id.banner_top_body);
        tv_price_market_body = (TextView) findViewById(R.id.tv_price_market_body);
        tv_price_yintai_body = (TextView) findViewById(R.id.tv_price_yintai_body);
        tv_name_left_body = (TextView) findViewById(R.id.tv_name_left_body);
        tv_brand_body = (TextView) findViewById(R.id.tv_brand_body);
        tv_code_body = (TextView) findViewById(R.id.tv_code_body);
        productdetail_property_label = (TextView) findViewById(R.id.productdetail_property_label);
        productdetail_property_label.setOnClickListener(this);
        generalproduct_title.setText("商品详情");

      if(url!=null&&!url.equals("")){
          Uri uri = Uri.parse(url);
          Set<String> set = uri.getQueryParameterNames();
          for (Iterator iterator = set.iterator(); iterator.hasNext(); ) {
              String name1 = (String) iterator.next();
              String value = uri.getQueryParameter(name1);
              Log.e("TAG", name1 + "---" + value);
              mTempMap.put(name1, value);
          }
      }

        CustomPresenter customPresenter = new CustomPresenter(this);
        Map<String, String> mParam = new HashMap<>();
        BaseParams.getParams(mParam, this);
        HashMap<String, String> mParams = PhoneParamsUtils.signBusinessParameter(this, (HashMap<String, String>) mParam);
        mParam.put("timereq", JumpActivityUtils.getTime());
        mParams.put("ver", "3.0");
        if(sku==null||sku.equals("")){
            mParams.put("data", "{\"itemcode\":\"" + mTempMap.get("sku") + "\"}");
        }else {
            mParams.put("data", "{\"itemcode\":\"" + sku + "\"}");
        }
        mParams.put("method", "products.getproduct");
        customPresenter.send("", mParams);
    }

    @Override
    public void onRefresh() {

    }

    @Override
    public void success(GeneraProductBean generaProductBean) {
        List<String> small_img_urls = generaProductBean.getData().getCurrent().getSmall_img_urls();
        GeneraProductBean.DataBean.CurrentBean current = generaProductBean.getData().getCurrent();

        banner_top_body.setImagesUrl(small_img_urls);
        tv_name_left_body.setText(current.getName());
        tv_price_yintai_body.setText(current.getYt_price() + "");
        tv_price_market_body.setText(current.getPrice() + "");
        tv_brand_body.setText(current.getBrand());
        tv_code_body.setText(current.getItemcode());

    }

    @Override
    public void failure(Exception e) {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.productdetail_property_label:
                View inflate = LayoutInflater.from(this).inflate(R.layout.body_commodity, null);
                PopupWindow popupWindow = new PopupWindow(inflate, LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT, true);
                popupWindow.setContentView(inflate);

                View rootview = LayoutInflater.from(GeneralProductActivity.this).inflate(R.layout.activity_commodity_details, null);
                popupWindow.showAtLocation(rootview, Gravity.BOTTOM, 0, 0);
                break;

        }
    }
}
