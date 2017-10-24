package com.example.administrator.yintaidemo.ui.fragemnts;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.administrator.yintaidemo.R;
import com.example.administrator.yintaidemo.ui.LoginActivity;

import static android.content.Context.MODE_PRIVATE;


/**
 * Created by dell on 2017/10/17.
 */
//我的银泰
public class MineYinTaiFragment extends Fragment implements View.OnClickListener {
    private ImageView img_dengluzhuce;
    private RelativeLayout relativelayout_shoucang;
    private RelativeLayout relativelayout_zuijin;
    private RelativeLayout relativelayout_daizhifu;
    private RelativeLayout relativelayout_quanbu;
    private RelativeLayout relativelayout_youhui;
    private RelativeLayout relativelayout_dizhi;
    private RelativeLayout relativelayout_xiaoxi;
    private RelativeLayout relativelayout_shezhi;
    private RelativeLayout relativelayout_qingchu;
    private RelativeLayout relativelayout_gengduo;
    private boolean loginbolean;
    private TextView text_hunaying;
    private ImageView mineyintai_img;
    private RelativeLayout mineyintai_relative;
    private TextView mineyintai_yhm;
    private TextView mineyintai_yhm_mc;
    private TextView mineyintai_hy;
    private RelativeLayout mineyintai_tc;
    private String stringName;
    private String stringPassword;
    private String uName;
    private String pWord;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = LayoutInflater.from(getActivity()).inflate(R.layout.mineyintaifragment, container, false);
        //查询SharedPreferences 的登录
        SharedPreferences sh = getActivity().getSharedPreferences("p", MODE_PRIVATE);
        //参数1：存储在xml中的key对象，参数2是个default字符串这个字符串用来再取key的时候取不到的时候给一个默认值
        uName = sh.getString("uName", "");
        pWord = sh.getString("pWord", "");
        initView(view);
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();


    }

    private void initView(View view) {
        mineyintai_img = (ImageView) view.findViewById(R.id.mineyintai_img);
        mineyintai_relative = (RelativeLayout) view.findViewById(R.id.mineyintai_relative);
        mineyintai_yhm = (TextView) view.findViewById(R.id.mineyintai_yhm);
        mineyintai_yhm_mc = (TextView) view.findViewById(R.id.mineyintai_yhm_mc);
        mineyintai_hy = (TextView) view.findViewById(R.id.mineyintai_hy);
        img_dengluzhuce = (ImageView) view.findViewById(R.id.img_dengluzhuce);
        text_hunaying = (TextView) view.findViewById(R.id.text_hunaying);
        mineyintai_tc = (RelativeLayout) view.findViewById(R.id.mineyintai_tc);
        mineyintai_tc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        relativelayout_shoucang = (RelativeLayout) view.findViewById(R.id.relativelayout_shoucang);
        relativelayout_zuijin = (RelativeLayout) view.findViewById(R.id.relativelayout_zuijin);
        relativelayout_daizhifu = (RelativeLayout) view.findViewById(R.id.relativelayout_daizhifu);
        relativelayout_quanbu = (RelativeLayout) view.findViewById(R.id.relativelayout_quanbu);
        relativelayout_youhui = (RelativeLayout) view.findViewById(R.id.relativelayout_youhui);
        relativelayout_dizhi = (RelativeLayout) view.findViewById(R.id.relativelayout_dizhi);
        relativelayout_xiaoxi = (RelativeLayout) view.findViewById(R.id.relativelayout_xiaoxi);
        relativelayout_shezhi = (RelativeLayout) view.findViewById(R.id.relativelayout_shezhi);
        relativelayout_qingchu = (RelativeLayout) view.findViewById(R.id.relativelayout_qingchu);
        relativelayout_gengduo = (RelativeLayout) view.findViewById(R.id.relativelayout_gengduo);
        img_dengluzhuce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(new Intent(getActivity(), LoginActivity.class), 100);
            }
        });
        relativelayout_shoucang.setOnClickListener(this);
        relativelayout_zuijin.setOnClickListener(this);
        relativelayout_daizhifu.setOnClickListener(this);
        relativelayout_quanbu.setOnClickListener(this);
        relativelayout_youhui.setOnClickListener(this);
        relativelayout_dizhi.setOnClickListener(this);
        relativelayout_xiaoxi.setOnClickListener(this);
        relativelayout_shezhi.setOnClickListener(this);
        relativelayout_qingchu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "清除完毕", Toast.LENGTH_SHORT).show();
            }
        });
        relativelayout_gengduo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "更多", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.relativelayout_shoucang:
                break;
            case R.id.relativelayout_zuijin:
                break;
            case R.id.relativelayout_daizhifu:
                break;
            case R.id.relativelayout_quanbu:
                break;
            case R.id.relativelayout_youhui:
                break;
            case R.id.relativelayout_dizhi:
                break;
            case R.id.relativelayout_xiaoxi:
                break;
            case R.id.relativelayout_shezhi:
                break;


        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 100 && resultCode == 120) {
            stringName = data.getStringExtra("name");
            stringPassword = data.getStringExtra("password");
            if (uName.isEmpty() || pWord.isEmpty()) {
                Toast.makeText(getActivity(), "000000000000000", Toast.LENGTH_SHORT).show();
                img_dengluzhuce.setVisibility(View.VISIBLE);
                text_hunaying.setVisibility(View.VISIBLE);
                mineyintai_img.setVisibility(View.GONE);
                mineyintai_relative.setVisibility(View.GONE);
                mineyintai_yhm.setVisibility(View.GONE);
                mineyintai_yhm_mc.setVisibility(View.GONE);
                mineyintai_hy.setVisibility(View.GONE);
                mineyintai_tc.setVisibility(View.GONE);
            } else {

                if (uName.equals(stringName) && pWord.equals(stringPassword)) {

                    img_dengluzhuce.setVisibility(View.GONE);
                    text_hunaying.setVisibility(View.GONE);
                    mineyintai_img.setVisibility(View.VISIBLE);
                    mineyintai_relative.setVisibility(View.VISIBLE);
                    mineyintai_yhm.setVisibility(View.VISIBLE);
                    mineyintai_yhm_mc.setVisibility(View.VISIBLE);
                    mineyintai_hy.setVisibility(View.VISIBLE);
                    mineyintai_tc.setVisibility(View.VISIBLE);
                } else {
                    img_dengluzhuce.setVisibility(View.VISIBLE);
                    text_hunaying.setVisibility(View.VISIBLE);
                    mineyintai_img.setVisibility(View.GONE);
                    mineyintai_relative.setVisibility(View.GONE);
                    mineyintai_yhm.setVisibility(View.GONE);
                    mineyintai_yhm_mc.setVisibility(View.GONE);
                    mineyintai_hy.setVisibility(View.GONE);
                    mineyintai_tc.setVisibility(View.GONE);
                }


            }

        }

    }
}
