package com.example.free.mymvpdemo.manager;

import android.app.Application;
import android.content.Context;

import com.blankj.utilcode.util.LogUtils;

/**
 * Created by free on 2017/7/31.
 */

public class CodeApplication extends Application {

    public static Context applicationContext = null;

    @Override
    public void onCreate() {
        super.onCreate();
        applicationContext = this;
        Init.getInstance();
    }


    @Override
    public void onLowMemory() {
        super.onLowMemory();
        LogUtils.e("onLowMemory");
    }
}
