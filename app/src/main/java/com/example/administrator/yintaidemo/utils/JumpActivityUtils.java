package com.example.administrator.yintaidemo.utils;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.example.administrator.yintaidemo.ui.WebActivity;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by Mr Chen on 2017/10/20.
 */

public class JumpActivityUtils {
    public static void jump(Context context, String jumpUrl) {
        try {
            URI uri = new URI(jumpUrl);
            String query = uri.getQuery();
            if (query.startsWith("url=")) {
                String[] split = query.split("url=");
                Intent intent = new Intent(context, WebActivity.class);
                intent.putExtra("url", split[1]);
                context.startActivity(intent);
            }
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

    }
}
