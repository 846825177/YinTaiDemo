package com.example.administrator.yintaidemo.http.factor;

import android.content.Context;

import com.example.administrator.yintaidemo.http.product.HttpRequest;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by Mr Chen on 2017/10/17.
 */

public class ConCreateHttpReqeust implements HttpRequestFactor{

    @Override
    public <T extends HttpRequest> HttpRequest create(Context context, Class<T> clz) {
        try {
            Class<?> aClass = Class.forName(clz.getName());
            Constructor<?> constructor = aClass.getConstructor(Context.class);
            HttpRequest o1 = (HttpRequest) constructor.newInstance(context);
            return o1;
        } catch (InstantiationException e) {
            e.printStackTrace();
            return null;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return null;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            return null;
        } catch (InvocationTargetException e) {
            e.printStackTrace();
            return null;
        }
    }
}
