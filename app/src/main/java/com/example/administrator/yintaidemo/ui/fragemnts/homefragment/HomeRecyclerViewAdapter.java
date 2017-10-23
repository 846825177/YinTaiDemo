package com.example.administrator.yintaidemo.ui.fragemnts.homefragment;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
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
import com.recker.flybanner.FlyBanner;

import java.util.ArrayList;
import java.util.List;


public class HomeRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;
    private ArrayList<HomePageBean.DataBean.TemplatelistBean> mList;
    public static final int ITEM_TYPE_COUNT = 11;
    //FuncAreaFiveImg  5个图片
    public static final int ITEM_TYPE_FUNCAREAFIVEIMG = 0;
    //爆款专区-楼层头6 FloorHead
    public static final int ITEM_TYPE_FLOORHEAD = 1;
    //    爆款间距 FloorSpace
    public static final int ITEM_TYPE_FLOORSPACE = 2;
    //ProductSingleRow 爆款专区0925
    public static final int ITEM_TYPE_PRODUCTSINGLEROW = 3;
    //爆款专区楼层尾  FloorFoot
    public static final int ITEM_TYPE_FLOORFOOT = 4;
    //TwoImgAverage  本周推荐0922下
    public static final int ITEM_TYPE_TWOIMGAVERAGE = 5;
    //OneImg 通栏-婴童花开月正圆
    public static final int ITEM_TYPE_ONEIMG = 6;
    //ThreeImgLeftOne
    public static final int ITEM_TYPE_THREEIMGLEFTONE = 7;
    //ThreeImgLeftTwo
    public static final int ITEM_TYPE_THREEIMGLEFTTWO = 8;
    // ThreeImgAbreast
    public static final int ITEM_TYPE_THREEIMGABREAST = 9;
    // CarouselFigure
    public static final int ITEM_TYPE_CAROUSELFIGURE = 10;
    public static final int ITEM_TYPE_PRODUCTDOUBLECOLUMN = 11;
    private RecyclerViewAdapter recyclerViewAdapter;
    private OnItemClickListener onItemClickListener;


    interface OnItemClickListener {
        void click(HomePageBean.DataBean.TemplatelistBean.ItemsBean bean);
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    @Override
    public int getItemViewType(int position) {
        String itemtype = mList.get(position).getTemplatetype();
        if ("FuncAreaFiveImg".equals(itemtype)) {
            return ITEM_TYPE_FUNCAREAFIVEIMG;
        }
        if ("FloorHead".equals(itemtype)) {
            return ITEM_TYPE_FLOORHEAD;
        }

        if ("FloorSpace".equals(itemtype)) {
            return ITEM_TYPE_FLOORSPACE;
        }
        if ("ProductSingleRow".equals(itemtype)) {
            return ITEM_TYPE_PRODUCTSINGLEROW;
        }
        if ("FloorFoot".equals(itemtype)) {
            return ITEM_TYPE_FLOORFOOT;
        }
        if ("TwoImgAverage".equals(itemtype)) {
            return ITEM_TYPE_TWOIMGAVERAGE;
        }
        if ("OneImg".equals(itemtype)) {
            return ITEM_TYPE_ONEIMG;
        }
        if ("ThreeImgLeftOne".equals(itemtype)) {
            return ITEM_TYPE_THREEIMGLEFTONE;
        }
        if ("ThreeImgLeftTwo".equals(itemtype)) {
            return ITEM_TYPE_THREEIMGLEFTTWO;
        }
        if ("ThreeImgAbreast".equals(itemtype)) {
            return ITEM_TYPE_THREEIMGABREAST;
        }
        if ("CarouselFigure".equals(itemtype)) {
            return ITEM_TYPE_CAROUSELFIGURE;
        }
        if ("ProductDoubleColumn".equals(itemtype)) {
            return ITEM_TYPE_PRODUCTDOUBLECOLUMN;
        }
        return 0;

    }

    public HomeRecyclerViewAdapter(ArrayList<HomePageBean.DataBean.TemplatelistBean> mList, Context context) {
        this.mList = mList;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == ITEM_TYPE_FUNCAREAFIVEIMG) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.funcareafiveimg_item, parent, false);
            FuncareafiveimgViewHolder funcareafiveimgViewHolder = new FuncareafiveimgViewHolder(view);
            return funcareafiveimgViewHolder;
        }
        if (viewType == ITEM_TYPE_FLOORHEAD) {
            View view1 = LayoutInflater.from(parent.getContext()).inflate(R.layout.floorhead_item, parent, false);
            FloorheadViewHolder floorheadViewHolder = new FloorheadViewHolder(view1);
            return floorheadViewHolder;
        }
        if (viewType == ITEM_TYPE_FLOORSPACE) {
            View view2 = LayoutInflater.from(parent.getContext()).inflate(R.layout.floorspace_item, parent, false);
            FloorspaceViewHolder floorspaceViewHolder = new FloorspaceViewHolder(view2);
            return floorspaceViewHolder;
        }
        if (viewType == ITEM_TYPE_PRODUCTSINGLEROW) {
            View view3 = LayoutInflater.from(parent.getContext()).inflate(R.layout.productsinglerow_item, parent, false);
            ProductsinglerowViewHolder productsinglerowViewHolder = new ProductsinglerowViewHolder(view3);
            return productsinglerowViewHolder;
        }
        if (viewType == ITEM_TYPE_FLOORFOOT) {
            View view4 = LayoutInflater.from(parent.getContext()).inflate(R.layout.floorfoot_item, parent, false);
            FloorfootViewHolder floorfootViewHolder = new FloorfootViewHolder(view4);
            return floorfootViewHolder;
        }
        if (viewType == ITEM_TYPE_TWOIMGAVERAGE) {
            View view5 = LayoutInflater.from(parent.getContext()).inflate(R.layout.twoimgaverage_item, parent, false);
            TwoimgaverageViewHolder twoimgaverageViewHolder = new TwoimgaverageViewHolder(view5);
            return twoimgaverageViewHolder;
        }
        if (viewType == ITEM_TYPE_ONEIMG) {
            View view6 = LayoutInflater.from(parent.getContext()).inflate(R.layout.oneimg_item, parent, false);
            OneimgViewHolder oneimgViewHolder = new OneimgViewHolder(view6);
            return oneimgViewHolder;
        }
        if (viewType == ITEM_TYPE_THREEIMGLEFTONE) {
            View view7 = LayoutInflater.from(parent.getContext()).inflate(R.layout.threeimgleftone_item, parent, false);
            ThreeimgleftoneViewHolder threeimgleftoneViewHolder = new ThreeimgleftoneViewHolder(view7);
            return threeimgleftoneViewHolder;
        }
        if (viewType == ITEM_TYPE_THREEIMGLEFTTWO) {
            View view8 = LayoutInflater.from(parent.getContext()).inflate(R.layout.threeimglefttwo, parent, false);
            ThreeimglefttwoViewHolder threeimglefttwoViewHolder = new ThreeimglefttwoViewHolder(view8);
            return threeimglefttwoViewHolder;
        }
        if (viewType == ITEM_TYPE_THREEIMGABREAST) {
            View view9 = LayoutInflater.from(parent.getContext()).inflate(R.layout.threeimgabreast_item, parent, false);
            ThreeimgabreastViewHolder threeimgabreastViewHolder = new ThreeimgabreastViewHolder(view9);
            return threeimgabreastViewHolder;
        }
        if (viewType == ITEM_TYPE_CAROUSELFIGURE) {
            View view10 = LayoutInflater.from(parent.getContext()).inflate(R.layout.carouselfigure_item, parent, false);
            CarouselfigureViewHolder carouselfigureViewHolder = new CarouselfigureViewHolder(view10);
            return carouselfigureViewHolder;
        }
        if (viewType == ITEM_TYPE_PRODUCTDOUBLECOLUMN) {
            View view11 = LayoutInflater.from(parent.getContext()).inflate(R.layout.productdoublecolumn_item, parent, false);
            ProductDoubleColumnViewHolder productdoublecolumn = new ProductDoubleColumnViewHolder(view11);
            return productdoublecolumn;
        }
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        HomePageBean.DataBean.TemplatelistBean bean = mList.get(position);
        if (holder instanceof FuncareafiveimgViewHolder) {
            final List<HomePageBean.DataBean.TemplatelistBean.ItemsBean> items = bean.getItems();
            ((FuncareafiveimgViewHolder) holder).mTextViwe_fun_a.setText(items.get(0).getImgname());
            ((FuncareafiveimgViewHolder) holder).mTextViwe_fun_b.setText(items.get(1).getImgname());
            ((FuncareafiveimgViewHolder) holder).mTextViwe_fun_c.setText(items.get(2).getImgname());
            ((FuncareafiveimgViewHolder) holder).mTextViwe_fun_d.setText(items.get(3).getImgname());
            ((FuncareafiveimgViewHolder) holder).mTextViwe_fun_e.setText(items.get(4).getImgname());
            Glide.with(context).load(items.get(0).getImgurl()).into(((FuncareafiveimgViewHolder) holder).mImage_fun_a);
            Glide.with(context).load(items.get(1).getImgurl()).into(((FuncareafiveimgViewHolder) holder).mImage_fun_b);
            Glide.with(context).load(items.get(2).getImgurl()).into(((FuncareafiveimgViewHolder) holder).mImage_fun_c);
            Glide.with(context).load(items.get(3).getImgurl()).into(((FuncareafiveimgViewHolder) holder).mImage_fun_d);
            Glide.with(context).load(items.get(4).getImgurl()).into(((FuncareafiveimgViewHolder) holder).mImage_fun_e);
            ((FuncareafiveimgViewHolder) holder).mImage_fun_a.setOnClickListener((v -> onItemClickListener.click(items.get(0))));
            ((FuncareafiveimgViewHolder) holder).mImage_fun_b.setOnClickListener((v -> onItemClickListener.click(items.get(1))));
            ((FuncareafiveimgViewHolder) holder).mImage_fun_c.setOnClickListener((v -> onItemClickListener.click(items.get(2))));
            ((FuncareafiveimgViewHolder) holder).mImage_fun_d.setOnClickListener((v -> onItemClickListener.click(items.get(3))));
            ((FuncareafiveimgViewHolder) holder).mImage_fun_e.setOnClickListener((v -> onItemClickListener.click(items.get(4))));
            ((FuncareafiveimgViewHolder) holder).mTextViwe_fun_a.setOnClickListener((v -> onItemClickListener.click(items.get(0))));
            ((FuncareafiveimgViewHolder) holder).mTextViwe_fun_b.setOnClickListener((v -> onItemClickListener.click(items.get(1))));
            ((FuncareafiveimgViewHolder) holder).mTextViwe_fun_c.setOnClickListener((v -> onItemClickListener.click(items.get(2))));
            ((FuncareafiveimgViewHolder) holder).mTextViwe_fun_d.setOnClickListener((v -> onItemClickListener.click(items.get(3))));
            ((FuncareafiveimgViewHolder) holder).mTextViwe_fun_e.setOnClickListener((v -> onItemClickListener.click(items.get(4))));

        }
        if (holder instanceof FloorheadViewHolder) {
            Glide.with(context).load(bean.getItems().get(0).getImgurl()).into(((FloorheadViewHolder) holder).mFloorHead);
            ((FloorheadViewHolder) holder).mFloorHead.setOnClickListener(v -> onItemClickListener.click(bean.getItems().get(0)));
        }
        if (holder instanceof FloorspaceViewHolder) {

        }
        if (holder instanceof ProductsinglerowViewHolder) {
            if (recyclerViewAdapter == null) {
                recyclerViewAdapter = new RecyclerViewAdapter(context, bean.getItems());
                recyclerViewAdapter.setOnItemClickListener((item) -> onItemClickListener.click(item));
                ((ProductsinglerowViewHolder) holder).mRecyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
                ((ProductsinglerowViewHolder) holder).mRecyclerView.setAdapter(recyclerViewAdapter);
            } else {
                recyclerViewAdapter.notifyDataSetChanged();
            }
        }
        if (holder instanceof FloorfootViewHolder) {
            FloorfootViewHolder holder1 = (FloorfootViewHolder) holder;
        }
        if (holder instanceof TwoimgaverageViewHolder) {
            Glide.with(context).load(bean.getItems().get(0).getImgurl()).into(((TwoimgaverageViewHolder) holder).mImage_Left);
            Glide.with(context).load(bean.getItems().get(1).getImgurl()).into(((TwoimgaverageViewHolder) holder).mImage_Right);
            ((TwoimgaverageViewHolder) holder).mImage_Left.setOnClickListener(v -> onItemClickListener.click(bean.getItems().get(0)));
            ((TwoimgaverageViewHolder) holder).mImage_Right.setOnClickListener(v -> onItemClickListener.click(bean.getItems().get(1)));
        }
        if (holder instanceof OneimgViewHolder) {
            Glide.with(context).load(bean.getItems().get(0).getImgurl()).into(((OneimgViewHolder) holder).mOneImg_a);
            ((OneimgViewHolder) holder).mOneImg_a.setOnClickListener(v -> onItemClickListener.click(bean.getItems().get(0)));
        }
        if (holder instanceof ThreeimgleftoneViewHolder) {
            Glide.with(context).load(bean.getItems().get(0).getImgurl()).into(((ThreeimgleftoneViewHolder) holder).mThreeimgLeftone_left);
            Glide.with(context).load(bean.getItems().get(1).getImgurl()).into(((ThreeimgleftoneViewHolder) holder).mThreeimgLeftone_right_top);
            Glide.with(context).load(bean.getItems().get(2).getImgurl()).into(((ThreeimgleftoneViewHolder) holder).mThreeimgLeftone_right_btm);
            ((ThreeimgleftoneViewHolder) holder).mThreeimgLeftone_left.setOnClickListener(v -> onItemClickListener.click(bean.getItems().get(0)));
            ((ThreeimgleftoneViewHolder) holder).mThreeimgLeftone_right_top.setOnClickListener(v -> onItemClickListener.click(bean.getItems().get(1)));
            ((ThreeimgleftoneViewHolder) holder).mThreeimgLeftone_right_btm.setOnClickListener(v -> onItemClickListener.click(bean.getItems().get(2)));

        }
        if (holder instanceof ThreeimglefttwoViewHolder) {
            Glide.with(context).load(bean.getItems().get(0).getImgurl()).into(((ThreeimglefttwoViewHolder) holder).mThreeimglefttwo_left_top);
            Glide.with(context).load(bean.getItems().get(1).getImgurl()).into(((ThreeimglefttwoViewHolder) holder).mThreeimglefttwo_left_btm);
            Glide.with(context).load(bean.getItems().get(2).getImgurl()).into(((ThreeimglefttwoViewHolder) holder).mThreeimglefttwo_right);
            ((ThreeimglefttwoViewHolder) holder).mThreeimglefttwo_left_top.setOnClickListener(v -> onItemClickListener.click(bean.getItems().get(0)));
            ((ThreeimglefttwoViewHolder) holder).mThreeimglefttwo_left_btm.setOnClickListener(v -> onItemClickListener.click(bean.getItems().get(1)));
            ((ThreeimglefttwoViewHolder) holder).mThreeimglefttwo_right.setOnClickListener(v -> onItemClickListener.click(bean.getItems().get(2)));
        }
        if (holder instanceof ThreeimgabreastViewHolder) {
            Glide.with(context).load(bean.getItems().get(0).getImgurl()).into(((ThreeimgabreastViewHolder) holder).mImage_ThreeImgAbreast_a);
            Glide.with(context).load(bean.getItems().get(1).getImgurl()).into(((ThreeimgabreastViewHolder) holder).mImage_ThreeImgAbreast_b);
            Glide.with(context).load(bean.getItems().get(2).getImgurl()).into(((ThreeimgabreastViewHolder) holder).mImage_ThreeImgAbreast_c);
            ((ThreeimgabreastViewHolder) holder).mImage_ThreeImgAbreast_a.setOnClickListener(v -> onItemClickListener.click(bean.getItems().get(0)));
            ((ThreeimgabreastViewHolder) holder).mImage_ThreeImgAbreast_b.setOnClickListener(v -> onItemClickListener.click(bean.getItems().get(1)));
            ((ThreeimgabreastViewHolder) holder).mImage_ThreeImgAbreast_c.setOnClickListener(v -> onItemClickListener.click(bean.getItems().get(2)));
        }
        if (holder instanceof CarouselfigureViewHolder) {
            ArrayList<String> flybanner = new ArrayList<>();
            for (int i = 0; i < bean.getItems().size(); i++) {
                flybanner.add(bean.getItems().get(i).getImgurl());
            }

            ((CarouselfigureViewHolder) holder).mCarouselFigure.setImagesUrl(flybanner);
            ((CarouselfigureViewHolder) holder).mCarouselFigure.setOnItemClickListener(new FlyBanner.OnItemClickListener() {
                @Override
                public void onItemClick(int position) {
                    onItemClickListener.click(bean.getItems().get(position));
                }
            });
        }

        if (holder instanceof ProductDoubleColumnViewHolder) {
            ProductDoubleColumnViewHolder viewHolder = (ProductDoubleColumnViewHolder) holder;
            List<HomePageBean.DataBean.TemplatelistBean.ItemsBean> itemsBeanList = bean.getItems();
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(itemsBeanList.get(0).getWidth(), itemsBeanList.get(0).getHeight());
            viewHolder.mImagetLeft.setLayoutParams(params);
            viewHolder.mImageRight.setLayoutParams(params);
            Glide.with(context).load(itemsBeanList.get(0).getImgurl()).into(viewHolder.mImagetLeft);
            Glide.with(context).load(itemsBeanList.get(1).getImgurl()).into(viewHolder.mImageRight);
            String name1 = itemsBeanList.get(0).getExtra().getProductdetail().getName();
            String name2 = itemsBeanList.get(1).getExtra().getProductdetail().getName();
            double price1 = itemsBeanList.get(0).getExtra().getProductdetail().getPrice();
            double price2 = itemsBeanList.get(1).getExtra().getProductdetail().getPrice();
            viewHolder.mTextView_left_title.setText(name1);
            viewHolder.mTextView_left_price.setText("￥" + price1 + "");
            viewHolder.mTextView_right_title.setText(name2);
            viewHolder.mTextView_right_price.setText("￥" + price2 + "");

            viewHolder.mImagetLeft.setOnClickListener(v -> onItemClickListener.click(itemsBeanList.get(0)));
            viewHolder.mTextView_left_title.setOnClickListener(v -> onItemClickListener.click(itemsBeanList.get(0)));
            viewHolder.mTextView_left_price.setOnClickListener(v -> onItemClickListener.click(itemsBeanList.get(0)));
            viewHolder.mImageRight.setOnClickListener(v -> onItemClickListener.click(itemsBeanList.get(1)));
            viewHolder.mTextView_right_title.setOnClickListener(v -> onItemClickListener.click(itemsBeanList.get(1)));
            viewHolder.mTextView_right_price.setOnClickListener(v -> onItemClickListener.click(itemsBeanList.get(1)));


        }


    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    class FuncareafiveimgViewHolder extends RecyclerView.ViewHolder {
        public View rootView;
        public ImageView mImage_fun_a;
        public TextView mTextViwe_fun_a;
        public ImageView mImage_fun_b;
        public TextView mTextViwe_fun_b;
        public ImageView mImage_fun_c;
        public TextView mTextViwe_fun_c;
        public ImageView mImage_fun_d;
        public TextView mTextViwe_fun_d;
        public ImageView mImage_fun_e;
        public TextView mTextViwe_fun_e;

        public FuncareafiveimgViewHolder(View rootView) {
            super(rootView);
            this.rootView = rootView;
            this.mImage_fun_a = (ImageView) rootView.findViewById(R.id.mImage_fun_a);
            this.mTextViwe_fun_a = (TextView) rootView.findViewById(R.id.mTextViwe_fun_a);
            this.mImage_fun_b = (ImageView) rootView.findViewById(R.id.mImage_fun_b);
            this.mTextViwe_fun_b = (TextView) rootView.findViewById(R.id.mTextViwe_fun_b);
            this.mImage_fun_c = (ImageView) rootView.findViewById(R.id.mImage_fun_c);
            this.mTextViwe_fun_c = (TextView) rootView.findViewById(R.id.mTextViwe_fun_c);
            this.mImage_fun_d = (ImageView) rootView.findViewById(R.id.mImage_fun_d);
            this.mTextViwe_fun_d = (TextView) rootView.findViewById(R.id.mTextViwe_fun_d);
            this.mImage_fun_e = (ImageView) rootView.findViewById(R.id.mImage_fun_e);
            this.mTextViwe_fun_e = (TextView) rootView.findViewById(R.id.mTextViwe_fun_e);
        }

    }

    class FloorheadViewHolder extends RecyclerView.ViewHolder {
        public View rootView;
        public ImageView mFloorHead;

        public FloorheadViewHolder(View rootView) {
            super(rootView);
            this.rootView = rootView;
            this.mFloorHead = (ImageView) rootView.findViewById(R.id.mFloorHead);
        }

    }

    class FloorspaceViewHolder extends RecyclerView.ViewHolder {
        public View rootView;

        public FloorspaceViewHolder(View rootView) {
            super(rootView);
            this.rootView = rootView;
        }

    }

    class ProductsinglerowViewHolder extends RecyclerView.ViewHolder {
        public View rootView;
        public RecyclerView mRecyclerView;

        public ProductsinglerowViewHolder(View rootView) {
            super(rootView);
            this.rootView = rootView;
            this.mRecyclerView = (RecyclerView) rootView.findViewById(R.id.mRecyclerView);
        }

    }

    class FloorfootViewHolder extends RecyclerView.ViewHolder {
        public View rootView;

        public FloorfootViewHolder(View rootView) {
            super(rootView);
            this.rootView = rootView;
        }

    }

    class TwoimgaverageViewHolder extends RecyclerView.ViewHolder {
        public View rootView;
        public ImageView mImage_Left;
        public ImageView mImage_Right;

        public TwoimgaverageViewHolder(View rootView) {
            super(rootView);
            this.rootView = rootView;
            this.mImage_Left = (ImageView) rootView.findViewById(R.id.mImage_Left);
            this.mImage_Right = (ImageView) rootView.findViewById(R.id.mImage_Right);
        }


    }

    class OneimgViewHolder extends RecyclerView.ViewHolder {
        public View rootView;
        public ImageView mOneImg_a;

        public OneimgViewHolder(View rootView) {
            super(rootView);
            this.rootView = rootView;
            this.mOneImg_a = (ImageView) rootView.findViewById(R.id.mOneImg_a);
        }

    }

    class ThreeimgleftoneViewHolder extends RecyclerView.ViewHolder {
        public View rootView;
        public ImageView mThreeimgLeftone_left;
        public ImageView mThreeimgLeftone_right_top;
        public ImageView mThreeimgLeftone_right_btm;

        public ThreeimgleftoneViewHolder(View rootView) {
            super(rootView);
            this.rootView = rootView;
            this.mThreeimgLeftone_left = (ImageView) rootView.findViewById(R.id.mThreeimgLeftone_left);
            this.mThreeimgLeftone_right_top = (ImageView) rootView.findViewById(R.id.mThreeimgLeftone_right_top);
            this.mThreeimgLeftone_right_btm = (ImageView) rootView.findViewById(R.id.mThreeimgLeftone_right_btm);
        }
    }

    class ThreeimglefttwoViewHolder extends RecyclerView.ViewHolder {
        public View rootView;
        public ImageView mThreeimglefttwo_left_top;
        public ImageView mThreeimglefttwo_left_btm;
        public ImageView mThreeimglefttwo_right;

        public ThreeimglefttwoViewHolder(View rootView) {
            super(rootView);
            this.rootView = rootView;
            this.mThreeimglefttwo_left_top = (ImageView) rootView.findViewById(R.id.mThreeimglefttwo_left_top);
            this.mThreeimglefttwo_left_btm = (ImageView) rootView.findViewById(R.id.mThreeimglefttwo_left_btm);
            this.mThreeimglefttwo_right = (ImageView) rootView.findViewById(R.id.mThreeimglefttwo_right);
        }

    }

    class ThreeimgabreastViewHolder extends RecyclerView.ViewHolder {
        public View rootView;
        public ImageView mImage_ThreeImgAbreast_a;
        public ImageView mImage_ThreeImgAbreast_b;
        public ImageView mImage_ThreeImgAbreast_c;

        public ThreeimgabreastViewHolder(View rootView) {
            super(rootView);
            this.rootView = rootView;
            this.mImage_ThreeImgAbreast_a = (ImageView) rootView.findViewById(R.id.mImage_ThreeImgAbreast_a);
            this.mImage_ThreeImgAbreast_b = (ImageView) rootView.findViewById(R.id.mImage_ThreeImgAbreast_b);
            this.mImage_ThreeImgAbreast_c = (ImageView) rootView.findViewById(R.id.mImage_ThreeImgAbreast_c);
        }

    }

    class CarouselfigureViewHolder extends RecyclerView.ViewHolder {
        public View rootView;
        public FlyBanner mCarouselFigure;

        public CarouselfigureViewHolder(View rootView) {
            super(rootView);
            this.rootView = rootView;
            this.mCarouselFigure = (FlyBanner) rootView.findViewById(R.id.mCarouselFigure);
        }


    }

    class ProductDoubleColumnViewHolder extends RecyclerView.ViewHolder {
        public ImageView mImagetLeft;
        public TextView mTextView_left_title;
        public TextView mTextView_left_price;
        public ImageView mImageRight;
        public TextView mTextView_right_title;
        public TextView mTextView_right_price;

        public ProductDoubleColumnViewHolder(View rootView) {
            super(rootView);
            this.mImagetLeft = (ImageView) rootView.findViewById(R.id.mImagetLeft);
            this.mTextView_left_title = (TextView) rootView.findViewById(R.id.mTextView_left_title);
            this.mTextView_left_price = (TextView) rootView.findViewById(R.id.mTextView_left_price);
            this.mImageRight = (ImageView) rootView.findViewById(R.id.mImageRight);
            this.mTextView_right_title = (TextView) rootView.findViewById(R.id.mTextView_right_title);
            this.mTextView_right_price = (TextView) rootView.findViewById(R.id.mTextView_right_price);
        }
    }


}


