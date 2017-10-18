package com.example.administrator.yintaidemo.ui.fragemnts.homefragment;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.administrator.yintaidemo.entity.HomePageBean;

import java.util.ArrayList;



public class HomeListViewAdapter extends BaseAdapter {
    private ArrayList<HomePageBean.DataBean.TemplatelistBean> mList;
    private Context context;

    public HomeListViewAdapter(ArrayList<HomePageBean.DataBean.TemplatelistBean> mList, Context context) {
        this.mList = mList;
        this.context = context;
    }



    @Override
    public int getViewTypeCount() {
        return HomeFragmentListViewUtils.ITEM_TYPE_COUNT;
    }

    @Override
    public int getItemViewType(int position) {
        return HomeFragmentListViewUtils.getItemType(mList.get(position).getTemplatetype());
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return HomeFragmentListViewUtils.getView(context, convertView, getItemViewType(position),mList.get(position));
    }
}
