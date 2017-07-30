package com.example.free.mymvpdemo.helper;

import android.app.Activity;
import android.content.Intent;

import com.example.free.mymvpdemo.ui.ServiceActivity;

/**
 * Created by free on 2017/7/30.
 */

public class Nav {

    public static void toServiceActivity(Activity activity) {
        activity.startActivity(new Intent(activity, ServiceActivity.class));
    }
}
