package com.example.administrator.yintaidemo.db;

import android.content.Context;

import com.jiyun.com.day07_greendao.DaoMaster;
import com.jiyun.com.day07_greendao.DaoSession;
import com.jiyun.com.day07_greendao.ShopCartEntityDao;

/**
 * Created by 张扬帆 on 2017/10/17.
 */

public class GreenDaoUtils {
    private static GreenDaoUtils utils;
    private static final String DB_NAME="shopcar.db";
    private final DaoMaster.DevOpenHelper helper;

    private GreenDaoUtils(Context context) {
        helper = new DaoMaster.DevOpenHelper(context, DB_NAME);
    }

    public static GreenDaoUtils getUtils(Context context){
        if (utils==null){
            synchronized (GreenDaoUtils.class){
                if (utils==null){
                    utils=new GreenDaoUtils(context);
                }
            }
        }
        return utils;
    }

    public ShopCartEntityDao getDao(){
        DaoMaster master = new DaoMaster(helper.getWritableDatabase());
        DaoSession session = master.newSession();
        ShopCartEntityDao dao = session.getShopCartEntityDao();
        return dao;
    }
}
