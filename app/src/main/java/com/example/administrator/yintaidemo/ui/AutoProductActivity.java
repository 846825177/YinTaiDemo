package com.example.administrator.yintaidemo.ui;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.IdRes;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.administrator.yintaidemo.R;
import com.example.administrator.yintaidemo.adapters.AutoProductAdapter;
import com.example.administrator.yintaidemo.entity.AutoProductBean;
import com.example.administrator.yintaidemo.http.BaseParams;
import com.example.administrator.yintaidemo.ui.customproduct.presenters.CustomPresenter;
import com.example.administrator.yintaidemo.ui.customproduct.views.CustomViews;
import com.example.administrator.yintaidemo.utils.JumpActivityUtils;
import com.example.administrator.yintaidemo.utils.PhoneParamsUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Mr Chen on 2017/10/22.
 */

public class AutoProductActivity extends BaseActivity implements CustomViews<AutoProductBean>, RadioGroup.OnCheckedChangeListener {

    private RecyclerView mAutoRecycler;
    private ArrayList<AutoProductBean.DataBean.ProductListBean> mList = new ArrayList<>();
    private AutoProductAdapter autoProductAdapter;
    private Map<String, String> mParams = new HashMap<>();
    private Map<String, String> mTempMap = new HashMap<>();

    @Override
    public void init() {
        setShowHeader(true);
        setShowNotScollBody(true);
    }

    @Override
    public void run() {
        Intent intent = getIntent();
        String url = intent.getStringExtra("url");

        setHeader(R.layout.autoproduct_headerview);
        setBody(R.layout.autoproduct_activity);
        TextView autoproduct_title = (TextView) findViewById(R.id.autoproduct_title);
        RadioGroup mAutoRadioGroup = (RadioGroup) findViewById(R.id.mAutoRadioGroup);
        mAutoRadioGroup.setOnCheckedChangeListener(this);
        //销量
        RadioButton mXl = (RadioButton) findViewById(R.id.mXl);
        //价格
        RadioButton mJg = (RadioButton) findViewById(R.id.mJg);
        //上架时间
        RadioButton mSjsj = (RadioButton) findViewById(R.id.mSjsj);
        //切换布局
        CheckBox mBj = (CheckBox) findViewById(R.id.mBj);
        //recyclerview
        mAutoRecycler = (RecyclerView) findViewById(R.id.mAutoRecycler);
        mAutoRecycler.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
        autoProductAdapter = new AutoProductAdapter(mList, 1, this);
        mAutoRecycler.setAdapter(autoProductAdapter);
        Uri uri = Uri.parse(url);
        Set<String> set = uri.getQueryParameterNames();
        for (Iterator iterator = set.iterator(); iterator.hasNext(); ) {
            String name1 = (String) iterator.next();
            String value = uri.getQueryParameter(name1);
            Log.e("TAG", name1 + "---" + value);
            mTempMap.put(name1, value);
        }

          /*
         //修改参数
         "timereq" -> "20171024083728"
         "wantype" -> "wifi"
         "ver" -> "2.1"
         //提交参数
         "data" -> "{"query_string":"N=10001889","displaycount":"30","order_type":"5","page_index":"1","keyword":""}"
         "sign" -> "767da356cfc42caffa5d62ba66166f37"
         "method" -> "products.getlist"
         */


        autoproduct_title.setText(mTempMap.get("title"));
        String searchCondition = mTempMap.get("searchCondition");
        BaseParams.getParams(mParams, AutoProductActivity.this);
        HashMap<String, String> mParam = PhoneParamsUtils.signBusinessParameter(AutoProductActivity.this, (HashMap<String, String>) mParams);
        mParam.put("method", "products.getlist");
        mParam.put("ver", "2.1");
        mParam.put("data", "{\"query_string\":\"N=50000111\",\"displaycount\":\"30\",\"order_type\":\"5\",\"page_index\":\"1\",\"keyword\":\"\"}");
        mParam.put("timereq", JumpActivityUtils.getTime());
        CustomPresenter presenter = new CustomPresenter(this);
        presenter.send(null, mParam);
    }

    @Override
    public void onRefresh() {

    }


    @Override
    public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
        switch (checkedId) {
            case R.id.mXl:
                Toast.makeText(this, "销量", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mJg:
                break;
            case R.id.mSjsj:
                break;
        }
    }

    @Override
    public void success(AutoProductBean autoProductBean) {
        List<AutoProductBean.DataBean.ProductListBean> product_list = autoProductBean.getData().getProduct_list();
        mList.addAll(product_list);
        autoProductAdapter.notifyDataSetChanged();
    }

    @Override
    public void failure(Exception e) {

    }
}
