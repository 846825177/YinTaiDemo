package com.example.administrator.yintaidemo.ui.fragemnts.forestallfragment.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.administrator.yintaidemo.R;
import com.example.administrator.yintaidemo.http.BaseParams;
import com.example.administrator.yintaidemo.ui.SaleActivity;
import com.example.administrator.yintaidemo.ui.fragemnts.forestallfragment.adapter.Forestall_lv_twoAdapter;
import com.example.administrator.yintaidemo.ui.fragemnts.forestallfragment.entity.Forestall;
import com.example.administrator.yintaidemo.ui.fragemnts.forestallfragment.presenter.ForestallPresenter;
import com.example.administrator.yintaidemo.ui.fragemnts.forestallfragment.views.ForestallView;

import java.util.HashMap;
import java.util.List;

/**
 * Created by 张扬帆 on 2017/10/20.
 */

public class OutFragment extends Fragment implements ForestallView<Forestall>, AdapterView.OnItemClickListener {
    private ListView lv_forestall_vp;
    private List<Forestall.DataBean.ActivityinfoBean.ActivitylistBean> list;
    private Forestall_lv_twoAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.forestall_vp, container, false);
        initView(view);
        initData();
        return view;
    }

    private void initData() {
        /**
         * 网络请求数据
         */
        HashMap<String, String> map = new HashMap<>();
        map.put("type", "1");
        map.put("timereq", "20171017164939");
        map.put("sign", "00cc0a56b6ac882c80c401b183a127f0");
        map.put("method", "products.limitbuy");
        BaseParams.getParams(map, getContext());
        ForestallPresenter presenter = new ForestallPresenter(this);
        presenter.request(getContext(), map);


    }

    private void initView(View view) {
        lv_forestall_vp = (ListView) view.findViewById(R.id.lv_forestall_vp);
        lv_forestall_vp.setOnItemClickListener(this);
    }

    @Override
    public void success(Forestall forestall) {
        list = forestall.getData().getActivityinfo().get(0).getActivitylist();

        adapter = new Forestall_lv_twoAdapter(list, getContext());
        lv_forestall_vp.setAdapter(adapter);
    }

    @Override
    public void failure(Exception e) {
        Log.e("TAG", e.toString());
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Forestall.DataBean.ActivityinfoBean.ActivitylistBean bean = list.get(i);
        int id = bean.getId();
        String endtime = bean.getEndtime();
        String title = bean.getTitle();
        Toast.makeText(getContext(), id + "", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(getContext(), SaleActivity.class);
        intent.putExtra("id", id);
        intent.putExtra("time", endtime);
        intent.putExtra("title", title);
        startActivity(intent);
    }
}