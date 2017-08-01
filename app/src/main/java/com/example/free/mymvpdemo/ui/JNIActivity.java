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
//        textView.setText(myJNI.sayHello());
    }
}
