package com.example.administrator.yintaidemo.ui.fragemnts;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.example.administrator.yintaidemo.R;
import com.example.administrator.yintaidemo.ui.LoginActivity;

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
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = LayoutInflater.from(getActivity()).inflate(R.layout.mineyintaifragment, container, false);
        initView(view);
        return view;
    }

    private void initView(View view) {
        img_dengluzhuce = (ImageView) view.findViewById(R.id.img_dengluzhuce);
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
        img_dengluzhuce.setOnClickListener(this);
        relativelayout_shoucang.setOnClickListener(this);
        relativelayout_zuijin.setOnClickListener(this);
        relativelayout_daizhifu.setOnClickListener(this);
        relativelayout_quanbu.setOnClickListener(this);
        relativelayout_youhui.setOnClickListener(this);
        relativelayout_dizhi.setOnClickListener(this);
        relativelayout_xiaoxi.setOnClickListener(this);
        relativelayout_shezhi.setOnClickListener(this);
        relativelayout_qingchu.setOnClickListener(this);
        relativelayout_gengduo.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.img_dengluzhuce:
                startActivity(new Intent(getActivity(),LoginActivity.class));
                break;
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
            case R.id.relativelayout_qingchu:
                break;
            case R.id.relativelayout_gengduo:
                break;

        }
    }
}
