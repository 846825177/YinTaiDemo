package com.example.administrator.yintaidemo.db;

import android.content.Context;

import com.example.administrator.yintaidemo.entity.ShopCartEntity;

import java.util.List;

/**
 * Created by 张扬帆 on 2017/10/17.
 */

public interface InterfaceDatabase {
    List<ShopCartEntity> queryForAll(Context context);

    List<ShopCartEntity> queryWhere(Context context, ShopCartEntity entity);

    void remove(Context context, ShopCartEntity entity);

    void insert(Context context, ShopCartEntity entity);

    void update(Context context, ShopCartEntity entity);
}
