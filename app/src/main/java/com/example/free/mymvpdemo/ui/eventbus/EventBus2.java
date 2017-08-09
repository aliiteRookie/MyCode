package com.example.free.mymvpdemo.ui.eventbus;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.free.mymvpdemo.R;
import com.example.free.mymvpdemo.bean.eventBean.MyAction;
import com.example.free.mymvpdemo.manager.BaseActivity;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import butterknife.BindView;
import butterknife.ButterKnife;

public class EventBus2 extends BaseActivity {

    @BindView(R.id.button)
    TextView button;
    @BindView(R.id.show)
    TextView show;


    @Override
    protected int getLayoutId() {
        return R.layout.activity_event_bus2;
    }

    @Override
    protected void initData() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EventBus.getDefault().post(new MyAction("我已经点击了EventBus2", 8));
            }
        });

    }


}
