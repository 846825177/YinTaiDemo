package com.example.administrator.yintaidemo.ui.customproduct;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import com.example.administrator.yintaidemo.R;
import com.example.administrator.yintaidemo.entity.CustomProductBean;
import com.example.administrator.yintaidemo.http.BaseParams;
import com.example.administrator.yintaidemo.ui.BaseActivity;
import com.example.administrator.yintaidemo.ui.customproduct.presenters.CustomPresenter;
import com.example.administrator.yintaidemo.ui.customproduct.views.CustomViews;
import com.example.administrator.yintaidemo.utils.JumpActivityUtils;
import com.example.administrator.yintaidemo.utils.PhoneParamsUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by Mr Chen on 2017/10/22.
 */

public class CustomProductAcitivity extends BaseActivity implements CustomViews<CustomProductBean>,  View.OnClickListener {
    private Map<String, String> mParams = new HashMap<>();
    private Map<String, String> mTempMap = new HashMap<>();
    private RecyclerView mCustomProduct;
    private ArrayList<CustomProductBean.DataBean.ProductListBean> mList = new ArrayList<>();
    private int ITEM_TYPE = 0;
    private CustomProductAdapter customProductAdapter;
    private CheckBox mGhBj;
    private String customlistid;
    private int discount = 0;
    private int price = 0;
    private HashMap<String, String> mParam;


    @Override
    public void init() {
        setShowHeader(true);
        setShowNotScollBody(true);
    }

    @Override
    public void run() {
        Intent intent = getIntent();
        String jumpUrl = intent.getStringExtra("url");
        setHeader(R.layout.customproduct_headerview);
        setBody(R.layout.customproduct_activity);
        mGhBj = (CheckBox) findViewById(R.id.mGhBj);
        mCustomProduct = (RecyclerView) findViewById(R.id.mCustomProduct);

        TextView customproduct_title = (TextView) findViewById(R.id.customproduct_title);
        mCustomProduct.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
        customProductAdapter = new CustomProductAdapter(mList, ITEM_TYPE, CustomProductAcitivity.this);
        mCustomProduct.setAdapter(customProductAdapter);
        mGhBj.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mCustomProduct.setLayoutManager(new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL));
                    customProductAdapter.setItemType(1);
                    customProductAdapter.notifyDataSetChanged();
                } else {
                    mCustomProduct.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
                    customProductAdapter.setItemType(0);
                    customProductAdapter.notifyDataSetChanged();
                }
            }
        });
        BaseParams.getParams(mParams, this);
        mParam = PhoneParamsUtils.signBusinessParameter(this, (HashMap<String, String>) mParams);
        mParam.put("ver", "3.0");
        mParam.put("method", "product.customtopiclist");
        mParam.put("sourceId", "1090610");
        mParam.put("wantype", "wifi");
        mParam.put("client_v", "4.0.5");
        mParam.put("timereq", JumpActivityUtils.getTime());
        Uri uri = Uri.parse(jumpUrl);
        Set<String> set = uri.getQueryParameterNames();
        for (Iterator iterator = set.iterator(); iterator.hasNext(); ) {
            String name1 = (String) iterator.next();
            String value = uri.getQueryParameter(name1);
            Log.e("TAG", name1 + "---" + value);
            mTempMap.put(name1, value);
        }
        customlistid = mTempMap.get("Customlistid");
        mParam.put("data", "{\"query_string\":\"589404\",\"displaycount\":\"30\",\"order_type\":\"0\",\"page_index\":\"1\",\"keyword\":\"" + customlistid + "\"}");
        customproduct_title.setText(mTempMap.get("title"));
        Button mDefault_RadioBtn = (Button) findViewById(R.id.mDefault_RadioBtn);
        Button mDiscount_RadioBtn = (Button) findViewById(R.id.mDiscount_RadioBtn);
        Button mPrice_RadioBtn = (Button) findViewById(R.id.mPrice_RadioBtn);
        Button mSv_RadioBtn = (Button) findViewById(R.id.mSv_RadioBtn);
        mDefault_RadioBtn.setOnClickListener(this);
        mDiscount_RadioBtn.setOnClickListener(this);
        mPrice_RadioBtn.setOnClickListener(this);
        mSv_RadioBtn.setOnClickListener(this);

        initData();
    }

    private void initData() {
        CustomPresenter presenter = new CustomPresenter(this);
        presenter.send("", mParam);
    }

    @Override
    public void onRefresh() {

    }


    @Override
    public void success(CustomProductBean customProductBean) {
        Log.e("TAG", customProductBean.getData().getProduct_list().toString());
        mList.addAll(customProductBean.getData().getProduct_list());
        customProductAdapter.notifyDataSetChanged();
    }

    @Override
    public void failure(Exception e) {

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            //默认
            case R.id.mDefault_RadioBtn:
                mParams.put("data", "{\"query_string\":\"589404\",\"displaycount\":\"30\",\"order_type\":\"0\",\"page_index\":\"1\",\"keyword\":\"" + customlistid + "\"}");
                break;
            //折扣
            case R.id.mDiscount_RadioBtn:
                discount++;
                if (discount % 2 == 0) {
                    mParams.put("data", "{\"query_string\":\"589404\",\"displaycount\":\"30\",\"order_type\":\"2\",\"page_index\":\"1\",\"keyword\":\"" + customlistid + "\"}");
                } else {
                    mParams.put("data", "{\"query_string\":\"589404\",\"displaycount\":\"30\",\"order_type\":\"1\",\"page_index\":\"1\",\"keyword\":\"" + customlistid + "\"}");
                }
                break;
            //价格
            case R.id.mPrice_RadioBtn:
                price++;
                if (price % 2 == 0) {
                    mParams.put("data", "{\"query_string\":\"589404\",\"displaycount\":\"30\",\"order_type\":\"3\",\"page_index\":\"1\",\"keyword\":\"" + customlistid + "\"}");
                } else {
                    mParams.put("data", "{\"query_string\":\"589404\",\"displaycount\":\"30\",\"order_type\":\"4\",\"page_index\":\"1\",\"keyword\":\"" + customlistid + "\"}");
                }
                break;
            //销量
            case R.id.mSv_RadioBtn:
                mParams.put("data", "{\"query_string\":\"589404\",\"displaycount\":\"30\",\"order_type\":\"5\",\"page_index\":\"1\",\"keyword\":\"" + customlistid + "\"}");
                break;


        }
        mList.clear();
        initData();
    }
}
