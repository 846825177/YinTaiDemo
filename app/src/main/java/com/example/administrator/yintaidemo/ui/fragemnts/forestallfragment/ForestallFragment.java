package com.example.administrator.yintaidemo.ui.fragemnts.forestallfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.yintaidemo.R;
import com.example.administrator.yintaidemo.ui.fragemnts.forestallfragment.adapter.ForestallAdapter;
import com.example.administrator.yintaidemo.ui.fragemnts.forestallfragment.entity.Forestall;
import com.example.administrator.yintaidemo.ui.fragemnts.forestallfragment.fragments.LastFragment;
import com.example.administrator.yintaidemo.ui.fragemnts.forestallfragment.fragments.OutFragment;
import com.example.administrator.yintaidemo.ui.fragemnts.forestallfragment.fragments.TheFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell on 2017/10/17.
 */
//抢先
public class ForestallFragment extends Fragment {
    private TabLayout tl_forestall;
    private ViewPager vp_forestall;
    private ForestallAdapter adapter;
    private ArrayList<Fragment> fragments;
    private ArrayList<String> strings;
    private List<Forestall.DataBean.ActivityinfoBean.ActivitylistBean> list;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = LayoutInflater.from(getActivity()).inflate(R.layout.forestallfragment, container, false);
        initView(view);
        initData();

        return view;
    }

    private void initData() {

        strings = new ArrayList<>();
        strings.add("正在进行");
        strings.add("最后疯抢");
        strings.add("即将开始");
        fragments = new ArrayList<>();
        fragments.add(new OutFragment());
        fragments.add(new LastFragment());
        fragments.add(new TheFragment());


        adapter = new ForestallAdapter(getChildFragmentManager(), strings, fragments);
        vp_forestall.setAdapter(adapter);
        tl_forestall.setupWithViewPager(vp_forestall);
    }

    private void initView(View view) {
        tl_forestall = (TabLayout) view.findViewById(R.id.tl_forestall);
        vp_forestall = (ViewPager) view.findViewById(R.id.vp_forestall);
    }

}
