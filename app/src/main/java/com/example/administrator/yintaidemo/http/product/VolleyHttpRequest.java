package com.example.administrator.yintaidemo.http.product;

import android.content.Context;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.example.administrator.yintaidemo.http.utils.VolleyUtils;
import com.example.administrator.yintaidemo.interfaces.HttpCallBack;
import com.google.gson.Gson;

import java.lang.reflect.Type;
import java.util.Map;

/**
 * Created by Mr Chen on 2017/10/17.
 */


public class VolleyHttpRequest<T> implements HttpRequest<T> {
    private Context context;

    public VolleyHttpRequest(Context context) {
        this.context = context;
    }

    @Override
    public void get(String url, Type type, HttpCallBack<T> callback) {

    }

    @Override
    public void post(String url, Type type, Map<String,String> mMap, HttpCallBack<T> callback) {
        post_String(url,type,mMap,callback);
    }
    public void post_String(String url, final Type type, final Map mMap, final HttpCallBack<T> callback) {
        StringRequest request = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Gson gson = new Gson();
                T t = gson.fromJson(response, type);
                callback.success(t);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                callback.failure(error);
            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                return mMap;
            }
        };
        VolleyUtils.getInstance(context).add(request);
    }
    public void post_Entity(String url, Type type, Map mMap, HttpCallBack<T> callback) {

    }
}

