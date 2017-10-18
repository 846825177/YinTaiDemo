package com.example.administrator.yintaidemo.ui.fragemnts.homefragment;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.administrator.yintaidemo.R;
import com.example.administrator.yintaidemo.entity.HomePageBean;
import com.example.administrator.yintaidemo.utils.PhoneParamsUtils;

import java.util.List;

/**
 * -------- This is 羊驼! -------
 * 　　　┏┓　　　┏┓
 * 　　┏┛┻━━━┛┻┓
 * 　　┃　　　　　　　┃
 * 　　┃　　　━　　　┃
 * 　　┃　┳┛　┗┳　┃
 * 　　┃　　　　　　　┃
 * 　　┃　　　┻　　　┃
 * 　　┃　　　　　　　┃
 * 　　┗━┓　　　┏━┛
 * 　　　　┃　　　┃神兽保佑
 * 　　　　┃　　　┃代码无BUG！
 * 　　　　┃　　　┗━━━┓
 * 　　　　┃　　　　　　　┣┓
 * 　　　　┃　　　　　　　┏┛
 * 　　　　┗┓┓┏━┳┓┏┛
 * 　　　　　┃┫┫　┃┫┫
 * 　　　　　┗┻┛　┗┻┛
 * ━━━━━━神兽出没━━━━━━
 * Created by 习爸爸 on 2017/9/28.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private Context context;
    private List<HomePageBean.DataBean.TemplatelistBean.ItemsBean> items;

    public RecyclerViewAdapter(Context context, List<HomePageBean.DataBean.TemplatelistBean.ItemsBean> items) {
        this.context = context;
        this.items = items;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item, parent, false);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(PhoneParamsUtils.getPhoneWidth(context) / 3, LinearLayout.LayoutParams.WRAP_CONTENT);
        view.setLayoutParams(params);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mRecycler_title.setText(items.get(position).getExtra().getProductdetail().getName());
        holder.mPrice.setText("￥" + items.get(position).getExtra().getProductdetail().getPrice() + "");
        Glide.with(context).load(items.get(position).getImgurl()).into(holder.mImage_recyc);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView mImage_recyc;
        private TextView mPrice;
        private TextView mRecycler_title;

        public ViewHolder(View itemView) {
            super(itemView);
            mImage_recyc = (ImageView) itemView.findViewById(R.id.mImage_recyc);
            mPrice = (TextView) itemView.findViewById(R.id.mPrice);
            mRecycler_title = (TextView) itemView.findViewById(R.id.mRecycler_title);
        }
    }
}
