package com.example.administrator.yintaidemo.http.factor;

import android.content.Context;

import com.example.administrator.yintaidemo.http.product.HttpRequest;

/**
 * Created by Mr Chen on 2017/10/17.
 */

public interface HttpRequestFactor {
    public abstract <T extends HttpRequest> HttpRequest create(Class<T> clz);
    public abstract <T extends HttpRequest> HttpRequest create(Context context,Class<T> clz);
}
