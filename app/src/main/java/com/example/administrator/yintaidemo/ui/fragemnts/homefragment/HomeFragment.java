package com.example.administrator.yintaidemo.ui.fragemnts.homefragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.administrator.yintaidemo.R;
import com.example.administrator.yintaidemo.entity.HomePageBean;
import com.example.administrator.yintaidemo.http.BaseParams;
import com.example.administrator.yintaidemo.ui.fragemnts.homefragment.presenters.HomeFragmentPresenter;
import com.example.administrator.yintaidemo.ui.fragemnts.homefragment.views.HomeFragmentView;
import com.recker.flybanner.FlyBanner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by dell on 2017/10/17.
 */
//首页
public class HomeFragment extends Fragment implements HomeFragmentView<HomePageBean> {

    private ListView mListView;
    private ArrayList<HomePageBean.DataBean.TemplatelistBean> mList = new ArrayList<>();
    private HomeListViewAdapter adapter;
    private FlyBanner mHomeFragment_banner;
    private ArrayList<String> banner = new ArrayList<>();
    private View inflate;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = LayoutInflater.from(getActivity()).inflate(R.layout.homefragment, container, false);
        inflate = inflater.inflate(R.layout.homefragment_banner,null);
        mHomeFragment_banner = inflate.findViewById(R.id.mHomeFragment_Banner);


        initView(view);
        getData();
        return view;
    }

    private void getData() {
        HomeFragmentPresenter presenter = new HomeFragmentPresenter(this);
        Map<String, String> mParams = new HashMap<>();
        BaseParams.getParams(mParams, getActivity());
        mParams.put("method", "products.template.getpage");
        mParams.put("pageid", "104001");
        mParams.put("pageindex", "1");
        mParams.put("ver", "3.0");
        presenter.request(getActivity(),mParams);

    }

    private void initView(View view) {
        mListView = view.findViewById(R.id.mListView_homefragment);
        adapter = new HomeListViewAdapter(mList, getActivity());
        mListView.setAdapter(adapter);

    }


    @Override
    public void success(HomePageBean homePageBean) {
        List<HomePageBean.DataBean.TemplatelistBean> templatelist = homePageBean.getData().getTemplatelist();
        mList.addAll(templatelist);
        adapter.notifyDataSetChanged();
        List<HomePageBean.DataBean.BannerlistBean> bannerlist = homePageBean.getData().getBannerlist();

        mList.addAll(templatelist);
        for (int i = 0; i < bannerlist.size(); i++) {
            banner.add(bannerlist.get(i).getImgurl());
        }
        mHomeFragment_banner.setImagesUrl(banner);
        mListView.addHeaderView(inflate);
        adapter.notifyDataSetChanged();
    }

    @Override
    public void failure(Exception e) {

    }
}
