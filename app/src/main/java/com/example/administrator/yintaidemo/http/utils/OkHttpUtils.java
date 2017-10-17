package com.example.administrator.yintaidemo.http.utils;

import com.example.administrator.yintaidemo.entity.HomePageBean;
import com.example.administrator.yintaidemo.interfaces.HttpCallBack;
import com.google.gson.Gson;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by Mr Chen on 2017/10/17.
 */

public class OkHttpUtils {
    private static OkHttpUtils okHttpUtils;
    private OkHttpClient okHttpClient;

    private OkHttpUtils() {
        okHttpClient = new OkHttpClient.Builder().build();
    }

    public static synchronized OkHttpUtils getInstance() {
        if (okHttpUtils == null)
            okHttpUtils = new OkHttpUtils();
        return okHttpUtils;
    }

    public void sendGet(String url, final HttpCallBack<HomePageBean> callback) {
        Request request = new Request.Builder().url(url).build();
        Call call = okHttpClient.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                callback.failure(e);
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                Gson gson = new Gson();
                HomePageBean homeBean = gson.fromJson(response.body().string(), HomePageBean.class);
                callback.success(homeBean);
            }
        });
    }
}
