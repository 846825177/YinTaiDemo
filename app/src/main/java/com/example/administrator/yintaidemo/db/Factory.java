package com.example.administrator.yintaidemo.db;

/**
 * Created by 张扬帆 on 2017/10/17.
 */

public class Factory implements InterfaceFactory {
    @Override
    public InterfaceDatabase createDbGreenDao() {
        return new DbGreenDao();
    }
}
