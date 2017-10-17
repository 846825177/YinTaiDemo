package com.example.administrator.yintaidemo.http;

import android.content.Context;

import com.example.administrator.yintaidemo.utils.PhoneParamsUtils;

import java.util.Map;

/**
 * Created by Mr Chen on 2017/10/17.
 */

public class BaseParams {
    public static void getParams(Map<String,String> mParams, Context context){
        mParams.put("yintaisourceId","1090610");
        mParams.put("sourceId","1090610");
        mParams.put("authtype","md5");
        mParams.put("os","android");
        mParams.put("ver","2.0");
        mParams.put("screenwidth",String.valueOf(PhoneParamsUtils.getPhoneWidth(context)));
        mParams.put("screenheight",String.valueOf(PhoneParamsUtils.getPhoneHeigth(context)));
        mParams.put("client_v","4.0.1");
        mParams.put("osversion",PhoneParamsUtils.getPhoneOsversion());
        mParams.put("devicename",PhoneParamsUtils.getPhoneDeviceName());
        mParams.put("carrier",PhoneParamsUtils.getPhoneCarrier(context) );
        mParams.put("imei",PhoneParamsUtils.getPhoneIMEI(context));
        mParams.put("macid",PhoneParamsUtils.getPhoneMacId(context));
        mParams.put("uid","");
        mParams.put("signtype","1");
        mParams.put("apptype","1");
    }
}
