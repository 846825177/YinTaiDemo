package com.example.administrator.yintaidemo.ui.fragemnts.classifyfragment;

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
import com.example.administrator.yintaidemo.ui.fragemnts.FashionshopFragment;
import com.example.administrator.yintaidemo.ui.fragemnts.homefragment.SkinCareFragment;

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


        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("时尚名品");
        stringArrayList.add("潮流女装");
        stringArrayList.add("精彩护肤");
        ListViewAdapter listViewAdapter = new ListViewAdapter(stringArrayList,getActivity());
        listView.setAdapter(listViewAdapter);

listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

    private SkinCareFragment skinCareFragment;
    private FashionshopFragment fashionshopFragment;
    private FragmentTransaction transaction;

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        FragmentManager fragmentManager = getFragmentManager();
        transaction = fragmentManager.beginTransaction();
        switch (position){
            case 0:
            if (fashionshopFragment==null) {
                fashionshopFragment = new FashionshopFragment();
            }
            transaction.replace(R.id.frame,fashionshopFragment);
            break;


            case 1:
                if (fashionshopFragment==null) {
                    fashionshopFragment = new FashionshopFragment();
                }
                transaction.replace(R.id.frame,fashionshopFragment);

                break;



            case 2:
                if (skinCareFragment==null){
                    skinCareFragment = new SkinCareFragment();
                }

                transaction.replace(R.id.frame,skinCareFragment);

                break;


        }
      transaction.commit();


    }
});






        return view;
    }

    private void initView(View view ) {
        listView = view.findViewById(R.id.listfenlei);
        frameLayout = view.findViewById(R.id.frame);


    }
}
