package com.example.administrator.yintaidemo.ui.homepage;

import android.content.Intent;
import android.os.Parcelable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.administrator.yintaidemo.R;
import com.example.administrator.yintaidemo.adapters.HomePagerAdapter;
import com.example.administrator.yintaidemo.entity.ShopCartEntity;
import com.example.administrator.yintaidemo.ui.BaseActivity;
import com.example.administrator.yintaidemo.ui.SearchActivity;
import com.example.administrator.yintaidemo.ui.fragemnts.MineYinTaiFragment;
import com.example.administrator.yintaidemo.ui.fragemnts.ShoppingcartFragment;
import com.example.administrator.yintaidemo.ui.fragemnts.classifyfragment.ClassifyFragment;
import com.example.administrator.yintaidemo.ui.fragemnts.forestallfragment.ForestallFragment;
import com.example.administrator.yintaidemo.ui.fragemnts.homefragment.HomeFragment;
import com.example.administrator.yintaidemo.ui.settlement.SettlementscenterActivity;

import java.util.ArrayList;
import java.util.List;

public class HomePageActivity extends BaseActivity {


    private ViewPager viewPager;
    private ImageView home_scan;
    private EditText search;

    @Override
    public void init() {
        setShowHeader(true);
        setShowNotScollBody(true);
        setShowFooter(true);

    }

    @Override
    public void run() {
        setBody(R.layout.body);
        setFooter(R.layout.footer);
        setHeader(R.layout.header_view);
        initView();
    }

    public void initView() {
        viewPager = bodyzong.findViewById(R.id.viewpager);
        home_scan = (ImageView) headerlayout.findViewById(R.id.home_scan);
        search = (EditText) headerlayout.findViewById(R.id.search);
        search.setOnClickListener((v) -> startActivity(new Intent(HomePageActivity.this, SearchActivity.class)));
        home_scan.setOnClickListener((v) -> Toast.makeText(this, "二维码扫描", Toast.LENGTH_SHORT).show());
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
        shoppingcartFragment.OnsetJump(new ShoppingcartFragment.SetJump() {
            @Override
            public void jump() {
                viewPager.setCurrentItem(0);
            }
        });
        shoppingcartFragment.OnSetJumpSettlement(new ShoppingcartFragment.SetJumpSettlement() {
            @Override
            public void jumpsettlement(List<ShopCartEntity> chuanzhilist, int judge, int count) {
                Intent intent = new Intent(HomePageActivity.this, SettlementscenterActivity.class);
                intent.putParcelableArrayListExtra("jihe", (ArrayList<? extends Parcelable>) chuanzhilist);
                intent.putExtra("judge",judge);
                intent.putExtra("count",count);
                startActivity(intent);


            }
        });

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
        viewPager.setOffscreenPageLimit(5);

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
