package com.example.administrator.yintaidemo.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

import com.example.administrator.yintaidemo.entity.HomePageBean;
import com.example.administrator.yintaidemo.ui.AutoProductActivity;
import com.example.administrator.yintaidemo.ui.GeneralProductActivity;
import com.example.administrator.yintaidemo.ui.WebActivity;
import com.example.administrator.yintaidemo.ui.customproduct.CustomProductAcitivity;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Mr Chen on 2017/10/20.
 */

public class JumpActivityUtils {
    public static void jump(Context context, HomePageBean.DataBean.TemplatelistBean.ItemsBean bean) {
        String jumpUrl = bean.getJumpurl();
        Uri uri = Uri.parse(jumpUrl);
        String part = uri.getSchemeSpecificPart();
        if (part.startsWith("//InnerH5?")) {
            String query = uri.getQuery();
            String[] split = query.split("url=");
            Intent intent = new Intent(context, WebActivity.class);
            intent.putExtra("url", split[1]);
            context.startActivity(intent);
            // 销量 价格 上架时间
        } else if (part.startsWith("//AutoProductList?")) {
            Intent intent = new Intent(context, AutoProductActivity.class);
            intent.putExtra("name", "name");
            intent.putExtra("url", part);
            context.startActivity(intent);
            //商品详情

        } else if (part.startsWith("//GeneralProductDetial?")) {
            Intent intent = new Intent(context, GeneralProductActivity.class);
            intent.putExtra("name", bean.getExtra().getProductdetail().getName());
            intent.putExtra("url", jumpUrl);
            context.startActivity(intent);
            //默认 销量 价格 折扣

        } else if (part.startsWith("//CustomProductList?")) {
            Intent intent = new Intent(context, CustomProductAcitivity.class);
            intent.putExtra("name", "name");
            intent.putExtra("url", jumpUrl);
            context.startActivity(intent);
        }

    }

    public static String getTime() {
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");//设置日期格式
        return df.format(new Date());

    }
}
