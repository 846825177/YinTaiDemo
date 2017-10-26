package com.example.administrator.yintaidemo.ui.fragemnts.forestallfragment.utils;

import android.widget.TextView;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by 张扬帆 on 2017/10/20.
 */

public class TimeUtils {

    //将获取来的结束时间通过字符串截取为日历时间
    public static long getEnd(String end) {
        String endtime = end.replace("T", " ");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        try {
            Date date = dateFormat.parse(endtime);
            long time = date.getTime();
            return time;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return 0;
    }

    //获取当前时间。
    public static long getNow() {
        long now = System.currentTimeMillis();
        return now;
    }

    //获取两个时间之间的差值
    public static long getValue(String string) {
        long now = getNow();
        long end = getEnd(string);
        long value = (end - now) / 1000;
        return value;
    }

    //获取剩余几天几时几分几秒。
    public static String getTime(long ss) {
        //获取剩余多少天 分钟 小时
        long day = ss / 60 / 60 / 24;

        //获取剩余多少小时
        long hour = ss / 60 / 60 - day * 24;

        //获取剩余多少分钟
        long min = ss / 60 - day * 24 * 60 - hour * 60;

        //获取剩余多少秒
        long second = ss - day * 24 * 60 * 60 - hour * 60 * 60 - min * 60;
        String s = "剩余时间:" + day + "天  " + hour + "：" + min + "：" + second;

//        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
        return s;
    }

    public static boolean getLong(String endtime) {
        long now = getNow();
        long end = getEnd(endtime);
        int value = (int) ((end - now) / 1000);
        int i = 24 * 60 * 60;
        if (value<i){
            return true;
        }
        return false;
    }
}
