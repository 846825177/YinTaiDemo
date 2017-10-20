package com.example.administrator.yintaidemo.ui.fragemnts.forestallfragment.model;

import android.content.Context;

import com.example.administrator.yintaidemo.interfaces.HttpCallBack;

import java.util.Map;

/**
 * Created by 张扬帆 on 2017/10/20.
 */

public interface InterfaceForestall {
    void request(Context context, Map<String, String> mParams, HttpCallBack callback);
}
