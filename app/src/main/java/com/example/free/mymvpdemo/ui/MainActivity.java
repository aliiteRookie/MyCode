package com.example.free.mymvpdemo.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.free.mymvpdemo.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button_enter_layout).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {  //点击事件的布局
                startActivity(new Intent(MainActivity.this, MyLayoutActivity.class));
            }
        });
        findViewById(R.id.button_picasso).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //进入Picasso的显示
                startActivity(new Intent(MainActivity.this, PicassoActivity.class));
            }
        });
        findViewById(R.id.button_recyclerview).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //进入RecyclerView
                startActivity(new Intent(MainActivity.this, RecyclerViewActivity.class));
            }
        });
        findViewById(R.id.button_waterfall).setOnClickListener(new View.OnClickListener() { //进入瀑布流
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, StaggeredGridLayoutActivity.class));
            }
        });
        findViewById(R.id.enter_handler).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, HandlerActivity.class));
            }
        });

    }
}