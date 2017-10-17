package com.example.administrator.yintaidemo.http.product;

import com.example.administrator.yintaidemo.interfaces.HttpCallBack;

import java.lang.reflect.Type;
import java.util.Map;

/**
 * Created by Mr Chen on 2017/10/17.
 */

public interface HttpRequest<T> {
    void post(String url, Type type, Map<String, String> mParams, HttpCallBack<T> callBack);
    void get(String url, Type type, HttpCallBack<T> callBack);
}
