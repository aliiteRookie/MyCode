package com.example.free.mymvpdemo.ui;

import android.app.Service;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.annotation.IntDef;
import android.util.Log;

import com.blankj.utilcode.util.LogUtils;

public class MyService extends Service {

    public MyService() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
        LogUtils.e("onCreate() executed");

    }

    @Override
    public IBinder onBind(Intent intent) {
        LogUtils.e("onBind");
        return null;
    }

    @Override
    public boolean onUnbind(Intent intent) {
        LogUtils.e("onUnbind");
        return super.onUnbind(intent);
    }

    @Override
    public void unbindService(ServiceConnection conn) {
        LogUtils.e("unbindService");
        super.unbindService(conn);
    }



    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        LogUtils.e("onStartCommand() executed");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        LogUtils.e("onDestroy() executed");
    }
}
