package com.example.administrator.yintaidemo.adapters;

import android.content.Context;
import android.graphics.Paint;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.administrator.yintaidemo.R;
import com.example.administrator.yintaidemo.entity.AutoProductBean;

import java.util.ArrayList;

/**
 * Created by Mr Chen on 2017/10/24.
 */

public class AutoProductAdapter extends RecyclerView.Adapter {
    private static final int ITEM_TYPE_A = 0;
    private static final int ITEM_TYPE_B = 1;
    private ArrayList<AutoProductBean.DataBean.ProductListBean> mList;
    private int itemType;
    private Context context;

    public void setItemType(int type){
        this.itemType=type;
    }
    public AutoProductAdapter(ArrayList<AutoProductBean.DataBean.ProductListBean> mList, int itemType, Context context) {
        this.mList = mList;
        this.itemType = itemType;
        this.context = context;
    }

    @Override
    public int getItemViewType(int position) {
        return itemType;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        switch (viewType) {
            case ITEM_TYPE_A:
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_item_a, parent, false);
                ViewHolder1 holder1 = new ViewHolder1(view);
                return holder1;
            case ITEM_TYPE_B:
                View view2 = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_item_b, parent, false);
                ViewHolder2 holder2 = new ViewHolder2(view2);
                return holder2;
        }
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        switch (getItemViewType(position)) {
            case 0:
                ViewHolder1 holder1 = (ViewHolder1) holder;
                Glide.with(context).load(mList.get(position).getBigimageurl()).into(((ViewHolder1) holder).mCustomImage);
                holder1.mPrice_right.setText(mList.get(position).getPromotion_price() + "");
                holder1.mPrice_right.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);
                holder1.mPriductName.setText(mList.get(position).getName());
                holder1.mPromotion_price.setText(mList.get(position).getPrice()+"");
                break;
            case 1:
                ViewHolder2 holder2 = (ViewHolder2) holder;
                Glide.with(context).load(mList.get(position).getBigimageurl()).into(((ViewHolder2) holder).mLeft_midimageurl);
                holder2.mRgith_Promotion_price.setText(mList.get(position).getPromotion_price() + "");
                holder2.mRight_Price.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);
                holder2.mRight_Price.getPaint().setFlags(mList.get(position).getPrice());
                holder2.mRight_name.setText(mList.get(position).getName());
                holder2.mRight_promotionlabel.setText(mList.get(position).getPromotion_price());

                break;


        }


    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    class ViewHolder1 extends RecyclerView.ViewHolder {

        public View rootView;
        public TextView mPromotionlabel;
        public ImageView mCustomImage;
        public TextView mPriductName;
        public TextView mPromotion_price;
        public TextView mPrice_right;

        public ViewHolder1(View rootView) {
            super(rootView);
            this.rootView = rootView;
            this.mPromotionlabel = (TextView) rootView.findViewById(R.id.mPromotionlabel);
            this.mCustomImage = (ImageView) rootView.findViewById(R.id.mCustomImage);
            this.mPriductName = (TextView) rootView.findViewById(R.id.mPriductName);
            this.mPromotion_price = (TextView) rootView.findViewById(R.id.mPromotion_price);
            this.mPrice_right = (TextView) rootView.findViewById(R.id.mPrice_right);
        }

    }

    class ViewHolder2 extends RecyclerView.ViewHolder {

        public View rootView;
        public ImageView mLeft_midimageurl;
        public TextView mRight_name;
        public TextView mRight_promotionlabel;
        public TextView mRight_Price;
        public TextView mRgith_Promotion_price;

        public ViewHolder2(View rootView) {
            super(rootView);
            this.rootView = rootView;
            this.mLeft_midimageurl = (ImageView) rootView.findViewById(R.id.mLeft_midimageurl);
            this.mRight_name = (TextView) rootView.findViewById(R.id.mRight_name);
            this.mRight_promotionlabel = (TextView) rootView.findViewById(R.id.mRight_promotionlabel);
            this.mRight_Price = (TextView) rootView.findViewById(R.id.mRight_Price);
            this.mRgith_Promotion_price = (TextView) rootView.findViewById(R.id.mRgith_Promotion_price);
        }

    }


}
