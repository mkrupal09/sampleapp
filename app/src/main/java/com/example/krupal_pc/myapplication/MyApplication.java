package com.example.krupal_pc.myapplication;

import android.app.Application;

import com.facebook.stetho.Stetho;

/**
 * Created by krupal-pc on 6/15/2016.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
    }
}
