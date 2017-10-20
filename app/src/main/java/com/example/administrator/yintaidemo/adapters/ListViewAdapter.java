package com.example.administrator.yintaidemo.adapters;

import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.administrator.yintaidemo.R;

import java.util.ArrayList;

/**
 * Created by dell on 2017/10/20.
 */

public class ListViewAdapter extends BaseAdapter {

    private  ArrayList<String> stringArrayList;
    private  FragmentActivity activity;

    public ListViewAdapter(ArrayList<String> stringArrayList, FragmentActivity activity) {
        this.stringArrayList = stringArrayList;
        this.activity = activity;

    }

    @Override
    public int getCount() {
        return stringArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return stringArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView==null){
         holder = new ViewHolder();
            convertView = LayoutInflater.from(activity).inflate(R.layout.listviewitem, null);
holder.textView=convertView.findViewById(R.id.listview_ittext);
            convertView.setTag(holder);

        }else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.textView.setText(stringArrayList.get(position));




        return convertView;
    }

    class ViewHolder{
        TextView textView;
    }


}
