package com.example.administrator.yintaidemo.ui.customproduct.models;

import android.content.Context;

import com.example.administrator.yintaidemo.concat.Concat;
import com.example.administrator.yintaidemo.http.factor.ConCreateHttpReqeust;
import com.example.administrator.yintaidemo.http.factor.HttpRequestFactor;
import com.example.administrator.yintaidemo.http.product.HttpRequest;
import com.example.administrator.yintaidemo.http.product.RetrofitHttpRequest;
import com.example.administrator.yintaidemo.interfaces.HttpCallBack;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;

/**
 * Created by Mr Chen on 2017/10/23.
 */

public class CustomModelImp implements CustomModel {
    @Override
    public void send(Context context, String path, Map<String, String> mParams, HttpCallBack callBack) {
        HttpRequestFactor factor = new ConCreateHttpReqeust();
        HttpRequest httpRequest = factor.create(RetrofitHttpRequest.class);
        Type[] genericInterfaces = callBack.getClass().getGenericInterfaces();
        Type[] actualTypeArguments = ((ParameterizedType) genericInterfaces[0]).getActualTypeArguments();
        Type types = actualTypeArguments[0];

        httpRequest.post(Concat.NEWSAPI_PATH + path, types, mParams, callBack);
    }
}
