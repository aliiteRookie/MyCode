package com.example.free.mymvpdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private Button enterLayout;
    private Button enterPicasso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enterLayout = ((Button) findViewById(R.id.button_enter_layout));
        enterPicasso = ((Button) findViewById(R.id.button_picasso));

        mRecyclerView = (RecyclerView)findViewById(R.id.recyclerview);

//        //设置adapter
//        mRecyclerView.setAdapter(adapter);
//
//        //设置Item增加、移除动画
//        mRecyclerView.setItemAnimator(new DefaultItemAnimator());

        enterLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MyLayoutActivity.class));
            }
        });
        enterPicasso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, PicassoActivity.class));
            }
        });
    }
}