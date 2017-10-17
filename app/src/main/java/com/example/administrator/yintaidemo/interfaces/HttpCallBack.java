package com.example.administrator.yintaidemo.interfaces;

/**
 * Created by Mr Chen on 2017/10/17.
 */

public interface HttpCallBack<T> {
    void success(T t);
    void failure(Exception e);
}
