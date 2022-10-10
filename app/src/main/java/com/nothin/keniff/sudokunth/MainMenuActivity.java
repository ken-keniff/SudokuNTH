package com.nothin.keniff.sudokunth;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Point;

import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

public class MainMenuActivity extends AppCompatActivity {
    //SharedPreferences SharedPrefs;

    //private InterstitialAd mInterstitialAd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        //MobileAds.initialize(this, new OnInitializationCompleteListener() {
        //    @Override
        //    public void onInitializationComplete(InitializationStatus initializationStatus) {
        //    }
        //});

        MobileAds.initialize(this, "ca-app-pub-7116254482076264~4489482222");
        //mInterstitialAd = new InterstitialAd(this);
        //mInterstitialAd.setAdUnitId("ca-app-pub-7116254482076264/1091548290");
        //mInterstitialAd.loadAd(new AdRequest.Builder().tagForChildDirectedTreatment(true).build());
        //
        //

        Display display =getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        int screen_w = size.x;
        int screen_h = size.y;
        String screen_width=Integer.toString(screen_w);
        String screen_height=Integer.toString(screen_h);

        SharedPreferences firstTime=getSharedPreferences("FirstTime", Context.MODE_PRIVATE);
        String firstTimestring=firstTime.getString("First","");
        if (firstTimestring.equals("")){

        }

        SharedPreferences sharesavegame=getSharedPreferences("SaveGame", Context.MODE_PRIVATE);
        String sharesavestring=sharesavegame.getString("Save","");

        Button resume=findViewById(R.id.resumebutton);
        if (sharesavestring.equals("1")){
            resume.setEnabled(true);

        }
        else {
            resume.setEnabled(false);
            resume.setTextColor(getResources().getColor(R.color.grey));
        }


        //TextView Screentest=findViewById(R.id.testing);
        //Screentest.setText(screen_height);
    }

    public void resume_game(View v){
        if (v.isEnabled()){
            Intent intentresume=new Intent(this,GameActivity.class);
            intentresume.putExtra("newgame","0");
            startActivity(intentresume);
        }

    }

    public void pre_game(View view){
        Intent intentpregame=new Intent(this,PreGameActivity2.class);

        startActivity(intentpregame);

    }
    public void options(View view){
        Intent intentoptions=new Intent(this,OptionsActivity.class);

        startActivity(intentoptions);

    }

    public void exit(View view){
        Intent homeIntent = new Intent(Intent.ACTION_MAIN);
        homeIntent.addCategory( Intent.CATEGORY_HOME );
        homeIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(homeIntent);
    }
}
