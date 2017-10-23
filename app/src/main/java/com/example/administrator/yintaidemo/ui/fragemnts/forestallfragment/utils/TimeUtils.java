package com.example.administrator.yintaidemo.ui.fragemnts.forestallfragment.utils;

import android.os.Handler;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static android.R.attr.format;
import static com.example.administrator.yintaidemo.R.id.textView;

/**
 * Created by 张扬帆 on 2017/10/20.
 */

public class TimeUtils {

    private static Handler handler=new Handler();
    //获取当前时间
    public static long getNow() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date(System.currentTimeMillis());
        String now = formatter.format(date);

        try {
            Date nowdate = formatter.parse(now);
            long nowtime = nowdate.getTime();

            return nowtime;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static String getEndData(String ends){
        String end = ends.replace("T", " ");
        return end;
    }

    //获取结束时间   并转换为时间戳对象
    public static long getEnd(String ends) {
        String end = ends.replace("T", " ");
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date enddate = formatter.parse(end);
            long endtime = enddate.getTime();
            return endtime;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return 0;
    }

    //转换成时间戳 判断是否是最后一天。
    public static boolean getLong(String ends) {
        long end = getEnd(ends);
        long now = getNow();

        long time = end - now;
        long daytime = 24 * 60 * 60 * 1000;
        if (time < daytime) {
            return true;
        }
        return false;
    }



    //将时间转换为时间戳对象   获取剩余时间
    public static void send(String end) {
        long end1 = getEnd(end);
        long now = getNow();

        //一天的毫秒值
        long daytime = 24 * 60 * 60;
        //计算毫秒值
        long time = (end1 - now) / 1000;

        while (time > 0){
            time--;
            //判断有没有超过一天。
            int dd = (int) (time / daytime);

            //获取相差时间
            //获取相差小时数
            long hh = time / 60 / 60 %24 ;
            //获取相差分钟数
            long mm = time / 60 % 60;
            //获取相差秒数
            long ss = time % 60;


            String sheng = dd + "天" + hh + ":" + mm + ":" + ss + "";

        }
    }
}
