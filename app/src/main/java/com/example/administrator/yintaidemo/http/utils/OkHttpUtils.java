package com.example.administrator.yintaidemo.http.utils;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;

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

    public Call newCall(Request request) {
        return okHttpClient.newCall(request);
    }
}
