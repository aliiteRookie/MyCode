package com.example.free.mymvpdemo.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.free.mymvpdemo.R;
import com.example.free.mymvpdemo.adapter.HomeAdapter;
import com.example.free.mymvpdemo.view.recyclerview.DividerGridItemDecoration;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private List<String> mDatas;
    private HomeAdapter mAdapter;
    private Button changeShowMode;
    private int currentShowMode;
    private RecyclerView.LayoutManager mLayoutManager;
    private static int SHOW_ITEM = 1;
    private static int SHOW_GRID = 2;
    private static int SHOW_WATER_FALL = 3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        mRecyclerView = (RecyclerView)findViewById(R.id.recyclerview);
        changeShowMode = ((Button) findViewById(R.id.button_change));
        initData();
        mAdapter = new HomeAdapter(this, mDatas);
        initEvent();
        initNormalRecyclerView();

        changeShowMode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentShowMode == SHOW_ITEM) {
                    initGridRecyclerView();
                } else if (currentShowMode == SHOW_GRID) {
                    initNormalRecyclerView();
                }
            }
        });
    }

    private void initNormalRecyclerView() {
        currentShowMode = SHOW_ITEM;
        mLayoutManager = new LinearLayoutManager(this);
        initRecyclerData(mLayoutManager);
    }

    private void initGridRecyclerView() {
        currentShowMode = SHOW_GRID;
        mLayoutManager = new StaggeredGridLayoutManager(4, StaggeredGridLayoutManager.VERTICAL);
        initRecyclerData(mLayoutManager);
    }

    private void initRecyclerData(RecyclerView.LayoutManager layout) {
        mRecyclerView.setLayoutManager(layout);
        mRecyclerView.addItemDecoration(new DividerGridItemDecoration(this));
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());         // 设置item动画
        mRecyclerView.setAdapter(mAdapter);
    }

    protected void initData() {
        mDatas = new ArrayList<>();
        for (int i = 'A'; i < 'z'; i++) {
            mDatas.add("" + (char) i);
        }
    }

    private void initEvent() {
        mAdapter.setOnItemClickLitener(new HomeAdapter.OnItemClickLitener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(RecyclerViewActivity.this, position + " click",
                        Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onItemLongClick(View view, int position) {
                Toast.makeText(RecyclerViewActivity.this, position + " long click",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
