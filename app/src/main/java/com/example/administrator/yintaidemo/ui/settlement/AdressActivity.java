package com.example.administrator.yintaidemo.ui.settlement;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import com.example.administrator.yintaidemo.R;
import com.example.administrator.yintaidemo.adapters.AdressAdapter;
import com.example.administrator.yintaidemo.db.adressdb.AdressBean;
import com.example.administrator.yintaidemo.db.adressdb.AdressUtils;

import java.util.ArrayList;
import java.util.List;
//地址管理
public class AdressActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adress);


    }
}