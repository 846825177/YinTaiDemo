package com.example.administrator.yintaidemo.ui.fragemnts.forestallfragment.adapter;

import android.app.Activity;
import android.content.Context;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.administrator.yintaidemo.R;
import com.example.administrator.yintaidemo.ui.fragemnts.forestallfragment.entity.Forestall;
import com.example.administrator.yintaidemo.ui.fragemnts.forestallfragment.utils.TimeUtils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by 张扬帆 on 2017/10/20.
 */

public class Forestall_lv_twoAdapter extends BaseAdapter {
    private List<Forestall.DataBean.ActivityinfoBean.ActivitylistBean> list;

    private Context context;
    private ViewHolder holder;
    private String t3;

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
        String endtime = list.get(i).getEndtime();

        String[] ts = endtime.split("T");

        String t = ts[0];
        String t1 = ts[1];
        String t2 = " ";
        t3 = t + t2 + t1;
        TimerTask task = new TimerTask() {
            public void run() {

                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String beginTime = simpleDateFormat.format(new Date());
                DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                Date firstDateTimeDate = null;
                try {
                    firstDateTimeDate = format.parse(t3);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                Date secondDateTimeDate = null;
                try {
                    secondDateTimeDate = format.parse(beginTime);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                //得到两个日期对象的总毫秒数
                long firstDateMilliSeconds = firstDateTimeDate.getTime();
                long secondDateMilliSeconds = secondDateTimeDate.getTime();

                //得到两者之差
                long firstMinusSecond = firstDateMilliSeconds - secondDateMilliSeconds;

                //毫秒转为秒
                long milliSeconds = firstMinusSecond;
                int totalSeconds = (int) (milliSeconds / 1000);

                //得到总天数
                int days = totalSeconds / (3600 * 24);
                int days_remains = totalSeconds % (3600 * 24);

                //得到总小时数
                int hours = days_remains / 3600;
                int remains_hours = days_remains % 3600;

                //得到分种数
                int minutes = remains_hours / 60;

                //得到总秒数
                int seconds = remains_hours % 60;

                final String s = "倒计时:" + days + "天" + hours + ":" + minutes + ":" + seconds;


                ((Activity)context).runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        holder.time_forestall_lv_two.setText(s);
                    }
                });


            }
        };
        Timer timer = new Timer();
        timer.schedule(task, 0, 1000);

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

