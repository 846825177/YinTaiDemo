package com.example.administrator.yintaidemo.http.product;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.example.administrator.yintaidemo.http.utils.OkHttpUtils;
import com.example.administrator.yintaidemo.interfaces.HttpCallBack;

import java.lang.reflect.Type;
import java.util.Map;

import okhttp3.Call;

/**
 * Created by Mr Chen on 2017/10/17.
 */

public class OkHttpRequest implements HttpRequest {
    @Override
    public void post(String url, Type type, Map mParams, HttpCallBack callBack) {

    }

    @Override
    public void get(String url, Type type, HttpCallBack callBack) {

    }
}
