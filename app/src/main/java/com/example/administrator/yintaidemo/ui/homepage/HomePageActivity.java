package com.example.administrator.yintaidemo.ui.homepage;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;

import com.example.administrator.yintaidemo.R;
import com.example.administrator.yintaidemo.adapters.HomePagerAdapter;
import com.example.administrator.yintaidemo.ui.BaseActivity;
import com.example.administrator.yintaidemo.ui.fragemnts.ClassifyFragment;
import com.example.administrator.yintaidemo.ui.fragemnts.ForestallFragment;
import com.example.administrator.yintaidemo.ui.fragemnts.homefragment.HomeFragment;
import com.example.administrator.yintaidemo.ui.fragemnts.MineYinTaiFragment;
import com.example.administrator.yintaidemo.ui.fragemnts.ShoppingcartFragment;

import java.util.ArrayList;

public class HomePageActivity extends BaseActivity {


    private ViewPager viewPager;

    @Override
    public void init() {
        setShowHeader(true);
        setShowErrorBody(true);
        setShowFooter(true);

    }

    @Override
    public void run() {
        setBody(R.layout.body);
        setFooter(R.layout.footer);
        setHeader(R.layout.header);
        initView();
    }

    public void initView() {
        viewPager = bodyzong.findViewById(R.id.viewpager);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab);
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("首页");
        stringArrayList.add("抢先");
        stringArrayList.add("分类");
        stringArrayList.add("购物车");
        stringArrayList.add("我的银泰");


        ArrayList<Fragment> arrayList = new ArrayList<>();
        HomeFragment homeFragment = new HomeFragment();
        ForestallFragment forestallFragment = new ForestallFragment();
        ClassifyFragment classifyFragment = new ClassifyFragment();
        ShoppingcartFragment shoppingcartFragment = new ShoppingcartFragment();
        MineYinTaiFragment mineYinTaiFragment = new MineYinTaiFragment();
        arrayList.add(homeFragment);
        arrayList.add(forestallFragment);
        arrayList.add(classifyFragment);
        arrayList.add(shoppingcartFragment);
        arrayList.add(mineYinTaiFragment);


        HomePagerAdapter homePagerAdapter = new HomePagerAdapter(getSupportFragmentManager(), arrayList, stringArrayList);
        tabLayout.setupWithViewPager(viewPager);
        viewPager.setAdapter(homePagerAdapter);


        tabLayout.getTabAt(0).setIcon(R.drawable.homepage_shape);
        tabLayout.getTabAt(1).setIcon(R.drawable.forestall_shape);
        tabLayout.getTabAt(2).setIcon(R.drawable.classify_shape);
        tabLayout.getTabAt(3).setIcon(R.drawable.shopping_shape);
        tabLayout.getTabAt(4).setIcon(R.drawable.mineyintai_shape);


    }

    @Override
    public void onRefresh() {
        if (refresh.isRefreshing()) {
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    refresh.setRefreshing(false);
                }
            }, 500);
        }
    }

}
