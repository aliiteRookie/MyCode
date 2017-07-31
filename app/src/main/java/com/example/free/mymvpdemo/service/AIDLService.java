package com.example.free.mymvpdemo.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

import com.example.free.mymvpdemo.MyAIDLService;

public class AIDLService extends Service {
    public AIDLService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return mbinder;
    }

    MyAIDLService.Stub mbinder = new MyAIDLService.Stub() {

        @Override
        public int plus(int a, int b) throws RemoteException {
            return a + b;
        }

        @Override
        public String toUpperCase(String str) throws RemoteException {
            if (str == null) return null;
            return str.toUpperCase();
        }
    };
}
