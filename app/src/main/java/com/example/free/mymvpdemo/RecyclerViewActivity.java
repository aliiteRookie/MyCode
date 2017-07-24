package com.example.free.mymvpdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class RecyclerViewActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        mRecyclerView = (RecyclerView)findViewById(R.id.recyclerview);

//        //设置adapter
//        mRecyclerView.setAdapter(adapter);
//
//        //设置Item增加、移除动画
//        mRecyclerView.setItemAnimator(new DefaultItemAnimator());


    }
}
