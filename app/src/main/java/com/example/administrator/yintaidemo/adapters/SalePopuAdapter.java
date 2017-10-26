package com.example.administrator.yintaidemo.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.yintaidemo.R;

import java.util.ArrayList;

/**
 * Created by 张扬帆 on 2017/10/26.
 */

public class SalePopuAdapter extends BaseAdapter {
    private ArrayList<String> list;
    private Context context;

    public SalePopuAdapter(ArrayList<String> list, Context context) {
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
            view = LayoutInflater.from(context).inflate(R.layout.sale_lv, null);
            holder=new ViewHolder(view);
            view.setTag(holder);
        }else{
            holder= (ViewHolder) view.getTag();
        }
        holder.name_sale_lv.setText(list.get(i));
        return view;
    }

    public static class ViewHolder {
        public View rootView;
        public ImageView iv_shaixuan_sale_lv;
        public TextView name_sale_lv;
        public ImageView imageView_sale_lv;

        public ViewHolder(View rootView) {
            this.rootView = rootView;
            this.iv_shaixuan_sale_lv = (ImageView) rootView.findViewById(R.id.iv_shaixuan_sale_lv);
            this.name_sale_lv = (TextView) rootView.findViewById(R.id.name_sale_lv);
            this.imageView_sale_lv = (ImageView) rootView.findViewById(R.id.imageView_sale_lv);
        }

    }
}
