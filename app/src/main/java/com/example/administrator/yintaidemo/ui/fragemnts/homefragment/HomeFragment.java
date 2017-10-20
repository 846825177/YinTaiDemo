package com.example.administrator.yintaidemo.ui.fragemnts.homefragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.yintaidemo.R;
import com.example.administrator.yintaidemo.entity.HomePageBean;
import com.example.administrator.yintaidemo.http.BaseParams;
import com.example.administrator.yintaidemo.ui.fragemnts.homefragment.presenters.HomeFragmentPresenter;
import com.example.administrator.yintaidemo.ui.fragemnts.homefragment.views.HomeFragmentView;
import com.example.administrator.yintaidemo.views.XListView;
import com.recker.flybanner.FlyBanner;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by dell on 2017/10/17.
 */
//首页
public class HomeFragment extends Fragment implements HomeFragmentView<HomePageBean>, XListView.IXListViewListener {

    private XListView mListView;
    private ArrayList<HomePageBean.DataBean.TemplatelistBean> mList = new ArrayList<>();
    private HomeListViewAdapter adapter;
    private FlyBanner mHomeFragment_banner;
    private ArrayList<String> banner = new ArrayList<>();
    private View inflate;
    private int pageindex = 1;
    private List<HomePageBean.DataBean.BannerlistBean> bannerlist;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = LayoutInflater.from(getActivity()).inflate(R.layout.homefragment, container, false);
        inflate = inflater.inflate(R.layout.homefragment_banner, null);
        mHomeFragment_banner = inflate.findViewById(R.id.mHomeFragment_Banner);


        initView(view);
        getData(pageindex);
        return view;
    }

    private void getData(int pageindex) {
        if (pageindex == 1)
            mList.clear();
        HomeFragmentPresenter presenter = new HomeFragmentPresenter(this);
        Map<String, String> mParams = new HashMap<>();
        BaseParams.getParams(mParams, getActivity());
        mParams.put("method", "products.template.getpage");
        mParams.put("pageid", "104001");
        mParams.put("pageindex", "" + pageindex);
        mParams.put("ver", "3.0");
        presenter.request(getActivity(), mParams);


    }

    private void initView(View view) {
        mListView = (XListView) view.findViewById(R.id.mListView_homefragment);
        mListView.addHeaderView(inflate);
        mListView.setPullLoadEnable(true);
        adapter = new HomeListViewAdapter(mList, getActivity());
        mListView.setAdapter(adapter);
        mListView.setXListViewListener(this);

    }


    @Override
    public void success(HomePageBean homePageBean) {
        List<HomePageBean.DataBean.TemplatelistBean> templatelist = homePageBean.getData().getTemplatelist();
        mList.addAll(templatelist);
        adapter.notifyDataSetChanged();
        if(pageindex==1){
            banner.clear();
            bannerlist = homePageBean.getData().getBannerlist();
            mList.addAll(templatelist);
            for (int i = 0; i < bannerlist.size(); i++) {
                banner.add(bannerlist.get(i).getImgurl());
            }

            mHomeFragment_banner.setImagesUrl(banner);

            adapter.notifyDataSetChanged();
       }



        mListView.stopRefresh();
        mListView.stopLoadMore();
        //获取当前时间
        Date curDate = new Date(System.currentTimeMillis());
        //格式化
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy年MM月dd日HH:mm:ss");
        String time = formatter.format(curDate);
        mListView.setRefreshTime(time);
    }

    @Override
    public void failure(Exception e) {

    }

    @Override
    public void onRefresh() {
        pageindex = 1;
        getData(pageindex);


    }

    @Override
    public void onLoadMore() {
        getData(++pageindex);
    }


    @Override
    public void onResume() {
        super.onResume();





    }
}
