package com.example.administrator.yintaidemo.db;

import android.content.Context;

import com.example.administrator.yintaidemo.entity.ShopCartEntity;
import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by 张扬帆 on 2017/10/17.
 */

public class DbOrmLite implements InterfaceDatabase {
    /**
     * 查找全部
     *
     * @param context
     * @return
     */
    @Override
    public List<ShopCartEntity> queryForAll(Context context) {
        try {
            Dao<ShopCartEntity, ?> dao = OrmLiteUtils.getUtils(context).getDao(ShopCartEntity.class);
            List<ShopCartEntity> list = dao.queryForAll();
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 条件查找  根据名字
     *
     * @param context
     * @param entity
     * @return
     */
    @Override
    public List<ShopCartEntity> queryWhere(Context context, ShopCartEntity entity) {
        try {
            Dao<ShopCartEntity, ?> dao = OrmLiteUtils.getUtils(context).getDao(ShopCartEntity.class);
            List<ShopCartEntity> query = dao.queryBuilder().where().eq("name", entity.getName()).query();
            return query;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 删除
     *
     * @param context
     * @param entity
     */
    @Override
    public void remove(Context context, ShopCartEntity entity) {
        try {
            Dao<ShopCartEntity, ?> dao = OrmLiteUtils.getUtils(context).getDao(ShopCartEntity.class);
            dao.delete(entity);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * 添加
     *
     * @param context
     * @param entity
     */
    @Override
    public void insert(Context context, ShopCartEntity entity) {
        try {
            Dao<ShopCartEntity, ?> dao = OrmLiteUtils.getUtils(context).getDao(ShopCartEntity.class);
            dao.create(entity);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * 修改
     *
     * @param context
     * @param entity
     */
    @Override
    public void update(Context context, ShopCartEntity entity) {
        try {
            Dao<ShopCartEntity, ?> dao = OrmLiteUtils.getUtils(context).getDao(ShopCartEntity.class);
            dao.createOrUpdate(entity);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
