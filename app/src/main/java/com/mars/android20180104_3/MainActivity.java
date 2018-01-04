package com.mars.android20180104_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
//使用程式來製作layout
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        TextView tv;
        tv = new TextView(this);//this指的是這個ACTIVITY
        tv.setText("Hello world");
        //setContentView(tv);
        LinearLayout ll = new LinearLayout(this);
        Button btn = new Button(this);
        Button btn2 = new Button(this);
        //setContentView(btn);
        btn.setText("click me");//第個按鈕的內容
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"click me",Toast.LENGTH_SHORT).show();
            }
        });
        btn2.setText("22click me");//第二個按鈕的內容
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"22click me",Toast.LENGTH_SHORT).show();
            }
        });

        ll.addView(btn);//加入兩個按鈕
        ll.addView(btn2);
        ll.setOrientation(LinearLayout.VERTICAL);//改變方向
        setContentView(ll);//加入LinearLayout到畫面上

        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int height = displayMetrics.heightPixels;
        int width = displayMetrics.widthPixels;
        Toast.makeText(MainActivity.this, height + "," + width, Toast.LENGTH_SHORT).show();


    }
}
