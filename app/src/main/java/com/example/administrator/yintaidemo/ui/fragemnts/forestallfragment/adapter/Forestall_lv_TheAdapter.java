package com.example.administrator.yintaidemo.ui.fragemnts.forestallfragment.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.administrator.yintaidemo.R;
import com.example.administrator.yintaidemo.ui.fragemnts.forestallfragment.entity.Forestall;

import java.util.List;

/**
 * Created by 张扬帆 on 2017/10/21.
 */

public class Forestall_lv_TheAdapter extends BaseAdapter {
    private List<Forestall.DataBean.ActivityinfoBean.ActivitylistBean> list;
    private Context context;

    public Forestall_lv_TheAdapter(List<Forestall.DataBean.ActivityinfoBean.ActivitylistBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder hodler;
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.forestall_lv_the, null);
            hodler=new ViewHolder(view);
            view.setTag(hodler);
        }else {
            hodler= (ViewHolder) view.getTag();
        }
        Glide.with(context).load(list.get(i).getLogoimage())/*.diskCacheStrategy(DiskCacheStrategy.ALL)*/.into(hodler.img_forestall_lv_the);
        hodler.name_forestall_lv_the.setText(list.get(i).getBrandname());
        hodler.title_forestall_lv_the.setText(list.get(i).getName());
        return view;
    }

    public static class ViewHolder {
        public View rootView;
        public ImageView img_forestall_lv_the;
        public TextView title_forestall_lv_the;
        public TextView name_forestall_lv_the;

        public ViewHolder(View rootView) {
            this.rootView = rootView;
            this.img_forestall_lv_the = (ImageView) rootView.findViewById(R.id.img_forestall_lv_the);
            this.title_forestall_lv_the = (TextView) rootView.findViewById(R.id.title_forestall_lv_the);
            this.name_forestall_lv_the = (TextView) rootView.findViewById(R.id.name_forestall_lv_the);
        }

    }
}
