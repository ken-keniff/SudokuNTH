package com.nothin.keniff.sudokunth;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Environment;
import android.transition.TransitionManager;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.Switch;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class OptionsActivity extends AppCompatActivity {
    String PressedONButton = "";
    SharedPreferences SharedPrefs;
    int idSelected1=0;
    int idSelected2=0;
    int leftint;
    String leftstring;
    private ConstraintLayout cons;


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);

        //
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        int screen_w = size.x;
        int screen_h = size.y;
        String screen_width = Integer.toString(screen_w);
        String screen_height = Integer.toString(screen_h);


        int buttSize = 500;
        if (screen_h > screen_w) {
            buttSize = (screen_w-20) / 9;
        } else if (screen_h <= screen_w) {
            buttSize = (screen_h-20) / 9;
        }


        SharedPreferences shareoptions=getSharedPreferences("Options", Context.MODE_PRIVATE);
        String handstring=shareoptions.getString("handed","");

        Switch hand=findViewById(R.id.switchhand);
        Switch timswitch =findViewById(R.id.timerswitch);
        Switch screen=findViewById(R.id.ScreenOnSwitch);
        Switch lightupsimilarswitch=findViewById(R.id.lightsimilarswitch);
        Switch cancelActionSwitch=findViewById(R.id.cancelActionSwitch);
        Switch redUnitSwitch=findViewById(R.id.redUnitSwitch);
        TextView assist=findViewById(R.id.assistancetext);


        if (handstring.equals("right")||handstring.equals("")){
            hand.setChecked(true);


            ConstraintLayout layout =  findViewById(R.id.activityoptions);
            ConstraintSet setcons= new ConstraintSet();
            setcons.clone(this,R.layout.activity_options);
            TransitionManager.beginDelayedTransition(layout);
            setcons.applyTo(layout);
            hand.setText(R.string.right);
            hand.setLayoutDirection(View.LAYOUT_DIRECTION_LTR);
            screen.setLayoutDirection(View.LAYOUT_DIRECTION_LTR);
            timswitch.setLayoutDirection(View.LAYOUT_DIRECTION_LTR);
            lightupsimilarswitch.setLayoutDirection(View.LAYOUT_DIRECTION_LTR);
            assist.setLayoutDirection(View.LAYOUT_DIRECTION_LTR);
            cancelActionSwitch.setLayoutDirection(View.LAYOUT_DIRECTION_LTR);
            redUnitSwitch.setLayoutDirection(View.LAYOUT_DIRECTION_LTR);
        }
        else if (handstring.equals("left")){
            hand.setChecked(false);


            ConstraintLayout layout =  findViewById(R.id.activityoptions);
            ConstraintSet setcons= new ConstraintSet();
            setcons.clone(this,R.layout.activity_options_left);
            TransitionManager.beginDelayedTransition(layout);
            setcons.applyTo(layout);
            hand.setText(R.string.left);
            hand.setLayoutDirection(View.LAYOUT_DIRECTION_RTL);
            screen.setLayoutDirection(View.LAYOUT_DIRECTION_RTL);
            timswitch.setLayoutDirection(View.LAYOUT_DIRECTION_RTL);
            lightupsimilarswitch.setLayoutDirection(View.LAYOUT_DIRECTION_RTL);
            assist.setLayoutDirection(View.LAYOUT_DIRECTION_RTL);
            cancelActionSwitch.setLayoutDirection(View.LAYOUT_DIRECTION_RTL);
            redUnitSwitch.setLayoutDirection(View.LAYOUT_DIRECTION_RTL);
        }
        String timerstring=shareoptions.getString("timer","");
        Switch timerswitch=findViewById(R.id.timerswitch);
        if (timerstring.equals("yes")){
            timerswitch.setChecked(true);
        }
        else if (timerstring.equals("no")||timerstring.equals("")){
            timerswitch.setChecked(false);

        }
        String screenstring=shareoptions.getString("screen","");
        Switch screenswitch=findViewById(R.id.ScreenOnSwitch);
        if (screenstring.equals("yes")||screenstring.equals("")){
            screenswitch.setChecked(true);
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        }
        else if (screenstring.equals("no")){
            screenswitch.setChecked(false);
            getWindow().clearFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        }
        String lightupsimilarstring=shareoptions.getString("lightsimilar","");
        //Switch lightupsimilarswitch=findViewById(R.id.lightsimilarswitch);
        if (lightupsimilarstring.equals("yes")||lightupsimilarstring.equals("")){
            lightupsimilarswitch.setChecked(true);
        }
        else if (lightupsimilarstring.equals("no")){
            lightupsimilarswitch.setChecked(false);
        }
        String cancelActionString=shareoptions.getString("cancelAction","");
        //Switch cancelActionSwitch=findViewById(R.id.lightsimilarswitch);
        if (cancelActionString.equals("yes")){
            cancelActionSwitch.setChecked(true);
        }
        else if (cancelActionString.equals("no")||cancelActionString.equals("")){
            cancelActionSwitch.setChecked(false);
            redUnitSwitch.setChecked(false);
        }
        String redUnitString=shareoptions.getString("redUnit","");

        if (redUnitString.equals("yes")||redUnitString.equals("")){
            redUnitSwitch.setChecked(true);
        }
        else if (redUnitString.equals("no")){
            redUnitSwitch.setChecked(false);
        }

        //View Oneninebuttons1=findViewById(R.id.OneNineButtons1);



        //Context context=this;
        //ConstraintLayout layout =  findViewById(R.id.OptionsActivity);
        //ConstraintLayout grid=findViewById(R.id.OneNineButtons1);
        //ConstraintSet setconst= new ConstraintSet();

        //GridLayout grid=findViewById(R.id.OneNineButtons1);

        //Switch switchleft =findViewById(R.id.lefthanded);
        //if (leftint==1) {
        //setconst.connect(grid.getId(), ConstraintSet.LEFT, ConstraintSet.PARENT_ID, ConstraintSet.LEFT, 80);
        //setconst.applyTo(layout);
        //    switchleft.setText("Left");
        //}
        //else if (leftint==0){
        //setconst.connect(grid.getId(), ConstraintSet.RIGHT, ConstraintSet.PARENT_ID, ConstraintSet.RIGHT, 80);
        //setconst.applyTo(layout);
        //    switchleft.setText("Right");
        //}

        //if (righthand.isChecked()){
        //    rightint=1;
        //    //super.onRestart();
        //}
        //else if (!righthand.isChecked()){
        //    rightint=0;
        //    righthand.setText("Left");
        //    super.onRestart();
        //}




    }
    public void ScreenOn(View view){
        Switch screen=findViewById(R.id.ScreenOnSwitch);
        if (screen.isChecked()){
            SharedPreferences shareoptions=getSharedPreferences("Options",Context.MODE_PRIVATE);
            SharedPreferences.Editor shareeditor=shareoptions.edit();
            shareeditor.putString("screen","yes");
            shareeditor.apply();
        }
        else{
            SharedPreferences shareoptions=getSharedPreferences("Options",Context.MODE_PRIVATE);
            SharedPreferences.Editor shareeditor=shareoptions.edit();
            shareeditor.putString("screen","no");
            shareeditor.apply();
        }
    }
    public void timer(View view){

        Switch timswitch =findViewById(R.id.timerswitch);
        if (timswitch.isChecked()){
            SharedPreferences shareoptions=getSharedPreferences("Options",Context.MODE_PRIVATE);
            SharedPreferences.Editor shareeditor=shareoptions.edit();
            shareeditor.putString("timer","yes");
            shareeditor.apply();
        }
        else{
            SharedPreferences shareoptions=getSharedPreferences("Options",Context.MODE_PRIVATE);
            SharedPreferences.Editor shareeditor=shareoptions.edit();
            shareeditor.putString("timer","no");
            shareeditor.apply();

        }
    }
    public void switchhand(View view){

        Switch timswitch =findViewById(R.id.timerswitch);
        Switch screen=findViewById(R.id.ScreenOnSwitch);
        Switch lightsimilarswitch=findViewById(R.id.lightsimilarswitch);
        Switch cancelActionSwitch=findViewById(R.id.cancelActionSwitch);
        Switch redUnitSwitch=findViewById(R.id.redUnitSwitch);
        TextView assist=findViewById(R.id.assistancetext);

        Switch hand=findViewById(R.id.switchhand);
        if (hand.isChecked()){
            ConstraintLayout layout =  findViewById(R.id.activityoptions);
            ConstraintSet setcons= new ConstraintSet();
            setcons.clone(this,R.layout.activity_options);
            TransitionManager.beginDelayedTransition(layout);
            setcons.applyTo(layout);
            hand.setLayoutDirection(View.LAYOUT_DIRECTION_LTR);
            screen.setLayoutDirection(View.LAYOUT_DIRECTION_LTR);
            timswitch.setLayoutDirection(View.LAYOUT_DIRECTION_LTR);
            lightsimilarswitch.setLayoutDirection(View.LAYOUT_DIRECTION_LTR);
            assist.setLayoutDirection(View.LAYOUT_DIRECTION_LTR);
            cancelActionSwitch.setLayoutDirection(View.LAYOUT_DIRECTION_LTR);
            redUnitSwitch.setLayoutDirection(View.LAYOUT_DIRECTION_LTR);

            //hand.setChecked(false);
            hand.setText(R.string.right);
            SharedPreferences shareoptions=getSharedPreferences("Options",Context.MODE_PRIVATE);
            SharedPreferences.Editor shareeditor=shareoptions.edit();
            shareeditor.putString("handed","right");
            shareeditor.apply();


        }
        else {
            ConstraintLayout layout =  findViewById(R.id.activityoptions);
            ConstraintSet setcons= new ConstraintSet();
            setcons.clone(this,R.layout.activity_options_left);
            TransitionManager.beginDelayedTransition(layout);
            setcons.applyTo(layout);
            hand.setLayoutDirection(View.LAYOUT_DIRECTION_RTL);
            screen.setLayoutDirection(View.LAYOUT_DIRECTION_RTL);
            timswitch.setLayoutDirection(View.LAYOUT_DIRECTION_RTL);
            lightsimilarswitch.setLayoutDirection(View.LAYOUT_DIRECTION_RTL);
            assist.setLayoutDirection(View.LAYOUT_DIRECTION_RTL);
            cancelActionSwitch.setLayoutDirection(View.LAYOUT_DIRECTION_RTL);
            redUnitSwitch.setLayoutDirection(View.LAYOUT_DIRECTION_RTL);

            //hand.setChecked(true);
            hand.setText(R.string.left);
            SharedPreferences shareoptions=getSharedPreferences("Options",Context.MODE_PRIVATE);
            SharedPreferences.Editor shareeditor=shareoptions.edit();
            shareeditor.putString("handed","left");
            shareeditor.apply();
        }
        //SharedPreferences shareoptions=getSharedPreferences("Options",Context.MODE_PRIVATE);
        //SharedPreferences.Editor shareeditor=shareoptions.edit();
        //shareeditor.putString("handed","12345");
        //shareeditor.apply();
    }

    public void readPassedLevels(){
        //TextView textview123=findViewById(R.id.passedlevelstext);
        //String filename =  "finished_levels.txt";
        //try {
            //File myFilePath = new File(Environment.getExternalStorageDirectory().toString() + "/" + "Sudoku NTH");
            //if (!myFilePath.exists()) {
            //    myFilePath.mkdirs();
            //}
            //File myFile = new File(myFilePath, filename);
            //FileReader reader= new FileReader(myFile);
            //String reading="";
            //reading=reader.read();
            //FileWriter writer = new FileWriter(myFile, true);
            //writer.append(variantstring);
            //writer.flush();
            //writer.close();
        //} catch (FileNotFoundException ie) {
        //    textview123.setText("no file");
        //}
        //catch (IOException ie){
        //    textview123.setText("nothing");
        //}
    }



    public void lightsimilar(View view){
        Switch lightsimilarswitch=findViewById(R.id.lightsimilarswitch);
        if (lightsimilarswitch.isChecked()){
            SharedPreferences shareoptions=getSharedPreferences("Options",Context.MODE_PRIVATE);
            SharedPreferences.Editor shareeditor=shareoptions.edit();
            shareeditor.putString("lightsimilar","yes");
            shareeditor.apply();
        }
        else{
            SharedPreferences shareoptions=getSharedPreferences("Options",Context.MODE_PRIVATE);
            SharedPreferences.Editor shareeditor=shareoptions.edit();
            shareeditor.putString("lightsimilar","no");
            shareeditor.apply();
        }
    }
    public void cancelActions(View view){
        Switch cancelActionSwitch=findViewById(R.id.cancelActionSwitch);
        if (cancelActionSwitch.isChecked()){
            SharedPreferences shareoptions=getSharedPreferences("Options",Context.MODE_PRIVATE);
            SharedPreferences.Editor shareeditor=shareoptions.edit();
            shareeditor.putString("cancelAction","yes");
            shareeditor.apply();
        }
        else{
            SharedPreferences shareoptions=getSharedPreferences("Options",Context.MODE_PRIVATE);
            SharedPreferences.Editor shareeditor=shareoptions.edit();
            shareeditor.putString("cancelAction","no");
            shareeditor.apply();
        }
    }
    public void mistakes(View view){
        Switch redUnitSwitch=findViewById(R.id.redUnitSwitch);
        if (redUnitSwitch.isChecked()){
            SharedPreferences shareoptions=getSharedPreferences("Options",Context.MODE_PRIVATE);
            SharedPreferences.Editor shareeditor=shareoptions.edit();
            shareeditor.putString("redUnit","yes");
            shareeditor.apply();
        }
        else{
            SharedPreferences shareoptions=getSharedPreferences("Options",Context.MODE_PRIVATE);
            SharedPreferences.Editor shareeditor=shareoptions.edit();
            shareeditor.putString("redUnit","no");
            shareeditor.apply();
        }
    }



    public void Close (View v){
        super.onBackPressed();
        //Intent intentsave=new Intent(this,MainMenuActivity.class);
        //startActivity(intentsave);


    }
    //public void yeay(View view){
    //    Intent intentyeay=new Intent(this,YeayActivity.class);
    //    startActivity(intentyeay);
    //}

}
