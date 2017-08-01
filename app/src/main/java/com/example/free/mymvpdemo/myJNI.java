package com.example.free.mymvpdemo;

/**
 * Created by free on 2017/8/1.
 */

public class myJNI {
    //加载so库
    static {
        System.loadLibrary("JniTest");
    }
    //native方法
    public static native String sayHello();
}
