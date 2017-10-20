package com.example.administrator.yintaidemo.ui.fragemnts.forestallfragment.model;

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
 * Created by 张扬帆 on 2017/10/20.
 */

public class ForestallModel implements InterfaceForestall {
    @Override
    public void request(Context context, Map<String, String> mParams, HttpCallBack callback) {
        HttpRequestFactor factor = new ConCreateHttpReqeust();
        HttpRequest httpRequest = factor.create(RetrofitHttpRequest.class);
        Type[] genericInterfaces = callback.getClass().getGenericInterfaces();
        Type[] actualTypeArguments = ((ParameterizedType) genericInterfaces[0]).getActualTypeArguments();
        Type types =  actualTypeArguments[0];

        httpRequest.post(Concat.NEWSAPI_PATH,types,mParams,callback);
    }
}
