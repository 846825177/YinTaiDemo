package com.example.administrator.yintaidemo.ui;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class AbstractActivity extends AppCompatActivity {
protected Handler handler=new Handler();
    public View infalter(int id){

        return View.inflate(this,id,null);
    }

    void toast(String s){
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }

}
