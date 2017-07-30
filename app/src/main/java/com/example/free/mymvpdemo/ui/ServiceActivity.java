package com.example.free.mymvpdemo.ui;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.widget.Button;

import com.blankj.utilcode.util.LogUtils;
import com.example.free.mymvpdemo.R;

import butterknife.BindView;
import butterknife.OnClick;

public class ServiceActivity extends BaseActivity {

    private boolean isBind;

    @BindView(R.id.start_service)
    Button startService;
    @BindView(R.id.stop_service)
    Button stopService;
    @BindView(R.id.bind_service)
    Button bindService;
    @BindView(R.id.unbind_service)
    Button unbindService;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_service;
    }

    @OnClick(R.id.start_service)
    public void startService() {
        startService(new Intent(ServiceActivity.this, MyService.class));
    }


    @OnClick(R.id.stop_service)
    public void stopService() {
        stopService(new Intent(ServiceActivity.this, MyService.class));
    }


    @OnClick(R.id.bind_service)
    public void bindService() {
        isBind = bindService(new Intent(ServiceActivity.this, MyService.class), serviceConnection, BIND_AUTO_CREATE);
    }

    ServiceConnection serviceConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            LogUtils.e("componentName:" + name + ", service:" + service);
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            LogUtils.e("componentName:" + name);
        }
    };

    @OnClick(R.id.unbind_service)
    public void unBindService() {
        if (isBind)
            unbindService(serviceConnection);
    }
}
