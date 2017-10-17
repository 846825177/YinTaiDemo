package com.example.administrator.yintaidemo.db;

import android.content.Context;

import com.example.administrator.yintaidemo.entity.ShopCartEntity;
import com.jiyun.com.day07_greendao.ShopCartEntityDao;

import java.util.List;

/**
 * Created by 张扬帆 on 2017/10/17.
 */

public class DbGreenDao implements InterfaceDatabase {
    @Override
    public List<ShopCartEntity> queryForAll(Context context) {
        ShopCartEntityDao dao = GreenDaoUtils.getUtils(context).getDao();
        List<ShopCartEntity> list = dao.queryBuilder().list();
        return list;
    }

    @Override
    public List<ShopCartEntity> queryWhere(Context context, ShopCartEntity entity) {
        ShopCartEntityDao dao = GreenDaoUtils.getUtils(context).getDao();
        List<ShopCartEntity> list = dao.queryBuilder().where(ShopCartEntityDao.Properties.Name.eq(entity.getName())).list();
        return list;
    }

    @Override
    public void remove(Context context, ShopCartEntity entity) {
        ShopCartEntityDao dao = GreenDaoUtils.getUtils(context).getDao();
        dao.delete(entity);
    }

    @Override
    public void insert(Context context, ShopCartEntity entity) {
        ShopCartEntityDao dao = GreenDaoUtils.getUtils(context).getDao();
        dao.insert(entity);
    }

    @Override
    public void update(Context context, ShopCartEntity entity) {
        ShopCartEntityDao dao = GreenDaoUtils.getUtils(context).getDao();
        dao.update(entity);
    }
}
