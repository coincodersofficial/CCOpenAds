package com.coincoders.ccopenads;

import android.app.Application;

import com.google.android.gms.ads.MobileAds;

public class MyApplication extends Application {
//  git config --global user.name "Coin Coders"
    // git config --global user.email "coincodersofficial@gmail.com"
    //  git config user.name "Coin Coders"
//git config user.email "coincodersofficial@gmail.com"
    @Override    // Coin Coders   coincodersofficial@gmail.com
    public void onCreate() {
        super.onCreate();
        MobileAds.initialize(this);

        new CCOpenAd(this, "ca-app-pub-3940256099942544/3419835294");

    }

}