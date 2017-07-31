package com.example.free.mymvpdemo.ui;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.widget.Button;

import com.blankj.utilcode.util.LogUtils;
import com.example.free.mymvpdemo.R;
import com.example.free.mymvpdemo.manager.BaseActivity;

import butterknife.BindView;
import butterknife.OnClick;

public class HandlerActivity extends BaseActivity {

    @BindView(R.id.open_handler)
    Button openHandler;
    @BindView(R.id.in_line_open_Handler)
    Button inLineOpenHandler;


    private int GET_AUTHCODE = 1;
    private Handler handler1;

    Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            LogUtils.e(msg);
        }
    };

    @Override
    protected int getLayoutId() {
        return R.layout.activity_handler;
    }

    @Override
    protected void initData() {

        //初始化子线程并进行设置好Handler的handleMessage方法
        new Thread() {
            @Override
            public void run() {
                Looper.prepare();
                handler1 = new Handler() {
                    @Override
                    public void handleMessage(Message msg) {

                        LogUtils.e(msg);
                        LogUtils.e("zhixingdaolema");
                    }
                };
                Looper.loop();
            }
        }.start();

    }

    @OnClick(R.id.open_handler)
    public void openHandler() {
        new Thread() {
            @Override
            public void run() {
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                String phoneEncty = "myDream";
                Message message = new Message();
                message.obj = phoneEncty;
                message.what = GET_AUTHCODE;
                mHandler.sendMessage(message);  //内部有自带的target属性，设置属于哪一个Handler
            }
        }.start();
    }

    @OnClick(R.id.in_line_open_Handler)
    public void inLineOpenHandler() {
        String string = "hahawodelixiang";
        Message msg = new Message();
        msg.obj = string;
        msg.what = 3;
        handler1.sendMessage(msg);
    }
}
