package com.example.free.mymvpdemo.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.free.mymvpdemo.R;

import butterknife.ButterKnife;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        ButterKnife.bind(this);
        initData();
    }

    protected int getLayoutId() {
        return -1;
    }

    protected void initData(){}
}
