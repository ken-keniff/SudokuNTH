package com.nothin.keniff.sudokunth;

import android.annotation.SuppressLint;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.Random;


import com.nothin.keniff.sudokunth.databinding.AcivityPreGame2Binding;

public class PreGameActivity2 extends AppCompatActivity {

    String theNumberString1="11";
    String theNumberString2="22";
    String theNumberString3="33";
    String theNumberString4="44";
    String theNumberString5="55";
    String theNumberString6="66";
    String theNumberString7="77";
    String theNumberString8="88";
    String theNumberString9="99";
    String textstring="bla";
    Integer a11;
    Integer a12;
    Integer a13;
    Integer a14;
    Integer a15;
    Integer a16;
    Integer a17;
    Integer a18;
    Integer a19;
    Integer a21;
    Integer a22;
    Integer a23;
    Integer a24;
    Integer a25;
    Integer a26;
    Integer a27;
    Integer a28;
    Integer a29;
    Integer a31;
    Integer a32;
    Integer a33;
    Integer a34;
    Integer a35;
    Integer a36;
    Integer a37;
    Integer a38;
    Integer a39;
    Integer a41;
    Integer a42;
    Integer a43;
    Integer a44;
    Integer a45;
    Integer a46;
    Integer a47;
    Integer a48;
    Integer a49;
    Integer a51;
    Integer a52;
    Integer a53;
    Integer a54;
    Integer a55;
    Integer a56;
    Integer a57;
    Integer a58;
    Integer a59;
    Integer a61;
    Integer a62;
    Integer a63;
    Integer a64;
    Integer a65;
    Integer a66;
    Integer a67;
    Integer a68;
    Integer a69;
    Integer a71;
    Integer a72;
    Integer a73;
    Integer a74;
    Integer a75;
    Integer a76;
    Integer a77;
    Integer a78;
    Integer a79;
    Integer a81;
    Integer a82;
    Integer a83;
    Integer a84;
    Integer a85;
    Integer a86;
    Integer a87;
    Integer a88;
    Integer a89;
    Integer a91;
    Integer a92;
    Integer a93;
    Integer a94;
    Integer a95;
    Integer a96;
    Integer a97;
    Integer a98;
    Integer a99;
    Integer theNumber1 = 11;
    Integer theNumber2 = 22;
    Integer theNumber3 = 33;
    int shithappens =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acivity_pre_game2);


        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_FULLSCREEN
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);



        try {
            //Thread.sleep(500);
            do {
                generatenumber();
            } while (shithappens==1);

            putintext();

        } catch (Exception e) {


        }

    }
    private static final Random num = new Random();

    private void putintext(){
        TextView text1 = (TextView) findViewById(R.id.textView123);
        do {
            textstring = String.valueOf(a11)+String.valueOf(a21)+String.valueOf(a31)+String.valueOf(a41)+String.valueOf(a51)
                    +String.valueOf(a61)+String.valueOf(a71)+String.valueOf(a81)+String.valueOf(a91)+"\n"+String.valueOf(a12)
                    +String.valueOf(a22)+String.valueOf(a32)+String.valueOf(a42)+String.valueOf(a52)+String.valueOf(a62)
                    +String.valueOf(a72)+String.valueOf(a82)+String.valueOf(a92)+"\n"+String.valueOf(a13)+String.valueOf(a23)
                    +String.valueOf(a33)+String.valueOf(a43)+String.valueOf(a53) +String.valueOf(a63)+String.valueOf(a73)+
                    String.valueOf(a83)+String.valueOf(a93);
        } while (a93==null);

        text1.setText(textstring);

    }
    private final void  generatenumber() {

        try {

            a11 = num.nextInt(9) + 1;

            do {
                a21 = num.nextInt(9) + 1;
            } while (a21.equals(a11));

            do {
                a31 = num.nextInt(9) + 1;
            } while ((a31.equals(a21)) | (a31.equals(a11)));

            do {
                a41 = num.nextInt(9) + 1;
            } while ((a41.equals(a31)) | (a41.equals(a21)) | (a41.equals(a11)));

            do {
                a51 = num.nextInt(9) + 1;
            } while ((a51.equals(a41)) | (a51.equals(a31)) | (a51.equals(a21)) | (a51.equals(a11)));

            do {
                a61 = num.nextInt(9) + 1;
            } while ((a61.equals(a51)) | (a61.equals(a41)) | (a61.equals(a31)) | (a61.equals(a21)) | (a61.equals(a11)));

            do {
                a71 = num.nextInt(9) + 1;
            } while ((a71.equals(a61)) | (a71.equals(a51)) | (a71.equals(a41)) | (a71.equals(a31)) | (a71.equals(a21)) | (a71.equals(a11)));

            do {
                a81 = num.nextInt(9) + 1;
            } while ((a81.equals(a71)) | (a81.equals(a61)) | (a81.equals(a51)) | (a81.equals(a41)) | (a81.equals(a31)) | (a81.equals(a21)) | (a81.equals(a11)));

            do {
                a91 = num.nextInt(9) + 1;
            } while ((a91.equals(a81)) | (a91.equals(a71)) | (a91.equals(a61)) | (a91.equals(a51)) | (a91.equals(a41)) | (a91.equals(a31)) | (a91.equals(a21)) | (a91.equals(a11)));

            //}
            //public void secondline()) {
            do {
                a12 = num.nextInt(9) + 1;
            } while ((a12.equals(a31)) | (a12.equals(a21)) | (a12.equals(a11)));

            do {
                a22 = num.nextInt(9) + 1;
            } while ((a22.equals(a31)) | (a22.equals(a21)) | (a22.equals(a11)) | (a22.equals(a12)));

            do {
                a32 = num.nextInt(9) + 1;
            } while ((a32.equals(a31)) | (a32.equals(a21)) | (a32.equals(a11)) | (a32.equals(a12)) | (a32.equals(a22)));

            do {
                a42 = num.nextInt(9) + 1;
            } while ((a42.equals(a61)) | (a42.equals(a51)) | (a42.equals(a41)) | (a42.equals(a12)) | (a42.equals(a22)) | (a42.equals(a32)));

            do {
                a52 = num.nextInt(9) + 1;
            } while ((a52.equals(a61)) | (a52.equals(a51)) | (a52.equals(a41)) | (a52.equals(a12)) | (a52.equals(a22)) | (a52.equals(a32)) | (a52.equals(a42)));

            do {
                a62 = num.nextInt(9) + 1;
            } while ((a62.equals(a61)) | (a62.equals(a51)) | (a62.equals(a41)) | (a62.equals(a12)) | (a62.equals(a22)) | (a62.equals(a32)) | (a62.equals(a42))
                    | (a62.equals(a52)));

            do {
                a72 = num.nextInt(9) + 1;
            } while ((a72.equals(a91)) | (a72.equals(a81)) | (a72.equals(a71)) | (a72.equals(a12)) | (a72.equals(a22)) | (a72.equals(a32)) | (a72.equals(a42))
                    | (a72.equals(a52)) | (a72.equals(a62)));

            do {
                a82 = num.nextInt(9) + 1;
            } while ((a82.equals(a91)) | (a82.equals(a81)) | (a82.equals(a71)) | (a82.equals(a12)) | (a82.equals(a22)) | (a82.equals(a32)) | (a82.equals(a42))
                    | (a82.equals(a52)) | (a82.equals(a62)) | (a82.equals(a72)));

            do {
                a92 = num.nextInt(9) + 1;
            } while ((a92.equals(a91)) | (a92.equals(a81)) | (a92.equals(a71)) | (a92.equals(a12)) | (a92.equals(a22)) | (a92.equals(a32)) | (a92.equals(a42))
                    | (a92.equals(a52)) | (a92.equals(a62)) | (a92.equals(a72)) | (a92.equals(a82)));
            //}
            //public void thirdline()) {
            do {
                a13 = num.nextInt(9) + 1;
            } while ((a13.equals(a11)) | (a13.equals(a21)) | (a13.equals(a31)) | (a13.equals(a12)) | (a13.equals(a22)) | (a13.equals(a32)));

            do {
                a23 = num.nextInt(9) + 1;
            } while ((a23.equals(a11)) | (a23.equals(a21)) | (a23.equals(a31)) | (a23.equals(a12)) | (a23.equals(a22)) | (a23.equals(a32)) | (a23.equals(a13)));

            do {
                a33 = num.nextInt(9) + 1;
            } while ((a33.equals(a11)) | (a33.equals(a21)) | (a33.equals(a31)) | (a33.equals(a12)) | (a33.equals(a22)) | (a33.equals(a32)) | (a33.equals(a13))
                    | (a33.equals(a23)));

            do {
                a43 = num.nextInt(9) + 1;
            } while ((a43.equals(a41)) | (a43.equals(a51)) | (a43.equals(a61)) | (a43.equals(a42)) | (a43.equals(a52)) | (a43.equals(a62)) | (a43.equals(a13))
                    | (a43.equals(a23)) | (a43.equals(a33)));

            do {
                a53 = num.nextInt(9) + 1;
            } while ((a53.equals(a41)) | (a53.equals(a51)) | (a53.equals(a61)) | (a53.equals(a42)) | (a53.equals(a52)) | (a53.equals(a62)) | (a53.equals(a13))
                    | (a53.equals(a23)) | (a53.equals(a33)) | (a53.equals(a43)));

            do {
                a63 = num.nextInt(9) + 1;
            } while ((a63.equals(a41)) | (a63.equals(a51)) | (a63.equals(a61)) | (a63.equals(a42)) | (a63.equals(a52)) | (a63.equals(a62)) | (a63.equals(a13))
                    | (a63.equals(a23)) | (a63.equals(a33)) | (a63.equals(a43)) | (a63.equals(a53)));

            do {
                a73 = num.nextInt(9) + 1;
            } while ((a73.equals(a71)) | (a73.equals(a81)) | (a73.equals(a91)) | (a73.equals(a72)) | (a73.equals(a82)) | (a73.equals(a92)) | (a73.equals(a13))
                    | (a73.equals(a23)) | (a73.equals(a33)) | (a73.equals(a43)) | (a73.equals(a53)) | (a73.equals(a63)));

            do {
                a83 = num.nextInt(9) + 1;
            } while ((a83.equals(a71)) | (a83.equals(a81)) | (a83.equals(a91)) | (a83.equals(a72)) | (a83.equals(a82)) | (a83.equals(a92)) | (a83.equals(a13))
                    | (a83.equals(a23)) | (a83.equals(a33)) | (a83.equals(a43)) | (a83.equals(a53)) | (a83.equals(a63)) | (a83.equals(a73)));

            do {
                a93 = num.nextInt(9) + 1;
            } while ((a93.equals(a71)) | (a93.equals(a81)) | (a93.equals(a91)) | (a93.equals(a72)) | (a93.equals(a82)) | (a93.equals(a92)) | (a93.equals(a13))
                    | (a93.equals(a23)) | (a93.equals(a33)) | (a93.equals(a43)) | (a93.equals(a53)) | (a93.equals(a63)) | (a93.equals(a73)) | (a93.equals(a83)));

        }catch (Exception e) {
            shithappens=1;

        }
    }

    public void easy(View view){
        SharedPreferences difficulty=getSharedPreferences("Difficulty", Context.MODE_PRIVATE);
        SharedPreferences.Editor shareeditor=difficulty.edit();
        shareeditor.putString("Difficulty","easy");
        shareeditor.apply();
        Intent intentgame=new Intent(this,GameActivity.class);
        startActivity(intentgame);
    }
    public void normal(View view){
        SharedPreferences difficulty=getSharedPreferences("Difficulty", Context.MODE_PRIVATE);
        SharedPreferences.Editor shareeditor=difficulty.edit();
        shareeditor.putString("Difficulty","normal");
        shareeditor.apply();
        Intent intentgame=new Intent(this,GameActivity.class);
        startActivity(intentgame);

    }
    public void hard(View view){
        SharedPreferences difficulty=getSharedPreferences("Difficulty", Context.MODE_PRIVATE);
        SharedPreferences.Editor shareeditor=difficulty.edit();
        shareeditor.putString("Difficulty","hard");
        shareeditor.apply();
        Intent intentgame=new Intent(this,GameActivity.class);
        startActivity(intentgame);
    }
    public void try_me(View view){
        SharedPreferences difficulty=getSharedPreferences("Difficulty", Context.MODE_PRIVATE);
        SharedPreferences.Editor shareeditor=difficulty.edit();
        shareeditor.putString("Difficulty","tryme");
        shareeditor.apply();
        Intent intentgame=new Intent(this,GameActivity.class);
        startActivity(intentgame);
    }

}