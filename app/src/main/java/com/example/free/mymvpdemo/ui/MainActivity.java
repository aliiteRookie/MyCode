package com.example.free.mymvpdemo.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.free.mymvpdemo.R;
import com.example.free.mymvpdemo.helper.Nav;
import com.example.free.mymvpdemo.manager.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {


    @BindView(R.id.button_enter_layout)
    Button buttonEnterLayout;
    @BindView(R.id.button_picasso)
    Button buttonPicasso;
    @BindView(R.id.button_recyclerview)
    Button buttonRecyclerview;
    @BindView(R.id.button_waterfall)
    Button buttonWaterfall;
    @BindView(R.id.enter_handler)
    Button enterHandler;
    @BindView(R.id.serviceControl)
    Button serviceControl;
    @BindView(R.id.aidl_control)
    Button aidlControl;
    @BindView(R.id.jni_control)
    Button jniControl;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @OnClick(R.id.button_enter_layout)
    public void enterLayout() {
        startActivity(new Intent(MainActivity.this, MyLayoutActivity.class));
    }

    @OnClick(R.id.button_picasso)
    public void enterPicasso() {
        startActivity(new Intent(MainActivity.this, PicassoActivity.class));
    }

    @OnClick(R.id.button_recyclerview)
    public void buttonRecyclerView() {
        startActivity(new Intent(MainActivity.this, RecyclerViewActivity.class));
    }

    @OnClick(R.id.button_waterfall)
    public void waterFall() {
        startActivity(new Intent(MainActivity.this, StaggeredGridLayoutActivity.class));
    }

    @OnClick(R.id.enter_handler)
    public void handlerControl() {
        startActivity(new Intent(MainActivity.this, HandlerActivity.class));
    }

    @OnClick(R.id.serviceControl)
    public void serViceControl() {
        Nav.toServiceActivity1(this);
    }

    @OnClick(R.id.aidl_control)
    public void aidlControl() {
        Nav.toAIDLActivity(this);
    }

    @OnClick(R.id.jni_control)
    public void jniControl() {
        Nav.toJNIActivity(this);
    }
}