package com.example.administrator.yintaidemo.ui.fragemnts.forestallfragment.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static android.R.attr.format;

/**
 * Created by 张扬帆 on 2017/10/20.
 */

public class TimeUtils {

    //获取当前时间
    public static String getNow(){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date=new Date(System.currentTimeMillis());
        String format = formatter.format(date);
        return format;
    }

    //获取结束时间
    public static void getEnd(String endtime){

    }

    //转换成时间戳 判断是否是最后一天。
    public static boolean getLong(String end){
        String now = getNow();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date enddate = formatter.parse(end);
            long endtime = enddate.getTime();
            Date nowdate = formatter.parse(now);
            long nowtime = nowdate.getTime();

            long time = endtime - nowtime;
            long daytime = 24 * 60 * 60 * 1000;

            if (time<daytime){
                return true;
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return false;
    }
}
