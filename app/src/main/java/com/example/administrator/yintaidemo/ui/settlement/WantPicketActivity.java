package com.example.administrator.yintaidemo.ui.settlement;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.PopupWindow;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.administrator.yintaidemo.R;

import static android.R.attr.x;

public class WantPicketActivity extends AppCompatActivity {

    private TextView fapiaoleixing;
    private TextView fapiaokemu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_want_picket);
        initView();
        fapiaokemu.setOnClickListener(new View.OnClickListener() {

            private PopupWindow popupWindow1;

            @Override
            public void onClick(View v) {
                View view = LayoutInflater.from(WantPicketActivity.this).inflate(R.layout.popuperkumo, null);
                popupWindow1 = new PopupWindow(view, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT, true);
                popupWindow1.showAsDropDown(view,100,200);
                popupWindow1.setBackgroundDrawable(new ColorDrawable(0x00000000));
                popupWindow1.setTouchable(true);


                final CheckBox p_shangpinmingxi = view.findViewById(R.id.p_shangpinmingxi);
                final CheckBox p_fuzhuang = view.findViewById(R.id.p_fuzhuang);
                final CheckBox p_piju = view.findViewById(R.id.p_piju);
                final CheckBox p_xiangbao = view.findViewById(R.id.p_xiangbao);
                final CheckBox p_huazhuagpin = view.findViewById(R.id.p_huazhuagpin);
                final CheckBox p_xie = view.findViewById(R.id.p_xie);

                p_shangpinmingxi.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (p_shangpinmingxi.isChecked()){
                            CharSequence text = p_shangpinmingxi.getText();

                            Toast.makeText(WantPicketActivity.this, text, Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent();

                            intent.putExtra("text",text);


                            setResult(90,intent);
                            finish();
                            popupWindow1.dismiss();



                        }


                    }
                });

                p_fuzhuang.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        if (p_fuzhuang.isChecked()){
                            CharSequence text = p_fuzhuang.getText();
                            Toast.makeText(WantPicketActivity.this, text, Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent();

                            intent.putExtra("text",text);


                            setResult(90,intent);
                            finish();
                            popupWindow1.dismiss();


                        }



                    }
                });

                p_piju.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {


                        if (p_piju.isChecked()){
                            CharSequence text = p_piju.getText();
                            Toast.makeText(WantPicketActivity.this, text, Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent();

                            intent.putExtra("text",text);


                            setResult(90,intent);
                            finish();
                            popupWindow1.dismiss();
                        }


                    }
                });




                p_xiangbao.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        if (p_xiangbao.isChecked()){
                            CharSequence text = p_xiangbao.getText();
                            Toast.makeText(WantPicketActivity.this, text, Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent();

                            intent.putExtra("text",text);


                            setResult(90,intent);
                            finish();
                            popupWindow1.dismiss();





                        }



                    }
                });

                p_huazhuagpin.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (p_huazhuagpin.isChecked()){
                            CharSequence text = p_huazhuagpin.getText();
                            Toast.makeText(WantPicketActivity.this, text, Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent();

                            intent.putExtra("text",text);


                            setResult(90,intent);
                            finish();
                            popupWindow1.dismiss();
                        }



                    }
                });

                p_xie.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        if (p_xie.isChecked()){
                            CharSequence text = p_xie.getText();
                            Toast.makeText(WantPicketActivity.this, text, Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent();

                            intent.putExtra("text",text);


                            setResult(90,intent);
                            finish();
                            popupWindow1.dismiss();
                        }


                    }
                });













            }
        });












        fapiaoleixing.setOnClickListener(new View.OnClickListener() {

            private PopupWindow popupWindow;
            private RadioButton gongsi;
            private RadioButton geren;

            @Override
            public void onClick(View v) {
                View view = LayoutInflater.from(WantPicketActivity.this).inflate(R.layout.popuperfapiaoleixing, null);


                popupWindow = new PopupWindow(view, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT, true);
                popupWindow.showAsDropDown(view,100,200);
                popupWindow.setBackgroundDrawable(new ColorDrawable(0x00000000));
                popupWindow.setTouchable(true);


                final CheckBox genren = view.findViewById(R.id.genren);
                final CheckBox gongsi = view.findViewById(R.id.gongsi);
              genren.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View v) {
                      if (genren.isChecked()){

                          CharSequence text = genren.getText();
                          Toast.makeText(WantPicketActivity.this, text, Toast.LENGTH_SHORT).show();
                          Intent intent = new Intent();
                          intent.putExtra("text",text);


                          setResult(90,intent);
                          finish();  //finish放在setResult后
                          popupWindow.dismiss();



                      }


                  }
              });

gongsi.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        if (gongsi.isChecked()){
            CharSequence text = gongsi.getText();
            Toast.makeText(WantPicketActivity.this, text, Toast.LENGTH_SHORT).show();
            Intent intent = new Intent();

            intent.putExtra("text",text);


            setResult(90,intent);
            finish();
            popupWindow.dismiss();

        }


    }
});





            }
        });


    }

    private void initView() {
        fapiaoleixing = (TextView) findViewById(R.id.fapiaoleixing);
        fapiaokemu = (TextView) findViewById(R.id.fapiaokemu);
    }
}
