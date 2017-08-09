package com.example.free.mymvpdemo.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.example.free.mymvpdemo.R;
import com.squareup.picasso.Picasso;

public class PicassoActivity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picasso);
        imageView = ((ImageView) findViewById(R.id.imageView));
//        Picasso.with(this).load("http://img2.ph.126.net/cuD4cgBVIa3CWAy0IlTi1A==/6608759774282909753.jpg").into(imageView);
        Picasso.with(this).load("http://www.qiwen007.com/images/image/2017/0624/6363392528166483188259433.jpg").into(imageView);

    }

//    class getPicasso(Context context){
//        OkHttpClient client = getProgressBarClient();
//        return new Picasso.Builder(context)
//                .downloader(new ImageDownLoader(client))
//                .build();
//    }
//
//    private  OkHttpClient getProgressBarClient() {
//        return client.newBuilder()
//                .addInterceptor(new CaheInterceptor(context))
//                .addNetworkInterceptor(new CaheInterceptor(contextr))
//                .build();
//    }

}
