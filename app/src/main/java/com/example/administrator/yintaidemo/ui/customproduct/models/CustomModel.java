package com.example.administrator.yintaidemo.ui.customproduct.models;

import android.content.Context;

import com.example.administrator.yintaidemo.interfaces.HttpCallBack;

import java.util.Map;

/**
 * Created by Mr Chen on 2017/10/23.
 */

public interface CustomModel {
    void send(Context context,String path,Map<String, String> map, HttpCallBack callBack);
}
