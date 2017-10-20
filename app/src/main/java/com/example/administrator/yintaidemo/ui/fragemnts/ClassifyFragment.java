package com.example.administrator.yintaidemo.ui.fragemnts;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;

import com.example.administrator.yintaidemo.R;
import com.example.administrator.yintaidemo.adapters.ListViewAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell on 2017/10/17.
 */
//分类
public class ClassifyFragment extends Fragment {

    private ListView listView;
    private FrameLayout frameLayout;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = LayoutInflater.from(getActivity()).inflate(R.layout.classifyfragment, container, false);
       initView(view);








        return view;
    }

    private void initView(View view ) {
        listView = view.findViewById(R.id.listfenlei);
        frameLayout = view.findViewById(R.id.frame);


    }
}
