package com.example.administrator.yintaidemo.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import com.example.administrator.yintaidemo.R;
import com.example.administrator.yintaidemo.adapters.SaleLvAdapter;
import com.example.administrator.yintaidemo.entity.SaleEntity;
import com.example.administrator.yintaidemo.http.BaseParams;
import com.example.administrator.yintaidemo.ui.fragemnts.forestallfragment.presenter.ForestallPresenter;
import com.example.administrator.yintaidemo.ui.fragemnts.forestallfragment.views.ForestallView;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 特卖商品列表界面
 */
public class SaleActivity extends AppCompatActivity implements ForestallView<SaleEntity>, View.OnClickListener, AbsListView.OnScrollListener, AdapterView.OnItemClickListener {

    private int id;
    private int pagenum = 1;
    private ListView lv_sale;
    private TextView sale_sale;
    private LinearLayout price_sale;
    private LinearLayout discount_sale;
    private ArrayList<SaleEntity.DataBean.ProductListBean> listBeen;
    private SaleLvAdapter adapter;
    private int num;
    private Comparator<SaleEntity.DataBean.ProductListBean> comparator;
    private int price = 0;
    private int discount = 0;
    private int order_type;
    private TextView timing_sale;
    private TextView gushi_sale;
    private String endtime;
    private String t3;
    private ImageView img_price_sale;
    private ImageView img_discount_sale;
    private TextView text_sale;
    private Toolbar tb_sale;
    private String title;
    private LinearLayout ll_sale;
    private TextView clear_sale;
    private ExpandableListView ev_sale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sale);

        Resources resources = getResources();
        Drawable blackbar1 = resources.getDrawable(R.drawable.product_blackbar1);
        Drawable blackbar2 = resources.getDrawable(R.drawable.product_blackbar2);

        //获取点击事件传递的参数。
        Intent intent = getIntent();
        title = intent.getStringExtra("title");
        id = intent.getIntExtra("id", 0);
        endtime = getIntent().getStringExtra("time");

        initView();

        String[] ts = endtime.split("T");

        String t = ts[0];
        String t1 = ts[1];
        String t2 = " ";
        t3 = t + t2 + t1;

        //获取适配器
        listBeen = new ArrayList<>();
        adapter = new SaleLvAdapter(listBeen, SaleActivity.this);

        //发起网络请求数据
        listBeen.clear();
        order_type = 5;
        gethttp(pagenum);
        lv_sale.setAdapter(adapter);

    }

    private void initView() {
        lv_sale = (ListView) findViewById(R.id.lv_sale);
        lv_sale.setOnScrollListener(this);
        lv_sale.setOnItemClickListener(this);
        sale_sale = (TextView) findViewById(R.id.sale_sale);
        sale_sale.setOnClickListener(this);
        price_sale = (LinearLayout) findViewById(R.id.price_sale);
        price_sale.setOnClickListener(this);
        discount_sale = (LinearLayout) findViewById(R.id.discount_sale);
        discount_sale.setOnClickListener(this);
        timing_sale = (TextView) findViewById(R.id.timing_sale);
        Timer timer = new Timer();
        timer.schedule(task, 0, 1000);
        gushi_sale = (TextView) findViewById(R.id.gushi_sale);
        gushi_sale.setOnClickListener(this);
        img_price_sale = (ImageView) findViewById(R.id.img_price_sale);
        img_discount_sale = (ImageView) findViewById(R.id.img_discount_sale);
        text_sale = (TextView) findViewById(R.id.text_sale);
        text_sale.setText(title);
        tb_sale = (Toolbar) findViewById(R.id.tb_sale);
        setSupportActionBar(tb_sale);
        ll_sale = (LinearLayout) findViewById(R.id.ll_sale);
        ll_sale.setOnClickListener(this);
    }

    /**
     * 发起网络请求。
     * <p>
     * order_type = 1   折扣降序
     * = 2   折扣升序
     * = 3   价格升序
     * = 4   价格降序
     * = 5   默认
     */
    public void gethttp(int pagenum) {
        HashMap<String, String> map = new HashMap<>();
        BaseParams.getParams(map, SaleActivity.this);
        map.put("ver", "3.0");
        map.put("method", "products.getlimitlist");
        map.put("displaycount", "12");
        map.put("page_index", pagenum + "");
        map.put("order_type", order_type + "");
        map.put("query_string", "");
        map.put("bargainid", id + "");

        ForestallPresenter presenter = new ForestallPresenter(this);
        presenter.request(SaleActivity.this, map);
    }

    @Override
    public void success(SaleEntity saleEntity) {
        Log.e("TAG", "===========" + saleEntity.toString());
        List<SaleEntity.DataBean.ProductListBean> list = saleEntity.getData().getProduct_list();
        listBeen.addAll(list);
        Log.e("TAG", listBeen.size() + "");
        adapter.notifyDataSetChanged();
    }

    @Override
    public void failure(Exception e) {
        Log.e("TAG", e.toString());
    }

    /**
     * 数据的升序和降序。
     *
     * @param v
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            //销量点击事件
            case R.id.sale_sale:
                lv_sale.setAdapter(adapter);
                break;
            //价格点击事件
            case R.id.price_sale:
                price += 1;
                if (price % 2 == 0) {
                    img_price_sale.setImageResource(R.drawable.product_blackbar2);
                    listBeen.clear();
                    order_type = 4;       //价格降序
                    gethttp(0);
                }
                if (price % 2 == 1) {
                    img_price_sale.setImageResource(R.drawable.product_blackbar1);
                    listBeen.clear();
                    order_type = 3;       //价格升序
                    gethttp(0);
                }
                lv_sale.setAdapter(adapter);
                break;
            //折扣点击事件
            case R.id.discount_sale:
                discount += 1;
                if (discount % 2 == 0) {
                    img_discount_sale.setImageResource(R.drawable.product_blackbar1);
                    listBeen.clear();
                    order_type = 2;       //折扣升序
                    gethttp(0);
                }
                if (discount % 2 == 1) {
                    img_discount_sale.setImageResource(R.drawable.product_blackbar2);
                    listBeen.clear();
                    order_type = 1;       //折扣降序
                    gethttp(0);
                }
                lv_sale.setAdapter(adapter);
                break;
            case R.id.gushi_sale:
                Toast.makeText(this, "从前有家店。。。。。。。。", Toast.LENGTH_SHORT).show();
                break;
            case R.id.clear_sale_condition:
                break;
        }
    }

    /**
     * 滑动监听
     *
     * @param absListView
     * @param i
     */
    @Override
    public void onScrollStateChanged(AbsListView absListView, int i) {
        if (num == adapter.getCount() && i == AbsListView.OnScrollListener.SCROLL_STATE_FLING) {
            ++pagenum;
            if (pagenum <= 5) {
                gethttp(pagenum);
                adapter.notifyDataSetChanged();
            } else {
                Toast.makeText(this, "加载完毕", Toast.LENGTH_SHORT).show();
            }
        }
    }

    @Override
    public void onScroll(AbsListView absListView, int i, int i1, int i2) {
        num = i + i1;
    }

    /**
     * ListView  条目点击事件。
     *
     * @param adapterView
     * @param view
     * @param i
     * @param l
     */
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        SaleEntity.DataBean.ProductListBean bean = listBeen.get(i);
        String itemcode = bean.getItemcode();

    }

    TimerTask task = new TimerTask() {
        public void run() {

            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String beginTime = simpleDateFormat.format(new Date());
            DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date firstDateTimeDate = null;
            try {
                firstDateTimeDate = format.parse(t3);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            Date secondDateTimeDate = null;
            try {
                secondDateTimeDate = format.parse(beginTime);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            //得到两个日期对象的总毫秒数
            long firstDateMilliSeconds = firstDateTimeDate.getTime();
            long secondDateMilliSeconds = secondDateTimeDate.getTime();

            //得到两者之差
            long firstMinusSecond = firstDateMilliSeconds - secondDateMilliSeconds;

            //毫秒转为秒
            long milliSeconds = firstMinusSecond;
            int totalSeconds = (int) (milliSeconds / 1000);

            //得到总天数
            int days = totalSeconds / (3600 * 24);
            int days_remains = totalSeconds % (3600 * 24);

            //得到总小时数
            int hours = days_remains / 3600;
            int remains_hours = days_remains % 3600;

            //得到分种数
            int minutes = remains_hours / 60;

            //得到总秒数
            int seconds = remains_hours % 60;

            final String s = "倒计时:" + days + "天" + hours + ":" + minutes + ":" + seconds;


            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    timing_sale.setText(s);
                }
            });
        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.sale_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.condition_menu:
                View view = LayoutInflater.from(this).inflate(R.layout.sale_condition, null);
                clear_sale = view.findViewById(R.id.clear_sale_condition);
                clear_sale.setOnClickListener(this);
                ev_sale = view.findViewById(R.id.ev_sale_condition);

                //创建popupWindow对象。
                PopupWindow window = new PopupWindow(view, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT, true);
                //可被结束
                window.setTouchable(true);
                //必须设置背景
                window.setBackgroundDrawable(new ColorDrawable(0x66666666));
                //显示位置
                window.showAtLocation(ll_sale, Gravity.BOTTOM, 0, 0);
                //可获取焦点
                window.setFocusable(true);
                //设置动画样式
                window.setAnimationStyle(R.anim.popu_anim);
                break;
        }
        return true;
    }
}
