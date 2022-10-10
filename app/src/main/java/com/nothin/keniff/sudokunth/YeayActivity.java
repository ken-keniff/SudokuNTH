package com.nothin.keniff.sudokunth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.AdRequest;



public class YeayActivity extends AppCompatActivity {

    private InterstitialAd mInterstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yeay);
        SharedPreferences sharesavegame=getSharedPreferences("SaveGame", Context.MODE_PRIVATE);
        SharedPreferences.Editor sharesaveeditor=sharesavegame.edit();
        sharesaveeditor.putString("Save","0");
        sharesaveeditor.apply();


        //MobileAds.initialize(this, "ca-app-pub-7116254482076264/1091548290");
        mInterstitialAd = new InterstitialAd(this);
        //mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        mInterstitialAd.setImmersiveMode(true);

        mInterstitialAd.setAdUnitId("ca-app-pub-7116254482076264/1091548290");
        //mInterstitialAd.loadAd(new AdRequest.Builder().tagForChildDirectedTreatment(true).build());
        //mInterstitialAd.loadAd(new AdRequest.Builder().build());
        mInterstitialAd.loadAd(new AdRequest.Builder().tagForChildDirectedTreatment(true).build());
        loaded();


        mInterstitialAd.setAdListener(new AdListener() {
            public void onAdLoaded(){
                mInterstitialAd.show();
            }
            //@Override
            //public void onAdClosed() {
                // Load the next interstitial.
            //    mInterstitialAd.loadAd(new AdRequest.Builder().tagForChildDirectedTreatment(true).build());
            //}

            //@Override
            public void onAdFailedToLoad(int errorCode) {

                //TextView why=findViewById(R.id.why);
                //why.setText("failed to load"+errorCode);
                // Code to be executed when an ad request fails.
            }

        });
        

    }
    public void loaded(){
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        } else {
            //TextView why=findViewById(R.id.why);
            //why.setText("not loaded");
            if (mInterstitialAd.isLoading()){
                //why.setText("loading");
            }
        }
    }

    public void yeay(View view){
        Intent intentmenu=new Intent(this,MainMenuActivity.class);
        startActivity(intentmenu);
    }
}
