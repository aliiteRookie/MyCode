package com.example.free.mymvpdemo.ui;

import android.widget.TextView;

import com.example.free.mymvpdemo.R;
import com.example.free.mymvpdemo.manager.BaseActivity;

import butterknife.BindView;

/**
 * JNI问题的测试
 */
public class JNIActivity extends BaseActivity {

    @BindView(R.id.textView)
    TextView textView;


    @Override
    protected int getLayoutId() {
        return R.layout.activity_jni;
    }

    @Override
    protected void initData() {
        //编写静态方法（用java声明）-->编译生成class文件--->编译生成h文件---->编写C文件（用C/C++实现）
        //---->配置NDK---->配置so库---->在Activity调用（Java调用C/C++）。

//        textView.setText(myJNI.sayHello());
    }
}
