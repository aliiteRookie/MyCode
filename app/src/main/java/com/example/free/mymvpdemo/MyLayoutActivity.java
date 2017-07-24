package com.example.free.mymvpdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import com.example.free.mymvpdemo.view.MyLayout;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class MyLayoutActivity extends AppCompatActivity {

    private MyLayout mylayout;
    private Button button1;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_layout);
        mylayout = ((MyLayout) findViewById(R.id.my_layout));
        button1 = ((Button) findViewById(R.id.button1));
        button2 = ((Button) findViewById(R.id.button2));

        mylayout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Log.d("TAG","myLayout on touch");
                return false;
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("TAG","You clicked button1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("TAG","You clicked button2");
            }
        });

        HashMap hashMap = new HashMap();
        Hashtable hashtable = new Hashtable();

        HashSet hashSet = new HashSet();
    }
}
