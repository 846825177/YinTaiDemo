package com.example.administrator.yintaidemo.ui.fragemnts.homefragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.administrator.yintaidemo.R;
import com.example.administrator.yintaidemo.entity.HomePageBean;
import com.example.administrator.yintaidemo.http.BaseParams;
import com.example.administrator.yintaidemo.ui.SearchActivity;
import com.example.administrator.yintaidemo.ui.fragemnts.homefragment.presenters.HomeFragmentPresenter;
import com.example.administrator.yintaidemo.ui.fragemnts.homefragment.views.HomeFragmentView;
import com.example.administrator.yintaidemo.utils.JumpActivityUtils;
import com.jcodecraeer.xrecyclerview.XRecyclerView;
import com.recker.flybanner.FlyBanner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by dell on 2017/10/17.
 */
//首页
public class HomeFragment extends Fragment implements HomeFragmentView<HomePageBean>, XRecyclerView.LoadingListener {

    private ArrayList<HomePageBean.DataBean.TemplatelistBean> mList = new ArrayList<>();
    private ArrayList<String> banner = new ArrayList<>();
    private int pageindex = 1;
    private XRecyclerView mRecycler;
    private HomeRecyclerViewAdapter adapter;
    private FlyBanner mHomeFragment_banner;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = LayoutInflater.from(getActivity()).inflate(R.layout.homefragment, container, false);
        View bannerView = LayoutInflater.from(getActivity()).inflate(R.layout.homefragment_banner, container, false);
        mHomeFragment_banner = bannerView.findViewById(R.id.mHomeFragment_Banner);
        ImageView home_scan = (ImageView) view.findViewById(R.id.home_scan);
        EditText search = (EditText) view.findViewById(R.id.search);
        search.setOnClickListener((v) -> startActivity(new Intent(getActivity(), SearchActivity.class)));
        home_scan.setOnClickListener((v) -> Toast.makeText(getActivity(), "二维码扫描", Toast.LENGTH_SHORT).show());
        initView(view);
        adapter = new HomeRecyclerViewAdapter(mList, getActivity());
        adapter.setOnItemClickListener((jumpurl) -> JumpActivityUtils.jump(getActivity(), jumpurl));
        mRecycler.setAdapter(adapter);
        mRecycler.addHeaderView(bannerView);
        getData(pageindex);
        return view;
    }

    private void getData(int pageindex) {
        HomeFragmentPresenter presenter = new HomeFragmentPresenter(this);
        Map<String, String> mParams = new HashMap<>();
        BaseParams.getParams(mParams, getActivity());
        mParams.put("method", "products.template.getpage");
        mParams.put("pageid", "104001");
        mParams.put("pageindex", "" + pageindex);
        mParams.put("ver", "3.0");
        presenter.request(getActivity(), mParams);

    }


    @Override
    public void success(HomePageBean homePageBean) {
        mList.addAll(homePageBean.getData().getTemplatelist());
        adapter.notifyDataSetChanged();
        List<HomePageBean.DataBean.BannerlistBean> bannerlist = homePageBean.getData().getBannerlist();

        if (bannerlist != null && bannerlist.size() > 0) {
            for (int i = 0; i < bannerlist.size(); i++) {
                banner.add(bannerlist.get(i).getImgurl());
            }
            mHomeFragment_banner.setImagesUrl(banner);
        }
        mRecycler.refreshComplete();
        mRecycler.loadMoreComplete();

//        mRecycler.setPullRefreshEnabled(false);
//        mRecycler.setLoadingMoreEnabled(false);

    }

    @Override
    public void failure(Exception e) {

    }

    private void initView(View view) {
        mRecycler = (XRecyclerView) view.findViewById(R.id.mRecycler);
        mRecycler.setLayoutManager(new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL));
        mRecycler.setLoadingListener(this);
    }

    @Override
    public void onRefresh() {
        mList.clear();
        banner.clear();
        pageindex = 1;
        getData(pageindex);
    }

    @Override
    public void onLoadMore() {
        getData(++pageindex);
    }
}
