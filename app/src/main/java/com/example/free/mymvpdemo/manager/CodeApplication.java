package com.example.free.mymvpdemo.manager;

import android.app.Application;

/**
 * Created by free on 2017/7/31.
 */

public class CodeApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        initAndroidUtils();
    }

    private void initAndroidUtils() {
        com.blankj.utilcode.util.Utils.init(this);
    }
}
