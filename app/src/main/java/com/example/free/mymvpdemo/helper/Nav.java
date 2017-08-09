package com.example.free.mymvpdemo.helper;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;

import com.blankj.utilcode.util.ToastUtils;
import com.example.free.mymvpdemo.service.AIDLService;
import com.example.free.mymvpdemo.service.MyService;
import com.example.free.mymvpdemo.ui.AIDLActivity;
import com.example.free.mymvpdemo.ui.EventbusActivity;
import com.example.free.mymvpdemo.ui.JNIActivity;
import com.example.free.mymvpdemo.ui.ServiceActivity1;
import com.example.free.mymvpdemo.ui.ServiceActivity2;
import com.example.free.mymvpdemo.ui.eventbus.EventBus1;
import com.example.free.mymvpdemo.ui.eventbus.EventBus2;

/**
 * Created by free on 2017/7/30.
 */

public class Nav {

    public static void toServiceActivity1(Activity activity) {
        activity.startActivity(new Intent(activity, ServiceActivity1.class));
    }

    public static void toServiceActivity2(Activity activity) {
        activity.startActivity(new Intent(activity, ServiceActivity2.class));
    }

    public static void startMyService(Activity activity) {
        activity.startService(new Intent(activity, MyService.class));
    }

    public static void stopMyService(Activity activity) {
        activity.stopService(new Intent(activity, MyService.class));
    }

    public static void bindMyService(Activity activity, ServiceConnection serviceConnection) {
        MyService.isBind =  activity.bindService(new Intent(activity, MyService.class), serviceConnection, Context.BIND_AUTO_CREATE);
    }

    public static void unBindMyService(Activity activity, ServiceConnection serviceConnection) {
        if (MyService.isBind) {
            activity.unbindService(serviceConnection);
            MyService.isBind = false;
        } else {
            ToastUtils.showShort("无控件绑定 MyService ");
        }
    }

    public static void toAIDLActivity(Activity activity) {
        activity.startActivity(new Intent(activity, AIDLActivity.class));
    }

    public static void toJNIActivity(Activity activity) {
        activity.startActivity(new Intent(activity, JNIActivity.class));
    }
    public static void bindAIDLService(Activity activity, ServiceConnection serviceConnection) {
        activity.bindService(new Intent(activity, AIDLService.class), serviceConnection, Context.BIND_AUTO_CREATE);
    }

    public static void toEventBusActivity(Activity activity) {
        activity.startActivity(new Intent(activity, EventbusActivity.class));
    }

    public static void toEventBus1(Activity activity) {
        activity.startActivity(new Intent(activity, EventBus1.class));
    }

    public static void toEventBus2(Activity activity) {
        activity.startActivity(new Intent(activity, EventBus2.class));
    }
}
