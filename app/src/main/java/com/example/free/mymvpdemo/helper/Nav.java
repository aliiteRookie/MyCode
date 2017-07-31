package com.example.free.mymvpdemo.helper;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;

import com.example.free.mymvpdemo.service.MyService;
import com.example.free.mymvpdemo.ui.ServiceActivity1;
import com.example.free.mymvpdemo.ui.ServiceActivity2;

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

    public static boolean bindMyService(Activity activity, ServiceConnection serviceConnection) {
        return activity.bindService(new Intent(activity, MyService.class), serviceConnection, Context.BIND_AUTO_CREATE);
    }

    public static void unBindMyService(Activity activity, ServiceConnection serviceConnection) {
        activity.unbindService(serviceConnection);
    }
}
