package com.nothin.keniff.sudokunth;

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
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;


public class PreGameActivity extends AppCompatActivity {

    private GestureDetector gestureDetector;

    int Easyint;

    Button var1;
    Button var2;
    Button var3;
    Button var4;
    Button var5;
    Button var6;
    Button var7;
    Button var8;
    Button var9;
    Button var10;
    Button var11;
    Button var12;
    Button var13;
    Button var14;
    Button var15;
    Button var16;
    Button var17;
    Button var18;
    Button var19;
    Button var20;
    Button var21;
    Button var22;
    Button var23;
    Button var24;
    Button var25;
    Button var26;
    Button var27;
    Button var28;
    Button var29;
    Button var30;
    Button var31;
    Button var32;
    Button var33;
    Button var34;
    Button var35;
    Button var36;
    Button var37;
    Button var38;
    Button var39;
    Button var40;
    Button var41;
    Button var42;
    Button var43;
    Button var44;
    Button var45;
    Button var46;
    Button var47;
    Button var48;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_game);

        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_FULLSCREEN
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);

        SharedPreferences firstTime=getSharedPreferences("FirstTime", Context.MODE_PRIVATE);
        String firstTimestring=firstTime.getString("PreGameActivity","");
        if (firstTimestring.equals("")){
            Toast.makeText(this,R.string.YouCanSwipe,Toast.LENGTH_LONG).show();
            SharedPreferences.Editor firstTimeeditor=firstTime.edit();
                firstTimeeditor.putString("PreGameActivity","noo");
                firstTimeeditor.apply();
        }

        var1=findViewById(R.id.var1);
        var2=findViewById(R.id.var2);
        var3=findViewById(R.id.var3);
        var4=findViewById(R.id.var4);
        var5=findViewById(R.id.var5);
        var6=findViewById(R.id.var6);
        var7=findViewById(R.id.var7);
        var8=findViewById(R.id.var8);
        var9=findViewById(R.id.var9);
        var10=findViewById(R.id.var10);
        var11=findViewById(R.id.var11);
        var12=findViewById(R.id.var12);
        var13=findViewById(R.id.var13);
        var14=findViewById(R.id.var14);
        var15=findViewById(R.id.var15);
        var16=findViewById(R.id.var16);
        var17=findViewById(R.id.var17);
        var18=findViewById(R.id.var18);
        var19=findViewById(R.id.var19);
        var20=findViewById(R.id.var20);
        var21=findViewById(R.id.var21);
        var22=findViewById(R.id.var22);
        var23=findViewById(R.id.var23);
        var24=findViewById(R.id.var24);
        var25=findViewById(R.id.var25);
        var26=findViewById(R.id.var26);
        var27=findViewById(R.id.var27);
        var28=findViewById(R.id.var28);
        var29=findViewById(R.id.var29);
        var30=findViewById(R.id.var30);
        var31=findViewById(R.id.var31);
        var32=findViewById(R.id.var32);
        var33=findViewById(R.id.var33);
        var34=findViewById(R.id.var34);
        var35=findViewById(R.id.var35);
        var36=findViewById(R.id.var36);
        var37=findViewById(R.id.var37);
        var38=findViewById(R.id.var38);
        var39=findViewById(R.id.var39);
        var40=findViewById(R.id.var40);
        var41=findViewById(R.id.var41);
        var42=findViewById(R.id.var42);
        var43=findViewById(R.id.var43);
        var44=findViewById(R.id.var44);
        var45=findViewById(R.id.var45);
        var46=findViewById(R.id.var46);
        var47=findViewById(R.id.var47);
        var48=findViewById(R.id.var48);


        gestureDetector=(new GestureDetector(this,new MyGestureListener(this)));


        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        int screen_w = size.x;
        int screen_h = size.y;

        int VarButtSize=5;
        if (screen_h > screen_w) {

            VarButtSize = screen_w/5;
        } else if (screen_h <= screen_w) {
            VarButtSize = screen_h/5;
        }




        var1.setWidth(VarButtSize);
        var1.setHeight(VarButtSize);
        var2.setWidth(VarButtSize);
        var2.setHeight(VarButtSize);
        var3.setWidth(VarButtSize);
        var3.setHeight(VarButtSize);
        var4.setWidth(VarButtSize);
        var4.setHeight(VarButtSize);
        var5.setWidth(VarButtSize);
        var5.setHeight(VarButtSize);
        var6.setWidth(VarButtSize);
        var6.setHeight(VarButtSize);
        var7.setWidth(VarButtSize);
        var7.setHeight(VarButtSize);
        var8.setWidth(VarButtSize);
        var8.setHeight(VarButtSize);
        var9.setWidth(VarButtSize);
        var9.setHeight(VarButtSize);
        var10.setWidth(VarButtSize);
        var10.setHeight(VarButtSize);
        var11.setWidth(VarButtSize);
        var11.setHeight(VarButtSize);
        var12.setWidth(VarButtSize);
        var12.setHeight(VarButtSize);
        var13.setWidth(VarButtSize);
        var13.setHeight(VarButtSize);
        var14.setWidth(VarButtSize);
        var14.setHeight(VarButtSize);
        var15.setWidth(VarButtSize);
        var15.setHeight(VarButtSize);
        var16.setWidth(VarButtSize);
        var16.setHeight(VarButtSize);
        var17.setWidth(VarButtSize);
        var17.setHeight(VarButtSize);
        var18.setWidth(VarButtSize);
        var18.setHeight(VarButtSize);
        var19.setWidth(VarButtSize);
        var19.setHeight(VarButtSize);
        var20.setWidth(VarButtSize);
        var20.setHeight(VarButtSize);
        var21.setWidth(VarButtSize);
        var21.setHeight(VarButtSize);
        var22.setWidth(VarButtSize);
        var22.setHeight(VarButtSize);
        var23.setWidth(VarButtSize);
        var23.setHeight(VarButtSize);
        var24.setWidth(VarButtSize);
        var24.setHeight(VarButtSize);
        var25.setWidth(VarButtSize);
        var25.setHeight(VarButtSize);
        var26.setWidth(VarButtSize);
        var26.setHeight(VarButtSize);
        var27.setWidth(VarButtSize);
        var27.setHeight(VarButtSize);
        var28.setWidth(VarButtSize);
        var28.setHeight(VarButtSize);
        var29.setWidth(VarButtSize);
        var29.setHeight(VarButtSize);
        var30.setWidth(VarButtSize);
        var30.setHeight(VarButtSize);
        var31.setWidth(VarButtSize);
        var31.setHeight(VarButtSize);
        var32.setWidth(VarButtSize);
        var32.setHeight(VarButtSize);
        var33.setWidth(VarButtSize);
        var33.setHeight(VarButtSize);
        var34.setWidth(VarButtSize);
        var34.setHeight(VarButtSize);
        var35.setWidth(VarButtSize);
        var35.setHeight(VarButtSize);
        var36.setWidth(VarButtSize);
        var36.setHeight(VarButtSize);
        var37.setWidth(VarButtSize);
        var37.setHeight(VarButtSize);
        var38.setWidth(VarButtSize);
        var38.setHeight(VarButtSize);
        var39.setWidth(VarButtSize);
        var39.setHeight(VarButtSize);
        var40.setWidth(VarButtSize);
        var40.setHeight(VarButtSize);
        var41.setWidth(VarButtSize);
        var41.setHeight(VarButtSize);
        var42.setWidth(VarButtSize);
        var42.setHeight(VarButtSize);
        var43.setWidth(VarButtSize);
        var43.setHeight(VarButtSize);
        var44.setWidth(VarButtSize);
        var44.setHeight(VarButtSize);
        var45.setWidth(VarButtSize);
        var45.setHeight(VarButtSize);
        var46.setWidth(VarButtSize);
        var46.setHeight(VarButtSize);
        var47.setWidth(VarButtSize);
        var47.setHeight(VarButtSize);
        var48.setWidth(VarButtSize);
        var48.setHeight(VarButtSize);

        SharedPreferences variantlayout=getSharedPreferences("variantlayout",Context.MODE_PRIVATE);
        String varlaystring=variantlayout.getString("layout","");

        if (varlaystring.equals("easy")|varlaystring.equals("")){
            //RadioButton radiobutvar=findViewById(R.id.radioeasy);
            //radiobutvar.setChecked(true);
            easylay();
        }
        else if (varlaystring.equals("normal")){
            //RadioButton radiobutvar=findViewById(R.id.radionorm);
            //radiobutvar.setChecked(true);
            normlay();
        }
        else if (varlaystring.equals("hard")){
            //RadioButton radiobutvar=findViewById(R.id.radiohard);
            //radiobutvar.setChecked(true);
            hardlay();
        }
        else if (varlaystring.equals("realhard")){
            //RadioButton radiobutvar=findViewById(R.id.radiorealhard);
            //radiobutvar.setChecked(true);
            realhardlay();
        }







        //SharedPreferences shareoptions=getSharedPreferences("Options", Context.MODE_PRIVATE);
        //String sharestring=shareoptions.getString("handed","");
        //TextView shartext=findViewById(R.id.sharetext);
        //shartext.setText(sharestring);
    }

    public void doneeasy(){
        SharedPreferences variantdone=getSharedPreferences("Variantdone", Context.MODE_PRIVATE);


        String donestring1=variantdone.getString("1","");
        String donestring2=variantdone.getString("2","");
        String donestring3=variantdone.getString("3","");
        String donestring4=variantdone.getString("4","");
        String donestring5=variantdone.getString("5","");
        String donestring6=variantdone.getString("6","");
        String donestring7=variantdone.getString("7","");
        String donestring8=variantdone.getString("8","");

        if (donestring1.equals("done")){
            var1.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring2.equals("done")){
            var2.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring3.equals("done")){
            var3.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring4.equals("done")){
            var4.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring5.equals("done")){
            var5.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring6.equals("done")){
            var6.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring7.equals("done")){
            var7.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring8.equals("done")){
            var8.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }

    }
    public void donenotsoeasy(){
        SharedPreferences variantdone=getSharedPreferences("Variantdone", Context.MODE_PRIVATE);



        String donestring11=variantdone.getString("11","");
        String donestring12=variantdone.getString("12","");
        String donestring13=variantdone.getString("13","");
        String donestring14=variantdone.getString("14","");
        String donestring15=variantdone.getString("15","");
        String donestring16=variantdone.getString("16","");
        String donestring17=variantdone.getString("17","");
        String donestring18=variantdone.getString("18","");
        String donestring19=variantdone.getString("19","");
        String donestring20=variantdone.getString("20","");
        String donestring21=variantdone.getString("21","");
        String donestring22=variantdone.getString("22","");
        String donestring23=variantdone.getString("23","");
        String donestring24=variantdone.getString("24","");
        String donestring25=variantdone.getString("25","");
        String donestring26=variantdone.getString("26","");
        String donestring27=variantdone.getString("27","");
        String donestring28=variantdone.getString("28","");
        String donestring29=variantdone.getString("29","");
        String donestring30=variantdone.getString("30","");
        String donestring31=variantdone.getString("31","");
        String donestring32=variantdone.getString("32","");
        String donestring33=variantdone.getString("33","");
        String donestring34=variantdone.getString("34","");
        String donestring35=variantdone.getString("35","");
        String donestring36=variantdone.getString("36","");
        String donestring37=variantdone.getString("37","");
        String donestring38=variantdone.getString("38","");
        String donestring39=variantdone.getString("39","");
        String donestring40=variantdone.getString("40","");
        String donestring41=variantdone.getString("41","");
        String donestring42=variantdone.getString("42","");
        String donestring43=variantdone.getString("43","");
        String donestring44=variantdone.getString("44","");
        String donestring45=variantdone.getString("45","");
        String donestring46=variantdone.getString("46","");
        String donestring47=variantdone.getString("47","");
        String donestring48=variantdone.getString("48","");

        if (donestring11.equals("done")){
            var1.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring12.equals("done")){
            var2.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring13.equals("done")){
            var3.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring14.equals("done")){
            var4.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring15.equals("done")){
            var5.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring16.equals("done")){
            var6.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring17.equals("done")){
            var7.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring18.equals("done")){
            var8.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring19.equals("done")){
            var9.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring20.equals("done")){
            var10.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring21.equals("done")){
            var11.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring22.equals("done")){
            var12.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring23.equals("done")){
            var13.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring24.equals("done")){
            var14.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring25.equals("done")){
            var15.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring26.equals("done")){
            var16.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring27.equals("done")){
            var17.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring28.equals("done")){
            var18.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring29.equals("done")){
            var19.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring30.equals("done")){
            var20.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring31.equals("done")){
            var21.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring32.equals("done")){
            var22.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring33.equals("done")){
            var23.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring34.equals("done")){
            var24.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring35.equals("done")){
            var25.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring36.equals("done")){
            var26.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring37.equals("done")){
            var27.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring38.equals("done")){
            var28.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring39.equals("done")){
            var29.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring40.equals("done")){
            var30.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring41.equals("done")){
            var31.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring42.equals("done")){
            var32.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring43.equals("done")){
            var33.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring44.equals("done")){
            var34.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring45.equals("done")){
            var35.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring46.equals("done")){
            var36.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring47.equals("done")){
            var37.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring48.equals("done")){
            var38.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }

    }
    public void donenormal(){
        SharedPreferences variantdone=getSharedPreferences("Variantdone", Context.MODE_PRIVATE);


        String donestring501=variantdone.getString("501","");
        String donestring502=variantdone.getString("502","");
        String donestring503=variantdone.getString("503","");
        String donestring504=variantdone.getString("504","");
        String donestring505=variantdone.getString("505","");
        String donestring506=variantdone.getString("506","");
        String donestring507=variantdone.getString("507","");
        String donestring508=variantdone.getString("508","");
        String donestring509=variantdone.getString("509","");
        String donestring510=variantdone.getString("510","");
        String donestring511=variantdone.getString("511","");
        String donestring512=variantdone.getString("512","");
        String donestring513=variantdone.getString("513","");
        String donestring514=variantdone.getString("514","");
        String donestring515=variantdone.getString("515","");
        String donestring516=variantdone.getString("516","");
        String donestring517=variantdone.getString("517","");
        String donestring518=variantdone.getString("518","");
        String donestring519=variantdone.getString("519","");
        String donestring520=variantdone.getString("520","");
        String donestring521=variantdone.getString("521","");
        String donestring522=variantdone.getString("522","");
        String donestring523=variantdone.getString("523","");
        String donestring524=variantdone.getString("524","");
        String donestring525=variantdone.getString("525","");
        String donestring526=variantdone.getString("526","");
        String donestring527=variantdone.getString("527","");
        String donestring528=variantdone.getString("528","");
        String donestring529=variantdone.getString("529","");
        String donestring530=variantdone.getString("530","");
        String donestring531=variantdone.getString("531","");
        String donestring532=variantdone.getString("532","");
        String donestring533=variantdone.getString("533","");
        String donestring534=variantdone.getString("534","");
        String donestring535=variantdone.getString("535","");
        String donestring536=variantdone.getString("536","");
        String donestring537=variantdone.getString("537","");
        String donestring538=variantdone.getString("538","");
        String donestring539=variantdone.getString("539","");
        String donestring540=variantdone.getString("540","");
        String donestring541=variantdone.getString("541","");
        String donestring542=variantdone.getString("542","");
        String donestring543=variantdone.getString("543","");
        String donestring544=variantdone.getString("544","");
        String donestring545=variantdone.getString("545","");
        String donestring546=variantdone.getString("546","");
        String donestring547=variantdone.getString("547","");
        String donestring548=variantdone.getString("548","");

        if (donestring501.equals("done")){
            var1.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring502.equals("done")){
            var2.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring503.equals("done")){
            var3.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring504.equals("done")){
            var4.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring505.equals("done")){
            var5.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring506.equals("done")){
            var6.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring507.equals("done")){
            var7.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring508.equals("done")){
            var8.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring509.equals("done")){
            var9.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring510.equals("done")){
            var10.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring511.equals("done")){
            var11.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring512.equals("done")){
            var12.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring513.equals("done")){
            var13.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring514.equals("done")){
            var14.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring515.equals("done")){
            var15.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring516.equals("done")){
            var16.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring517.equals("done")){
            var17.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring518.equals("done")){
            var18.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring519.equals("done")){
            var19.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring520.equals("done")){
            var20.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring521.equals("done")){
            var21.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring522.equals("done")){
            var22.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring523.equals("done")){
            var23.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring524.equals("done")){
            var24.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring525.equals("done")){
            var25.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring526.equals("done")){
            var26.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring527.equals("done")){
            var27.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring528.equals("done")){
            var28.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring529.equals("done")){
            var29.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring530.equals("done")){
            var30.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring531.equals("done")){
            var31.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring532.equals("done")){
            var32.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring533.equals("done")){
            var33.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring534.equals("done")){
            var34.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring535.equals("done")){
            var35.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring536.equals("done")){
            var36.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring537.equals("done")){
            var37.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring538.equals("done")){
            var38.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring539.equals("done")){
            var39.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring540.equals("done")){
            var40.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring541.equals("done")){
            var41.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring542.equals("done")){
            var42.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring543.equals("done")){
            var43.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring544.equals("done")){
            var44.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring545.equals("done")){
            var45.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring546.equals("done")){
            var46.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring547.equals("done")){
            var47.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring548.equals("done")){
            var48.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }

    }
    public void donehard(){
        SharedPreferences variantdone=getSharedPreferences("Variantdone", Context.MODE_PRIVATE);


        String donestring1001=variantdone.getString("1001","");
        String donestring1002=variantdone.getString("1002","");
        String donestring1003=variantdone.getString("1003","");
        String donestring1004=variantdone.getString("1004","");
        String donestring1005=variantdone.getString("1005","");
        String donestring1006=variantdone.getString("1006","");
        String donestring1007=variantdone.getString("1007","");
        String donestring1008=variantdone.getString("1008","");
        String donestring1009=variantdone.getString("1009","");
        String donestring1010=variantdone.getString("1010","");
        String donestring1011=variantdone.getString("1011","");
        String donestring1012=variantdone.getString("1012","");
        String donestring1013=variantdone.getString("1013","");
        String donestring1014=variantdone.getString("1014","");
        String donestring1015=variantdone.getString("1015","");
        String donestring1016=variantdone.getString("1016","");
        String donestring1017=variantdone.getString("1017","");
        String donestring1018=variantdone.getString("1018","");
        String donestring1019=variantdone.getString("1019","");
        String donestring1020=variantdone.getString("1020","");
        String donestring1021=variantdone.getString("1021","");
        String donestring1022=variantdone.getString("1022","");
        String donestring1023=variantdone.getString("1023","");
        String donestring1024=variantdone.getString("1024","");
        String donestring1025=variantdone.getString("1025","");
        String donestring1026=variantdone.getString("1026","");
        String donestring1027=variantdone.getString("1027","");
        String donestring1028=variantdone.getString("1028","");
        String donestring1029=variantdone.getString("1029","");
        String donestring1030=variantdone.getString("1030","");
        String donestring1031=variantdone.getString("1031","");
        String donestring1032=variantdone.getString("1032","");
        String donestring1033=variantdone.getString("1033","");
        String donestring1034=variantdone.getString("1034","");
        String donestring1035=variantdone.getString("1035","");
        String donestring1036=variantdone.getString("1036","");
        String donestring1037=variantdone.getString("1037","");
        String donestring1038=variantdone.getString("1038","");
        String donestring1039=variantdone.getString("1039","");
        String donestring1040=variantdone.getString("1040","");
        String donestring1041=variantdone.getString("1041","");
        String donestring1042=variantdone.getString("1042","");
        String donestring1043=variantdone.getString("1043","");
        String donestring1044=variantdone.getString("1044","");
        String donestring1045=variantdone.getString("1045","");
        String donestring1046=variantdone.getString("1046","");
        String donestring1047=variantdone.getString("1047","");
        String donestring1048=variantdone.getString("1048","");

        if (donestring1001.equals("done")){
            var1.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring1002.equals("done")){
            var2.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring1003.equals("done")){
            var3.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring1004.equals("done")){
            var4.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring1005.equals("done")){
            var5.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring1006.equals("done")){
            var6.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring1007.equals("done")){
            var7.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring1008.equals("done")){
            var8.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring1009.equals("done")){
            var9.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring1010.equals("done")){
            var10.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring1011.equals("done")){
            var11.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring1012.equals("done")){
            var12.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring1013.equals("done")){
            var13.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring1014.equals("done")){
            var14.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring1015.equals("done")){
            var15.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring1016.equals("done")){
            var16.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring1017.equals("done")){
            var17.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring1018.equals("done")){
            var18.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring1019.equals("done")){
            var19.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring1020.equals("done")){
            var20.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring1021.equals("done")){
            var21.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring1022.equals("done")){
            var22.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring1023.equals("done")){
            var23.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring1024.equals("done")){
            var24.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring1025.equals("done")){
            var25.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring1026.equals("done")){
            var26.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring1027.equals("done")){
            var27.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring1028.equals("done")){
            var28.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring1029.equals("done")){
            var29.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring1030.equals("done")){
            var30.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring1031.equals("done")){
            var31.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring1032.equals("done")){
            var32.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring1033.equals("done")){
            var33.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring1034.equals("done")){
            var34.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring1035.equals("done")){
            var35.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring1036.equals("done")){
            var36.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring1037.equals("done")){
            var37.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring1038.equals("done")){
            var38.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring1039.equals("done")){
            var39.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring1040.equals("done")){
            var40.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring1041.equals("done")){
            var41.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring1042.equals("done")){
            var42.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring1043.equals("done")){
            var43.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring1044.equals("done")){
            var44.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring1045.equals("done")){
            var45.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring1046.equals("done")){
            var46.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring1047.equals("done")){
            var47.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }
        if (donestring1048.equals("done")){
            var48.setBackgroundResource(R.drawable.variant_buttons_done_animator);
        }


    }
    public void normalvariantbuttons(){
        var1.setBackgroundResource(R.drawable.variant_buttons_animator);
        var2.setBackgroundResource(R.drawable.variant_buttons_animator);
        var3.setBackgroundResource(R.drawable.variant_buttons_animator);
        var4.setBackgroundResource(R.drawable.variant_buttons_animator);
        var5.setBackgroundResource(R.drawable.variant_buttons_animator);
        var6.setBackgroundResource(R.drawable.variant_buttons_animator);
        var7.setBackgroundResource(R.drawable.variant_buttons_animator);
        var8.setBackgroundResource(R.drawable.variant_buttons_animator);
        var9.setBackgroundResource(R.drawable.variant_buttons_animator);
        var10.setBackgroundResource(R.drawable.variant_buttons_animator);
        var11.setBackgroundResource(R.drawable.variant_buttons_animator);
        var12.setBackgroundResource(R.drawable.variant_buttons_animator);
        var13.setBackgroundResource(R.drawable.variant_buttons_animator);
        var14.setBackgroundResource(R.drawable.variant_buttons_animator);
        var15.setBackgroundResource(R.drawable.variant_buttons_animator);
        var16.setBackgroundResource(R.drawable.variant_buttons_animator);
        var17.setBackgroundResource(R.drawable.variant_buttons_animator);
        var18.setBackgroundResource(R.drawable.variant_buttons_animator);
        var19.setBackgroundResource(R.drawable.variant_buttons_animator);
        var20.setBackgroundResource(R.drawable.variant_buttons_animator);
        var21.setBackgroundResource(R.drawable.variant_buttons_animator);
        var22.setBackgroundResource(R.drawable.variant_buttons_animator);
        var23.setBackgroundResource(R.drawable.variant_buttons_animator);
        var24.setBackgroundResource(R.drawable.variant_buttons_animator);
        var25.setBackgroundResource(R.drawable.variant_buttons_animator);
        var26.setBackgroundResource(R.drawable.variant_buttons_animator);
        var27.setBackgroundResource(R.drawable.variant_buttons_animator);
        var28.setBackgroundResource(R.drawable.variant_buttons_animator);
        var29.setBackgroundResource(R.drawable.variant_buttons_animator);
        var30.setBackgroundResource(R.drawable.variant_buttons_animator);
        var31.setBackgroundResource(R.drawable.variant_buttons_animator);
        var32.setBackgroundResource(R.drawable.variant_buttons_animator);
        var33.setBackgroundResource(R.drawable.variant_buttons_animator);
        var34.setBackgroundResource(R.drawable.variant_buttons_animator);
        var35.setBackgroundResource(R.drawable.variant_buttons_animator);
        var36.setBackgroundResource(R.drawable.variant_buttons_animator);
        var37.setBackgroundResource(R.drawable.variant_buttons_animator);
        var38.setBackgroundResource(R.drawable.variant_buttons_animator);
        var39.setBackgroundResource(R.drawable.variant_buttons_animator);
        var40.setBackgroundResource(R.drawable.variant_buttons_animator);
        var41.setBackgroundResource(R.drawable.variant_buttons_animator);
        var42.setBackgroundResource(R.drawable.variant_buttons_animator);
        var43.setBackgroundResource(R.drawable.variant_buttons_animator);
        var44.setBackgroundResource(R.drawable.variant_buttons_animator);
        var45.setBackgroundResource(R.drawable.variant_buttons_animator);
        var46.setBackgroundResource(R.drawable.variant_buttons_animator);
        var47.setBackgroundResource(R.drawable.variant_buttons_animator);
        var48.setBackgroundResource(R.drawable.variant_buttons_animator);
    }
    //ScrollView scrollvariants=findViewById(R.id.ScrollVariants);
    public void left(){
        SharedPreferences variantlayout=getSharedPreferences("variantlayout",Context.MODE_PRIVATE);
        String varlaystring=variantlayout.getString("layout","");
        SharedPreferences.Editor shareeditor=variantlayout.edit();

        if (varlaystring.equals("normal")){
            //RadioButton radiobutvar1=findViewById(R.id.radioeasy);
            //radiobutvar1.setChecked(true);
            shareeditor.putString("layout","easy");
            shareeditor.apply();
            easylay();
        }else
            if (varlaystring.equals("hard")){
            RadioButton radiobutvar2=findViewById(R.id.radionorm);
            radiobutvar2.setChecked(true);
            shareeditor.putString("layout","normal");
            shareeditor.apply();
            normlay();
        }else
            if (varlaystring.equals("realhard")){
            RadioButton radiobutvar3=findViewById(R.id.radiohard);
            radiobutvar3.setChecked(true);
            shareeditor.putString("layout","hard");
            shareeditor.apply();
            hardlay();
        }else
            if (varlaystring.equals("easy")){

            }

        //TextView tex=findViewById(R.id.tex12);
        //tex.setText("leftyoohooo!!!");
    }
    public void right(){
        SharedPreferences variantlayout=getSharedPreferences("variantlayout",Context.MODE_PRIVATE);
        String varlaystring=variantlayout.getString("layout","");
        SharedPreferences.Editor shareeditor=variantlayout.edit();

        if (varlaystring.equals("easy")||varlaystring.equals("")){
            RadioButton radiobutvar2=findViewById(R.id.radionorm);
            radiobutvar2.setChecked(true);
            shareeditor.putString("layout","normal");
            shareeditor.apply();
            normlay();
        }else if (varlaystring.equals("normal")){
            RadioButton radiobutvar3=findViewById(R.id.radiohard);
            radiobutvar3.setChecked(true);
            shareeditor.putString("layout","hard");
            shareeditor.apply();
            hardlay();
        }else if (varlaystring.equals("hard")){
            RadioButton radiobutvar4=findViewById(R.id.radiorealhard);
            radiobutvar4.setChecked(true);
            shareeditor.putString("layout","realhard");
            shareeditor.apply();
            realhardlay();
        }else if (varlaystring.equals("realhard")){

        }


        //TextView tex=findViewById(R.id.tex12);
        //tex.setText("rightboohooo!!!");
    }

    public void easylay(){
        ConstraintLayout layout =  findViewById(R.id.pregame);
        ConstraintSet setcons= new ConstraintSet();
        setcons.clone(this,R.layout.activity_pre_game);
        TransitionManager.beginDelayedTransition(layout);
        setcons.applyTo(layout);
        RadioButton radiobutvar1=findViewById(R.id.radioeasy);
        radiobutvar1.setChecked(true);
        easyv();
        ScrollView scrollvariants=findViewById(R.id.ScrollVariants);
        scrollvariants.scrollTo(0,0);
        scrollvariants.smoothScrollBy(0,0);
        //scrollvariants.setSmoothScrollingEnabled(false);
        //scrollvariants.setScrollX(0);
        //scrollvariants.setVerticalScrollbarPosition(0);

    }
    public void normlay(){
        ConstraintLayout layout =  findViewById(R.id.pregame);
        ConstraintSet setcons= new ConstraintSet();
        setcons.clone(this,R.layout.activity_pre_game_normal);
        TransitionManager.beginDelayedTransition(layout);
        setcons.applyTo(layout);
        RadioButton radiobutvar2=findViewById(R.id.radionorm);
        radiobutvar2.setChecked(true);
        normv();
    }
    public void hardlay(){
        ConstraintLayout layout =  findViewById(R.id.pregame);
        ConstraintSet setcons= new ConstraintSet();
        setcons.clone(this,R.layout.activity_pre_game_hard);
        TransitionManager.beginDelayedTransition(layout);
        setcons.applyTo(layout);
        RadioButton radiobutvar3=findViewById(R.id.radiohard);
        radiobutvar3.setChecked(true);
        hardv();
        ScrollView scrollvariants=findViewById(R.id.ScrollVariants);
        scrollvariants.scrollTo(0,0);
        scrollvariants.smoothScrollBy(0,0);
        //scrollvariants.setScrollX(0);
        //scrollvariants.setVerticalScrollbarPosition(0);

    }
    public void realhardlay(){
        ConstraintLayout layout =  findViewById(R.id.pregame);
        ConstraintSet setcons= new ConstraintSet();
        setcons.clone(this,R.layout.activity_pre_game_real_hard);
        TransitionManager.beginDelayedTransition(layout);
        setcons.applyTo(layout);
        RadioButton radiobutvar4=findViewById(R.id.radiorealhard);
        radiobutvar4.setChecked(true);
        realhardv();
        ScrollView scrollvariants=findViewById(R.id.ScrollVariants);
        scrollvariants.scrollTo(0,0);
        scrollvariants.smoothScrollBy(0,0);
        //scrollvariants.setScrollX(0);
        //scrollvariants.setVerticalScrollbarPosition(0);
    }


    public void radiovariantschanger(View view){
        //TextView test=findViewById(R.id.testtextview123);
        //test.setText("activated");

        SharedPreferences variantlayout=getSharedPreferences("variantlayout",Context.MODE_PRIVATE);
        //ConstraintLayout layout =  findViewById(R.id.pregame);
        //ConstraintSet setcons= new ConstraintSet();
        SharedPreferences.Editor shareeditor=variantlayout.edit();

        //boolean check=((RadioButton) view).isChecked();
        switch (view.getId()){
            case R.id.radioeasy:

                    shareeditor.putString("layout", "easy");
                    shareeditor.apply();
                    //RadioButton radiobutvar1=findViewById(R.id.radioeasy);
                    //radiobutvar1.setChecked(true);
                    easylay();
                //test.setText("activated1");
                break;
            case R.id.radionorm:

                    shareeditor.putString("layout", "normal");
                    shareeditor.apply();
                    //RadioButton radiobutvar2=findViewById(R.id.radionorm);
                    //radiobutvar2.setChecked(true);
                    normlay();
                //test.setText("activated2");
                break;
            case R.id.radiohard:

                    shareeditor.putString("layout", "hard");
                    shareeditor.apply();
                    //RadioButton radiobutvar3=findViewById(R.id.radiohard);
                    //radiobutvar3.setChecked(true);
                    hardlay();
                //test.setText("activated3");
                break;
            case R.id.radiorealhard:

                    shareeditor.putString("layout", "realhard");
                    shareeditor.apply();
                    //RadioButton radiobutvar4=findViewById(R.id.radiorealhard);
                    //radiobutvar4.setChecked(true);
                    realhardlay();
                //test.setText("activated4");
                break;
        }


    }
    public void easyv(){



        normalvariantbuttons();

        var1.setVisibility(View.VISIBLE);
        var2.setVisibility(View.VISIBLE);
        var3.setVisibility(View.VISIBLE);
        var4.setVisibility(View.VISIBLE);
        var5.setVisibility(View.VISIBLE);
        var6.setVisibility(View.VISIBLE);
        var7.setVisibility(View.VISIBLE);
        var8.setVisibility(View.VISIBLE);
        var9.setVisibility(View.INVISIBLE);
        var10.setVisibility(View.INVISIBLE);
        var11.setVisibility(View.INVISIBLE);
        var12.setVisibility(View.INVISIBLE);
        var13.setVisibility(View.INVISIBLE);
        var14.setVisibility(View.INVISIBLE);
        var15.setVisibility(View.INVISIBLE);
        var16.setVisibility(View.INVISIBLE);
        var17.setVisibility(View.INVISIBLE);
        var18.setVisibility(View.INVISIBLE);
        var19.setVisibility(View.INVISIBLE);
        var20.setVisibility(View.INVISIBLE);
        var21.setVisibility(View.INVISIBLE);
        var22.setVisibility(View.INVISIBLE);
        var23.setVisibility(View.INVISIBLE);
        var24.setVisibility(View.INVISIBLE);
        var25.setVisibility(View.INVISIBLE);
        var26.setVisibility(View.INVISIBLE);
        var27.setVisibility(View.INVISIBLE);
        var28.setVisibility(View.INVISIBLE);
        var29.setVisibility(View.INVISIBLE);
        var30.setVisibility(View.INVISIBLE);
        var31.setVisibility(View.INVISIBLE);
        var32.setVisibility(View.INVISIBLE);
        var33.setVisibility(View.INVISIBLE);
        var34.setVisibility(View.INVISIBLE);
        var35.setVisibility(View.INVISIBLE);
        var36.setVisibility(View.INVISIBLE);
        var37.setVisibility(View.INVISIBLE);
        var38.setVisibility(View.INVISIBLE);
        var39.setVisibility(View.INVISIBLE);
        var40.setVisibility(View.INVISIBLE);
        var41.setVisibility(View.INVISIBLE);
        var42.setVisibility(View.INVISIBLE);
        var43.setVisibility(View.INVISIBLE);
        var44.setVisibility(View.INVISIBLE);
        var45.setVisibility(View.INVISIBLE);
        var46.setVisibility(View.INVISIBLE);
        var47.setVisibility(View.INVISIBLE);
        var48.setVisibility(View.INVISIBLE);
        doneeasy();

    }
    public void normv(){


        normalvariantbuttons();

        var1.setVisibility(View.VISIBLE);
        var2.setVisibility(View.VISIBLE);
        var3.setVisibility(View.VISIBLE);
        var4.setVisibility(View.VISIBLE);
        var5.setVisibility(View.VISIBLE);
        var6.setVisibility(View.VISIBLE);
        var7.setVisibility(View.VISIBLE);
        var8.setVisibility(View.VISIBLE);
        var9.setVisibility(View.VISIBLE);
        var10.setVisibility(View.VISIBLE);
        var11.setVisibility(View.VISIBLE);
        var12.setVisibility(View.VISIBLE);
        var13.setVisibility(View.VISIBLE);
        var14.setVisibility(View.VISIBLE);
        var15.setVisibility(View.VISIBLE);
        var16.setVisibility(View.VISIBLE);
        var17.setVisibility(View.VISIBLE);
        var18.setVisibility(View.VISIBLE);
        var19.setVisibility(View.VISIBLE);
        var20.setVisibility(View.VISIBLE);
        var21.setVisibility(View.VISIBLE);
        var22.setVisibility(View.VISIBLE);
        var23.setVisibility(View.VISIBLE);
        var24.setVisibility(View.VISIBLE);
        var25.setVisibility(View.VISIBLE);
        var26.setVisibility(View.VISIBLE);
        var27.setVisibility(View.VISIBLE);
        var28.setVisibility(View.VISIBLE);
        var29.setVisibility(View.VISIBLE);
        var30.setVisibility(View.VISIBLE);
        var31.setVisibility(View.VISIBLE);
        var32.setVisibility(View.VISIBLE);
        var33.setVisibility(View.VISIBLE);
        var34.setVisibility(View.VISIBLE);
        var35.setVisibility(View.VISIBLE);
        var36.setVisibility(View.VISIBLE);
        var37.setVisibility(View.VISIBLE);
        var38.setVisibility(View.VISIBLE);
        var39.setVisibility(View.VISIBLE);
        var40.setVisibility(View.VISIBLE);
        var41.setVisibility(View.VISIBLE);
        var42.setVisibility(View.VISIBLE);
        var43.setVisibility(View.VISIBLE);
        var44.setVisibility(View.VISIBLE);
        var45.setVisibility(View.VISIBLE);
        var46.setVisibility(View.VISIBLE);
        var47.setVisibility(View.VISIBLE);
        var48.setVisibility(View.VISIBLE);
        donenotsoeasy();
    }
    public void hardv(){


        normalvariantbuttons();

        var1.setVisibility(View.VISIBLE);
        var2.setVisibility(View.VISIBLE);
        var3.setVisibility(View.VISIBLE);
        var4.setVisibility(View.VISIBLE);
        var5.setVisibility(View.VISIBLE);
        var6.setVisibility(View.VISIBLE);
        var7.setVisibility(View.VISIBLE);
        var8.setVisibility(View.VISIBLE);
        var9.setVisibility(View.VISIBLE);
        var10.setVisibility(View.VISIBLE);
        var11.setVisibility(View.VISIBLE);
        var12.setVisibility(View.VISIBLE);
        var13.setVisibility(View.VISIBLE);
        var14.setVisibility(View.VISIBLE);
        var15.setVisibility(View.VISIBLE);
        var16.setVisibility(View.VISIBLE);
        var17.setVisibility(View.VISIBLE);
        var18.setVisibility(View.VISIBLE);
        var19.setVisibility(View.VISIBLE);
        var20.setVisibility(View.VISIBLE);
        var21.setVisibility(View.VISIBLE);
        var22.setVisibility(View.VISIBLE);
        var23.setVisibility(View.VISIBLE);
        var24.setVisibility(View.VISIBLE);
        var25.setVisibility(View.VISIBLE);
        var26.setVisibility(View.VISIBLE);
        var27.setVisibility(View.VISIBLE);
        var28.setVisibility(View.VISIBLE);
        var29.setVisibility(View.VISIBLE);
        var30.setVisibility(View.VISIBLE);
        var31.setVisibility(View.VISIBLE);
        var32.setVisibility(View.VISIBLE);
        var33.setVisibility(View.VISIBLE);
        var34.setVisibility(View.VISIBLE);
        var35.setVisibility(View.VISIBLE);
        var36.setVisibility(View.VISIBLE);
        var37.setVisibility(View.VISIBLE);
        var38.setVisibility(View.VISIBLE);
        var39.setVisibility(View.VISIBLE);
        var40.setVisibility(View.VISIBLE);
        var41.setVisibility(View.VISIBLE);
        var42.setVisibility(View.VISIBLE);
        var43.setVisibility(View.VISIBLE);
        var44.setVisibility(View.VISIBLE);
        var45.setVisibility(View.VISIBLE);
        var46.setVisibility(View.VISIBLE);
        var47.setVisibility(View.VISIBLE);
        var48.setVisibility(View.VISIBLE);
        donenormal();

    }
    public void realhardv(){


        normalvariantbuttons();

        var1.setVisibility(View.VISIBLE);
        var2.setVisibility(View.VISIBLE);
        var3.setVisibility(View.VISIBLE);
        var4.setVisibility(View.VISIBLE);
        var5.setVisibility(View.VISIBLE);
        var6.setVisibility(View.VISIBLE);
        var7.setVisibility(View.VISIBLE);
        var8.setVisibility(View.VISIBLE);
        var9.setVisibility(View.VISIBLE);
        var10.setVisibility(View.VISIBLE);
        var11.setVisibility(View.VISIBLE);
        var12.setVisibility(View.VISIBLE);
        var13.setVisibility(View.VISIBLE);
        var14.setVisibility(View.VISIBLE);
        var15.setVisibility(View.VISIBLE);
        var16.setVisibility(View.VISIBLE);
        var17.setVisibility(View.VISIBLE);
        var18.setVisibility(View.VISIBLE);
        var19.setVisibility(View.VISIBLE);
        var20.setVisibility(View.VISIBLE);
        var21.setVisibility(View.VISIBLE);
        var22.setVisibility(View.VISIBLE);
        var23.setVisibility(View.VISIBLE);
        var24.setVisibility(View.VISIBLE);
        var25.setVisibility(View.VISIBLE);
        var26.setVisibility(View.VISIBLE);
        var27.setVisibility(View.VISIBLE);
        var28.setVisibility(View.VISIBLE);
        var29.setVisibility(View.VISIBLE);
        var30.setVisibility(View.VISIBLE);
        var31.setVisibility(View.VISIBLE);
        var32.setVisibility(View.VISIBLE);
        var33.setVisibility(View.VISIBLE);
        var34.setVisibility(View.VISIBLE);
        var35.setVisibility(View.VISIBLE);
        var36.setVisibility(View.VISIBLE);
        var37.setVisibility(View.VISIBLE);
        var38.setVisibility(View.VISIBLE);
        var39.setVisibility(View.VISIBLE);
        var40.setVisibility(View.VISIBLE);
        var41.setVisibility(View.VISIBLE);
        var42.setVisibility(View.VISIBLE);
        var43.setVisibility(View.VISIBLE);
        var44.setVisibility(View.VISIBLE);
        var45.setVisibility(View.VISIBLE);
        var46.setVisibility(View.VISIBLE);
        var47.setVisibility(View.VISIBLE);
        var48.setVisibility(View.VISIBLE);
        donehard();

    }

    public void variant(View view){

        Intent intentgame=new Intent(this,GameActivity.class);
        int variantint=view.getId();
        SharedPreferences newgame=getSharedPreferences("NewGame",Context.MODE_PRIVATE);
        SharedPreferences.Editor newgameeditor=newgame.edit();
        newgameeditor.putString("New","Yes");
        newgameeditor.apply();
        SharedPreferences sharesavegame=getSharedPreferences("SaveGame", Context.MODE_PRIVATE);
        SharedPreferences.Editor shareeditor=sharesavegame.edit();
        shareeditor.putString("Save","1");
        shareeditor.apply();

        RadioGroup radio=findViewById(R.id.radiovariants);
        int difficulty=radio.getCheckedRadioButtonId();
        //ScrollView scrollvariants=findViewById(R.id.ScrollVariants);
        if (difficulty==R.id.radioeasy) {
            Easyint=1;
            //scrollvariants.setVerticalScrollBarEnabled(false);
            //scrollvariants.setHorizontalScrollBarEnabled(false);
            switch (variantint) {

                case R.id.var1:
                    intentgame.putExtra("variant", "1");
                    startActivity(intentgame);
                    break;
                case R.id.var2:
                    intentgame.putExtra("variant", "2");
                    startActivity(intentgame);
                    break;
                case R.id.var3:
                    intentgame.putExtra("variant", "3");
                    //intentgame.putExtra("newgame","1");
                    startActivity(intentgame);
                    break;
                case R.id.var4:
                    intentgame.putExtra("variant", "4");
                    //intentgame.putExtra("newgame","1");
                    startActivity(intentgame);
                    break;
                case R.id.var5:
                    intentgame.putExtra("variant", "5");
                    //intentgame.putExtra("newgame","1");
                    startActivity(intentgame);
                    break;
                case R.id.var6:
                    intentgame.putExtra("variant", "6");
                    //intentgame.putExtra("newgame","1");
                    startActivity(intentgame);
                    break;
                case R.id.var7:
                    intentgame.putExtra("variant", "7");
                    //intentgame.putExtra("newgame","1");
                    startActivity(intentgame);
                    break;
                case R.id.var8:
                    intentgame.putExtra("variant", "8");
                    //intentgame.putExtra("newgame","1");
                    startActivity(intentgame);
                    break;
            }
        }
        if (difficulty==R.id.radionorm){
            Easyint=0;

            switch (variantint) {
                    case R.id.var1:

                        intentgame.putExtra("variant", "11");
                        //intentgame.putExtra("newgame","1");
                        startActivity(intentgame);
                        break;
                    case R.id.var2:
                        intentgame.putExtra("variant", "12");
                        //intentgame.putExtra("newgame","1");
                        startActivity(intentgame);
                        break;
                    case R.id.var3:
                        intentgame.putExtra("variant", "13");
                        //intentgame.putExtra("newgame","1");
                        startActivity(intentgame);
                        break;
                    case R.id.var4:
                        intentgame.putExtra("variant", "14");
                        //intentgame.putExtra("newgame","1");
                        startActivity(intentgame);
                        break;
                    case R.id.var5:
                        intentgame.putExtra("variant", "15");
                        //intentgame.putExtra("newgame","1");
                        startActivity(intentgame);
                        break;
                    case R.id.var6:
                        intentgame.putExtra("variant", "16");
                        //intentgame.putExtra("newgame","1");
                        startActivity(intentgame);
                        break;
                    case R.id.var7:
                        intentgame.putExtra("variant", "17");
                        //intentgame.putExtra("newgame","1");
                        startActivity(intentgame);
                        break;
                    case R.id.var8:
                        intentgame.putExtra("variant", "18");
                        //intentgame.putExtra("newgame","1");
                        startActivity(intentgame);
                        break;
                    case R.id.var9:

                        intentgame.putExtra("variant", "19");
                        startActivity(intentgame);
                        break;
                    case R.id.var10:
                        intentgame.putExtra("variant", "20");
                        startActivity(intentgame);
                        break;
                    case R.id.var11:
                        intentgame.putExtra("variant", "21");
                        startActivity(intentgame);
                        break;
                    case R.id.var12:
                        intentgame.putExtra("variant", "22");
                        startActivity(intentgame);
                        break;
                    case R.id.var13:
                        intentgame.putExtra("variant", "23");
                        startActivity(intentgame);
                        break;
                    case R.id.var14:
                        intentgame.putExtra("variant", "24");
                        startActivity(intentgame);
                        break;
                    case R.id.var15:
                        intentgame.putExtra("variant", "25");
                        startActivity(intentgame);
                        break;
                    case R.id.var16:
                        intentgame.putExtra("variant", "26");
                        startActivity(intentgame);
                        break;
                    case R.id.var17:
                        intentgame.putExtra("variant", "27");
                        startActivity(intentgame);
                        break;
                    case R.id.var18:
                        intentgame.putExtra("variant", "28");
                        startActivity(intentgame);
                        break;
                    case R.id.var19:
                        intentgame.putExtra("variant", "29");
                        startActivity(intentgame);
                        break;
                    case R.id.var20:
                        intentgame.putExtra("variant", "30");
                        startActivity(intentgame);
                        break;
                    case R.id.var21:
                        intentgame.putExtra("variant", "31");
                        startActivity(intentgame);
                        break;
                    case R.id.var22:
                        intentgame.putExtra("variant", "32");
                        startActivity(intentgame);
                        break;
                    case R.id.var23:
                        intentgame.putExtra("variant", "33");
                        startActivity(intentgame);
                        break;
                    case R.id.var24:
                        intentgame.putExtra("variant", "34");
                        startActivity(intentgame);
                        break;
                    case R.id.var25:
                        intentgame.putExtra("variant", "35");
                        startActivity(intentgame);
                        break;
                    case R.id.var26:
                        intentgame.putExtra("variant", "36");
                        startActivity(intentgame);
                        break;
                    case R.id.var27:
                        intentgame.putExtra("variant", "37");
                        startActivity(intentgame);
                        break;
                    case R.id.var28:
                        intentgame.putExtra("variant", "38");
                        startActivity(intentgame);
                        break;
                    case R.id.var29:
                        intentgame.putExtra("variant", "39");
                        startActivity(intentgame);
                        break;
                    case R.id.var30:
                        intentgame.putExtra("variant", "40");
                        startActivity(intentgame);
                        break;
                    case R.id.var31:
                        intentgame.putExtra("variant", "41");
                        startActivity(intentgame);
                        break;
                    case R.id.var32:
                        intentgame.putExtra("variant", "42");
                        startActivity(intentgame);
                        break;
                    case R.id.var33:
                        intentgame.putExtra("variant", "43");
                        startActivity(intentgame);
                        break;
                    case R.id.var34:
                        intentgame.putExtra("variant", "44");
                        startActivity(intentgame);
                        break;
                    case R.id.var35:
                        intentgame.putExtra("variant", "45");
                        startActivity(intentgame);
                        break;
                    case R.id.var36:
                        intentgame.putExtra("variant", "46");
                        startActivity(intentgame);
                        break;
                    case R.id.var37:
                        intentgame.putExtra("variant", "47");
                        startActivity(intentgame);
                        break;
                    case R.id.var38:
                        intentgame.putExtra("variant", "48");
                        startActivity(intentgame);
                        break;
                    case R.id.var39:
                        intentgame.putExtra("variant", "49");
                        startActivity(intentgame);
                        break;
                    case R.id.var40:
                        intentgame.putExtra("variant", "50");
                        startActivity(intentgame);
                        break;
                    case R.id.var41:
                        intentgame.putExtra("variant", "51");
                        startActivity(intentgame);
                        break;
                    case R.id.var42:
                        intentgame.putExtra("variant", "52");
                        startActivity(intentgame);
                        break;
                    case R.id.var43:
                        intentgame.putExtra("variant", "53");
                        startActivity(intentgame);
                        break;
                    case R.id.var44:
                        intentgame.putExtra("variant", "54");
                        startActivity(intentgame);
                        break;
                    case R.id.var45:
                        intentgame.putExtra("variant", "55");
                        startActivity(intentgame);
                        break;
                    case R.id.var46:
                        intentgame.putExtra("variant", "56");
                        startActivity(intentgame);
                        break;
                    case R.id.var47:
                        intentgame.putExtra("variant", "57");
                        startActivity(intentgame);
                        break;
                    case R.id.var48:
                        intentgame.putExtra("variant", "58");
                        startActivity(intentgame);
                        break;

                }
        }

        if (difficulty==R.id.radiohard){
            Easyint=0;
            switch (variantint) {
                case R.id.var1:

                    intentgame.putExtra("variant", "501");
                    //intentgame.putExtra("newgame","1");
                    startActivity(intentgame);
                    break;
                case R.id.var2:
                    intentgame.putExtra("variant", "502");
                    //intentgame.putExtra("newgame","1");
                    startActivity(intentgame);
                    break;
                case R.id.var3:
                    intentgame.putExtra("variant", "503");
                    //intentgame.putExtra("newgame","1");
                    startActivity(intentgame);
                    break;
                case R.id.var4:
                    intentgame.putExtra("variant", "504");
                    //intentgame.putExtra("newgame","1");
                    startActivity(intentgame);
                    break;
                case R.id.var5:
                    intentgame.putExtra("variant", "505");
                    //intentgame.putExtra("newgame","1");
                    startActivity(intentgame);
                    break;
                case R.id.var6:
                    intentgame.putExtra("variant", "506");
                    //intentgame.putExtra("newgame","1");
                    startActivity(intentgame);
                    break;
                case R.id.var7:
                    intentgame.putExtra("variant", "507");
                    //intentgame.putExtra("newgame","1");
                    startActivity(intentgame);
                    break;
                case R.id.var8:
                    intentgame.putExtra("variant", "508");
                    //intentgame.putExtra("newgame","1");
                    startActivity(intentgame);
                    break;
                case R.id.var9:

                    intentgame.putExtra("variant", "509");
                    startActivity(intentgame);
                    break;
                case R.id.var10:
                    intentgame.putExtra("variant", "510");
                    startActivity(intentgame);
                    break;
                case R.id.var11:
                    intentgame.putExtra("variant", "511");
                    startActivity(intentgame);
                    break;
                case R.id.var12:
                    intentgame.putExtra("variant", "512");
                    startActivity(intentgame);
                    break;
                case R.id.var13:
                    intentgame.putExtra("variant", "513");
                    startActivity(intentgame);
                    break;
                case R.id.var14:
                    intentgame.putExtra("variant", "514");
                    startActivity(intentgame);
                    break;
                case R.id.var15:
                    intentgame.putExtra("variant", "515");
                    startActivity(intentgame);
                    break;
                case R.id.var16:
                    intentgame.putExtra("variant", "516");
                    startActivity(intentgame);
                    break;
                case R.id.var17:
                    intentgame.putExtra("variant", "517");
                    startActivity(intentgame);
                    break;
                case R.id.var18:
                    intentgame.putExtra("variant", "518");
                    startActivity(intentgame);
                    break;
                case R.id.var19:
                    intentgame.putExtra("variant", "519");
                    startActivity(intentgame);
                    break;
                case R.id.var20:
                    intentgame.putExtra("variant", "520");
                    startActivity(intentgame);
                    break;
                case R.id.var21:
                    intentgame.putExtra("variant", "521");
                    startActivity(intentgame);
                    break;
                case R.id.var22:
                    intentgame.putExtra("variant", "522");
                    startActivity(intentgame);
                    break;
                case R.id.var23:
                    intentgame.putExtra("variant", "523");
                    startActivity(intentgame);
                    break;
                case R.id.var24:
                    intentgame.putExtra("variant", "524");
                    startActivity(intentgame);
                    break;
                case R.id.var25:
                    intentgame.putExtra("variant", "525");
                    startActivity(intentgame);
                    break;
                case R.id.var26:
                    intentgame.putExtra("variant", "526");
                    startActivity(intentgame);
                    break;
                case R.id.var27:
                    intentgame.putExtra("variant", "527");
                    startActivity(intentgame);
                    break;
                case R.id.var28:
                    intentgame.putExtra("variant", "528");
                    startActivity(intentgame);
                    break;
                case R.id.var29:
                    intentgame.putExtra("variant", "529");
                    startActivity(intentgame);
                    break;
                case R.id.var30:
                    intentgame.putExtra("variant", "530");
                    startActivity(intentgame);
                    break;
                case R.id.var31:
                    intentgame.putExtra("variant", "531");
                    startActivity(intentgame);
                    break;
                case R.id.var32:
                    intentgame.putExtra("variant", "532");
                    startActivity(intentgame);
                    break;
                case R.id.var33:
                    intentgame.putExtra("variant", "533");
                    startActivity(intentgame);
                    break;
                case R.id.var34:
                    intentgame.putExtra("variant", "534");
                    startActivity(intentgame);
                    break;
                case R.id.var35:
                    intentgame.putExtra("variant", "535");
                    startActivity(intentgame);
                    break;
                case R.id.var36:
                    intentgame.putExtra("variant", "536");
                    startActivity(intentgame);
                    break;
                case R.id.var37:
                    intentgame.putExtra("variant", "537");
                    startActivity(intentgame);
                    break;
                case R.id.var38:
                    intentgame.putExtra("variant", "538");
                    startActivity(intentgame);
                    break;
                case R.id.var39:
                    intentgame.putExtra("variant", "539");
                    startActivity(intentgame);
                    break;
                case R.id.var40:
                    intentgame.putExtra("variant", "540");
                    startActivity(intentgame);
                    break;
                case R.id.var41:
                    intentgame.putExtra("variant", "541");
                    startActivity(intentgame);
                    break;
                case R.id.var42:
                    intentgame.putExtra("variant", "542");
                    startActivity(intentgame);
                    break;
                case R.id.var43:
                    intentgame.putExtra("variant", "543");
                    startActivity(intentgame);
                    break;
                case R.id.var44:
                    intentgame.putExtra("variant", "544");
                    startActivity(intentgame);
                    break;
                case R.id.var45:
                    intentgame.putExtra("variant", "545");
                    startActivity(intentgame);
                    break;
                case R.id.var46:
                    intentgame.putExtra("variant", "546");
                    startActivity(intentgame);
                    break;
                case R.id.var47:
                    intentgame.putExtra("variant", "547");
                    startActivity(intentgame);
                    break;
                case R.id.var48:
                    intentgame.putExtra("variant", "548");
                    startActivity(intentgame);
                    break;

            }
        }
        if (difficulty==R.id.radiorealhard){
            Easyint=0;
            switch (variantint) {
                case R.id.var1:

                    intentgame.putExtra("variant", "1001");
                    //intentgame.putExtra("newgame","1");
                    startActivity(intentgame);
                    break;
                case R.id.var2:
                    intentgame.putExtra("variant", "1002");
                    //intentgame.putExtra("newgame","1");
                    startActivity(intentgame);
                    break;
                case R.id.var3:
                    intentgame.putExtra("variant", "1003");
                    //intentgame.putExtra("newgame","1");
                    startActivity(intentgame);
                    break;
                case R.id.var4:
                    intentgame.putExtra("variant", "1004");
                    //intentgame.putExtra("newgame","1");
                    startActivity(intentgame);
                    break;
                case R.id.var5:
                    intentgame.putExtra("variant", "1005");
                    //intentgame.putExtra("newgame","1");
                    startActivity(intentgame);
                    break;
                case R.id.var6:
                    intentgame.putExtra("variant", "1006");
                    //intentgame.putExtra("newgame","1");
                    startActivity(intentgame);
                    break;
                case R.id.var7:
                    intentgame.putExtra("variant", "1007");
                    //intentgame.putExtra("newgame","1");
                    startActivity(intentgame);
                    break;
                case R.id.var8:
                    intentgame.putExtra("variant", "1008");
                    //intentgame.putExtra("newgame","1");
                    startActivity(intentgame);
                    break;
                case R.id.var9:

                    intentgame.putExtra("variant", "1009");
                    startActivity(intentgame);
                    break;
                case R.id.var10:
                    intentgame.putExtra("variant", "1010");
                    startActivity(intentgame);
                    break;
                case R.id.var11:
                    intentgame.putExtra("variant", "1011");
                    startActivity(intentgame);
                    break;
                case R.id.var12:
                    intentgame.putExtra("variant", "1012");
                    startActivity(intentgame);
                    break;
                case R.id.var13:
                    intentgame.putExtra("variant", "1013");
                    startActivity(intentgame);
                    break;
                case R.id.var14:
                    intentgame.putExtra("variant", "1014");
                    startActivity(intentgame);
                    break;
                case R.id.var15:
                    intentgame.putExtra("variant", "1015");
                    startActivity(intentgame);
                    break;
                case R.id.var16:
                    intentgame.putExtra("variant", "1016");
                    startActivity(intentgame);
                    break;
                case R.id.var17:
                    intentgame.putExtra("variant", "1017");
                    startActivity(intentgame);
                    break;
                case R.id.var18:
                    intentgame.putExtra("variant", "1018");
                    startActivity(intentgame);
                    break;
                case R.id.var19:
                    intentgame.putExtra("variant", "1019");
                    startActivity(intentgame);
                    break;
                case R.id.var20:
                    intentgame.putExtra("variant", "1020");
                    startActivity(intentgame);
                    break;
                case R.id.var21:
                    intentgame.putExtra("variant", "1021");
                    startActivity(intentgame);
                    break;
                case R.id.var22:
                    intentgame.putExtra("variant", "1022");
                    startActivity(intentgame);
                    break;
                case R.id.var23:
                    intentgame.putExtra("variant", "1023");
                    startActivity(intentgame);
                    break;
                case R.id.var24:
                    intentgame.putExtra("variant", "1024");
                    startActivity(intentgame);
                    break;
                case R.id.var25:
                    intentgame.putExtra("variant", "1025");
                    startActivity(intentgame);
                    break;
                case R.id.var26:
                    intentgame.putExtra("variant", "1026");
                    startActivity(intentgame);
                    break;
                case R.id.var27:
                    intentgame.putExtra("variant", "1027");
                    startActivity(intentgame);
                    break;
                case R.id.var28:
                    intentgame.putExtra("variant", "1028");
                    startActivity(intentgame);
                    break;
                case R.id.var29:
                    intentgame.putExtra("variant", "1029");
                    startActivity(intentgame);
                    break;
                case R.id.var30:
                    intentgame.putExtra("variant", "1030");
                    startActivity(intentgame);
                    break;
                case R.id.var31:
                    intentgame.putExtra("variant", "1031");
                    startActivity(intentgame);
                    break;
                case R.id.var32:
                    intentgame.putExtra("variant", "1032");
                    startActivity(intentgame);
                    break;
                case R.id.var33:
                    intentgame.putExtra("variant", "1033");
                    startActivity(intentgame);
                    break;
                case R.id.var34:
                    intentgame.putExtra("variant", "1034");
                    startActivity(intentgame);
                    break;
                case R.id.var35:
                    intentgame.putExtra("variant", "1035");
                    startActivity(intentgame);
                    break;
                case R.id.var36:
                    intentgame.putExtra("variant", "1036");
                    startActivity(intentgame);
                    break;
                case R.id.var37:
                    intentgame.putExtra("variant", "1037");
                    startActivity(intentgame);
                    break;
                case R.id.var38:
                    intentgame.putExtra("variant", "1038");
                    startActivity(intentgame);
                    break;
                case R.id.var39:
                    intentgame.putExtra("variant", "1039");
                    startActivity(intentgame);
                    break;
                case R.id.var40:
                    intentgame.putExtra("variant", "1040");
                    startActivity(intentgame);
                    break;
                case R.id.var41:
                    intentgame.putExtra("variant", "1041");
                    startActivity(intentgame);
                    break;
                case R.id.var42:
                    intentgame.putExtra("variant", "1042");
                    startActivity(intentgame);
                    break;
                case R.id.var43:
                    intentgame.putExtra("variant", "1043");
                    startActivity(intentgame);
                    break;
                case R.id.var44:
                    intentgame.putExtra("variant", "1044");
                    startActivity(intentgame);
                    break;
                case R.id.var45:
                    intentgame.putExtra("variant", "1045");
                    startActivity(intentgame);
                    break;
                case R.id.var46:
                    intentgame.putExtra("variant", "1046");
                    startActivity(intentgame);
                    break;
                case R.id.var47:
                    intentgame.putExtra("variant", "1047");
                    startActivity(intentgame);
                    break;
                case R.id.var48:
                    intentgame.putExtra("variant", "1048");
                    startActivity(intentgame);
                    break;

            }
        }



        }


    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {

            getWindow().getDecorView().setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                            | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);

        }


    }

    public boolean dispatchTouchEvent(MotionEvent event) {
        super.dispatchTouchEvent(event);
        return gestureDetector.onTouchEvent(event);

    }



    @Override
    public boolean onTouchEvent(MotionEvent event) {
        gestureDetector.onTouchEvent(event);
        return true;
    }

    public class MyGestureListener implements GestureDetector.OnGestureListener {
        private Context context;

        public MyGestureListener(Context context){
            this.context=context;
        }
        @Override
        public boolean onDown(MotionEvent e) {
            return false;
        }

        @Override
        public void onShowPress(MotionEvent motionEvent) {
        }

        @Override
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return false;
        }


        @Override
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
            return false;
        }

        @Override
        public void onLongPress(MotionEvent motionEvent) {

        }

        @Override
        public boolean onFling(MotionEvent  e1, MotionEvent e2, float v, float v1) {

            if (e1.getX()-e2.getX()>150&& e1.getY()-e2.getY()<150&&e2.getY()-e1.getY()<150){
                //Toast.makeText(context,"Right",Toast.LENGTH_SHORT).show();
                right();
                return true;
            }

            if (e2.getX()-e1.getX()>150 && e1.getY()-e2.getY()<150&&e2.getY()-e1.getY()<150){
                left();
                //try {
                //    context.getClass().getDeclaredMethod("left",null);
                //} catch (NoSuchMethodException e) {
                //    e.printStackTrace();
                //}

                //Toast.makeText(context,"Left",Toast.LENGTH_SHORT).show();
                return true;
            }
            return false;

        }




    }

    }


