package com.example.administrator.yintaidemo.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.administrator.yintaidemo.entity.ShopCartEntity;
import com.example.administrator.yintaidemo.entity.ShopEntity;
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;

/**
 * Created by 张扬帆 on 2017/10/17.
 */

public class OrmLiteUtils extends OrmLiteSqliteOpenHelper {
    private static String DB_NAME = "car";
    private static int DB_VERSION = 1;
    private static OrmLiteUtils utils;

    private OrmLiteUtils(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    public static OrmLiteUtils getUtils(Context context) {
        if (utils == null) {
            synchronized (OrmLiteUtils.class) {
                if (utils == null) {
                    utils = new OrmLiteUtils(context);
                }
            }
        }
        return utils;
    }

    @Override
    public void onCreate(SQLiteDatabase database, ConnectionSource connectionSource) {
        try {
            TableUtils.createTableIfNotExists(connectionSource, ShopEntity.class);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase database, ConnectionSource connectionSource, int oldVersion, int newVersion) {
        try {
            TableUtils.dropTable(connectionSource, ShopEntity.class, false);
            TableUtils.createTableIfNotExists(connectionSource, ShopEntity.class);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
