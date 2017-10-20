package com.example.administrator.yintaidemo.ui.fragemnts;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.administrator.yintaidemo.R;
import com.example.administrator.yintaidemo.adapters.ShopAdapter;
import com.example.administrator.yintaidemo.db.GreenDaoUtils;
import com.example.administrator.yintaidemo.entity.ShopCartEntity;

import java.util.ArrayList;
import java.util.List;

import static android.R.id.list;
import static com.example.administrator.yintaidemo.R.id.num;


/**
 * Created by dell on 2017/10/17.
 */
//购物车
public class ShoppingcartFragment extends Fragment implements View.OnClickListener {


    public interface SetJump {
        void jump();
    }

    public SetJump setJump;

    public void OnsetJump(SetJump setJump) {
        this.setJump = setJump;
    }


    public interface SetJumpSettlement {
        void jumpsettlement(String name,
                            String image,
                            String color,
                            String size,
                            int num,
                            double price,
                            int judge);
    }

    public SetJumpSettlement setJumpSettlement;

    public void OnSetJumpSettlement(SetJumpSettlement setJumpSettlement) {
        this.setJumpSettlement = setJumpSettlement;
    }


    private Button shop_button;
    private LinearLayout shop_entity;
    private ListView listView;
    private double sumprice = 0;
    private int count = 0;
    private int judge = 0;
    private List<ShopCartEntity> list = new ArrayList<>();

    //全选
    private CheckBox checkBoxall;
    //合计价钱
    private TextView totaltextprice;
    //已经满多少元
    private TextView shop_alreadyprice;
    //去结算
    private Button button_totalprice;
    private List<ShopCartEntity> list1;
    private ShopAdapter shopAdapter;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable final Bundle savedInstanceState) {
        View view = LayoutInflater.from(getActivity()).inflate(R.layout.shoppingcartfragment, container, false);
        initView(view);
        shopAdapter = new ShopAdapter(list, getActivity());
        // query();
        shopAdapter.setCheckLister(new ShopAdapter.CheckListener() {
            @Override
            public void click(List<ShopCartEntity> list) {
                sumprice = 0;
                count = 0;
                for (int i = 0; i < list.size(); i++) {
                    boolean ischeckd = list.get(i).ischeckd();
                    if (ischeckd) {
                        count++;
                        int num = list.get(i).getNum();
                        double price = list.get(i).getPrice();
                        //判断 购物车中该商品添加了几次   以及对价格的影响

//                        if (num == 0) {
//                            sumprice += price;
//                        } else {
//                            sumprice += price * num;
//                        }
                        sumprice += price * num;







                    } else {
                        checkBoxall.setChecked(false);
                    }


                }
                if (sumprice >= 199.00) {
                    judge = 1;
                } else {
                    if (sumprice == 0.00) {
                        judge = 3;
                    } else {
                        judge = 2;
                    }
                }



                if (count == list.size()) {
                    checkBoxall.setChecked(true);

                } else {
                    checkBoxall.setChecked(false);
                }
                totaltextprice.setText("￥" + sumprice);
                //判断是否需要运费
                if (judge == 1) {
                    shop_alreadyprice.setText("已满199元,免费运");
                } else if (judge == 2) {
                    shop_alreadyprice.setText("不满199元,运费15元");
                } else if (judge == 3) {
                    shop_alreadyprice.setText("请选择商品进行结算");
                }


            }
        });
        listView.setAdapter(shopAdapter);

        checkBoxall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sumprice = 0;
//                judge=3;
                if (checkBoxall.isChecked()) {

                    for (int i = 0; i < list.size(); i++) {

                        list.get(i).setIscheckd(true);
                        double price = list.get(i).getPrice();
                        int num = list.get(i).getNum();
                        sumprice += price * num;


                    }


                    if (sumprice >= 199.00) {
                        judge = 1;
                    } else {

                        judge = 2;

                    }


                } else {

                    for (int i = 0; i < list.size(); i++) {
                        list.get(i).setIscheckd(false);
                    }
                    judge = 3;
                    sumprice = 0;
                    count = 0;

                }
                shopAdapter.notifyDataSetChanged();
                totaltextprice.setText("￥" + sumprice);
                //判断是否需要运费
                if (judge == 1) {
                    shop_alreadyprice.setText("已满199元,免费运");

                } else if (judge == 2) {
                    shop_alreadyprice.setText("不满199元,运费15元");

                } else if (judge == 3) {
                    shop_alreadyprice.setText("请选择商品进行结算");

                }


            }
        });


        return view;
    }

    private void query() {
        list.clear();
        list1 = GreenDaoUtils.getUtils(getActivity()).getDao().queryBuilder().list();
        list.addAll(list1);

        if (list.size() > 0) {

            listView.setVisibility(View.VISIBLE);
            shop_entity.setVisibility(View.GONE);
            // list.addAll(list1);
            shopAdapter.notifyDataSetChanged();


        } else {
            shop_entity.setVisibility(View.VISIBLE);
            listView.setVisibility(View.GONE);
        }


    }

    private void initView(View view) {
        shop_button = (Button) view.findViewById(R.id.shop_button);
        shop_entity = (LinearLayout) view.findViewById(R.id.shop_entity);
        listView = (ListView) view.findViewById(R.id.shopitem_list);
        checkBoxall = (CheckBox) view.findViewById(R.id.checkall);
        totaltextprice = (TextView) view.findViewById(R.id.totaltextprice);
        shop_alreadyprice = (TextView) view.findViewById(R.id.shop_alreadyprice);
        button_totalprice = (Button) view.findViewById(R.id.button_totalprice);
        button_totalprice.setOnClickListener(this);
        shop_button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.shop_button:


                setJump.jump();
                break;
            case R.id.button_totalprice:
               if (judge==3){
                   Toast.makeText(getActivity(), "请勾选内容", Toast.LENGTH_SHORT).show();
               }else {
                   for (int i = 0; i < list.size(); i++) {
                       boolean ischeckd = list.get(i).ischeckd();
                       if (ischeckd) {
                           //名字颜色型号数量价钱  运费
                           setJumpSettlement.jumpsettlement(list.get(i).getName(),
                                   list.get(i).getImg(),
                                   list.get(i).getColor(),
                                   list.get(i).getSize(),
                                   list.get(i).getNum(), list.get(i).getPrice(), judge);
                       }


                   }

               }

                break;
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        query();
    }
}
