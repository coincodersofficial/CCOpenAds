package com.coincoders.ccopenads;

import android.app.Application;

import com.google.android.gms.ads.MobileAds;

public class MyApplication extends Application {
    @Override   
    public void onCreate() {
        super.onCreate();
        MobileAds.initialize(this);

        new CCOpenAd(this, "ca-app-pub-3940256099942544/3419835294");

    }

}
