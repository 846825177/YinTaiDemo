package com.example.administrator.yintaidemo.ui.fragemnts.homefragment.models;

import android.content.Context;

import com.example.administrator.yintaidemo.interfaces.HttpCallBack;

import java.util.Map;

/**
 * Created by Mr Chen on 2017/10/17.
 */

public interface HomeFragmentModel {
    void request(Context context, Map<String, String> mParams, HttpCallBack callback);
}
