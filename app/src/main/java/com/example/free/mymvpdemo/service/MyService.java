package com.example.free.mymvpdemo.service;

import android.app.Service;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;

import com.blankj.utilcode.util.LogUtils;

public class MyService extends Service {

    public MyBinder myBinder = new MyBinder();
    public static boolean isBind = false; //查看本Service是否是绑定状态

    public MyService() {
        LogUtils.e("constructor MyService");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        LogUtils.e("onCreate() executed");

    }

    @Override
    public IBinder onBind(Intent intent) {
        LogUtils.e("onBind");
        return myBinder;
    }

    @Override
    public void onRebind(Intent intent) {
        LogUtils.e("onRebind");
        super.onRebind(intent);
    }


    @Override
    public boolean onUnbind(Intent intent) {
        LogUtils.e("super.onUnbind(intent):" + super.onUnbind(intent) + ", onUnbind");
        return true;  //为了演示onRebind方法，具体见 [onRebind什么时候使用]:http://blog.csdn.net/qq_29781403/article/details/76458502
//        return super.onUnbind(intent);
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

    public class MyBinder extends Binder {

        public void startDownload() {
            LogUtils.e("startDownload execute");
        }
    }
}
