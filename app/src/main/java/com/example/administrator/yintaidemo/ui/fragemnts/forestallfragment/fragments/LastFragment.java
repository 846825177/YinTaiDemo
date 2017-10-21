package com.example.administrator.yintaidemo.ui.fragemnts.forestallfragment.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.yintaidemo.R;
import com.example.administrator.yintaidemo.http.BaseParams;
import com.example.administrator.yintaidemo.ui.fragemnts.forestallfragment.entity.Forestall;
import com.example.administrator.yintaidemo.ui.fragemnts.forestallfragment.presenter.ForestallPresenter;
import com.example.administrator.yintaidemo.ui.fragemnts.forestallfragment.views.ForestallView;

import java.util.HashMap;
import java.util.List;

/**
 * Created by 张扬帆 on 2017/10/20.
 */

public class LastFragment extends Fragment implements ForestallView<Forestall>{
    private ImageView img_forestall_lv_two;
    private TextView name_forestall_lv_two;
    private TextView discount_forestall_lv_two;
    private TextView time_forestall_lv_two;
    private List<Forestall.DataBean.ActivityinfoBean.ActivitylistBean> list;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.forestall_lv_two, container, false);
        initView(view);
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
        presenter.request(getContext(),map);


    }

    private void initView(View view) {
        img_forestall_lv_two = (ImageView) view.findViewById(R.id.img_forestall_lv_two);
        name_forestall_lv_two = (TextView) view.findViewById(R.id.name_forestall_lv_two);
        discount_forestall_lv_two = (TextView) view.findViewById(R.id.discount_forestall_lv_two);
        time_forestall_lv_two = (TextView) view.findViewById(R.id.time_forestall_lv_two);
    }

    @Override
    public void success(Forestall forestall) {
        list = forestall.getData().getActivityinfo().get(0).getActivitylist();
        for (int i = 0; i < list.size(); i++) {
            String endtime = list.get(i).getEndtime();

        }
    }

    @Override
    public void failure(Exception e) {

    }
}
