package com.example.administrator.yintaidemo.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.administrator.yintaidemo.R;
import com.example.administrator.yintaidemo.entity.SaleEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 张扬帆 on 2017/10/24.
 */

public class SaleLvAdapter extends BaseAdapter {
    private List<SaleEntity.DataBean.ProductListBean> list;
    private Context context;

    public SaleLvAdapter(List<SaleEntity.DataBean.ProductListBean> list, Context context) {
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
            view = LayoutInflater.from(context).inflate(R.layout.activity_sale_lv, null);
            holder = new ViewHolder(view);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
        Glide.with(context).load(list.get(i).getImage()).into(holder.img_sale_lv);
        holder.name_sale_lv.setText(list.get(i).getName());
        holder.discount_sale_lv.setText(list.get(i).getDiscount());
        holder.price_sale_lv.setText("¥" + list.get(i).getPrice());
        holder.promotion_price_sale_lv.setText("¥"+list.get(i).getPromotion_price());
        return view;
    }

    public static class ViewHolder {
        public View rootView;
        public ImageView img_sale_lv;
        public TextView name_sale_lv;
        public TextView discount_sale_lv;
        public TextView promotion_price_sale_lv;
        public TextView price_sale_lv;

        public ViewHolder(View rootView) {
            this.rootView = rootView;
            this.img_sale_lv = (ImageView) rootView.findViewById(R.id.img_sale_lv);
            this.name_sale_lv = (TextView) rootView.findViewById(R.id.name_sale_lv);
            this.discount_sale_lv = (TextView) rootView.findViewById(R.id.discount_sale_lv);
            this.promotion_price_sale_lv = (TextView) rootView.findViewById(R.id.promotion_price_sale_lv);
            this.price_sale_lv = (TextView) rootView.findViewById(R.id.price_sale_lv);
        }

    }
}
