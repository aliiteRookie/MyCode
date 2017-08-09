package com.example.free.mymvpdemo.ui;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.widget.Button;

import com.blankj.utilcode.util.LogUtils;
import com.example.free.mymvpdemo.MyAIDLService;
import com.example.free.mymvpdemo.R;
import com.example.free.mymvpdemo.helper.Nav;
import com.example.free.mymvpdemo.manager.BaseActivity;

import butterknife.BindView;
import butterknife.OnClick;

public class AIDLActivity extends BaseActivity {

    private MyAIDLService myAIDLService;

    @BindView(R.id.btn_aidl)
    Button btnAidl;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_aidl;
    }

    @OnClick(R.id.btn_aidl)
    public void btnAidl() {
        Nav.bindAIDLService(this, serviceConnection);
    }

    ServiceConnection serviceConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            myAIDLService = MyAIDLService.Stub.asInterface(service);
            try {
                int a = myAIDLService.plus(3,5);
                String b = myAIDLService.toUpperCase("hello world");
                LogUtils.e("a:" + a);
                LogUtils.e("b:" + b);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {

        }
    };
}
