package com.example.administrator.yintaidemo.adapters;

import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.administrator.yintaidemo.R;
import com.example.administrator.yintaidemo.entity.ShopCartEntity;
import com.example.administrator.yintaidemo.ui.BaseActivity;

import java.util.List;

/**
 * Created by dell on 2017/10/17.
 */

public class ShopAdapter extends BaseAdapter {


    private List<ShopCartEntity> list;
    private FragmentActivity activity;

    public interface CheckListener {
        void click(List<ShopCartEntity> list);
    }

    public CheckListener checkListener;

    public void setCheckLister(CheckListener checkListener) {
        this.checkListener = checkListener;
    }

    public ShopAdapter(List<ShopCartEntity> list, FragmentActivity activity) {
        this.list = list;
        this.activity = activity;


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
    public View getView(final int position, View convertView, ViewGroup parent) {
        final ViewHolder holder;
        if (convertView == null) {
            holder = new ViewHolder();
            convertView = LayoutInflater.from(activity).inflate(R.layout.shopcaritem, null);
            holder.checkBox = (CheckBox) convertView.findViewById(R.id.shopitem_checkbox);
            holder.image = (ImageView) convertView.findViewById(R.id.shopitwem_iamge);
            holder.name = (TextView) convertView.findViewById(R.id.shopitem_name);
            holder.color = (TextView) convertView.findViewById(R.id.shopitem_color);
            holder.size = (TextView) convertView.findViewById(R.id.shopitem_size);
            holder.price = (TextView) convertView.findViewById(R.id.shopitem_price);
            holder.num = (TextView) convertView.findViewById(R.id.shopitem_num);
            convertView.setTag(holder);

        } else {

            holder = (ViewHolder) convertView.getTag();


        }

        Glide.with(activity).load(list.get(position).getImg()).into(holder.image);
        holder.name.setText(list.get(position).getName());
        holder.color.setText("颜色:"+list.get(position).getColor());
        holder.size.setText("尺码:"+list.get(position).getSize());
        holder.price.setText("¥" + list.get(position).getPrice());
        holder.num.setText(list.get(position).getNum() + "");
        holder.checkBox.setChecked(list.get(position).ischeckd());
        holder.checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


if (holder.checkBox.isChecked()){
list.get(position).setIscheckd(true);


}else {
    list.get(position).setIscheckd(false);
}

if (checkListener!=null){
checkListener.click(list);


}

            }
        });


        return convertView;
    }

    class ViewHolder {
        CheckBox checkBox;
        ImageView image;
        TextView name;

        TextView color;
        TextView size;
        TextView price;
        TextView num;
    }


}
