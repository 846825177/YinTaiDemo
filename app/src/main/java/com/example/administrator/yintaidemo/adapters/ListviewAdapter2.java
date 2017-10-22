package com.example.administrator.yintaidemo.adapters;

import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.administrator.yintaidemo.R;
import com.example.administrator.yintaidemo.entity.ShopCartEntity;
import com.example.administrator.yintaidemo.ui.settlement.SettlementscenterActivity;

import java.util.ArrayList;

/**
 * Created by dell on 2017/10/22.
 */

public class ListviewAdapter2 extends BaseAdapter {

    private final ArrayList<ShopCartEntity> list;
    private final SettlementscenterActivity settlementscenterActivity;

    public ListviewAdapter2(ArrayList<ShopCartEntity> list, SettlementscenterActivity settlementscenterActivity) {
        this.list = list;
        this.settlementscenterActivity = settlementscenterActivity;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            holder = new ViewHolder();
            convertView = LayoutInflater.from(settlementscenterActivity).inflate(R.layout.listvviewitem2, null);
            holder.image = convertView.findViewById(R.id.settlement_shop_image);
            holder.colororsize = convertView.findViewById(R.id.colororsize);
            holder.name = convertView.findViewById(R.id.settlement_shop_name);
            holder.num = convertView.findViewById(R.id.settlement_shop_num);
            holder.price = convertView.findViewById(R.id.settlement_shop_price);


            convertView.setTag(holder);

        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        Glide.with(settlementscenterActivity).load(list.get(position).getImg()).into(holder.image);
        holder.name.setText(list.get(position).getName());
        holder.colororsize.setText(list.get(position).getColor()+"|"+list.get(position).getSize());
        holder.num.setText(list.get(position).getNum()+"");
        holder.price.setText("￥"+list.get(position).getPrice());


        return convertView;
    }

    class ViewHolder {
        ImageView image;
        TextView colororsize;
        TextView name;
        TextView num;
        TextView price;


    }


}
