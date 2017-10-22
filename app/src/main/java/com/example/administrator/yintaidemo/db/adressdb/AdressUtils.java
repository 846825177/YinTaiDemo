package com.example.administrator.yintaidemo.db.adressdb;

import android.content.Context;

import com.jiyun.com.day07_greendao.AdressBeanDao;
import com.jiyun.com.day07_greendao.DaoMaster;
import com.jiyun.com.day07_greendao.DaoSession;

/**
 * Created by dell on 2017/10/21.
 */

public class AdressUtils {
    private static AdressUtils adressUtils;
    private final String DB_NAME="adress.db";
    private final DaoMaster.DevOpenHelper devOpenHelper;

    private AdressUtils(Context context){
        devOpenHelper = new DaoMaster.DevOpenHelper(context, DB_NAME);

    }

    public static synchronized AdressUtils getIntance(Context context){

        if (adressUtils==null)
      adressUtils=new AdressUtils(context);
        return adressUtils;

    }
public AdressBeanDao getDao(){


    DaoMaster daoMaster = new DaoMaster(devOpenHelper.getWritableDatabase());
    DaoSession daoSession = daoMaster.newSession();
    AdressBeanDao adressBeanDao = daoSession.getAdressBeanDao();
return adressBeanDao;
}




}
