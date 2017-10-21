package com.example.administrator.yintaidemo.ui.fragemnts.forestallfragment.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.administrator.yintaidemo.R;
import com.example.administrator.yintaidemo.ui.fragemnts.forestallfragment.entity.Forestall;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 张扬帆 on 2017/10/20.
 */

public class Forestall_lv_twoAdapter extends BaseAdapter {
    private List<Forestall.DataBean.ActivityinfoBean.ActivitylistBean> list;
    private Context context;

    public Forestall_lv_twoAdapter(List<Forestall.DataBean.ActivityinfoBean.ActivitylistBean> list, Context context) {
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
        ViewHolder holder;
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.forestall_lv_two, null);
            holder = new ViewHolder(view);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
        Glide.with(context).load(list.get(i).getImgurl()).into(holder.img_forestall_lv_two);
        holder.name_forestall_lv_two.setText(list.get(i).getName());
        holder.discount_forestall_lv_two.setText(list.get(i).getDiscount());
        holder.time_forestall_lv_two.setText(list.get(i).getEndtime());
        return view;
    }

    public static class ViewHolder {
        public View rootView;
        public ImageView img_forestall_lv_two;
        public TextView name_forestall_lv_two;
        public TextView discount_forestall_lv_two;
        public TextView time_forestall_lv_two;

        public ViewHolder(View rootView) {
            this.rootView = rootView;
            this.img_forestall_lv_two = (ImageView) rootView.findViewById(R.id.img_forestall_lv_two);
            this.name_forestall_lv_two = (TextView) rootView.findViewById(R.id.name_forestall_lv_two);
            this.discount_forestall_lv_two = (TextView) rootView.findViewById(R.id.discount_forestall_lv_two);
            this.time_forestall_lv_two = (TextView) rootView.findViewById(R.id.time_forestall_lv_two);
        }

    }
}
