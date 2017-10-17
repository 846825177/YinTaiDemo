package com.example.administrator.yintaidemo.ui.fragemnts;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.yintaidemo.R;

/**
 * Created by dell on 2017/10/17.
 */
//分类
public class ClassifyFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = LayoutInflater.from(getActivity()).inflate(R.layout.classifyfragment, container, false);


        return view;
    }
}
