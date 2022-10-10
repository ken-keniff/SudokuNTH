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
import android.os.SystemClock;
import android.transition.TransitionManager;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class GameActivity extends AppCompatActivity {
    String variantstring;
    String newgamestring="5";
    int variantInt;
    String PressedONButton = "";
    SharedPreferences SharedPrefs;
    //SharedPreferences SharedPrefsPrime;
    int idSelected1=0;
    int idSelected2=0;
    int idSelected3=0;
    int screen_w;
    int screen_h;

    Button testbut1;
    String testbut1string;
    Button testbut2;
    String testbut2string;
    Button testbut3;
    String testbut3string;
    int buttSize;
    int thinline;
    int fatline;
    int lenghtline;

    int onecount=0;
    int twocount=0;
    int threecount=0;
    int fourcount=0;
    int fivecount=0;
    int sixcount=0;
    int sevencount=0;
    int eightcount=0;
    int ninecount=0;
    int numberticketheight;
    int numberticketwidth;
    Button numberticketbutton1;
    Button numberticketbutton2;
    Button numberticketbutton3;
    Button numberticketbutton4;
    Button numberticketbutton5;
    Button numberticketbutton6;
    Button numberticketbutton7;
    Button numberticketbutton8;
    Button numberticketbutton9;

    int memoint=0;
    String handstring;
    int lightUpSimilar=5;
    String cancelActionstring;
    int cancelActionInt;
    String redUnitstring;
    int redUnitInt;
    int lineSelected;
    int columnSelected;
    int blockSelected;
    int actionSelected1=0;
    int actionSelected2;
    int actionSelected3;
    int actionSelected4;
    int actionSelected5;
    int actionSelected6;
    int actionSelected7;
    int actionSelected8;
    int actionSelected9;
    int actionSelected10;
    int actionSelected11;
    int actionSelected12;
    int actionSelected13;
    int actionSelected14;
    int actionSelected15;
    int actionSelected16;
    int actionSelected17;
    int actionSelected18;
    int actionSelected19;
    int actionSelected20;
    int actionSelected21;
    int actionSelected22;
    int actionSelected23;
    int actionSelected24;
    int actionSelected25;
    int actionSelected26;
    int actionSelected27;
    int actionSelected28;
    int actionSelected29;
    int actionSelected30;
    int actionSelected31;
    int actionSelected32;
    int actionSelected33;
    int actionSelected34;
    int actionSelected35;
    int actionSelected36;
    String actionString1;
    String actionString2;
    String actionString3;
    String actionString4;
    String actionString5;
    String actionString6;
    String actionString7;
    String actionString8;
    String actionString9;
    String actionString10;
    String actionString11;
    String actionString12;
    String actionString13;
    String actionString14;
    String actionString15;
    String actionString16;
    String actionString17;
    String actionString18;
    String actionString19;
    String actionString20;
    String actionString21;
    String actionString22;
    String actionString23;
    String actionString24;
    String actionString25;
    String actionString26;
    String actionString27;
    String actionString28;
    String actionString29;
    String actionString30;
    String actionString31;
    String actionString32;
    String actionString33;
    String actionString34;
    String actionString35;
    String actionString36;
    String actionStringOld1="";
    String actionStringOld2="";
    String actionStringOld3="";
    String actionStringOld4="";
    String actionStringOld5="";
    String actionStringOld6="";
    String actionStringOld7="";
    String actionStringOld8="";
    String actionStringOld9="";
    String actionStringOld10="";
    String actionStringOld11="";
    String actionStringOld12="";
    String actionStringOld13="";
    String actionStringOld14="";
    String actionStringOld15="";
    String actionStringOld16="";
    String actionStringOld17="";
    String actionStringOld18="";
    String actionStringOld19="";
    String actionStringOld20="";
    String actionStringOld21="";
    String actionStringOld22="";
    String actionStringOld23="";
    String actionStringOld24="";
    String actionStringOld25="";
    String actionStringOld26="";
    String actionStringOld27="";
    String actionStringOld28="";
    String actionStringOld29="";
    String actionStringOld30="";
    String actionStringOld31="";
    String actionStringOld32="";
    String actionStringOld33="";
    String actionStringOld34="";
    String actionStringOld35="";
    String actionStringOld36="";

    Button button11;
    Button button12;
    Button button13;
    Button button14;
    Button button15;
    Button button16;
    Button button17;
    Button button18;
    Button button19;

    Button button21;
    Button button22;
    Button button23;
    Button button24;
    Button button25;
    Button button26;
    Button button27;
    Button button28;
    Button button29;

    Button button31;
    Button button32;
    Button button33;
    Button button34;
    Button button35;
    Button button36;
    Button button37;
    Button button38;
    Button button39;

    Button button41;
    Button button42;
    Button button43;
    Button button44;
    Button button45;
    Button button46;
    Button button47;
    Button button48;
    Button button49;

    Button button51;
    Button button52;
    Button button53;
    Button button54;
    Button button55;
    Button button56;
    Button button57;
    Button button58;
    Button button59;

    Button button61;
    Button button62;
    Button button63;
    Button button64;
    Button button65;
    Button button66;
    Button button67;
    Button button68;
    Button button69;

    Button button71;
    Button button72;
    Button button73;
    Button button74;
    Button button75;
    Button button76;
    Button button77;
    Button button78;
    Button button79;

    Button button81;
    Button button82;
    Button button83;
    Button button84;
    Button button85;
    Button button86;
    Button button87;
    Button button88;
    Button button89;

    Button button91;
    Button button92;
    Button button93;
    Button button94;
    Button button95;
    Button button96;
    Button button97;
    Button button98;
    Button button99;

    String buttonprime11;
    String buttonprime12;
    String buttonprime13;
    String buttonprime14;
    String buttonprime15;
    String buttonprime16;
    String buttonprime17;
    String buttonprime18;
    String buttonprime19;
    String buttonprime21;
    String buttonprime22;
    String buttonprime23;
    String buttonprime24;
    String buttonprime25;
    String buttonprime26;
    String buttonprime27;
    String buttonprime28;
    String buttonprime29;
    String buttonprime31;
    String buttonprime32;
    String buttonprime33;
    String buttonprime34;
    String buttonprime35;
    String buttonprime36;
    String buttonprime37;
    String buttonprime38;
    String buttonprime39;
    String buttonprime41;
    String buttonprime42;
    String buttonprime43;
    String buttonprime44;
    String buttonprime45;
    String buttonprime46;
    String buttonprime47;
    String buttonprime48;
    String buttonprime49;
    String buttonprime51;
    String buttonprime52;
    String buttonprime53;
    String buttonprime54;
    String buttonprime55;
    String buttonprime56;
    String buttonprime57;
    String buttonprime58;
    String buttonprime59;
    String buttonprime61;
    String buttonprime62;
    String buttonprime63;
    String buttonprime64;
    String buttonprime65;
    String buttonprime66;
    String buttonprime67;
    String buttonprime68;
    String buttonprime69;
    String buttonprime71;
    String buttonprime72;
    String buttonprime73;
    String buttonprime74;
    String buttonprime75;
    String buttonprime76;
    String buttonprime77;
    String buttonprime78;
    String buttonprime79;
    String buttonprime81;
    String buttonprime82;
    String buttonprime83;
    String buttonprime84;
    String buttonprime85;
    String buttonprime86;
    String buttonprime87;
    String buttonprime88;
    String buttonprime89;
    String buttonprime91;
    String buttonprime92;
    String buttonprime93;
    String buttonprime94;
    String buttonprime95;
    String buttonprime96;
    String buttonprime97;
    String buttonprime98;
    String buttonprime99;



    String	buttonstring11	=Integer.toString(R.id.button11	);
    String	buttonstring12	=Integer.toString(R.id.button12	);
    String	buttonstring13	=Integer.toString(R.id.button13	);
    String	buttonstring14	=Integer.toString(R.id.button14	);
    String	buttonstring15	=Integer.toString(R.id.button15	);
    String	buttonstring16	=Integer.toString(R.id.button16	);
    String	buttonstring17	=Integer.toString(R.id.button17	);
    String	buttonstring18	=Integer.toString(R.id.button18	);
    String	buttonstring19	=Integer.toString(R.id.button19	);

    String	buttonstring21	=Integer.toString(R.id.button21	);
    String	buttonstring22	=Integer.toString(R.id.button22	);
    String	buttonstring23	=Integer.toString(R.id.button23	);
    String	buttonstring24	=Integer.toString(R.id.button24	);
    String	buttonstring25	=Integer.toString(R.id.button25	);
    String	buttonstring26	=Integer.toString(R.id.button26	);
    String	buttonstring27	=Integer.toString(R.id.button27	);
    String	buttonstring28	=Integer.toString(R.id.button28	);
    String	buttonstring29	=Integer.toString(R.id.button29	);

    String	buttonstring31	=Integer.toString(R.id.button31	);
    String	buttonstring32	=Integer.toString(R.id.button32	);
    String	buttonstring33	=Integer.toString(R.id.button33	);
    String	buttonstring34	=Integer.toString(R.id.button34	);
    String	buttonstring35	=Integer.toString(R.id.button35	);
    String	buttonstring36	=Integer.toString(R.id.button36	);
    String	buttonstring37	=Integer.toString(R.id.button37	);
    String	buttonstring38	=Integer.toString(R.id.button38	);
    String	buttonstring39	=Integer.toString(R.id.button39	);

    String	buttonstring41	=Integer.toString(R.id.button41	);
    String	buttonstring42	=Integer.toString(R.id.button42	);
    String	buttonstring43	=Integer.toString(R.id.button43	);
    String	buttonstring44	=Integer.toString(R.id.button44	);
    String	buttonstring45	=Integer.toString(R.id.button45	);
    String	buttonstring46	=Integer.toString(R.id.button46	);
    String	buttonstring47	=Integer.toString(R.id.button47	);
    String	buttonstring48	=Integer.toString(R.id.button48	);
    String	buttonstring49	=Integer.toString(R.id.button49	);

    String	buttonstring51	=Integer.toString(R.id.button51	);
    String	buttonstring52	=Integer.toString(R.id.button52	);
    String	buttonstring53	=Integer.toString(R.id.button53	);
    String	buttonstring54	=Integer.toString(R.id.button54	);
    String	buttonstring55	=Integer.toString(R.id.button55	);
    String	buttonstring56	=Integer.toString(R.id.button56	);
    String	buttonstring57	=Integer.toString(R.id.button57	);
    String	buttonstring58	=Integer.toString(R.id.button58	);
    String	buttonstring59	=Integer.toString(R.id.button59	);

    String	buttonstring61	=Integer.toString(R.id.button61	);
    String	buttonstring62	=Integer.toString(R.id.button62	);
    String	buttonstring63	=Integer.toString(R.id.button63	);
    String	buttonstring64	=Integer.toString(R.id.button64	);
    String	buttonstring65	=Integer.toString(R.id.button65	);
    String	buttonstring66	=Integer.toString(R.id.button66	);
    String	buttonstring67	=Integer.toString(R.id.button67	);
    String	buttonstring68	=Integer.toString(R.id.button68	);
    String	buttonstring69	=Integer.toString(R.id.button69	);

    String	buttonstring71	=Integer.toString(R.id.button71	);
    String	buttonstring72	=Integer.toString(R.id.button72	);
    String	buttonstring73	=Integer.toString(R.id.button73	);
    String	buttonstring74	=Integer.toString(R.id.button74	);
    String	buttonstring75	=Integer.toString(R.id.button75	);
    String	buttonstring76	=Integer.toString(R.id.button76	);
    String	buttonstring77	=Integer.toString(R.id.button77	);
    String	buttonstring78	=Integer.toString(R.id.button78	);
    String	buttonstring79	=Integer.toString(R.id.button79	);

    String	buttonstring81	=Integer.toString(R.id.button81	);
    String	buttonstring82	=Integer.toString(R.id.button82	);
    String	buttonstring83	=Integer.toString(R.id.button83	);
    String	buttonstring84	=Integer.toString(R.id.button84	);
    String	buttonstring85	=Integer.toString(R.id.button85	);
    String	buttonstring86	=Integer.toString(R.id.button86	);
    String	buttonstring87	=Integer.toString(R.id.button87	);
    String	buttonstring88	=Integer.toString(R.id.button88	);
    String	buttonstring89	=Integer.toString(R.id.button89	);

    String	buttonstring91	=Integer.toString(R.id.button91	);
    String	buttonstring92	=Integer.toString(R.id.button92	);
    String	buttonstring93	=Integer.toString(R.id.button93	);
    String	buttonstring94	=Integer.toString(R.id.button94	);
    String	buttonstring95	=Integer.toString(R.id.button95	);
    String	buttonstring96	=Integer.toString(R.id.button96	);
    String	buttonstring97	=Integer.toString(R.id.button97	);
    String	buttonstring98	=Integer.toString(R.id.button98	);
    String	buttonstring99	=Integer.toString(R.id.button99	);





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        //SharedprefsPrime = getPreferences(MODE_PRIVATE);




        SharedPreferences prime = getSharedPreferences("Prime",Context.MODE_PRIVATE);

        SharedPreferences shareoptions=getSharedPreferences("Options", Context.MODE_PRIVATE);
        handstring=shareoptions.getString("handed","");
        if (handstring.equals("left")){
            ConstraintLayout layout =  findViewById(R.id.gameactivity);
            ConstraintSet setcons= new ConstraintSet();
            setcons.clone(this,R.layout.activity_game_left);
            TransitionManager.beginDelayedTransition(layout);
            setcons.applyTo(layout);

        }
        else {
            ConstraintLayout layout =  findViewById(R.id.gameactivity);
            ConstraintSet setcons= new ConstraintSet();
            setcons.clone(this,R.layout.activity_game);
        TransitionManager.beginDelayedTransition(layout);
        setcons.applyTo(layout);
    }
        Chronometer chronometer=findViewById(R.id.chronometer);
        String timerstring=shareoptions.getString("timer","");
        if (timerstring.equals("yes")){

            chronometer.start();
        }
        else if(timerstring.equals("no")||timerstring.equals("")){
            chronometer.setVisibility(View.INVISIBLE);
        }
        String screenstring=shareoptions.getString("screen","");
        if (screenstring.equals("yes")||screenstring.equals("")){
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        }
        else if (screenstring.equals("no")){
            getWindow().clearFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        }

        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_FULLSCREEN
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        //getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        String lightupsimilarstring=shareoptions.getString("lightsimilar","");
        if (lightupsimilarstring.equals("yes")||lightupsimilarstring.equals("")){
            lightUpSimilar=1;
        }
        else if (lightupsimilarstring.equals("no")){
            lightUpSimilar=0;
        }

        cancelActionstring=shareoptions.getString("cancelAction","");
        if (cancelActionstring.equals("yes")){
            cancelActionInt=1;
        }
        else if(cancelActionstring.equals("no")||cancelActionstring.equals("")){
            cancelActionInt=0;
        }

        redUnitstring=shareoptions.getString("redUnit","");
        if (redUnitstring.equals("yes")||redUnitstring.equals("")){
            redUnitInt=1;
        }
        else if(redUnitstring.equals("no")){
            redUnitInt=0;
        }

        SharedPreferences sharesavegame=getSharedPreferences("SaveGame", Context.MODE_PRIVATE);
        SharedPreferences newgame=getSharedPreferences("NewGame",Context.MODE_PRIVATE);
        //restartstring = getIntent().getStringExtra("restart");
            newgamestring=newgame.getString("New","");

            if (newgamestring.equals("Yes")) {
                variantstring = getIntent().getStringExtra("variant");
                SharedPrefs = getPreferences(MODE_PRIVATE);
                SharedPreferences.Editor PrefEditor = SharedPrefs.edit();
                PrefEditor.putString("VARIANT", variantstring);
                PrefEditor.apply();
                SharedPreferences.Editor shareeditor = sharesavegame.edit();
                shareeditor.putString("Save", "1");
                shareeditor.apply();
                SharedPreferences.Editor newgameeditor=newgame.edit();
                newgameeditor.putString("New","No");
                newgameeditor.apply();
            }else
                {
            SharedPrefs = getPreferences(MODE_PRIVATE);
            variantstring = SharedPrefs.getString("VARIANT", "");
        }

            variantInt=Integer.parseInt(variantstring);
        //TextView testvar=findViewById(R.id.testvar);

        //testvar.setText("VAR "+variantstring);
        //
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
         screen_w = size.x;
         screen_h = size.y;

        //String screen_width = Integer.toString(screen_w);
        //String screen_height = Integer.toString(screen_h);
        //TextView ScreenSize = findViewById(R.id.screenSize);
        //String sizescreen = getString(R.string.height) + screen_height + "\n" + getString(R.string.width) + screen_width;
        //ScreenSize.setText(sizescreen);
        //
        //TextView ONBPressedButton = findViewById(R.id.textViewONButtonPressed);
        //SharedPrefs = getPreferences(MODE_PRIVATE);
        //String PressedButt = SharedPrefs.getString("PRESSED_BUTTON", "");
        //ONBPressedButton.setText(PressedButt);

        numberticketbutton1 =findViewById(R.id.numberticket1);
        numberticketbutton2 =findViewById(R.id.numberticket2);
        numberticketbutton3 =findViewById(R.id.numberticket3);
        numberticketbutton4 =findViewById(R.id.numberticket4);
        numberticketbutton5 =findViewById(R.id.numberticket5);
        numberticketbutton6 =findViewById(R.id.numberticket6);
        numberticketbutton7 =findViewById(R.id.numberticket7);
        numberticketbutton8 =findViewById(R.id.numberticket8);
        numberticketbutton9 =findViewById(R.id.numberticket9);

         buttSize = 500;
        int padding=5;
        int OneNineButtSize=5;
        int pauseButSize=6;
        if (screen_h > screen_w) {
            buttSize = ((screen_w)  *103)/1000;
            thinline=screen_w*7/1000;
            fatline=screen_w*15/1000;
            numberticketheight=buttSize/2;
            numberticketwidth=buttSize;
            padding=(screen_w-(thinline*6)-(fatline*2)-(buttSize*9))/2;
            lenghtline=screen_w-(padding*2);
            pauseButSize=(screen_w)/4;
            //OneNineButtSize=screen_w/5-buttSize/2;
            //OneNineButtSize=(screen_h-(buttSize*9+20))/4;
            OneNineButtSize=(screen_h-screen_w-padding*2)/40*10;

            ConstraintLayout layoutnumbertickets =  findViewById(R.id.gameactivity);
            ConstraintSet setconsnumbertickets= new ConstraintSet();
            setconsnumbertickets.clone(this,R.layout.activity_game_number_tickets_hor);
            setconsnumbertickets.applyTo(layoutnumbertickets);
            numberticketbutton1.setBackgroundResource(R.drawable.number_ticket_selector);
            numberticketbutton2.setBackgroundResource(R.drawable.number_ticket_selector);
            numberticketbutton3.setBackgroundResource(R.drawable.number_ticket_selector);
            numberticketbutton4.setBackgroundResource(R.drawable.number_ticket_selector);
            numberticketbutton5.setBackgroundResource(R.drawable.number_ticket_selector);
            numberticketbutton6.setBackgroundResource(R.drawable.number_ticket_selector);
            numberticketbutton7.setBackgroundResource(R.drawable.number_ticket_selector);
            numberticketbutton8.setBackgroundResource(R.drawable.number_ticket_selector);
            numberticketbutton9.setBackgroundResource(R.drawable.number_ticket_selector);




        } else if (screen_h < screen_w) {
            buttSize = ((screen_h) *103)/1000;
            thinline=screen_h*7/1000;
            fatline=screen_h*15/1000;
            numberticketheight=buttSize;
            numberticketwidth=buttSize/2;
            padding=(screen_h-(thinline*6)-(fatline*2)-(buttSize*9))/2;
            lenghtline=screen_h-(padding*2);
            pauseButSize=(screen_h)/4;
            //padding=50;
            //OneNineButtSize=screen_h/5-buttSize/2;
            //OneNineButtSize=(screen_w-(buttSize*9+20))/4;
            OneNineButtSize=(screen_w-screen_h-padding*2)/40*10;

            ConstraintLayout layoutnumbertickets =  findViewById(R.id.gameactivity);
            ConstraintSet setconsnumbertickets= new ConstraintSet();
            setconsnumbertickets.clone(this,R.layout.activity_game_number_tickets_ver);
            setconsnumbertickets.applyTo(layoutnumbertickets);
            numberticketbutton1.setBackgroundResource(R.drawable.number_ticket_vertical_selector);
            numberticketbutton2.setBackgroundResource(R.drawable.number_ticket_vertical_selector);
            numberticketbutton3.setBackgroundResource(R.drawable.number_ticket_vertical_selector);
            numberticketbutton4.setBackgroundResource(R.drawable.number_ticket_vertical_selector);
            numberticketbutton5.setBackgroundResource(R.drawable.number_ticket_vertical_selector);
            numberticketbutton6.setBackgroundResource(R.drawable.number_ticket_vertical_selector);
            numberticketbutton7.setBackgroundResource(R.drawable.number_ticket_vertical_selector);
            numberticketbutton8.setBackgroundResource(R.drawable.number_ticket_vertical_selector);
            numberticketbutton9.setBackgroundResource(R.drawable.number_ticket_vertical_selector);



        } else if (screen_h==screen_w){
            buttSize = (((screen_h-12)-(screen_w*10/30)) / 9)-3;
            padding=(screen_h-12-(buttSize*9))/2;
            pauseButSize=(screen_h)/4;
        }
        //ImageView justline=findViewById(R.id.justline);
        //justline.setMinimumHeight(buttSize*8);
        //ImageView upline=findViewById(R.id.upline);
        //ImageView upline=findViewById(R.id.upline);
        //ImageView line=findViewById(R.id.line);
        //upline.setImageResource(R.drawable.upline);
        //line.setImageResource(R.drawable.line);
        //justline.setImageResource(R.drawable.justline);
        //justline.setMinimumHeight((buttSize*85)/10);
        //justline.requestLayout();
        //upline.getLayoutParams().height=(buttSize*9)-20;
        //numberTicketButton();


        numberticketbutton1.setWidth(numberticketwidth);
        numberticketbutton1.setHeight(numberticketheight);
        numberticketbutton2.setWidth(numberticketwidth);
        numberticketbutton2.setHeight(numberticketheight);
        numberticketbutton3.setWidth(numberticketwidth);
        numberticketbutton3.setHeight(numberticketheight);
        numberticketbutton4.setWidth(numberticketwidth);
        numberticketbutton4.setHeight(numberticketheight);
        numberticketbutton5.setWidth(numberticketwidth);
        numberticketbutton5.setHeight(numberticketheight);
        numberticketbutton6.setWidth(numberticketwidth);
        numberticketbutton6.setHeight(numberticketheight);
        numberticketbutton7.setWidth(numberticketwidth);
        numberticketbutton7.setHeight(numberticketheight);
        numberticketbutton8.setWidth(numberticketwidth);
        numberticketbutton8.setHeight(numberticketheight);
        numberticketbutton9.setWidth(numberticketwidth);
        numberticketbutton9.setHeight(numberticketheight);



        Button pausebut1=findViewById(R.id.pausebut1);
        Button pausebut2=findViewById(R.id.pausebut2);
        Button pausebut3=findViewById(R.id.pausebut3);
        Button pausebut4=findViewById(R.id.pausebut4);

        pausebut1.setWidth(pauseButSize);
        pausebut1.setHeight(pauseButSize);
        pausebut2.setWidth(pauseButSize);
        pausebut2.setHeight(pauseButSize);
        pausebut3.setWidth(pauseButSize);
        pausebut3.setHeight(pauseButSize);
        pausebut4.setWidth(pauseButSize);
        pausebut4.setHeight(pauseButSize);

        Button pausebut1L=findViewById(R.id.pausebut1L);
        Button pausebut2L=findViewById(R.id.pausebut2L);
        Button pausebut3L=findViewById(R.id.pausebut3L);
        Button pausebut4L=findViewById(R.id.pausebut4L);

        pausebut1L.setWidth(pauseButSize);
        pausebut1L.setHeight(pauseButSize);
        pausebut2L.setWidth(pauseButSize);
        pausebut2L.setHeight(pauseButSize);
        pausebut3L.setWidth(pauseButSize);
        pausebut3L.setHeight(pauseButSize);
        pausebut4L.setWidth(pauseButSize);
        pausebut4L.setHeight(pauseButSize);

        ImageView fatlinevert1= findViewById(R.id.fatlinevert1);
        fatlinevert1.setMinimumWidth(fatline);
        fatlinevert1.setMinimumHeight(lenghtline);
        ImageView fatlinevert2= findViewById(R.id.fatlinevert2);
        fatlinevert2.setMinimumWidth(fatline);
        fatlinevert2.setMinimumHeight(lenghtline);
        ImageView fatlinehor1= findViewById(R.id.fatlinehor1);
        fatlinehor1.setMinimumWidth(lenghtline);
        fatlinehor1.setMinimumHeight(fatline);
        ImageView fatlinehor2= findViewById(R.id.fatlinehor2);
        fatlinehor2.setMinimumWidth(lenghtline);
        fatlinehor2.setMinimumHeight(fatline);
        ImageView thinlinevert1= findViewById(R.id.thinlinevert1);
        thinlinevert1.setMinimumWidth(thinline);
        thinlinevert1.setMinimumHeight(lenghtline);
        ImageView thinlinevert2= findViewById(R.id.thinlinevert2);
        thinlinevert2.setMinimumWidth(thinline);
        thinlinevert2.setMinimumHeight(lenghtline);
        ImageView thinlinevert3= findViewById(R.id.thinlinevert3);
        thinlinevert3.setMinimumWidth(thinline);
        thinlinevert3.setMinimumHeight(lenghtline);
        ImageView thinlinevert4= findViewById(R.id.thinlinevert4);
        thinlinevert4.setMinimumWidth(thinline);
        thinlinevert4.setMinimumHeight(lenghtline);
        ImageView thinlinevert5= findViewById(R.id.thinlinevert5);
        thinlinevert5.setMinimumWidth(thinline);
        thinlinevert5.setMinimumHeight(lenghtline);
        ImageView thinlinevert6= findViewById(R.id.thinlinevert6);
        thinlinevert6.setMinimumWidth(thinline);
        thinlinevert6.setMinimumHeight(lenghtline);
        ImageView thinlinehor1= findViewById(R.id.thinlinehor1);
        thinlinehor1.setMinimumWidth(lenghtline);
        thinlinehor1.setMinimumHeight(thinline);
        ImageView thinlinehor2= findViewById(R.id.thinlinehor2);
        thinlinehor2.setMinimumWidth(lenghtline);
        thinlinehor2.setMinimumHeight(thinline);
        ImageView thinlinehor3= findViewById(R.id.thinlinehor3);
        thinlinehor3.setMinimumWidth(lenghtline);
        thinlinehor3.setMinimumHeight(thinline);
        ImageView thinlinehor4= findViewById(R.id.thinlinehor4);
        thinlinehor4.setMinimumWidth(lenghtline);
        thinlinehor4.setMinimumHeight(thinline);
        ImageView thinlinehor5= findViewById(R.id.thinlinehor5);
        thinlinehor5.setMinimumWidth(lenghtline);
        thinlinehor5.setMinimumHeight(thinline);
        ImageView thinlinehor6= findViewById(R.id.thinlinehor6);
        thinlinehor6.setMinimumWidth(lenghtline);
        thinlinehor6.setMinimumHeight(thinline);



        //TextView Testtext = findViewById(R.id.unitsize);
        //String buttSizeS = Integer.toString(buttSize);
        //Testtext.setText(buttSizeS);

        button11 = findViewById(R.id.button11);
        //Button button11 = findViewById(R.id.button11);
        button12 = findViewById(R.id.button12);
        button13 = findViewById(R.id.button13);
        button14 = findViewById(R.id.button14);
        button15 = findViewById(R.id.button15);
        button16 = findViewById(R.id.button16);
        button17 = findViewById(R.id.button17);
        button18 = findViewById(R.id.button18);
        button19 = findViewById(R.id.button19);

        button21 = findViewById(R.id.button21);
        button22 = findViewById(R.id.button22);
        button23 = findViewById(R.id.button23);
        button24 = findViewById(R.id.button24);
        button25 = findViewById(R.id.button25);
        button26 = findViewById(R.id.button26);
        button27 = findViewById(R.id.button27);
        button28 = findViewById(R.id.button28);
        button29 = findViewById(R.id.button29);

        button31 = findViewById(R.id.button31);
        button32 = findViewById(R.id.button32);
        button33 = findViewById(R.id.button33);
        button34 = findViewById(R.id.button34);
        button35 = findViewById(R.id.button35);
        button36 = findViewById(R.id.button36);
        button37 = findViewById(R.id.button37);
        button38 = findViewById(R.id.button38);
        button39 = findViewById(R.id.button39);

        button41 = findViewById(R.id.button41);
        button42 = findViewById(R.id.button42);
        button43 = findViewById(R.id.button43);
        button44 = findViewById(R.id.button44);
        button45 = findViewById(R.id.button45);
        button46 = findViewById(R.id.button46);
        button47 = findViewById(R.id.button47);
        button48 = findViewById(R.id.button48);
        button49 = findViewById(R.id.button49);

        button51 = findViewById(R.id.button51);
        button52 = findViewById(R.id.button52);
        button53 = findViewById(R.id.button53);
        button54 = findViewById(R.id.button54);
        button55 = findViewById(R.id.button55);
        button56 = findViewById(R.id.button56);
        button57 = findViewById(R.id.button57);
        button58 = findViewById(R.id.button58);
        button59 = findViewById(R.id.button59);

        button61 = findViewById(R.id.button61);
        button62 = findViewById(R.id.button62);
        button63 = findViewById(R.id.button63);
        button64 = findViewById(R.id.button64);
        button65 = findViewById(R.id.button65);
        button66 = findViewById(R.id.button66);
        button67 = findViewById(R.id.button67);
        button68 = findViewById(R.id.button68);
        button69 = findViewById(R.id.button69);

        button71 = findViewById(R.id.button71);
        button72 = findViewById(R.id.button72);
        button73 = findViewById(R.id.button73);
        button74 = findViewById(R.id.button74);
        button75 = findViewById(R.id.button75);
        button76 = findViewById(R.id.button76);
        button77 = findViewById(R.id.button77);
        button78 = findViewById(R.id.button78);
        button79 = findViewById(R.id.button79);

        button81 = findViewById(R.id.button81);
        button82 = findViewById(R.id.button82);
        button83 = findViewById(R.id.button83);
        button84 = findViewById(R.id.button84);
        button85 = findViewById(R.id.button85);
        button86 = findViewById(R.id.button86);
        button87 = findViewById(R.id.button87);
        button88 = findViewById(R.id.button88);
        button89 = findViewById(R.id.button89);

        button91 = findViewById(R.id.button91);
        button92 = findViewById(R.id.button92);
        button93 = findViewById(R.id.button93);
        button94 = findViewById(R.id.button94);
        button95 = findViewById(R.id.button95);
        button96 = findViewById(R.id.button96);
        button97 = findViewById(R.id.button97);
        button98 = findViewById(R.id.button98);
        button99 = findViewById(R.id.button99);

        button11.setWidth(buttSize);
        button11.setHeight(buttSize);
        button12.setWidth(buttSize);
        button12.setHeight(buttSize);
        button13.setWidth(buttSize);
        button13.setHeight(buttSize);
        button14.setWidth(buttSize);
        button14.setHeight(buttSize);
        button15.setWidth(buttSize);
        button15.setHeight(buttSize);
        button16.setWidth(buttSize);
        button16.setHeight(buttSize);
        button17.setWidth(buttSize);
        button17.setHeight(buttSize);
        button18.setWidth(buttSize);
        button18.setHeight(buttSize);
        button19.setWidth(buttSize);
        button19.setHeight(buttSize);

        button21.setWidth(buttSize);
        button21.setHeight(buttSize);
        button22.setWidth(buttSize);
        button22.setHeight(buttSize);
        button23.setWidth(buttSize);
        button23.setHeight(buttSize);
        button24.setWidth(buttSize);
        button24.setHeight(buttSize);
        button25.setWidth(buttSize);
        button25.setHeight(buttSize);
        button26.setWidth(buttSize);
        button26.setHeight(buttSize);
        button27.setWidth(buttSize);
        button27.setHeight(buttSize);
        button28.setWidth(buttSize);
        button28.setHeight(buttSize);
        button29.setWidth(buttSize);
        button29.setHeight(buttSize);

        button31.setWidth(buttSize);
        button31.setHeight(buttSize);
        button32.setWidth(buttSize);
        button32.setHeight(buttSize);
        button33.setWidth(buttSize);
        button33.setHeight(buttSize);
        button34.setWidth(buttSize);
        button34.setHeight(buttSize);
        button35.setWidth(buttSize);
        button35.setHeight(buttSize);
        button36.setWidth(buttSize);
        button36.setHeight(buttSize);
        button37.setWidth(buttSize);
        button37.setHeight(buttSize);
        button38.setWidth(buttSize);
        button38.setHeight(buttSize);
        button39.setWidth(buttSize);
        button39.setHeight(buttSize);

        button41.setWidth(buttSize);
        button41.setHeight(buttSize);
        button42.setWidth(buttSize);
        button42.setHeight(buttSize);
        button43.setWidth(buttSize);
        button43.setHeight(buttSize);
        button44.setWidth(buttSize);
        button44.setHeight(buttSize);
        button45.setWidth(buttSize);
        button45.setHeight(buttSize);
        button46.setWidth(buttSize);
        button46.setHeight(buttSize);
        button47.setWidth(buttSize);
        button47.setHeight(buttSize);
        button48.setWidth(buttSize);
        button48.setHeight(buttSize);
        button49.setWidth(buttSize);
        button49.setHeight(buttSize);

        button51.setWidth(buttSize);
        button51.setHeight(buttSize);
        button52.setWidth(buttSize);
        button52.setHeight(buttSize);
        button53.setWidth(buttSize);
        button53.setHeight(buttSize);
        button54.setWidth(buttSize);
        button54.setHeight(buttSize);
        button55.setWidth(buttSize);
        button55.setHeight(buttSize);
        button56.setWidth(buttSize);
        button56.setHeight(buttSize);
        button57.setWidth(buttSize);
        button57.setHeight(buttSize);
        button58.setWidth(buttSize);
        button58.setHeight(buttSize);
        button59.setWidth(buttSize);
        button59.setHeight(buttSize);

        button61.setWidth(buttSize);
        button61.setHeight(buttSize);
        button62.setWidth(buttSize);
        button62.setHeight(buttSize);
        button63.setWidth(buttSize);
        button63.setHeight(buttSize);
        button64.setWidth(buttSize);
        button64.setHeight(buttSize);
        button65.setWidth(buttSize);
        button65.setHeight(buttSize);
        button66.setWidth(buttSize);
        button66.setHeight(buttSize);
        button67.setWidth(buttSize);
        button67.setHeight(buttSize);
        button68.setWidth(buttSize);
        button68.setHeight(buttSize);
        button69.setWidth(buttSize);
        button69.setHeight(buttSize);

        button71.setWidth(buttSize);
        button71.setHeight(buttSize);
        button72.setWidth(buttSize);
        button72.setHeight(buttSize);
        button73.setWidth(buttSize);
        button73.setHeight(buttSize);
        button74.setWidth(buttSize);
        button74.setHeight(buttSize);
        button75.setWidth(buttSize);
        button75.setHeight(buttSize);
        button76.setWidth(buttSize);
        button76.setHeight(buttSize);
        button77.setWidth(buttSize);
        button77.setHeight(buttSize);
        button78.setWidth(buttSize);
        button78.setHeight(buttSize);
        button79.setWidth(buttSize);
        button79.setHeight(buttSize);

        button81.setWidth(buttSize);
        button81.setHeight(buttSize);
        button82.setWidth(buttSize);
        button82.setHeight(buttSize);
        button83.setWidth(buttSize);
        button83.setHeight(buttSize);
        button84.setWidth(buttSize);
        button84.setHeight(buttSize);
        button85.setWidth(buttSize);
        button85.setHeight(buttSize);
        button86.setWidth(buttSize);
        button86.setHeight(buttSize);
        button87.setWidth(buttSize);
        button87.setHeight(buttSize);
        button88.setWidth(buttSize);
        button88.setHeight(buttSize);
        button89.setWidth(buttSize);
        button89.setHeight(buttSize);

        button91.setWidth(buttSize);
        button91.setHeight(buttSize);
        button92.setWidth(buttSize);
        button92.setHeight(buttSize);
        button93.setWidth(buttSize);
        button93.setHeight(buttSize);
        button94.setWidth(buttSize);
        button94.setHeight(buttSize);
        button95.setWidth(buttSize);
        button95.setHeight(buttSize);
        button96.setWidth(buttSize);
        button96.setHeight(buttSize);
        button97.setWidth(buttSize);
        button97.setHeight(buttSize);
        button98.setWidth(buttSize);
        button98.setHeight(buttSize);
        button99.setWidth(buttSize);
        button99.setHeight(buttSize);

        //String buttonPrimordialShare11=SharedprefsPrime.getString(buttonstring11,"");
        //if (buttonPrimordialShare11.equals("yes")){
        //    button11.setBackgroundResource(R.drawable.field_unit_primordial);
        //}
        //else
        //{
        //    button11.setBackgroundResource(R.drawable.field_unit_selector);
        //}



        ConstraintLayout gameactivity=findViewById(R.id.gameactivity);
        gameactivity.setPadding(padding,padding,padding,padding);

        Button b1=findViewById(R.id.B1);
        b1.setWidth(OneNineButtSize);
        b1.setHeight(OneNineButtSize);
        Button b2=findViewById(R.id.B2);
        b2.setWidth(OneNineButtSize);
        b2.setHeight(OneNineButtSize);
        Button b3=findViewById(R.id.B3);
        b3.setWidth(OneNineButtSize);
        b3.setHeight(OneNineButtSize);
        Button b4=findViewById(R.id.B4);
        b4.setWidth(OneNineButtSize);
        b4.setHeight(OneNineButtSize);
        Button b5=findViewById(R.id.B5);
        b5.setWidth(OneNineButtSize);
        b5.setHeight(OneNineButtSize);
        Button b6=findViewById(R.id.B6);
        b6.setWidth(OneNineButtSize);
        b6.setHeight(OneNineButtSize);
        Button b7=findViewById(R.id.B7);
        b7.setWidth(OneNineButtSize);
        b7.setHeight(OneNineButtSize);
        Button b8=findViewById(R.id.B8);
        b8.setWidth(OneNineButtSize);
        b8.setHeight(OneNineButtSize);
        Button b9=findViewById(R.id.B9);
        b9.setWidth(OneNineButtSize);
        b9.setHeight(OneNineButtSize);
        Button bE=findViewById(R.id.BE);
        bE.setWidth(OneNineButtSize);
        bE.setHeight(OneNineButtSize);
        Button bpause=findViewById(R.id.pause);
        bpause.setWidth(OneNineButtSize);
        bpause.setHeight(OneNineButtSize);
        Button bmemo=findViewById(R.id.Memo);
        bmemo.setWidth(OneNineButtSize);
        bmemo.setHeight(OneNineButtSize);
        if (cancelActionInt==1){
            Button cancelAction=findViewById(R.id.cancelActionButton);
            cancelAction.setEnabled(true);
            cancelAction.setWidth((OneNineButtSize*9)/10);
            cancelAction.setHeight(OneNineButtSize);
        } else if (cancelActionInt==0){
            Button cancelAction=findViewById(R.id.cancelActionButton);
            cancelAction.setWidth(OneNineButtSize);
            cancelAction.setHeight(OneNineButtSize);
            cancelAction.setEnabled(false);
        }




        if (newgamestring.equals("Yes")){
            SharedPreferences.Editor PrefEditor = SharedPrefs.edit();
            //PrefEditor.putInt(buttonstring11,);
            PrefEditor.putString(buttonstring11	, "");
            PrefEditor.putString(buttonstring12	, "");
            PrefEditor.putString(buttonstring13	, "");
            PrefEditor.putString(buttonstring14	, "");
            PrefEditor.putString(buttonstring15	, "");
            PrefEditor.putString(buttonstring16	, "");
            PrefEditor.putString(buttonstring17	, "");
            PrefEditor.putString(buttonstring18	, "");
            PrefEditor.putString(buttonstring19	, "");

            PrefEditor.putString(buttonstring21	, "");
            PrefEditor.putString(buttonstring22	, "");
            PrefEditor.putString(buttonstring23	, "");
            PrefEditor.putString(buttonstring24	, "");
            PrefEditor.putString(buttonstring25	, "");
            PrefEditor.putString(buttonstring26	, "");
            PrefEditor.putString(buttonstring27	, "");
            PrefEditor.putString(buttonstring28	, "");
            PrefEditor.putString(buttonstring29	, "");

            PrefEditor.putString(buttonstring31	, "");
            PrefEditor.putString(buttonstring32	, "");
            PrefEditor.putString(buttonstring33	, "");
            PrefEditor.putString(buttonstring34	, "");
            PrefEditor.putString(buttonstring35	, "");
            PrefEditor.putString(buttonstring36	, "");
            PrefEditor.putString(buttonstring37	, "");
            PrefEditor.putString(buttonstring38	, "");
            PrefEditor.putString(buttonstring39	, "");

            PrefEditor.putString(buttonstring41	, "");
            PrefEditor.putString(buttonstring42	, "");
            PrefEditor.putString(buttonstring43	, "");
            PrefEditor.putString(buttonstring44	, "");
            PrefEditor.putString(buttonstring45	, "");
            PrefEditor.putString(buttonstring46	, "");
            PrefEditor.putString(buttonstring47	, "");
            PrefEditor.putString(buttonstring48	, "");
            PrefEditor.putString(buttonstring49	, "");

            PrefEditor.putString(buttonstring51	, "");
            PrefEditor.putString(buttonstring52	, "");
            PrefEditor.putString(buttonstring53	, "");
            PrefEditor.putString(buttonstring54	, "");
            PrefEditor.putString(buttonstring55	, "");
            PrefEditor.putString(buttonstring56	, "");
            PrefEditor.putString(buttonstring57	, "");
            PrefEditor.putString(buttonstring58	, "");
            PrefEditor.putString(buttonstring59	, "");

            PrefEditor.putString(buttonstring61	, "");
            PrefEditor.putString(buttonstring62	, "");
            PrefEditor.putString(buttonstring63	, "");
            PrefEditor.putString(buttonstring64	, "");
            PrefEditor.putString(buttonstring65	, "");
            PrefEditor.putString(buttonstring66	, "");
            PrefEditor.putString(buttonstring67	, "");
            PrefEditor.putString(buttonstring68	, "");
            PrefEditor.putString(buttonstring69	, "");

            PrefEditor.putString(buttonstring71	, "");
            PrefEditor.putString(buttonstring72	, "");
            PrefEditor.putString(buttonstring73	, "");
            PrefEditor.putString(buttonstring74	, "");
            PrefEditor.putString(buttonstring75	, "");
            PrefEditor.putString(buttonstring76	, "");
            PrefEditor.putString(buttonstring77	, "");
            PrefEditor.putString(buttonstring78	, "");
            PrefEditor.putString(buttonstring79	, "");

            PrefEditor.putString(buttonstring81	, "");
            PrefEditor.putString(buttonstring82	, "");
            PrefEditor.putString(buttonstring83	, "");
            PrefEditor.putString(buttonstring84	, "");
            PrefEditor.putString(buttonstring85	, "");
            PrefEditor.putString(buttonstring86	, "");
            PrefEditor.putString(buttonstring87	, "");
            PrefEditor.putString(buttonstring88	, "");
            PrefEditor.putString(buttonstring89	, "");

            PrefEditor.putString(buttonstring91	, "");
            PrefEditor.putString(buttonstring92	, "");
            PrefEditor.putString(buttonstring93	, "");
            PrefEditor.putString(buttonstring94	, "");
            PrefEditor.putString(buttonstring95	, "");
            PrefEditor.putString(buttonstring96	, "");
            PrefEditor.putString(buttonstring97	, "");
            PrefEditor.putString(buttonstring98	, "");
            PrefEditor.putString(buttonstring99	, "");

            PrefEditor.apply();

            SharedPreferences.Editor PrefEditorPrime = prime.edit();
            PrefEditorPrime.putString(buttonstring11	, "");
            PrefEditorPrime.putString(buttonstring12	, "");
            PrefEditorPrime.putString(buttonstring13	, "");
            PrefEditorPrime.putString(buttonstring14	, "");
            PrefEditorPrime.putString(buttonstring15	, "");
            PrefEditorPrime.putString(buttonstring16	, "");
            PrefEditorPrime.putString(buttonstring17	, "");
            PrefEditorPrime.putString(buttonstring18	, "");
            PrefEditorPrime.putString(buttonstring19	, "");

            PrefEditorPrime.putString(buttonstring21	, "");
            PrefEditorPrime.putString(buttonstring22	, "");
            PrefEditorPrime.putString(buttonstring23	, "");
            PrefEditorPrime.putString(buttonstring24	, "");
            PrefEditorPrime.putString(buttonstring25	, "");
            PrefEditorPrime.putString(buttonstring26	, "");
            PrefEditorPrime.putString(buttonstring27	, "");
            PrefEditorPrime.putString(buttonstring28	, "");
            PrefEditorPrime.putString(buttonstring29	, "");

            PrefEditorPrime.putString(buttonstring31	, "");
            PrefEditorPrime.putString(buttonstring32	, "");
            PrefEditorPrime.putString(buttonstring33	, "");
            PrefEditorPrime.putString(buttonstring34	, "");
            PrefEditorPrime.putString(buttonstring35	, "");
            PrefEditorPrime.putString(buttonstring36	, "");
            PrefEditorPrime.putString(buttonstring37	, "");
            PrefEditorPrime.putString(buttonstring38	, "");
            PrefEditorPrime.putString(buttonstring39	, "");

            PrefEditorPrime.putString(buttonstring41	, "");
            PrefEditorPrime.putString(buttonstring42	, "");
            PrefEditorPrime.putString(buttonstring43	, "");
            PrefEditorPrime.putString(buttonstring44	, "");
            PrefEditorPrime.putString(buttonstring45	, "");
            PrefEditorPrime.putString(buttonstring46	, "");
            PrefEditorPrime.putString(buttonstring47	, "");
            PrefEditorPrime.putString(buttonstring48	, "");
            PrefEditorPrime.putString(buttonstring49	, "");

            PrefEditorPrime.putString(buttonstring51	, "");
            PrefEditorPrime.putString(buttonstring52	, "");
            PrefEditorPrime.putString(buttonstring53	, "");
            PrefEditorPrime.putString(buttonstring54	, "");
            PrefEditorPrime.putString(buttonstring55	, "");
            PrefEditorPrime.putString(buttonstring56	, "");
            PrefEditorPrime.putString(buttonstring57	, "");
            PrefEditorPrime.putString(buttonstring58	, "");
            PrefEditorPrime.putString(buttonstring59	, "");

            PrefEditorPrime.putString(buttonstring61	, "");
            PrefEditorPrime.putString(buttonstring62	, "");
            PrefEditorPrime.putString(buttonstring63	, "");
            PrefEditorPrime.putString(buttonstring64	, "");
            PrefEditorPrime.putString(buttonstring65	, "");
            PrefEditorPrime.putString(buttonstring66	, "");
            PrefEditorPrime.putString(buttonstring67	, "");
            PrefEditorPrime.putString(buttonstring68	, "");
            PrefEditorPrime.putString(buttonstring69	, "");

            PrefEditorPrime.putString(buttonstring71	, "");
            PrefEditorPrime.putString(buttonstring72	, "");
            PrefEditorPrime.putString(buttonstring73	, "");
            PrefEditorPrime.putString(buttonstring74	, "");
            PrefEditorPrime.putString(buttonstring75	, "");
            PrefEditorPrime.putString(buttonstring76	, "");
            PrefEditorPrime.putString(buttonstring77	, "");
            PrefEditorPrime.putString(buttonstring78	, "");
            PrefEditorPrime.putString(buttonstring79	, "");

            PrefEditorPrime.putString(buttonstring81	, "");
            PrefEditorPrime.putString(buttonstring82	, "");
            PrefEditorPrime.putString(buttonstring83	, "");
            PrefEditorPrime.putString(buttonstring84	, "");
            PrefEditorPrime.putString(buttonstring85	, "");
            PrefEditorPrime.putString(buttonstring86	, "");
            PrefEditorPrime.putString(buttonstring87	, "");
            PrefEditorPrime.putString(buttonstring88	, "");
            PrefEditorPrime.putString(buttonstring89	, "");

            PrefEditorPrime.putString(buttonstring91	, "");
            PrefEditorPrime.putString(buttonstring92	, "");
            PrefEditorPrime.putString(buttonstring93	, "");
            PrefEditorPrime.putString(buttonstring94	, "");
            PrefEditorPrime.putString(buttonstring95	, "");
            PrefEditorPrime.putString(buttonstring96	, "");
            PrefEditorPrime.putString(buttonstring97	, "");
            PrefEditorPrime.putString(buttonstring98	, "");
            PrefEditorPrime.putString(buttonstring99	, "");

            PrefEditorPrime.apply();


        }


        variant();
        primordialunits();



        //SharedPreferences.Editor PrefEditorPrime = SharedprefsPrime.edit();



        String oldvalue11 = SharedPrefs.getString(buttonstring11, "");
        button11.setText(oldvalue11);
        String oldvalue12 = SharedPrefs.getString(buttonstring12, "");
        button12.setText(oldvalue12);
        String oldvalue13 = SharedPrefs.getString(buttonstring13, "");
        button13.setText(oldvalue13);
        String oldvalue14 = SharedPrefs.getString(buttonstring14, "");
        button14.setText(oldvalue14);
        String oldvalue15 = SharedPrefs.getString(buttonstring15, "");
        button15.setText(oldvalue15);
        String oldvalue16 = SharedPrefs.getString(buttonstring16, "");
        button16.setText(oldvalue16);
        String oldvalue17 = SharedPrefs.getString(buttonstring17, "");
        button17.setText(oldvalue17);
        String oldvalue18 = SharedPrefs.getString(buttonstring18, "");
        button18.setText(oldvalue18);
        String oldvalue19 = SharedPrefs.getString(buttonstring19, "");
        button19.setText(oldvalue19);

        String oldvalue21 = SharedPrefs.getString(buttonstring21, "");
        button21.setText(oldvalue21);
        String oldvalue22 = SharedPrefs.getString(buttonstring22, "");
        button22.setText(oldvalue22);
        String oldvalue23 = SharedPrefs.getString(buttonstring23, "");
        button23.setText(oldvalue23);
        String oldvalue24 = SharedPrefs.getString(buttonstring24, "");
        button24.setText(oldvalue24);
        String oldvalue25 = SharedPrefs.getString(buttonstring25, "");
        button25.setText(oldvalue25);
        String oldvalue26 = SharedPrefs.getString(buttonstring26, "");
        button26.setText(oldvalue26);
        String oldvalue27 = SharedPrefs.getString(buttonstring27, "");
        button27.setText(oldvalue27);
        String oldvalue28 = SharedPrefs.getString(buttonstring28, "");
        button28.setText(oldvalue28);
        String oldvalue29 = SharedPrefs.getString(buttonstring29, "");
        button29.setText(oldvalue29);

        String oldvalue31 = SharedPrefs.getString(buttonstring31, "");
        button31.setText(oldvalue31);
        String oldvalue32 = SharedPrefs.getString(buttonstring32, "");
        button32.setText(oldvalue32);
        String oldvalue33 = SharedPrefs.getString(buttonstring33, "");
        button33.setText(oldvalue33);
        String oldvalue34 = SharedPrefs.getString(buttonstring34, "");
        button34.setText(oldvalue34);
        String oldvalue35 = SharedPrefs.getString(buttonstring35, "");
        button35.setText(oldvalue35);
        String oldvalue36 = SharedPrefs.getString(buttonstring36, "");
        button36.setText(oldvalue36);
        String oldvalue37 = SharedPrefs.getString(buttonstring37, "");
        button37.setText(oldvalue37);
        String oldvalue38 = SharedPrefs.getString(buttonstring38, "");
        button38.setText(oldvalue38);
        String oldvalue39 = SharedPrefs.getString(buttonstring39, "");
        button39.setText(oldvalue39);

        String oldvalue41 = SharedPrefs.getString(buttonstring41, "");
        button41.setText(oldvalue41);
        String oldvalue42 = SharedPrefs.getString(buttonstring42, "");
        button42.setText(oldvalue42);
        String oldvalue43 = SharedPrefs.getString(buttonstring43, "");
        button43.setText(oldvalue43);
        String oldvalue44 = SharedPrefs.getString(buttonstring44, "");
        button44.setText(oldvalue44);
        String oldvalue45 = SharedPrefs.getString(buttonstring45, "");
        button45.setText(oldvalue45);
        String oldvalue46 = SharedPrefs.getString(buttonstring46, "");
        button46.setText(oldvalue46);
        String oldvalue47 = SharedPrefs.getString(buttonstring47, "");
        button47.setText(oldvalue47);
        String oldvalue48 = SharedPrefs.getString(buttonstring48, "");
        button48.setText(oldvalue48);
        String oldvalue49 = SharedPrefs.getString(buttonstring49, "");
        button49.setText(oldvalue49);

        String oldvalue51 = SharedPrefs.getString(buttonstring51, "");
        button51.setText(oldvalue51);
        String oldvalue52 = SharedPrefs.getString(buttonstring52, "");
        button52.setText(oldvalue52);
        String oldvalue53 = SharedPrefs.getString(buttonstring53, "");
        button53.setText(oldvalue53);
        String oldvalue54 = SharedPrefs.getString(buttonstring54, "");
        button54.setText(oldvalue54);
        String oldvalue55 = SharedPrefs.getString(buttonstring55, "");
        button55.setText(oldvalue55);
        String oldvalue56 = SharedPrefs.getString(buttonstring56, "");
        button56.setText(oldvalue56);
        String oldvalue57 = SharedPrefs.getString(buttonstring57, "");
        button57.setText(oldvalue57);
        String oldvalue58 = SharedPrefs.getString(buttonstring58, "");
        button58.setText(oldvalue58);
        String oldvalue59 = SharedPrefs.getString(buttonstring59, "");
        button59.setText(oldvalue59);

        String oldvalue61 = SharedPrefs.getString(buttonstring61, "");
        button61.setText(oldvalue61);
        String oldvalue62 = SharedPrefs.getString(buttonstring62, "");
        button62.setText(oldvalue62);
        String oldvalue63 = SharedPrefs.getString(buttonstring63, "");
        button63.setText(oldvalue63);
        String oldvalue64 = SharedPrefs.getString(buttonstring64, "");
        button64.setText(oldvalue64);
        String oldvalue65 = SharedPrefs.getString(buttonstring65, "");
        button65.setText(oldvalue65);
        String oldvalue66 = SharedPrefs.getString(buttonstring66, "");
        button66.setText(oldvalue66);
        String oldvalue67 = SharedPrefs.getString(buttonstring67, "");
        button67.setText(oldvalue67);
        String oldvalue68 = SharedPrefs.getString(buttonstring68, "");
        button68.setText(oldvalue68);
        String oldvalue69 = SharedPrefs.getString(buttonstring69, "");
        button69.setText(oldvalue69);

        String oldvalue71 = SharedPrefs.getString(buttonstring71, "");
        button71.setText(oldvalue71);
        String oldvalue72 = SharedPrefs.getString(buttonstring72, "");
        button72.setText(oldvalue72);
        String oldvalue73 = SharedPrefs.getString(buttonstring73, "");
        button73.setText(oldvalue73);
        String oldvalue74 = SharedPrefs.getString(buttonstring74, "");
        button74.setText(oldvalue74);
        String oldvalue75 = SharedPrefs.getString(buttonstring75, "");
        button75.setText(oldvalue75);
        String oldvalue76 = SharedPrefs.getString(buttonstring76, "");
        button76.setText(oldvalue76);
        String oldvalue77 = SharedPrefs.getString(buttonstring77, "");
        button77.setText(oldvalue77);
        String oldvalue78 = SharedPrefs.getString(buttonstring78, "");
        button78.setText(oldvalue78);
        String oldvalue79 = SharedPrefs.getString(buttonstring79, "");
        button79.setText(oldvalue79);

        String oldvalue81 = SharedPrefs.getString(buttonstring81, "");
        button81.setText(oldvalue81);
        String oldvalue82 = SharedPrefs.getString(buttonstring82, "");
        button82.setText(oldvalue82);
        String oldvalue83 = SharedPrefs.getString(buttonstring83, "");
        button83.setText(oldvalue83);
        String oldvalue84 = SharedPrefs.getString(buttonstring84, "");
        button84.setText(oldvalue84);
        String oldvalue85 = SharedPrefs.getString(buttonstring85, "");
        button85.setText(oldvalue85);
        String oldvalue86 = SharedPrefs.getString(buttonstring86, "");
        button86.setText(oldvalue86);
        String oldvalue87 = SharedPrefs.getString(buttonstring87, "");
        button87.setText(oldvalue87);
        String oldvalue88 = SharedPrefs.getString(buttonstring88, "");
        button88.setText(oldvalue88);
        String oldvalue89 = SharedPrefs.getString(buttonstring89, "");
        button89.setText(oldvalue89);

        String oldvalue91 = SharedPrefs.getString(buttonstring91, "");
        button91.setText(oldvalue91);
        String oldvalue92 = SharedPrefs.getString(buttonstring92, "");
        button92.setText(oldvalue92);
        String oldvalue93 = SharedPrefs.getString(buttonstring93, "");
        button93.setText(oldvalue93);
        String oldvalue94 = SharedPrefs.getString(buttonstring94, "");
        button94.setText(oldvalue94);
        String oldvalue95 = SharedPrefs.getString(buttonstring95, "");
        button95.setText(oldvalue95);
        String oldvalue96 = SharedPrefs.getString(buttonstring96, "");
        button96.setText(oldvalue96);
        String oldvalue97 = SharedPrefs.getString(buttonstring97, "");
        button97.setText(oldvalue97);
        String oldvalue98 = SharedPrefs.getString(buttonstring98, "");
        button98.setText(oldvalue98);
        String oldvalue99 = SharedPrefs.getString(buttonstring99, "");
        button99.setText(oldvalue99);

    }

    private void stringprime(){
        SharedPreferences prime = getSharedPreferences("Prime",Context.MODE_PRIVATE);
        buttonprime11 = prime.getString(buttonstring11, "");
        buttonprime12 = prime.getString(buttonstring12, "");
        buttonprime13 = prime.getString(buttonstring13, "");
        buttonprime14 = prime.getString(buttonstring14, "");
        buttonprime15 = prime.getString(buttonstring15, "");
        buttonprime16 = prime.getString(buttonstring16, "");
        buttonprime17 = prime.getString(buttonstring17, "");
        buttonprime18 = prime.getString(buttonstring18, "");
        buttonprime19 = prime.getString(buttonstring19, "");

        buttonprime21 = prime.getString(buttonstring21, "");
        buttonprime22 = prime.getString(buttonstring22, "");
        buttonprime23 = prime.getString(buttonstring23, "");
        buttonprime24 = prime.getString(buttonstring24, "");
        buttonprime25 = prime.getString(buttonstring25, "");
        buttonprime26 = prime.getString(buttonstring26, "");
        buttonprime27 = prime.getString(buttonstring27, "");
        buttonprime28 = prime.getString(buttonstring28, "");
        buttonprime29 = prime.getString(buttonstring29, "");

        buttonprime31 = prime.getString(buttonstring31, "");
        buttonprime32 = prime.getString(buttonstring32, "");
        buttonprime33 = prime.getString(buttonstring33, "");
        buttonprime34 = prime.getString(buttonstring34, "");
        buttonprime35 = prime.getString(buttonstring35, "");
        buttonprime36 = prime.getString(buttonstring36, "");
        buttonprime37 = prime.getString(buttonstring37, "");
        buttonprime38 = prime.getString(buttonstring38, "");
        buttonprime39 = prime.getString(buttonstring39, "");

        buttonprime41 = prime.getString(buttonstring41, "");
        buttonprime42 = prime.getString(buttonstring42, "");
        buttonprime43 = prime.getString(buttonstring43, "");
        buttonprime44 = prime.getString(buttonstring44, "");
        buttonprime45 = prime.getString(buttonstring45, "");
        buttonprime46 = prime.getString(buttonstring46, "");
        buttonprime47 = prime.getString(buttonstring47, "");
        buttonprime48 = prime.getString(buttonstring48, "");
        buttonprime49 = prime.getString(buttonstring49, "");

        buttonprime51 = prime.getString(buttonstring51, "");
        buttonprime52 = prime.getString(buttonstring52, "");
        buttonprime53 = prime.getString(buttonstring53, "");
        buttonprime54 = prime.getString(buttonstring54, "");
        buttonprime55 = prime.getString(buttonstring55, "");
        buttonprime56 = prime.getString(buttonstring56, "");
        buttonprime57 = prime.getString(buttonstring57, "");
        buttonprime58 = prime.getString(buttonstring58, "");
        buttonprime59 = prime.getString(buttonstring59, "");

        buttonprime61 = prime.getString(buttonstring61, "");
        buttonprime62 = prime.getString(buttonstring62, "");
        buttonprime63 = prime.getString(buttonstring63, "");
        buttonprime64 = prime.getString(buttonstring64, "");
        buttonprime65 = prime.getString(buttonstring65, "");
        buttonprime66 = prime.getString(buttonstring66, "");
        buttonprime67 = prime.getString(buttonstring67, "");
        buttonprime68 = prime.getString(buttonstring68, "");
        buttonprime69 = prime.getString(buttonstring69, "");

        buttonprime71 = prime.getString(buttonstring71, "");
        buttonprime72 = prime.getString(buttonstring72, "");
        buttonprime73 = prime.getString(buttonstring73, "");
        buttonprime74 = prime.getString(buttonstring74, "");
        buttonprime75 = prime.getString(buttonstring75, "");
        buttonprime76 = prime.getString(buttonstring76, "");
        buttonprime77 = prime.getString(buttonstring77, "");
        buttonprime78 = prime.getString(buttonstring78, "");
        buttonprime79 = prime.getString(buttonstring79, "");

        buttonprime81 = prime.getString(buttonstring81, "");
        buttonprime82 = prime.getString(buttonstring82, "");
        buttonprime83 = prime.getString(buttonstring83, "");
        buttonprime84 = prime.getString(buttonstring84, "");
        buttonprime85 = prime.getString(buttonstring85, "");
        buttonprime86 = prime.getString(buttonstring86, "");
        buttonprime87 = prime.getString(buttonstring87, "");
        buttonprime88 = prime.getString(buttonstring88, "");
        buttonprime89 = prime.getString(buttonstring89, "");

        buttonprime91 = prime.getString(buttonstring91, "");
        buttonprime92 = prime.getString(buttonstring92, "");
        buttonprime93 = prime.getString(buttonstring93, "");
        buttonprime94 = prime.getString(buttonstring94, "");
        buttonprime95 = prime.getString(buttonstring95, "");
        buttonprime96 = prime.getString(buttonstring96, "");
        buttonprime97 = prime.getString(buttonstring97, "");
        buttonprime98 = prime.getString(buttonstring98, "");
        buttonprime99 = prime.getString(buttonstring99, "");
    }

    private void variant(){



        //SharedPrefs = getPreferences(MODE_PRIVATE);
        //SharedPreferences.Editor PrefEditor = SharedPrefs.edit();
        //SharedPreferences prime = getSharedPreferences("Prime",Context.MODE_PRIVATE);
        //SharedPreferences.Editor PrefEditorPrime = prime.edit();






    }

    public void easy(){

    }
    public void normal(){

    }
    public void hard(){

    }
    public void try_me(){

    }



    private void primordialunits(){

        stringprime();



        if (buttonprime11.equals("yes")) {
            button11.setBackgroundResource(R.drawable.field_unit_primordial);
        }
        if (buttonprime12.equals("yes")) {
            button12.setBackgroundResource(R.drawable.field_unit_primordial);
        }
        if (buttonprime13.equals("yes")) {
            button13.setBackgroundResource(R.drawable.field_unit_primordial);
        }
        if (buttonprime14.equals("yes")) {
            button14.setBackgroundResource(R.drawable.field_unit_primordial);
        }
        if (buttonprime15.equals("yes")) {
            button15.setBackgroundResource(R.drawable.field_unit_primordial);
        }
        if (buttonprime16.equals("yes")) {
            button16.setBackgroundResource(R.drawable.field_unit_primordial);
        }
        if (buttonprime17.equals("yes")) {
            button17.setBackgroundResource(R.drawable.field_unit_primordial);
        }
        if (buttonprime18.equals("yes")) {
            button18.setBackgroundResource(R.drawable.field_unit_primordial);
        }
        if (buttonprime19.equals("yes")) {
            button19.setBackgroundResource(R.drawable.field_unit_primordial);
        }
        if (buttonprime21.equals("yes")) {
            button21.setBackgroundResource(R.drawable.field_unit_primordial);
        }
        if (buttonprime22.equals("yes")) {
            button22.setBackgroundResource(R.drawable.field_unit_primordial);
        }
        if (buttonprime23.equals("yes")) {
            button23.setBackgroundResource(R.drawable.field_unit_primordial);
        }
        if (buttonprime24.equals("yes")) {
            button24.setBackgroundResource(R.drawable.field_unit_primordial);
        }
        if (buttonprime25.equals("yes")) {
            button25.setBackgroundResource(R.drawable.field_unit_primordial);
        }
        if (buttonprime26.equals("yes")) {
            button26.setBackgroundResource(R.drawable.field_unit_primordial);
        }
        if (buttonprime27.equals("yes")) {
            button27.setBackgroundResource(R.drawable.field_unit_primordial);
        }
        if (buttonprime28.equals("yes")) {
            button28.setBackgroundResource(R.drawable.field_unit_primordial);
        }
        if (buttonprime29.equals("yes")) {
            button29.setBackgroundResource(R.drawable.field_unit_primordial);
        }

        if (buttonprime31.equals("yes")) {
            button31.setBackgroundResource(R.drawable.field_unit_primordial);
        }
        if (buttonprime32.equals("yes")) {
            button32.setBackgroundResource(R.drawable.field_unit_primordial);
        }
        if (buttonprime33.equals("yes")) {
            button33.setBackgroundResource(R.drawable.field_unit_primordial);
        }
        if (buttonprime34.equals("yes")) {
            button34.setBackgroundResource(R.drawable.field_unit_primordial);
        }
        if (buttonprime35.equals("yes")) {
            button35.setBackgroundResource(R.drawable.field_unit_primordial);
        }
        if (buttonprime36.equals("yes")) {
            button36.setBackgroundResource(R.drawable.field_unit_primordial);
        }
        if (buttonprime37.equals("yes")) {
            button37.setBackgroundResource(R.drawable.field_unit_primordial);
        }
        if (buttonprime38.equals("yes")) {
            button38.setBackgroundResource(R.drawable.field_unit_primordial);
        }
        if (buttonprime39.equals("yes")) {
            button39.setBackgroundResource(R.drawable.field_unit_primordial);
        }
        if (buttonprime41.equals("yes")) {
            button41.setBackgroundResource(R.drawable.field_unit_primordial);
        }
        if (buttonprime42.equals("yes")) {
            button42.setBackgroundResource(R.drawable.field_unit_primordial);
        }
        if (buttonprime43.equals("yes")) {
            button43.setBackgroundResource(R.drawable.field_unit_primordial);
        }
        if (buttonprime44.equals("yes")) {
            button44.setBackgroundResource(R.drawable.field_unit_primordial);
        }
        if (buttonprime45.equals("yes")) {
            button45.setBackgroundResource(R.drawable.field_unit_primordial);
        }
        if (buttonprime46.equals("yes")) {
            button46.setBackgroundResource(R.drawable.field_unit_primordial);
        }
        if (buttonprime47.equals("yes")) {
            button47.setBackgroundResource(R.drawable.field_unit_primordial);
        }
        if (buttonprime48.equals("yes")) {
            button48.setBackgroundResource(R.drawable.field_unit_primordial);
        }
        if (buttonprime49.equals("yes")) {
            button49.setBackgroundResource(R.drawable.field_unit_primordial);
        }

        if (buttonprime51.equals("yes")) {
            button51.setBackgroundResource(R.drawable.field_unit_primordial);
        }
        if (buttonprime52.equals("yes")) {
            button52.setBackgroundResource(R.drawable.field_unit_primordial);
        }
        if (buttonprime53.equals("yes")) {
            button53.setBackgroundResource(R.drawable.field_unit_primordial);
        }
        if (buttonprime54.equals("yes")) {
            button54.setBackgroundResource(R.drawable.field_unit_primordial);
        }
        if (buttonprime55.equals("yes")) {
            button55.setBackgroundResource(R.drawable.field_unit_primordial);
        }
        if (buttonprime56.equals("yes")) {
            button56.setBackgroundResource(R.drawable.field_unit_primordial);
        }
        if (buttonprime57.equals("yes")) {
            button57.setBackgroundResource(R.drawable.field_unit_primordial);
        }
        if (buttonprime58.equals("yes")) {
            button58.setBackgroundResource(R.drawable.field_unit_primordial);
        }
        if (buttonprime59.equals("yes")) {
            button59.setBackgroundResource(R.drawable.field_unit_primordial);
        }

        if (buttonprime61.equals("yes")) {
            button61.setBackgroundResource(R.drawable.field_unit_primordial);
        }
        if (buttonprime62.equals("yes")) {
            button62.setBackgroundResource(R.drawable.field_unit_primordial);
        }
        if (buttonprime63.equals("yes")) {
            button63.setBackgroundResource(R.drawable.field_unit_primordial);
        }
        if (buttonprime64.equals("yes")) {
            button64.setBackgroundResource(R.drawable.field_unit_primordial);
        }
        if (buttonprime65.equals("yes")) {
            button65.setBackgroundResource(R.drawable.field_unit_primordial);
        }
        if (buttonprime66.equals("yes")) {
            button66.setBackgroundResource(R.drawable.field_unit_primordial);
        }
        if (buttonprime67.equals("yes")) {
            button67.setBackgroundResource(R.drawable.field_unit_primordial);
        }
        if (buttonprime68.equals("yes")) {
            button68.setBackgroundResource(R.drawable.field_unit_primordial);
        }
        if (buttonprime69.equals("yes")) {
            button69.setBackgroundResource(R.drawable.field_unit_primordial);
        }

        if (buttonprime71.equals("yes")) {
            button71.setBackgroundResource(R.drawable.field_unit_primordial);
        }
        if (buttonprime72.equals("yes")) {
            button72.setBackgroundResource(R.drawable.field_unit_primordial);
        }
        if (buttonprime73.equals("yes")) {
            button73.setBackgroundResource(R.drawable.field_unit_primordial);
        }
        if (buttonprime74.equals("yes")) {
            button74.setBackgroundResource(R.drawable.field_unit_primordial);
        }
        if (buttonprime75.equals("yes")) {
            button75.setBackgroundResource(R.drawable.field_unit_primordial);
        }
        if (buttonprime76.equals("yes")) {
            button76.setBackgroundResource(R.drawable.field_unit_primordial);
        }
        if (buttonprime77.equals("yes")) {
            button77.setBackgroundResource(R.drawable.field_unit_primordial);
        }
        if (buttonprime78.equals("yes")) {
            button78.setBackgroundResource(R.drawable.field_unit_primordial);
        }
        if (buttonprime79.equals("yes")) {
            button79.setBackgroundResource(R.drawable.field_unit_primordial);
        }

        if (buttonprime81.equals("yes")) {
            button81.setBackgroundResource(R.drawable.field_unit_primordial);
        }
        if (buttonprime82.equals("yes")) {
            button82.setBackgroundResource(R.drawable.field_unit_primordial);
        }
        if (buttonprime83.equals("yes")) {
            button83.setBackgroundResource(R.drawable.field_unit_primordial);
        }
        if (buttonprime84.equals("yes")) {
            button84.setBackgroundResource(R.drawable.field_unit_primordial);
        }
        if (buttonprime85.equals("yes")) {
            button85.setBackgroundResource(R.drawable.field_unit_primordial);
        }
        if (buttonprime86.equals("yes")) {
            button86.setBackgroundResource(R.drawable.field_unit_primordial);
        }
        if (buttonprime87.equals("yes")) {
            button87.setBackgroundResource(R.drawable.field_unit_primordial);
        }
        if (buttonprime88.equals("yes")) {
            button88.setBackgroundResource(R.drawable.field_unit_primordial);
        }
        if (buttonprime89.equals("yes")) {
            button89.setBackgroundResource(R.drawable.field_unit_primordial);
        }

        if (buttonprime91.equals("yes")) {
            button91.setBackgroundResource(R.drawable.field_unit_primordial);
        }
        if (buttonprime92.equals("yes")) {
            button92.setBackgroundResource(R.drawable.field_unit_primordial);
        }
        if (buttonprime93.equals("yes")) {
            button93.setBackgroundResource(R.drawable.field_unit_primordial);
        }
        if (buttonprime94.equals("yes")) {
            button94.setBackgroundResource(R.drawable.field_unit_primordial);
        }
        if (buttonprime95.equals("yes")) {
            button95.setBackgroundResource(R.drawable.field_unit_primordial);
        }
        if (buttonprime96.equals("yes")) {
            button96.setBackgroundResource(R.drawable.field_unit_primordial);
        }
        if (buttonprime97.equals("yes")) {
            button97.setBackgroundResource(R.drawable.field_unit_primordial);
        }
        if (buttonprime98.equals("yes")) {
            button98.setBackgroundResource(R.drawable.field_unit_primordial);
        }
        if (buttonprime99.equals("yes")) {
            button99.setBackgroundResource(R.drawable.field_unit_primordial);
        }
    }
    private void normalunits(){
        stringprime();





        if (!buttonprime11.equals("yes")) {
            button11.setBackgroundResource(R.drawable.field_unit_selector);
        }
        if (!buttonprime12.equals("yes")) {
            button12.setBackgroundResource(R.drawable.field_unit_selector);
        }
        if (!buttonprime13.equals("yes")) {
            button13.setBackgroundResource(R.drawable.field_unit_selector);
        }
        if (!buttonprime14.equals("yes")) {
            button14.setBackgroundResource(R.drawable.field_unit_selector);
        }
        if (!buttonprime15.equals("yes")) {
            button15.setBackgroundResource(R.drawable.field_unit_selector);
        }
        if (!buttonprime16.equals("yes")) {
            button16.setBackgroundResource(R.drawable.field_unit_selector);
        }
        if (!buttonprime17.equals("yes")) {
            button17.setBackgroundResource(R.drawable.field_unit_selector);
        }
        if (!buttonprime18.equals("yes")) {
            button18.setBackgroundResource(R.drawable.field_unit_selector);
        }
        if (!buttonprime19.equals("yes")) {
            button19.setBackgroundResource(R.drawable.field_unit_selector);
        }
        if (!buttonprime21.equals("yes")) {
            button21.setBackgroundResource(R.drawable.field_unit_selector);
        }
        if (!buttonprime22.equals("yes")) {
            button22.setBackgroundResource(R.drawable.field_unit_selector);
        }
        if (!buttonprime23.equals("yes")) {
            button23.setBackgroundResource(R.drawable.field_unit_selector);
        }
        if (!buttonprime24.equals("yes")) {
            button24.setBackgroundResource(R.drawable.field_unit_selector);
        }
        if (!buttonprime25.equals("yes")) {
            button25.setBackgroundResource(R.drawable.field_unit_selector);
        }
        if (!buttonprime26.equals("yes")) {
            button26.setBackgroundResource(R.drawable.field_unit_selector);
        }
        if (!buttonprime27.equals("yes")) {
            button27.setBackgroundResource(R.drawable.field_unit_selector);
        }
        if (!buttonprime28.equals("yes")) {
            button28.setBackgroundResource(R.drawable.field_unit_selector);
        }
        if (!buttonprime29.equals("yes")) {
            button29.setBackgroundResource(R.drawable.field_unit_selector);
        }

        if (!buttonprime31.equals("yes")) {
            button31.setBackgroundResource(R.drawable.field_unit_selector);
        }
        if (!buttonprime32.equals("yes")) {
            button32.setBackgroundResource(R.drawable.field_unit_selector);
        }
        if (!buttonprime33.equals("yes")) {
            button33.setBackgroundResource(R.drawable.field_unit_selector);
        }
        if (!buttonprime34.equals("yes")) {
            button34.setBackgroundResource(R.drawable.field_unit_selector);
        }
        if (!buttonprime35.equals("yes")) {
            button35.setBackgroundResource(R.drawable.field_unit_selector);
        }
        if (!buttonprime36.equals("yes")) {
            button36.setBackgroundResource(R.drawable.field_unit_selector);
        }
        if (!buttonprime37.equals("yes")) {
            button37.setBackgroundResource(R.drawable.field_unit_selector);
        }
        if (!buttonprime38.equals("yes")) {
            button38.setBackgroundResource(R.drawable.field_unit_selector);
        }
        if (!buttonprime39.equals("yes")) {
            button39.setBackgroundResource(R.drawable.field_unit_selector);
        }
        if (!buttonprime41.equals("yes")) {
            button41.setBackgroundResource(R.drawable.field_unit_selector);
        }
        if (!buttonprime42.equals("yes")) {
            button42.setBackgroundResource(R.drawable.field_unit_selector);
        }
        if (!buttonprime43.equals("yes")) {
            button43.setBackgroundResource(R.drawable.field_unit_selector);
        }
        if (!buttonprime44.equals("yes")) {
            button44.setBackgroundResource(R.drawable.field_unit_selector);
        }
        if (!buttonprime45.equals("yes")) {
            button45.setBackgroundResource(R.drawable.field_unit_selector);
        }
        if (!buttonprime46.equals("yes")) {
            button46.setBackgroundResource(R.drawable.field_unit_selector);
        }
        if (!buttonprime47.equals("yes")) {
            button47.setBackgroundResource(R.drawable.field_unit_selector);
        }
        if (!buttonprime48.equals("yes")) {
            button48.setBackgroundResource(R.drawable.field_unit_selector);
        }
        if (!buttonprime49.equals("yes")) {
            button49.setBackgroundResource(R.drawable.field_unit_selector);
        }

        if (!buttonprime51.equals("yes")) {
            button51.setBackgroundResource(R.drawable.field_unit_selector);
        }
        if (!buttonprime52.equals("yes")) {
            button52.setBackgroundResource(R.drawable.field_unit_selector);
        }
        if (!buttonprime53.equals("yes")) {
            button53.setBackgroundResource(R.drawable.field_unit_selector);
        }
        if (!buttonprime54.equals("yes")) {
            button54.setBackgroundResource(R.drawable.field_unit_selector);
        }
        if (!buttonprime55.equals("yes")) {
            button55.setBackgroundResource(R.drawable.field_unit_selector);
        }
        if (!buttonprime56.equals("yes")) {
            button56.setBackgroundResource(R.drawable.field_unit_selector);
        }
        if (!buttonprime57.equals("yes")) {
            button57.setBackgroundResource(R.drawable.field_unit_selector);
        }
        if (!buttonprime58.equals("yes")) {
            button58.setBackgroundResource(R.drawable.field_unit_selector);
        }
        if (!buttonprime59.equals("yes")) {
            button59.setBackgroundResource(R.drawable.field_unit_selector);
        }

        if (!buttonprime61.equals("yes")) {
            button61.setBackgroundResource(R.drawable.field_unit_selector);
        }
        if (!buttonprime62.equals("yes")) {
            button62.setBackgroundResource(R.drawable.field_unit_selector);
        }
        if (!buttonprime63.equals("yes")) {
            button63.setBackgroundResource(R.drawable.field_unit_selector);
        }
        if (!buttonprime64.equals("yes")) {
            button64.setBackgroundResource(R.drawable.field_unit_selector);
        }
        if (!buttonprime65.equals("yes")) {
            button65.setBackgroundResource(R.drawable.field_unit_selector);
        }
        if (!buttonprime66.equals("yes")) {
            button66.setBackgroundResource(R.drawable.field_unit_selector);
        }
        if (!buttonprime67.equals("yes")) {
            button67.setBackgroundResource(R.drawable.field_unit_selector);
        }
        if (!buttonprime68.equals("yes")) {
            button68.setBackgroundResource(R.drawable.field_unit_selector);
        }
        if (!buttonprime69.equals("yes")) {
            button69.setBackgroundResource(R.drawable.field_unit_selector);
        }

        if (!buttonprime71.equals("yes")) {
            button71.setBackgroundResource(R.drawable.field_unit_selector);
        }
        if (!buttonprime72.equals("yes")) {
            button72.setBackgroundResource(R.drawable.field_unit_selector);
        }
        if (!buttonprime73.equals("yes")) {
            button73.setBackgroundResource(R.drawable.field_unit_selector);
        }
        if (!buttonprime74.equals("yes")) {
            button74.setBackgroundResource(R.drawable.field_unit_selector);
        }
        if (!buttonprime75.equals("yes")) {
            button75.setBackgroundResource(R.drawable.field_unit_selector);
        }
        if (!buttonprime76.equals("yes")) {
            button76.setBackgroundResource(R.drawable.field_unit_selector);
        }
        if (!buttonprime77.equals("yes")) {
            button77.setBackgroundResource(R.drawable.field_unit_selector);
        }
        if (!buttonprime78.equals("yes")) {
            button78.setBackgroundResource(R.drawable.field_unit_selector);
        }
        if (!buttonprime79.equals("yes")) {
            button79.setBackgroundResource(R.drawable.field_unit_selector);
        }

        if (!buttonprime81.equals("yes")) {
            button81.setBackgroundResource(R.drawable.field_unit_selector);
        }
        if (!buttonprime82.equals("yes")) {
            button82.setBackgroundResource(R.drawable.field_unit_selector);
        }
        if (!buttonprime83.equals("yes")) {
            button83.setBackgroundResource(R.drawable.field_unit_selector);
        }
        if (!buttonprime84.equals("yes")) {
            button84.setBackgroundResource(R.drawable.field_unit_selector);
        }
        if (!buttonprime85.equals("yes")) {
            button85.setBackgroundResource(R.drawable.field_unit_selector);
        }
        if (!buttonprime86.equals("yes")) {
            button86.setBackgroundResource(R.drawable.field_unit_selector);
        }
        if (!buttonprime87.equals("yes")) {
            button87.setBackgroundResource(R.drawable.field_unit_selector);
        }
        if (!buttonprime88.equals("yes")) {
            button88.setBackgroundResource(R.drawable.field_unit_selector);
        }
        if (!buttonprime89.equals("yes")) {
            button89.setBackgroundResource(R.drawable.field_unit_selector);
        }

        if (!buttonprime91.equals("yes")) {
            button91.setBackgroundResource(R.drawable.field_unit_selector);
        }
        if (!buttonprime92.equals("yes")) {
            button92.setBackgroundResource(R.drawable.field_unit_selector);
        }
        if (!buttonprime93.equals("yes")) {
            button93.setBackgroundResource(R.drawable.field_unit_selector);
        }
        if (!buttonprime94.equals("yes")) {
            button94.setBackgroundResource(R.drawable.field_unit_selector);
        }
        if (!buttonprime95.equals("yes")) {
            button95.setBackgroundResource(R.drawable.field_unit_selector);
        }
        if (!buttonprime96.equals("yes")) {
            button96.setBackgroundResource(R.drawable.field_unit_selector);
        }
        if (!buttonprime97.equals("yes")) {
            button97.setBackgroundResource(R.drawable.field_unit_selector);
        }
        if (!buttonprime98.equals("yes")) {
            button98.setBackgroundResource(R.drawable.field_unit_selector);
        }
        if (!buttonprime99.equals("yes")) {
            button99.setBackgroundResource(R.drawable.field_unit_selector);
        }
    }

    public void test(View v){

        //SharedPreferences shareoptions=getSharedPreferences("Options", Context.MODE_PRIVATE);
        //String lightupsimilarstring=shareoptions.getString("lightsimilar","");
        //if (lightupsimilarstring.equals("yes")||lightupsimilarstring.equals("")){
        //    lightUpSimilar=1;
        //}
        //else if (lightupsimilarstring.equals("no")){
        //    lightUpSimilar=0;
        //}


        idSelected1 = v.getId();
        String idSelectedString1=Integer.toString(idSelected1);

        SharedPreferences prime = getSharedPreferences("Prime",Context.MODE_PRIVATE);
        String Prime = prime.getString(idSelectedString1,"");

        //String idSelectedString1= Integer.toString(idSelected1);
        //String prime=SharedprefsPrime.getString(idSelectedString1,"");
        //if (prime.equals("yes")){

        //}




        if (Prime.equals("")) {

            if (lightUpSimilar==1){
                primordialunits();
                normalunits();
            }
            if (redUnitInt==1){
                tablesunits();
                checkRed();
            }

            if (idSelected1 == idSelected2) {
                if (v.isSelected()) {
                    v.setSelected(false);

                    if (lightUpSimilar==1||redUnitInt==1){
                        primordialunits();
                        normalunits();
                    }

                    idSelected3=idSelected2;
                    idSelected2 = idSelected1;

                } else if (!v.isSelected()){
                    v.setSelected(true);
                    idSelected3 = idSelected2;
                    idSelected2 = idSelected1;
                    if (lightUpSimilar==1){
                        greencheck();
                    }
                    if (redUnitInt==1){
                        tablesunits();
                        checkRed();
                    }
                }
            } else
            if (idSelected1 != idSelected2) {
                if (idSelected2 != 0) {
                    Button but2 = findViewById(idSelected2);
                    but2.setSelected(false);

                    //if (testbut1string.equals(testbut2string)){
                    //    testbut2.setPressed(true);
                    //}

                    v.setSelected(true);
                    idSelected3 = idSelected2;
                    idSelected2 = idSelected1;
                    if (lightUpSimilar==1){
                        greencheck();
                    }
                    if (redUnitInt==1){
                        tablesunits();
                        checkRed();
                    }

                    //testbut3.setPressed(true);

                } else {
                    Button but1 = findViewById(idSelected1);
                    but1.setSelected(true);
                    idSelected2 = idSelected1;
                }
            }
        } else {
            if (idSelected1!=idSelected2){
                if (idSelected2 != 0) {
                    Button but2 = findViewById(idSelected2);
                    but2.setSelected(false);
                }
                if (lightUpSimilar==1) {
                    greencheck();
                }
                if (redUnitInt==1){
                    tablesunits();
                    checkRed();
                }
                idSelected2 = idSelected1;

            }
            else{
                idSelected2 = idSelected1;
                primordialunits();
                normalunits();
            }
        }
    }

    public void greencheck(){

        //stringprime();


        primordialunits();
        normalunits();



        Button butIdSelected1=findViewById(idSelected1);
        String idSelectedString1=Integer.toString(idSelected1);
        SharedPreferences prime = getSharedPreferences("Prime",Context.MODE_PRIVATE);
        String butIdSelectedPrime1 = prime.getString(idSelectedString1, "");



            //if (butIdSelected1.isSelected()) {
            if (idSelected1 != 0) {
                testbut1 = findViewById(idSelected1);
                testbut1string = testbut1.getText().toString();
            }

            if (idSelected2 != 0) {
                testbut2 = findViewById(idSelected2);
                testbut2string = testbut2.getText().toString();
            }
            if (idSelected3 != 0) {
                testbut3 = findViewById(idSelected3);
                testbut3string = testbut3.getText().toString();
            }
            String oldvalue11 = SharedPrefs.getString(buttonstring11, "");
            String oldvalue12 = SharedPrefs.getString(buttonstring12, "");
            String oldvalue13 = SharedPrefs.getString(buttonstring13, "");
            String oldvalue14 = SharedPrefs.getString(buttonstring14, "");
            String oldvalue15 = SharedPrefs.getString(buttonstring15, "");
            String oldvalue16 = SharedPrefs.getString(buttonstring16, "");
            String oldvalue17 = SharedPrefs.getString(buttonstring17, "");
            String oldvalue18 = SharedPrefs.getString(buttonstring18, "");
            String oldvalue19 = SharedPrefs.getString(buttonstring19, "");

            String oldvalue21 = SharedPrefs.getString(buttonstring21, "");
            String oldvalue22 = SharedPrefs.getString(buttonstring22, "");
            String oldvalue23 = SharedPrefs.getString(buttonstring23, "");
            String oldvalue24 = SharedPrefs.getString(buttonstring24, "");
            String oldvalue25 = SharedPrefs.getString(buttonstring25, "");
            String oldvalue26 = SharedPrefs.getString(buttonstring26, "");
            String oldvalue27 = SharedPrefs.getString(buttonstring27, "");
            String oldvalue28 = SharedPrefs.getString(buttonstring28, "");
            String oldvalue29 = SharedPrefs.getString(buttonstring29, "");

            String oldvalue31 = SharedPrefs.getString(buttonstring31, "");
            String oldvalue32 = SharedPrefs.getString(buttonstring32, "");
            String oldvalue33 = SharedPrefs.getString(buttonstring33, "");
            String oldvalue34 = SharedPrefs.getString(buttonstring34, "");
            String oldvalue35 = SharedPrefs.getString(buttonstring35, "");
            String oldvalue36 = SharedPrefs.getString(buttonstring36, "");
            String oldvalue37 = SharedPrefs.getString(buttonstring37, "");
            String oldvalue38 = SharedPrefs.getString(buttonstring38, "");
            String oldvalue39 = SharedPrefs.getString(buttonstring39, "");

            String oldvalue41 = SharedPrefs.getString(buttonstring41, "");
            String oldvalue42 = SharedPrefs.getString(buttonstring42, "");
            String oldvalue43 = SharedPrefs.getString(buttonstring43, "");
            String oldvalue44 = SharedPrefs.getString(buttonstring44, "");
            String oldvalue45 = SharedPrefs.getString(buttonstring45, "");
            String oldvalue46 = SharedPrefs.getString(buttonstring46, "");
            String oldvalue47 = SharedPrefs.getString(buttonstring47, "");
            String oldvalue48 = SharedPrefs.getString(buttonstring48, "");
            String oldvalue49 = SharedPrefs.getString(buttonstring49, "");

            String oldvalue51 = SharedPrefs.getString(buttonstring51, "");
            String oldvalue52 = SharedPrefs.getString(buttonstring52, "");
            String oldvalue53 = SharedPrefs.getString(buttonstring53, "");
            String oldvalue54 = SharedPrefs.getString(buttonstring54, "");
            String oldvalue55 = SharedPrefs.getString(buttonstring55, "");
            String oldvalue56 = SharedPrefs.getString(buttonstring56, "");
            String oldvalue57 = SharedPrefs.getString(buttonstring57, "");
            String oldvalue58 = SharedPrefs.getString(buttonstring58, "");
            String oldvalue59 = SharedPrefs.getString(buttonstring59, "");

            String oldvalue61 = SharedPrefs.getString(buttonstring61, "");
            String oldvalue62 = SharedPrefs.getString(buttonstring62, "");
            String oldvalue63 = SharedPrefs.getString(buttonstring63, "");
            String oldvalue64 = SharedPrefs.getString(buttonstring64, "");
            String oldvalue65 = SharedPrefs.getString(buttonstring65, "");
            String oldvalue66 = SharedPrefs.getString(buttonstring66, "");
            String oldvalue67 = SharedPrefs.getString(buttonstring67, "");
            String oldvalue68 = SharedPrefs.getString(buttonstring68, "");
            String oldvalue69 = SharedPrefs.getString(buttonstring69, "");

            String oldvalue71 = SharedPrefs.getString(buttonstring71, "");
            String oldvalue72 = SharedPrefs.getString(buttonstring72, "");
            String oldvalue73 = SharedPrefs.getString(buttonstring73, "");
            String oldvalue74 = SharedPrefs.getString(buttonstring74, "");
            String oldvalue75 = SharedPrefs.getString(buttonstring75, "");
            String oldvalue76 = SharedPrefs.getString(buttonstring76, "");
            String oldvalue77 = SharedPrefs.getString(buttonstring77, "");
            String oldvalue78 = SharedPrefs.getString(buttonstring78, "");
            String oldvalue79 = SharedPrefs.getString(buttonstring79, "");

            String oldvalue81 = SharedPrefs.getString(buttonstring81, "");
            String oldvalue82 = SharedPrefs.getString(buttonstring82, "");
            String oldvalue83 = SharedPrefs.getString(buttonstring83, "");
            String oldvalue84 = SharedPrefs.getString(buttonstring84, "");
            String oldvalue85 = SharedPrefs.getString(buttonstring85, "");
            String oldvalue86 = SharedPrefs.getString(buttonstring86, "");
            String oldvalue87 = SharedPrefs.getString(buttonstring87, "");
            String oldvalue88 = SharedPrefs.getString(buttonstring88, "");
            String oldvalue89 = SharedPrefs.getString(buttonstring89, "");

            String oldvalue91 = SharedPrefs.getString(buttonstring91, "");
            String oldvalue92 = SharedPrefs.getString(buttonstring92, "");
            String oldvalue93 = SharedPrefs.getString(buttonstring93, "");
            String oldvalue94 = SharedPrefs.getString(buttonstring94, "");
            String oldvalue95 = SharedPrefs.getString(buttonstring95, "");
            String oldvalue96 = SharedPrefs.getString(buttonstring96, "");
            String oldvalue97 = SharedPrefs.getString(buttonstring97, "");
            String oldvalue98 = SharedPrefs.getString(buttonstring98, "");
            String oldvalue99 = SharedPrefs.getString(buttonstring99, "");
            //TextView text = findViewById(R.id.unitsize);
            //text.setText("SOME");

            //if (butIdSelected1.isSelected()) {
            String butIdSelectedval1 = butIdSelected1.getText().toString();


            if (!butIdSelectedval1.equals("")) {
                //text.setText("SOME1");
                //if (oldvalue11.equals(butIdSelectedval1)){
                //text.setText("SOME2");
                //if (idSelected1!=button11.getId()) {
                //button11.setPressed(true);

                //text.setText("YES");
                //}
                //}else {
                //button11.setPressed(false);
                //}

                //if (oldvalue12.equals(butIdSelectedval1)&&idSelected1!=button12.getId()){
                //button12.setPressed(true);
                //text.setText("YES2");
                //} else {
                //button12.setPressed(false);
                //}
                //if (butIdSelectedPrime1.equals("yes")) {
                    //if (idSelected1!=idSelected2){


                    if (oldvalue11.equals(butIdSelectedval1) && idSelected1 != button11.getId()) {
                        button11.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue12.equals(butIdSelectedval1) && idSelected1 != button12.getId()) {
                        button12.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue13.equals(butIdSelectedval1) && idSelected1 != button13.getId()) {
                        button13.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue14.equals(butIdSelectedval1) && idSelected1 != button14.getId()) {
                        button14.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue15.equals(butIdSelectedval1) && idSelected1 != button15.getId()) {
                        button15.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue16.equals(butIdSelectedval1) && idSelected1 != button16.getId()) {
                        button16.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue17.equals(butIdSelectedval1) && idSelected1 != button17.getId()) {
                        button17.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue18.equals(butIdSelectedval1) && idSelected1 != button18.getId()) {
                        button18.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue19.equals(butIdSelectedval1) && idSelected1 != button19.getId()) {
                        button19.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue21.equals(butIdSelectedval1) && idSelected1 != button21.getId()) {
                        button21.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue22.equals(butIdSelectedval1) && idSelected1 != button22.getId()) {
                        button22.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue23.equals(butIdSelectedval1) && idSelected1 != button23.getId()) {
                        button23.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue24.equals(butIdSelectedval1) && idSelected1 != button24.getId()) {
                        button24.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue25.equals(butIdSelectedval1) && idSelected1 != button25.getId()) {
                        button25.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue26.equals(butIdSelectedval1) && idSelected1 != button26.getId()) {
                        button26.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue27.equals(butIdSelectedval1) && idSelected1 != button27.getId()) {
                        button27.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue28.equals(butIdSelectedval1) && idSelected1 != button28.getId()) {
                        button28.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue29.equals(butIdSelectedval1) && idSelected1 != button29.getId()) {
                        button29.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue31.equals(butIdSelectedval1) && idSelected1 != button31.getId()) {
                        button31.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue32.equals(butIdSelectedval1) && idSelected1 != button32.getId()) {
                        button32.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue33.equals(butIdSelectedval1) && idSelected1 != button33.getId()) {
                        button33.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue34.equals(butIdSelectedval1) && idSelected1 != button34.getId()) {
                        button34.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue35.equals(butIdSelectedval1) && idSelected1 != button35.getId()) {
                        button35.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue36.equals(butIdSelectedval1) && idSelected1 != button36.getId()) {
                        button36.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue37.equals(butIdSelectedval1) && idSelected1 != button37.getId()) {
                        button37.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue38.equals(butIdSelectedval1) && idSelected1 != button38.getId()) {
                        button38.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue39.equals(butIdSelectedval1) && idSelected1 != button39.getId()) {
                        button39.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue41.equals(butIdSelectedval1) && idSelected1 != button41.getId()) {
                        button41.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue42.equals(butIdSelectedval1) && idSelected1 != button42.getId()) {
                        button42.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue43.equals(butIdSelectedval1) && idSelected1 != button43.getId()) {
                        button43.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue44.equals(butIdSelectedval1) && idSelected1 != button44.getId()) {
                        button44.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue45.equals(butIdSelectedval1) && idSelected1 != button45.getId()) {
                        button45.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue46.equals(butIdSelectedval1) && idSelected1 != button46.getId()) {
                        button46.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue47.equals(butIdSelectedval1) && idSelected1 != button47.getId()) {
                        button47.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue48.equals(butIdSelectedval1) && idSelected1 != button48.getId()) {
                        button48.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue49.equals(butIdSelectedval1) && idSelected1 != button49.getId()) {
                        button49.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue51.equals(butIdSelectedval1) && idSelected1 != button51.getId()) {
                        button51.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue52.equals(butIdSelectedval1) && idSelected1 != button52.getId()) {
                        button52.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue53.equals(butIdSelectedval1) && idSelected1 != button53.getId()) {
                        button53.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue54.equals(butIdSelectedval1) && idSelected1 != button54.getId()) {
                        button54.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue55.equals(butIdSelectedval1) && idSelected1 != button55.getId()) {
                        button55.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue56.equals(butIdSelectedval1) && idSelected1 != button56.getId()) {
                        button56.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue57.equals(butIdSelectedval1) && idSelected1 != button57.getId()) {
                        button57.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue58.equals(butIdSelectedval1) && idSelected1 != button58.getId()) {
                        button58.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue59.equals(butIdSelectedval1) && idSelected1 != button59.getId()) {
                        button59.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue61.equals(butIdSelectedval1) && idSelected1 != button61.getId()) {
                        button61.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue62.equals(butIdSelectedval1) && idSelected1 != button62.getId()) {
                        button62.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue63.equals(butIdSelectedval1) && idSelected1 != button63.getId()) {
                        button63.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue64.equals(butIdSelectedval1) && idSelected1 != button64.getId()) {
                        button64.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue65.equals(butIdSelectedval1) && idSelected1 != button65.getId()) {
                        button65.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue66.equals(butIdSelectedval1) && idSelected1 != button66.getId()) {
                        button66.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue67.equals(butIdSelectedval1) && idSelected1 != button67.getId()) {
                        button67.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue68.equals(butIdSelectedval1) && idSelected1 != button68.getId()) {
                        button68.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue69.equals(butIdSelectedval1) && idSelected1 != button69.getId()) {
                        button69.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue71.equals(butIdSelectedval1) && idSelected1 != button71.getId()) {
                        button71.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue72.equals(butIdSelectedval1) && idSelected1 != button72.getId()) {
                        button72.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue73.equals(butIdSelectedval1) && idSelected1 != button73.getId()) {
                        button73.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue74.equals(butIdSelectedval1) && idSelected1 != button74.getId()) {
                        button74.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue75.equals(butIdSelectedval1) && idSelected1 != button75.getId()) {
                        button75.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue76.equals(butIdSelectedval1) && idSelected1 != button76.getId()) {
                        button76.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue77.equals(butIdSelectedval1) && idSelected1 != button77.getId()) {
                        button77.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue78.equals(butIdSelectedval1) && idSelected1 != button78.getId()) {
                        button78.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue79.equals(butIdSelectedval1) && idSelected1 != button79.getId()) {
                        button79.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue81.equals(butIdSelectedval1) && idSelected1 != button81.getId()) {
                        button81.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue82.equals(butIdSelectedval1) && idSelected1 != button82.getId()) {
                        button82.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue83.equals(butIdSelectedval1) && idSelected1 != button83.getId()) {
                        button83.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue84.equals(butIdSelectedval1) && idSelected1 != button84.getId()) {
                        button84.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue85.equals(butIdSelectedval1) && idSelected1 != button85.getId()) {
                        button85.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue86.equals(butIdSelectedval1) && idSelected1 != button86.getId()) {
                        button86.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue87.equals(butIdSelectedval1) && idSelected1 != button87.getId()) {
                        button87.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue88.equals(butIdSelectedval1) && idSelected1 != button88.getId()) {
                        button88.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue89.equals(butIdSelectedval1) && idSelected1 != button89.getId()) {
                        button89.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue91.equals(butIdSelectedval1) && idSelected1 != button91.getId()) {
                        button91.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue92.equals(butIdSelectedval1) && idSelected1 != button92.getId()) {
                        button92.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue93.equals(butIdSelectedval1) && idSelected1 != button93.getId()) {
                        button93.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue94.equals(butIdSelectedval1) && idSelected1 != button94.getId()) {
                        button94.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue95.equals(butIdSelectedval1) && idSelected1 != button95.getId()) {
                        button95.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue96.equals(butIdSelectedval1) && idSelected1 != button96.getId()) {
                        button96.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue97.equals(butIdSelectedval1) && idSelected1 != button97.getId()) {
                        button97.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue98.equals(butIdSelectedval1) && idSelected1 != button98.getId()) {
                        button98.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue99.equals(butIdSelectedval1) && idSelected1 != button99.getId()) {
                        button99.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (butIdSelectedPrime1.equals("yes")) {
                        butIdSelected1.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                //}

                    //}
                //}


        }

            //}
        //}
    }
    public void tablesunits(){
        if (idSelected1!=0){
            //String idSelectedString1=Integer.toString(idSelected1);
            switch (idSelected1) {
                case R.id.button11:
                case R.id.button12:
                case R.id.button13:
                case R.id.button21:
                case R.id.button22:
                case R.id.button23:
                case R.id.button31:
                case R.id.button32:
                case R.id.button33:
                    lineSelected=1;
                    break;
                case R.id.button14:
                case R.id.button15:
                case R.id.button16:
                case R.id.button24:
                case R.id.button25:
                case R.id.button26:
                case R.id.button34:
                case R.id.button35:
                case R.id.button36:
                    lineSelected=2;
                    break;
                case R.id.button17:
                case R.id.button18:
                case R.id.button19:
                case R.id.button27:
                case R.id.button28:
                case R.id.button29:
                case R.id.button37:
                case R.id.button38:
                case R.id.button39:
                    lineSelected=3;
                    break;
                case R.id.button41:
                case R.id.button42:
                case R.id.button43:
                case R.id.button51:
                case R.id.button52:
                case R.id.button53:
                case R.id.button61:
                case R.id.button62:
                case R.id.button63:
                    lineSelected=4;
                    break;
                case R.id.button44:
                case R.id.button45:
                case R.id.button46:
                case R.id.button54:
                case R.id.button55:
                case R.id.button56:
                case R.id.button64:
                case R.id.button65:
                case R.id.button66:
                    lineSelected=5;
                    break;
                case R.id.button47:
                case R.id.button48:
                case R.id.button49:
                case R.id.button57:
                case R.id.button58:
                case R.id.button59:
                case R.id.button67:
                case R.id.button68:
                case R.id.button69:
                    lineSelected=6;
                    break;
                case R.id.button71:
                case R.id.button72:
                case R.id.button73:
                case R.id.button81:
                case R.id.button82:
                case R.id.button83:
                case R.id.button91:
                case R.id.button92:
                case R.id.button93:
                    lineSelected=7;
                    break;
                case R.id.button74:
                case R.id.button75:
                case R.id.button76:
                case R.id.button84:
                case R.id.button85:
                case R.id.button86:
                case R.id.button94:
                case R.id.button95:
                case R.id.button96:
                    lineSelected=8;
                    break;
                case R.id.button77:
                case R.id.button78:
                case R.id.button79:
                case R.id.button87:
                case R.id.button88:
                case R.id.button89:
                case R.id.button97:
                case R.id.button98:
                case R.id.button99:
                    lineSelected=9;
                    break;
            }
            switch (idSelected1){
                case R.id.button11:
                case R.id.button14:
                case R.id.button17:
                case R.id.button41:
                case R.id.button44:
                case R.id.button47:
                case R.id.button71:
                case R.id.button74:
                case R.id.button77:
                    columnSelected=1;
                    break;
                case R.id.button12:
                case R.id.button15:
                case R.id.button18:
                case R.id.button42:
                case R.id.button45:
                case R.id.button48:
                case R.id.button72:
                case R.id.button75:
                case R.id.button78:
                    columnSelected=2;
                    break;
                case R.id.button13:
                case R.id.button16:
                case R.id.button19:
                case R.id.button43:
                case R.id.button46:
                case R.id.button49:
                case R.id.button73:
                case R.id.button76:
                case R.id.button79:
                    columnSelected=3;
                    break;
                case R.id.button21:
                case R.id.button24:
                case R.id.button27:
                case R.id.button51:
                case R.id.button54:
                case R.id.button57:
                case R.id.button81:
                case R.id.button84:
                case R.id.button87:
                    columnSelected=4;
                    break;
                case R.id.button22:
                case R.id.button25:
                case R.id.button28:
                case R.id.button52:
                case R.id.button55:
                case R.id.button58:
                case R.id.button82:
                case R.id.button85:
                case R.id.button88:
                    columnSelected=5;
                    break;
                case R.id.button23:
                case R.id.button26:
                case R.id.button29:
                case R.id.button53:
                case R.id.button56:
                case R.id.button59:
                case R.id.button83:
                case R.id.button86:
                case R.id.button89:
                    columnSelected=6;
                    break;
                case R.id.button31:
                case R.id.button34:
                case R.id.button37:
                case R.id.button61:
                case R.id.button64:
                case R.id.button67:
                case R.id.button91:
                case R.id.button94:
                case R.id.button97:
                    columnSelected=7;
                    break;
                case R.id.button32:
                case R.id.button35:
                case R.id.button38:
                case R.id.button62:
                case R.id.button65:
                case R.id.button68:
                case R.id.button92:
                case R.id.button95:
                case R.id.button98:
                    columnSelected=8;
                    break;
                case R.id.button33:
                case R.id.button36:
                case R.id.button39:
                case R.id.button63:
                case R.id.button66:
                case R.id.button69:
                case R.id.button93:
                case R.id.button96:
                case R.id.button99:
                    columnSelected=9;
                    break;
            }
            switch (idSelected1){
                case R.id.button11:
                case R.id.button12:
                case R.id.button13:
                case R.id.button14:
                case R.id.button15:
                case R.id.button16:
                case R.id.button17:
                case R.id.button18:
                case R.id.button19:
                    blockSelected=1;
                    break;
                case R.id.button21:
                case R.id.button22:
                case R.id.button23:
                case R.id.button24:
                case R.id.button25:
                case R.id.button26:
                case R.id.button27:
                case R.id.button28:
                case R.id.button29:
                    blockSelected=2;
                    break;
                case R.id.button31:
                case R.id.button32:
                case R.id.button33:
                case R.id.button34:
                case R.id.button35:
                case R.id.button36:
                case R.id.button37:
                case R.id.button38:
                case R.id.button39:
                    blockSelected=3;
                    break;
                case R.id.button41:
                case R.id.button42:
                case R.id.button43:
                case R.id.button44:
                case R.id.button45:
                case R.id.button46:
                case R.id.button47:
                case R.id.button48:
                case R.id.button49:
                    blockSelected=4;
                    break;
                case R.id.button51:
                case R.id.button52:
                case R.id.button53:
                case R.id.button54:
                case R.id.button55:
                case R.id.button56:
                case R.id.button57:
                case R.id.button58:
                case R.id.button59:
                    blockSelected=5;
                    break;
                case R.id.button61:
                case R.id.button62:
                case R.id.button63:
                case R.id.button64:
                case R.id.button65:
                case R.id.button66:
                case R.id.button67:
                case R.id.button68:
                case R.id.button69:
                    blockSelected=6;
                    break;
                case R.id.button71:
                case R.id.button72:
                case R.id.button73:
                case R.id.button74:
                case R.id.button75:
                case R.id.button76:
                case R.id.button77:
                case R.id.button78:
                case R.id.button79:
                    blockSelected=7;
                    break;
                case R.id.button81:
                case R.id.button82:
                case R.id.button83:
                case R.id.button84:
                case R.id.button85:
                case R.id.button86:
                case R.id.button87:
                case R.id.button88:
                case R.id.button89:
                    blockSelected=8;
                    break;
                case R.id.button91:
                case R.id.button92:
                case R.id.button93:
                case R.id.button94:
                case R.id.button95:
                case R.id.button96:
                case R.id.button97:
                case R.id.button98:
                case R.id.button99:
                    blockSelected=9;
                    break;
            }
        }
    }
    public void checkRed (){
        if (lightUpSimilar==0) {
            primordialunits();
            normalunits();
        }
        Button butIdSelected1=findViewById(idSelected1);
        String butIdSelectedval1 = butIdSelected1.getText().toString();
        if (!butIdSelectedval1.isEmpty()) {
            String oldvalue11 = SharedPrefs.getString(buttonstring11, "");
            String oldvalue12 = SharedPrefs.getString(buttonstring12, "");
            String oldvalue13 = SharedPrefs.getString(buttonstring13, "");
            String oldvalue14 = SharedPrefs.getString(buttonstring14, "");
            String oldvalue15 = SharedPrefs.getString(buttonstring15, "");
            String oldvalue16 = SharedPrefs.getString(buttonstring16, "");
            String oldvalue17 = SharedPrefs.getString(buttonstring17, "");
            String oldvalue18 = SharedPrefs.getString(buttonstring18, "");
            String oldvalue19 = SharedPrefs.getString(buttonstring19, "");

            String oldvalue21 = SharedPrefs.getString(buttonstring21, "");
            String oldvalue22 = SharedPrefs.getString(buttonstring22, "");
            String oldvalue23 = SharedPrefs.getString(buttonstring23, "");
            String oldvalue24 = SharedPrefs.getString(buttonstring24, "");
            String oldvalue25 = SharedPrefs.getString(buttonstring25, "");
            String oldvalue26 = SharedPrefs.getString(buttonstring26, "");
            String oldvalue27 = SharedPrefs.getString(buttonstring27, "");
            String oldvalue28 = SharedPrefs.getString(buttonstring28, "");
            String oldvalue29 = SharedPrefs.getString(buttonstring29, "");

            String oldvalue31 = SharedPrefs.getString(buttonstring31, "");
            String oldvalue32 = SharedPrefs.getString(buttonstring32, "");
            String oldvalue33 = SharedPrefs.getString(buttonstring33, "");
            String oldvalue34 = SharedPrefs.getString(buttonstring34, "");
            String oldvalue35 = SharedPrefs.getString(buttonstring35, "");
            String oldvalue36 = SharedPrefs.getString(buttonstring36, "");
            String oldvalue37 = SharedPrefs.getString(buttonstring37, "");
            String oldvalue38 = SharedPrefs.getString(buttonstring38, "");
            String oldvalue39 = SharedPrefs.getString(buttonstring39, "");

            String oldvalue41 = SharedPrefs.getString(buttonstring41, "");
            String oldvalue42 = SharedPrefs.getString(buttonstring42, "");
            String oldvalue43 = SharedPrefs.getString(buttonstring43, "");
            String oldvalue44 = SharedPrefs.getString(buttonstring44, "");
            String oldvalue45 = SharedPrefs.getString(buttonstring45, "");
            String oldvalue46 = SharedPrefs.getString(buttonstring46, "");
            String oldvalue47 = SharedPrefs.getString(buttonstring47, "");
            String oldvalue48 = SharedPrefs.getString(buttonstring48, "");
            String oldvalue49 = SharedPrefs.getString(buttonstring49, "");

            String oldvalue51 = SharedPrefs.getString(buttonstring51, "");
            String oldvalue52 = SharedPrefs.getString(buttonstring52, "");
            String oldvalue53 = SharedPrefs.getString(buttonstring53, "");
            String oldvalue54 = SharedPrefs.getString(buttonstring54, "");
            String oldvalue55 = SharedPrefs.getString(buttonstring55, "");
            String oldvalue56 = SharedPrefs.getString(buttonstring56, "");
            String oldvalue57 = SharedPrefs.getString(buttonstring57, "");
            String oldvalue58 = SharedPrefs.getString(buttonstring58, "");
            String oldvalue59 = SharedPrefs.getString(buttonstring59, "");

            String oldvalue61 = SharedPrefs.getString(buttonstring61, "");
            String oldvalue62 = SharedPrefs.getString(buttonstring62, "");
            String oldvalue63 = SharedPrefs.getString(buttonstring63, "");
            String oldvalue64 = SharedPrefs.getString(buttonstring64, "");
            String oldvalue65 = SharedPrefs.getString(buttonstring65, "");
            String oldvalue66 = SharedPrefs.getString(buttonstring66, "");
            String oldvalue67 = SharedPrefs.getString(buttonstring67, "");
            String oldvalue68 = SharedPrefs.getString(buttonstring68, "");
            String oldvalue69 = SharedPrefs.getString(buttonstring69, "");

            String oldvalue71 = SharedPrefs.getString(buttonstring71, "");
            String oldvalue72 = SharedPrefs.getString(buttonstring72, "");
            String oldvalue73 = SharedPrefs.getString(buttonstring73, "");
            String oldvalue74 = SharedPrefs.getString(buttonstring74, "");
            String oldvalue75 = SharedPrefs.getString(buttonstring75, "");
            String oldvalue76 = SharedPrefs.getString(buttonstring76, "");
            String oldvalue77 = SharedPrefs.getString(buttonstring77, "");
            String oldvalue78 = SharedPrefs.getString(buttonstring78, "");
            String oldvalue79 = SharedPrefs.getString(buttonstring79, "");

            String oldvalue81 = SharedPrefs.getString(buttonstring81, "");
            String oldvalue82 = SharedPrefs.getString(buttonstring82, "");
            String oldvalue83 = SharedPrefs.getString(buttonstring83, "");
            String oldvalue84 = SharedPrefs.getString(buttonstring84, "");
            String oldvalue85 = SharedPrefs.getString(buttonstring85, "");
            String oldvalue86 = SharedPrefs.getString(buttonstring86, "");
            String oldvalue87 = SharedPrefs.getString(buttonstring87, "");
            String oldvalue88 = SharedPrefs.getString(buttonstring88, "");
            String oldvalue89 = SharedPrefs.getString(buttonstring89, "");

            String oldvalue91 = SharedPrefs.getString(buttonstring91, "");
            String oldvalue92 = SharedPrefs.getString(buttonstring92, "");
            String oldvalue93 = SharedPrefs.getString(buttonstring93, "");
            String oldvalue94 = SharedPrefs.getString(buttonstring94, "");
            String oldvalue95 = SharedPrefs.getString(buttonstring95, "");
            String oldvalue96 = SharedPrefs.getString(buttonstring96, "");
            String oldvalue97 = SharedPrefs.getString(buttonstring97, "");
            String oldvalue98 = SharedPrefs.getString(buttonstring98, "");
            String oldvalue99 = SharedPrefs.getString(buttonstring99, "");
            Button but1 = findViewById(idSelected1);
            switch (lineSelected) {
                case 1:
                    if (oldvalue11.equals(butIdSelectedval1) && idSelected1 != button11.getId()) {
                        if (buttonprime11.equals("yes")) {                             button11.setBackgroundResource(R.drawable.field_unit_mark);
                            button11.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button11.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue12.equals(butIdSelectedval1) && idSelected1 != button12.getId()) {
                        if (buttonprime12.equals("yes")) {                             button12.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button12.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue13.equals(butIdSelectedval1) && idSelected1 != button13.getId()) {
                        if (buttonprime13.equals("yes")) {                             button13.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button13.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue21.equals(butIdSelectedval1) && idSelected1 != button21.getId()) {
                        if (buttonprime21.equals("yes")) {                             button21.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button21.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue22.equals(butIdSelectedval1) && idSelected1 != button22.getId()) {
                        if (buttonprime22.equals("yes")) {                             button22.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button22.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue23.equals(butIdSelectedval1) && idSelected1 != button23.getId()) {
                        if (buttonprime23.equals("yes")) {                             button23.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button23.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue31.equals(butIdSelectedval1) && idSelected1 != button31.getId()) {
                        if (buttonprime31.equals("yes")) {                             button31.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button31.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue32.equals(butIdSelectedval1) && idSelected1 != button32.getId()) {
                        if (buttonprime32.equals("yes")) {                             button32.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button32.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue33.equals(butIdSelectedval1) && idSelected1 != button33.getId()) {
                        if (buttonprime33.equals("yes")) {                             button33.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button33.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    break;
                case 2:
                    if (oldvalue14.equals(butIdSelectedval1) && idSelected1 != button14.getId()) {
                        if (buttonprime14.equals("yes")) {                             button14.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button14.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue15.equals(butIdSelectedval1) && idSelected1 != button15.getId()) {
                        if (buttonprime15.equals("yes")) {                             button15.setBackgroundResource(R.drawable.field_unit_mark);                             button15.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button15.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue16.equals(butIdSelectedval1) && idSelected1 != button16.getId()) {
                        if (buttonprime16.equals("yes")) {                             button16.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button16.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue24.equals(butIdSelectedval1) && idSelected1 != button24.getId()) {
                        if (buttonprime24.equals("yes")) {                             button24.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button24.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue25.equals(butIdSelectedval1) && idSelected1 != button25.getId()) {
                        if (buttonprime25.equals("yes")) {                             button25.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button25.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue26.equals(butIdSelectedval1) && idSelected1 != button26.getId()) {
                        if (buttonprime26.equals("yes")) {                             button26.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button26.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue34.equals(butIdSelectedval1) && idSelected1 != button34.getId()) {
                        if (buttonprime34.equals("yes")) {                             button34.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button34.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue35.equals(butIdSelectedval1) && idSelected1 != button35.getId()) {
                        if (buttonprime35.equals("yes")) {                             button35.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button35.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue36.equals(butIdSelectedval1) && idSelected1 != button36.getId()) {
                        if (buttonprime36.equals("yes")) {                             button36.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button36.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    break;
                case 3:
                    if (oldvalue17.equals(butIdSelectedval1) && idSelected1 != button17.getId()) {
                        if (buttonprime17.equals("yes")) {                             button17.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button17.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue18.equals(butIdSelectedval1) && idSelected1 != button18.getId()) {
                        if (buttonprime18.equals("yes")) {                             button18.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button18.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue19.equals(butIdSelectedval1) && idSelected1 != button19.getId()) {
                        if (buttonprime19.equals("yes")) {                             button19.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button19.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue27.equals(butIdSelectedval1) && idSelected1 != button27.getId()) {
                        if (buttonprime27.equals("yes")) {                             button27.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button27.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue28.equals(butIdSelectedval1) && idSelected1 != button28.getId()) {
                        if (buttonprime28.equals("yes")) {                             button28.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button28.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue29.equals(butIdSelectedval1) && idSelected1 != button29.getId()) {
                        if (buttonprime29.equals("yes")) {                             button29.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button29.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue37.equals(butIdSelectedval1) && idSelected1 != button37.getId()) {
                        if (buttonprime37.equals("yes")) {                             button37.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button37.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue38.equals(butIdSelectedval1) && idSelected1 != button38.getId()) {
                        if (buttonprime38.equals("yes")) {                             button38.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button38.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue39.equals(butIdSelectedval1) && idSelected1 != button39.getId()) {
                        if (buttonprime39.equals("yes")) {                             button39.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button39.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    break;
                case 4:
                    if (oldvalue41.equals(butIdSelectedval1) && idSelected1 != button41.getId()) {
                        if (buttonprime41.equals("yes")) {                             button41.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button41.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue42.equals(butIdSelectedval1) && idSelected1 != button42.getId()) {
                        if (buttonprime42.equals("yes")) {                             button42.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button42.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue43.equals(butIdSelectedval1) && idSelected1 != button43.getId()) {
                        if (buttonprime43.equals("yes")) {                             button43.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button43.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue51.equals(butIdSelectedval1) && idSelected1 != button51.getId()) {
                        if (buttonprime51.equals("yes")) {                             button51.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button51.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue52.equals(butIdSelectedval1) && idSelected1 != button52.getId()) {
                        if (buttonprime52.equals("yes")) {                             button52.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button52.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue53.equals(butIdSelectedval1) && idSelected1 != button53.getId()) {
                        if (buttonprime53.equals("yes")) {                             button53.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button53.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue61.equals(butIdSelectedval1) && idSelected1 != button61.getId()) {
                        if (buttonprime61.equals("yes")) {                             button61.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button61.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue62.equals(butIdSelectedval1) && idSelected1 != button62.getId()) {
                        if (buttonprime62.equals("yes")) {                             button62.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button62.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue63.equals(butIdSelectedval1) && idSelected1 != button63.getId()) {
                        if (buttonprime63.equals("yes")) {                             button63.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button63.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    break;
                case 5:
                    if (oldvalue44.equals(butIdSelectedval1) && idSelected1 != button44.getId()) {
                        if (buttonprime44.equals("yes")) {                             button44.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button44.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue45.equals(butIdSelectedval1) && idSelected1 != button45.getId()) {
                        if (buttonprime45.equals("yes")) {                             button45.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button45.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue46.equals(butIdSelectedval1) && idSelected1 != button46.getId()) {
                        if (buttonprime46.equals("yes")) {                             button46.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button46.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue54.equals(butIdSelectedval1) && idSelected1 != button54.getId()) {
                        if (buttonprime54.equals("yes")) {                             button54.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button54.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue55.equals(butIdSelectedval1) && idSelected1 != button55.getId()) {
                        if (buttonprime55.equals("yes")) {                             button55.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button55.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue56.equals(butIdSelectedval1) && idSelected1 != button56.getId()) {
                        if (buttonprime56.equals("yes")) {                             button56.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button56.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue64.equals(butIdSelectedval1) && idSelected1 != button64.getId()) {
                        if (buttonprime64.equals("yes")) {                             button64.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button64.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue65.equals(butIdSelectedval1) && idSelected1 != button65.getId()) {
                        if (buttonprime65.equals("yes")) {                             button65.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button65.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue66.equals(butIdSelectedval1) && idSelected1 != button66.getId()) {
                        if (buttonprime66.equals("yes")) {                             button66.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button66.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    break;
                case 6:
                    if (oldvalue47.equals(butIdSelectedval1) && idSelected1 != button47.getId()) {
                        if (buttonprime47.equals("yes")) {                             button47.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button47.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue48.equals(butIdSelectedval1) && idSelected1 != button48.getId()) {
                        if (buttonprime48.equals("yes")) {                             button48.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button48.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue49.equals(butIdSelectedval1) && idSelected1 != button49.getId()) {
                        if (buttonprime49.equals("yes")) {                             button49.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button49.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue57.equals(butIdSelectedval1) && idSelected1 != button57.getId()) {
                        if (buttonprime57.equals("yes")) {                             button57.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button57.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue58.equals(butIdSelectedval1) && idSelected1 != button58.getId()) {
                        if (buttonprime58.equals("yes")) {                             button58.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button58.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue59.equals(butIdSelectedval1) && idSelected1 != button59.getId()) {
                        if (buttonprime59.equals("yes")) {                             button59.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button59.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue67.equals(butIdSelectedval1) && idSelected1 != button67.getId()) {
                        if (buttonprime67.equals("yes")) {                             button67.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button67.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue68.equals(butIdSelectedval1) && idSelected1 != button68.getId()) {
                        if (buttonprime68.equals("yes")) {                             button68.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button68.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue69.equals(butIdSelectedval1) && idSelected1 != button69.getId()) {
                        if (buttonprime69.equals("yes")) {                             button69.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button69.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    break;
                case 7:
                    if (oldvalue71.equals(butIdSelectedval1) && idSelected1 != button71.getId()) {
                        if (buttonprime71.equals("yes")) {                             button71.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button71.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue72.equals(butIdSelectedval1) && idSelected1 != button72.getId()) {
                        if (buttonprime72.equals("yes")) {                             button72.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button72.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue73.equals(butIdSelectedval1) && idSelected1 != button73.getId()) {
                        if (buttonprime73.equals("yes")) {                             button73.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button73.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue81.equals(butIdSelectedval1) && idSelected1 != button81.getId()) {
                        if (buttonprime81.equals("yes")) {                             button81.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button81.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue82.equals(butIdSelectedval1) && idSelected1 != button82.getId()) {
                        if (buttonprime82.equals("yes")) {                             button82.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button82.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue83.equals(butIdSelectedval1) && idSelected1 != button83.getId()) {
                        if (buttonprime83.equals("yes")) {                             button83.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button83.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue91.equals(butIdSelectedval1) && idSelected1 != button91.getId()) {
                        if (buttonprime91.equals("yes")) {                             button91.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button91.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue92.equals(butIdSelectedval1) && idSelected1 != button92.getId()) {
                        if (buttonprime92.equals("yes")) {                             button92.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button92.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue93.equals(butIdSelectedval1) && idSelected1 != button93.getId()) {
                        if (buttonprime93.equals("yes")) {                             button93.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button93.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    break;
                case 8:
                    if (oldvalue74.equals(butIdSelectedval1) && idSelected1 != button74.getId()) {
                        if (buttonprime74.equals("yes")) {                             button74.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button74.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue75.equals(butIdSelectedval1) && idSelected1 != button75.getId()) {
                        if (buttonprime75.equals("yes")) {                             button75.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button75.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue76.equals(butIdSelectedval1) && idSelected1 != button76.getId()) {
                        if (buttonprime76.equals("yes")) {                             button76.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button76.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue84.equals(butIdSelectedval1) && idSelected1 != button84.getId()) {
                        if (buttonprime84.equals("yes")) {                             button84.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button84.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue85.equals(butIdSelectedval1) && idSelected1 != button85.getId()) {
                        if (buttonprime85.equals("yes")) {                             button85.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button85.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue86.equals(butIdSelectedval1) && idSelected1 != button86.getId()) {
                        if (buttonprime86.equals("yes")) {                             button86.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button86.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue94.equals(butIdSelectedval1) && idSelected1 != button94.getId()) {
                        if (buttonprime94.equals("yes")) {                             button94.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button94.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue95.equals(butIdSelectedval1) && idSelected1 != button95.getId()) {
                        if (buttonprime95.equals("yes")) {                             button95.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button95.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue96.equals(butIdSelectedval1) && idSelected1 != button96.getId()) {
                        if (buttonprime96.equals("yes")) {                             button96.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button96.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    break;
                case 9:
                    if (oldvalue77.equals(butIdSelectedval1) && idSelected1 != button77.getId()) {
                        if (buttonprime77.equals("yes")) {                             button77.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button77.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue78.equals(butIdSelectedval1) && idSelected1 != button78.getId()) {
                        if (buttonprime78.equals("yes")) {                             button78.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button78.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue79.equals(butIdSelectedval1) && idSelected1 != button79.getId()) {
                        if (buttonprime79.equals("yes")) {                             button79.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button79.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue87.equals(butIdSelectedval1) && idSelected1 != button87.getId()) {
                        if (buttonprime87.equals("yes")) {                             button87.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button87.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue88.equals(butIdSelectedval1) && idSelected1 != button88.getId()) {
                        if (buttonprime88.equals("yes")) {                             button88.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button88.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue89.equals(butIdSelectedval1) && idSelected1 != button89.getId()) {
                        if (buttonprime89.equals("yes")) {                             button89.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button89.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue97.equals(butIdSelectedval1) && idSelected1 != button97.getId()) {
                        if (buttonprime97.equals("yes")) {                             button97.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button97.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue98.equals(butIdSelectedval1) && idSelected1 != button98.getId()) {
                        if (buttonprime98.equals("yes")) {                             button98.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button98.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue99.equals(butIdSelectedval1) && idSelected1 != button99.getId()) {
                        if (buttonprime99.equals("yes")) {                             button99.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button99.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    break;
            }
            switch (columnSelected) {
                case 1:
                    if (oldvalue11.equals(butIdSelectedval1) && idSelected1 != button11.getId()) {
                        if (buttonprime11.equals("yes")) {                             button11.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button11.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue14.equals(butIdSelectedval1) && idSelected1 != button14.getId()) {
                        if (buttonprime14.equals("yes")) {                             button14.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button14.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue17.equals(butIdSelectedval1) && idSelected1 != button17.getId()) {
                        if (buttonprime17.equals("yes")) {                             button17.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button17.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue41.equals(butIdSelectedval1) && idSelected1 != button41.getId()) {
                        if (buttonprime41.equals("yes")) {                             button41.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button41.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue44.equals(butIdSelectedval1) && idSelected1 != button44.getId()) {
                        if (buttonprime44.equals("yes")) {                             button44.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button44.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue47.equals(butIdSelectedval1) && idSelected1 != button47.getId()) {
                        if (buttonprime47.equals("yes")) {                             button47.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button47.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue71.equals(butIdSelectedval1) && idSelected1 != button71.getId()) {
                        if (buttonprime71.equals("yes")) {                             button71.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button71.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue74.equals(butIdSelectedval1) && idSelected1 != button74.getId()) {
                        if (buttonprime74.equals("yes")) {                             button74.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button74.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue77.equals(butIdSelectedval1) && idSelected1 != button77.getId()) {
                        if (buttonprime77.equals("yes")) {                             button77.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button77.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    break;
                case 2:
                    if (oldvalue12.equals(butIdSelectedval1) && idSelected1 != button12.getId()) {
                        if (buttonprime12.equals("yes")) {                             button12.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button12.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue15.equals(butIdSelectedval1) && idSelected1 != button15.getId()) {
                        if (buttonprime15.equals("yes")) {                             button15.setBackgroundResource(R.drawable.field_unit_mark);                             button15.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button15.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue18.equals(butIdSelectedval1) && idSelected1 != button18.getId()) {
                        if (buttonprime18.equals("yes")) {                             button18.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button18.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue42.equals(butIdSelectedval1) && idSelected1 != button42.getId()) {
                        if (buttonprime42.equals("yes")) {                             button42.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button42.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue45.equals(butIdSelectedval1) && idSelected1 != button45.getId()) {
                        if (buttonprime45.equals("yes")) {                             button45.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button45.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue48.equals(butIdSelectedval1) && idSelected1 != button48.getId()) {
                        if (buttonprime48.equals("yes")) {                             button48.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button48.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue72.equals(butIdSelectedval1) && idSelected1 != button72.getId()) {
                        if (buttonprime72.equals("yes")) {                             button72.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button72.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue75.equals(butIdSelectedval1) && idSelected1 != button75.getId()) {
                        if (buttonprime75.equals("yes")) {                             button75.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button75.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue78.equals(butIdSelectedval1) && idSelected1 != button78.getId()) {
                        if (buttonprime78.equals("yes")) {                             button78.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button78.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    break;
                case 3:
                    if (oldvalue13.equals(butIdSelectedval1) && idSelected1 != button13.getId()) {
                        if (buttonprime13.equals("yes")) {                             button13.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button13.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue16.equals(butIdSelectedval1) && idSelected1 != button16.getId()) {
                        if (buttonprime16.equals("yes")) {                             button16.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button16.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue19.equals(butIdSelectedval1) && idSelected1 != button19.getId()) {
                        if (buttonprime19.equals("yes")) {                             button19.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button19.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue43.equals(butIdSelectedval1) && idSelected1 != button43.getId()) {
                        if (buttonprime43.equals("yes")) {                             button43.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button43.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue46.equals(butIdSelectedval1) && idSelected1 != button46.getId()) {
                        if (buttonprime46.equals("yes")) {                             button46.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button46.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue49.equals(butIdSelectedval1) && idSelected1 != button49.getId()) {
                        if (buttonprime49.equals("yes")) {                             button49.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button49.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue73.equals(butIdSelectedval1) && idSelected1 != button73.getId()) {
                        if (buttonprime73.equals("yes")) {                             button73.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button73.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue76.equals(butIdSelectedval1) && idSelected1 != button76.getId()) {
                        if (buttonprime76.equals("yes")) {                             button76.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button76.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue79.equals(butIdSelectedval1) && idSelected1 != button79.getId()) {
                        if (buttonprime79.equals("yes")) {                             button79.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button79.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    break;
                case 4:
                    if (oldvalue21.equals(butIdSelectedval1) && idSelected1 != button21.getId()) {
                        if (buttonprime21.equals("yes")) {                             button21.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button21.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue24.equals(butIdSelectedval1) && idSelected1 != button24.getId()) {
                        if (buttonprime24.equals("yes")) {                             button24.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button24.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue27.equals(butIdSelectedval1) && idSelected1 != button27.getId()) {
                        if (buttonprime27.equals("yes")) {                             button27.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button27.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue51.equals(butIdSelectedval1) && idSelected1 != button51.getId()) {
                        if (buttonprime51.equals("yes")) {                             button51.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button51.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue54.equals(butIdSelectedval1) && idSelected1 != button54.getId()) {
                        if (buttonprime54.equals("yes")) {                             button54.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button54.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue57.equals(butIdSelectedval1) && idSelected1 != button57.getId()) {
                        if (buttonprime57.equals("yes")) {                             button57.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button57.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue81.equals(butIdSelectedval1) && idSelected1 != button81.getId()) {
                        if (buttonprime81.equals("yes")) {                             button81.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button81.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue84.equals(butIdSelectedval1) && idSelected1 != button84.getId()) {
                        if (buttonprime84.equals("yes")) {                             button84.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button84.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue87.equals(butIdSelectedval1) && idSelected1 != button87.getId()) {
                        if (buttonprime87.equals("yes")) {                             button87.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button87.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    break;
                case 5:
                    if (oldvalue22.equals(butIdSelectedval1) && idSelected1 != button22.getId()) {
                        if (buttonprime22.equals("yes")) {                             button22.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button22.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue25.equals(butIdSelectedval1) && idSelected1 != button25.getId()) {
                        if (buttonprime25.equals("yes")) {                             button25.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button25.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue28.equals(butIdSelectedval1) && idSelected1 != button28.getId()) {
                        if (buttonprime28.equals("yes")) {                             button28.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button28.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue52.equals(butIdSelectedval1) && idSelected1 != button52.getId()) {
                        if (buttonprime52.equals("yes")) {                             button52.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button52.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue55.equals(butIdSelectedval1) && idSelected1 != button55.getId()) {
                        if (buttonprime55.equals("yes")) {                             button55.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button55.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue58.equals(butIdSelectedval1) && idSelected1 != button58.getId()) {
                        if (buttonprime58.equals("yes")) {                             button58.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button58.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue82.equals(butIdSelectedval1) && idSelected1 != button82.getId()) {
                        if (buttonprime82.equals("yes")) {                             button82.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button82.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue85.equals(butIdSelectedval1) && idSelected1 != button85.getId()) {
                        if (buttonprime85.equals("yes")) {                             button85.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button85.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue88.equals(butIdSelectedval1) && idSelected1 != button88.getId()) {
                        if (buttonprime88.equals("yes")) {                             button88.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button88.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    break;
                case 6:
                    if (oldvalue23.equals(butIdSelectedval1) && idSelected1 != button23.getId()) {
                        if (buttonprime23.equals("yes")) {                             button23.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button23.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue26.equals(butIdSelectedval1) && idSelected1 != button26.getId()) {
                        if (buttonprime26.equals("yes")) {                             button26.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button26.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue29.equals(butIdSelectedval1) && idSelected1 != button29.getId()) {
                        if (buttonprime29.equals("yes")) {                             button29.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button29.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue53.equals(butIdSelectedval1) && idSelected1 != button53.getId()) {
                        if (buttonprime53.equals("yes")) {                             button53.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button53.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue56.equals(butIdSelectedval1) && idSelected1 != button56.getId()) {
                        if (buttonprime56.equals("yes")) {                             button56.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button56.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue59.equals(butIdSelectedval1) && idSelected1 != button59.getId()) {
                        if (buttonprime59.equals("yes")) {                             button59.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button59.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue83.equals(butIdSelectedval1) && idSelected1 != button83.getId()) {
                        if (buttonprime83.equals("yes")) {                             button83.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button83.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue86.equals(butIdSelectedval1) && idSelected1 != button86.getId()) {
                        if (buttonprime86.equals("yes")) {                             button86.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button86.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue89.equals(butIdSelectedval1) && idSelected1 != button89.getId()) {
                        if (buttonprime89.equals("yes")) {                             button89.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button89.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    break;
                case 7:
                    if (oldvalue31.equals(butIdSelectedval1) && idSelected1 != button31.getId()) {
                        if (buttonprime31.equals("yes")) {                             button31.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button31.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue34.equals(butIdSelectedval1) && idSelected1 != button34.getId()) {
                        if (buttonprime34.equals("yes")) {                             button34.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button34.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue37.equals(butIdSelectedval1) && idSelected1 != button37.getId()) {
                        if (buttonprime37.equals("yes")) {                             button37.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button37.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue61.equals(butIdSelectedval1) && idSelected1 != button61.getId()) {
                        if (buttonprime61.equals("yes")) {                             button61.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button61.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue64.equals(butIdSelectedval1) && idSelected1 != button64.getId()) {
                        if (buttonprime64.equals("yes")) {                             button64.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button64.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue67.equals(butIdSelectedval1) && idSelected1 != button67.getId()) {
                        if (buttonprime67.equals("yes")) {                             button67.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button67.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue91.equals(butIdSelectedval1) && idSelected1 != button91.getId()) {
                        if (buttonprime91.equals("yes")) {                             button91.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button91.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue94.equals(butIdSelectedval1) && idSelected1 != button94.getId()) {
                        if (buttonprime94.equals("yes")) {                             button94.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button94.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue97.equals(butIdSelectedval1) && idSelected1 != button97.getId()) {
                        if (buttonprime97.equals("yes")) {                             button97.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button97.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    break;
                case 8:
                    if (oldvalue32.equals(butIdSelectedval1) && idSelected1 != button32.getId()) {
                        if (buttonprime32.equals("yes")) {                             button32.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button32.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue35.equals(butIdSelectedval1) && idSelected1 != button35.getId()) {
                        if (buttonprime35.equals("yes")) {                             button35.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button35.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue38.equals(butIdSelectedval1) && idSelected1 != button38.getId()) {
                        if (buttonprime38.equals("yes")) {                             button38.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button38.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue62.equals(butIdSelectedval1) && idSelected1 != button62.getId()) {
                        if (buttonprime62.equals("yes")) {                             button62.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button62.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue65.equals(butIdSelectedval1) && idSelected1 != button65.getId()) {
                        if (buttonprime65.equals("yes")) {                             button65.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button65.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue68.equals(butIdSelectedval1) && idSelected1 != button68.getId()) {
                        if (buttonprime68.equals("yes")) {                             button68.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button68.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue92.equals(butIdSelectedval1) && idSelected1 != button92.getId()) {
                        if (buttonprime92.equals("yes")) {                             button92.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button92.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue95.equals(butIdSelectedval1) && idSelected1 != button95.getId()) {
                        if (buttonprime95.equals("yes")) {                             button95.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button95.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue98.equals(butIdSelectedval1) && idSelected1 != button98.getId()) {
                        if (buttonprime98.equals("yes")) {                             button98.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button98.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    break;
                case 9:
                    if (oldvalue33.equals(butIdSelectedval1) && idSelected1 != button33.getId()) {
                        if (buttonprime33.equals("yes")) {                             button33.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button33.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue36.equals(butIdSelectedval1) && idSelected1 != button36.getId()) {
                        if (buttonprime36.equals("yes")) {                             button36.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button36.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue39.equals(butIdSelectedval1) && idSelected1 != button39.getId()) {
                        if (buttonprime39.equals("yes")) {                             button39.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button39.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue63.equals(butIdSelectedval1) && idSelected1 != button63.getId()) {
                        if (buttonprime63.equals("yes")) {                             button63.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button63.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue66.equals(butIdSelectedval1) && idSelected1 != button66.getId()) {
                        if (buttonprime66.equals("yes")) {                             button66.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button66.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue69.equals(butIdSelectedval1) && idSelected1 != button69.getId()) {
                        if (buttonprime69.equals("yes")) {                             button69.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button69.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue93.equals(butIdSelectedval1) && idSelected1 != button93.getId()) {
                        if (buttonprime93.equals("yes")) {                             button93.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button93.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue96.equals(butIdSelectedval1) && idSelected1 != button96.getId()) {
                        if (buttonprime96.equals("yes")) {                             button96.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button96.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue99.equals(butIdSelectedval1) && idSelected1 != button99.getId()) {
                        if (buttonprime99.equals("yes")) {                             button99.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button99.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    break;
            }
            switch (blockSelected) {
                case 1:
                    if (oldvalue11.equals(butIdSelectedval1) && idSelected1 != button11.getId()) {
                        if (buttonprime11.equals("yes")) {                             button11.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button11.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue12.equals(butIdSelectedval1) && idSelected1 != button12.getId()) {
                        if (buttonprime12.equals("yes")) {                             button12.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button12.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue13.equals(butIdSelectedval1) && idSelected1 != button13.getId()) {
                        if (buttonprime13.equals("yes")) {                             button13.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button13.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue14.equals(butIdSelectedval1) && idSelected1 != button14.getId()) {
                        if (buttonprime14.equals("yes")) {                             button14.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button14.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue15.equals(butIdSelectedval1) && idSelected1 != button15.getId()) {
                        if (buttonprime15.equals("yes")) {                             button15.setBackgroundResource(R.drawable.field_unit_mark);                             button15.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button15.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue16.equals(butIdSelectedval1) && idSelected1 != button16.getId()) {
                        if (buttonprime16.equals("yes")) {                             button16.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button16.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue17.equals(butIdSelectedval1) && idSelected1 != button17.getId()) {
                        if (buttonprime17.equals("yes")) {                             button17.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button17.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue18.equals(butIdSelectedval1) && idSelected1 != button18.getId()) {
                        if (buttonprime18.equals("yes")) {                             button18.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button18.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue19.equals(butIdSelectedval1) && idSelected1 != button19.getId()) {
                        if (buttonprime19.equals("yes")) {                             button19.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button19.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    break;
                case 2:
                    if (oldvalue21.equals(butIdSelectedval1) && idSelected1 != button21.getId()) {
                        if (buttonprime21.equals("yes")) {                             button21.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button21.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue22.equals(butIdSelectedval1) && idSelected1 != button22.getId()) {
                        if (buttonprime22.equals("yes")) {                             button22.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button22.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue23.equals(butIdSelectedval1) && idSelected1 != button23.getId()) {
                        if (buttonprime23.equals("yes")) {                             button23.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button23.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue24.equals(butIdSelectedval1) && idSelected1 != button24.getId()) {
                        if (buttonprime24.equals("yes")) {                             button24.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button24.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue25.equals(butIdSelectedval1) && idSelected1 != button25.getId()) {
                        if (buttonprime25.equals("yes")) {                             button25.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button25.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue26.equals(butIdSelectedval1) && idSelected1 != button26.getId()) {
                        if (buttonprime26.equals("yes")) {                             button26.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button26.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue27.equals(butIdSelectedval1) && idSelected1 != button27.getId()) {
                        if (buttonprime27.equals("yes")) {                             button27.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button27.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue28.equals(butIdSelectedval1) && idSelected1 != button28.getId()) {
                        if (buttonprime28.equals("yes")) {                             button28.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button28.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue29.equals(butIdSelectedval1) && idSelected1 != button29.getId()) {
                        if (buttonprime29.equals("yes")) {                             button29.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button29.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    break;
                case 3:
                    if (oldvalue31.equals(butIdSelectedval1) && idSelected1 != button31.getId()) {
                        if (buttonprime31.equals("yes")) {                             button31.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button31.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue32.equals(butIdSelectedval1) && idSelected1 != button32.getId()) {
                        if (buttonprime32.equals("yes")) {                             button32.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button32.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue33.equals(butIdSelectedval1) && idSelected1 != button33.getId()) {
                        if (buttonprime33.equals("yes")) {                             button33.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button33.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue34.equals(butIdSelectedval1) && idSelected1 != button34.getId()) {
                        if (buttonprime34.equals("yes")) {                             button34.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button34.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue35.equals(butIdSelectedval1) && idSelected1 != button35.getId()) {
                        if (buttonprime35.equals("yes")) {                             button35.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button35.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue36.equals(butIdSelectedval1) && idSelected1 != button36.getId()) {
                        if (buttonprime36.equals("yes")) {                             button36.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button36.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue37.equals(butIdSelectedval1) && idSelected1 != button37.getId()) {
                        if (buttonprime37.equals("yes")) {                             button37.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button37.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue38.equals(butIdSelectedval1) && idSelected1 != button38.getId()) {
                        if (buttonprime38.equals("yes")) {                             button38.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button38.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue39.equals(butIdSelectedval1) && idSelected1 != button39.getId()) {
                        if (buttonprime39.equals("yes")) {                             button39.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button39.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    break;
                case 4:
                    if (oldvalue41.equals(butIdSelectedval1) && idSelected1 != button41.getId()) {
                        if (buttonprime41.equals("yes")) {                             button41.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button41.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue42.equals(butIdSelectedval1) && idSelected1 != button42.getId()) {
                        if (buttonprime42.equals("yes")) {                             button42.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button42.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue43.equals(butIdSelectedval1) && idSelected1 != button43.getId()) {
                        if (buttonprime43.equals("yes")) {                             button43.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button43.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue44.equals(butIdSelectedval1) && idSelected1 != button44.getId()) {
                        if (buttonprime44.equals("yes")) {                             button44.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button44.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue45.equals(butIdSelectedval1) && idSelected1 != button45.getId()) {
                        if (buttonprime45.equals("yes")) {                             button45.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button45.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue46.equals(butIdSelectedval1) && idSelected1 != button46.getId()) {
                        if (buttonprime46.equals("yes")) {                             button46.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button46.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue47.equals(butIdSelectedval1) && idSelected1 != button47.getId()) {
                        if (buttonprime47.equals("yes")) {                             button47.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button47.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue48.equals(butIdSelectedval1) && idSelected1 != button48.getId()) {
                        if (buttonprime48.equals("yes")) {                             button48.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button48.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue49.equals(butIdSelectedval1) && idSelected1 != button49.getId()) {
                        if (buttonprime49.equals("yes")) {                             button49.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button49.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    break;
                case 5:
                    if (oldvalue51.equals(butIdSelectedval1) && idSelected1 != button51.getId()) {
                        if (buttonprime51.equals("yes")) {                             button51.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button51.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue52.equals(butIdSelectedval1) && idSelected1 != button52.getId()) {
                        if (buttonprime52.equals("yes")) {                             button52.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button52.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue53.equals(butIdSelectedval1) && idSelected1 != button53.getId()) {
                        if (buttonprime53.equals("yes")) {                             button53.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button53.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue54.equals(butIdSelectedval1) && idSelected1 != button54.getId()) {
                        if (buttonprime54.equals("yes")) {                             button54.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button54.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue55.equals(butIdSelectedval1) && idSelected1 != button55.getId()) {
                        if (buttonprime55.equals("yes")) {                             button55.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button55.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue56.equals(butIdSelectedval1) && idSelected1 != button56.getId()) {
                        if (buttonprime56.equals("yes")) {                             button56.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button56.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue57.equals(butIdSelectedval1) && idSelected1 != button57.getId()) {
                        if (buttonprime57.equals("yes")) {                             button57.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button57.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue58.equals(butIdSelectedval1) && idSelected1 != button58.getId()) {
                        if (buttonprime58.equals("yes")) {                             button58.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button58.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue59.equals(butIdSelectedval1) && idSelected1 != button59.getId()) {
                        if (buttonprime59.equals("yes")) {                             button59.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button59.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    break;
                case 6:
                    if (oldvalue61.equals(butIdSelectedval1) && idSelected1 != button61.getId()) {
                        if (buttonprime61.equals("yes")) {                             button61.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button61.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue62.equals(butIdSelectedval1) && idSelected1 != button62.getId()) {
                        if (buttonprime62.equals("yes")) {                             button62.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button62.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue63.equals(butIdSelectedval1) && idSelected1 != button63.getId()) {
                        if (buttonprime63.equals("yes")) {                             button63.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button63.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue64.equals(butIdSelectedval1) && idSelected1 != button64.getId()) {
                        if (buttonprime64.equals("yes")) {                             button64.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button64.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue65.equals(butIdSelectedval1) && idSelected1 != button65.getId()) {
                        if (buttonprime65.equals("yes")) {                             button65.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button65.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue66.equals(butIdSelectedval1) && idSelected1 != button66.getId()) {
                        if (buttonprime66.equals("yes")) {                             button66.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button66.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue67.equals(butIdSelectedval1) && idSelected1 != button67.getId()) {
                        if (buttonprime67.equals("yes")) {                             button67.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button67.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue68.equals(butIdSelectedval1) && idSelected1 != button68.getId()) {
                        if (buttonprime68.equals("yes")) {                             button68.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button68.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue69.equals(butIdSelectedval1) && idSelected1 != button69.getId()) {
                        if (buttonprime69.equals("yes")) {                             button69.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button69.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    break;
                case 7:
                    if (oldvalue71.equals(butIdSelectedval1) && idSelected1 != button71.getId()) {
                        if (buttonprime71.equals("yes")) {                             button71.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button71.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue72.equals(butIdSelectedval1) && idSelected1 != button72.getId()) {
                        if (buttonprime72.equals("yes")) {                             button72.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button72.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue73.equals(butIdSelectedval1) && idSelected1 != button73.getId()) {
                        if (buttonprime73.equals("yes")) {                             button73.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button73.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue74.equals(butIdSelectedval1) && idSelected1 != button74.getId()) {
                        if (buttonprime74.equals("yes")) {                             button74.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button74.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue75.equals(butIdSelectedval1) && idSelected1 != button75.getId()) {
                        if (buttonprime75.equals("yes")) {                             button75.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button75.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue76.equals(butIdSelectedval1) && idSelected1 != button76.getId()) {
                        if (buttonprime76.equals("yes")) {                             button76.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button76.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue77.equals(butIdSelectedval1) && idSelected1 != button77.getId()) {
                        if (buttonprime77.equals("yes")) {                             button77.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button77.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue78.equals(butIdSelectedval1) && idSelected1 != button78.getId()) {
                        if (buttonprime78.equals("yes")) {                             button78.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button78.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue79.equals(butIdSelectedval1) && idSelected1 != button79.getId()) {
                        if (buttonprime79.equals("yes")) {                             button79.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button79.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }

                    break;
                case 8:
                    if (oldvalue81.equals(butIdSelectedval1) && idSelected1 != button81.getId()) {
                        if (buttonprime81.equals("yes")) {                             button81.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button81.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue82.equals(butIdSelectedval1) && idSelected1 != button82.getId()) {
                        if (buttonprime82.equals("yes")) {                             button82.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button82.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue83.equals(butIdSelectedval1) && idSelected1 != button83.getId()) {
                        if (buttonprime83.equals("yes")) {                             button83.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button83.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue84.equals(butIdSelectedval1) && idSelected1 != button84.getId()) {
                        if (buttonprime84.equals("yes")) {                             button84.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button84.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue85.equals(butIdSelectedval1) && idSelected1 != button85.getId()) {
                        if (buttonprime85.equals("yes")) {                             button85.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button85.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue86.equals(butIdSelectedval1) && idSelected1 != button86.getId()) {
                        if (buttonprime86.equals("yes")) {                             button86.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button86.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue87.equals(butIdSelectedval1) && idSelected1 != button87.getId()) {
                        if (buttonprime87.equals("yes")) {                             button87.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button87.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue88.equals(butIdSelectedval1) && idSelected1 != button88.getId()) {
                        if (buttonprime88.equals("yes")) {                             button88.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button88.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue89.equals(butIdSelectedval1) && idSelected1 != button89.getId()) {
                        if (buttonprime89.equals("yes")) {                             button89.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button89.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    break;
                case 9:
                    if (oldvalue91.equals(butIdSelectedval1) && idSelected1 != button91.getId()) {
                        if (buttonprime91.equals("yes")) {                             button91.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button91.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue92.equals(butIdSelectedval1) && idSelected1 != button92.getId()) {
                        if (buttonprime92.equals("yes")) {                             button92.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button92.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue93.equals(butIdSelectedval1) && idSelected1 != button93.getId()) {
                        if (buttonprime93.equals("yes")) {                             button93.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button93.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue94.equals(butIdSelectedval1) && idSelected1 != button94.getId()) {
                        if (buttonprime94.equals("yes")) {                             button94.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button94.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue95.equals(butIdSelectedval1) && idSelected1 != button95.getId()) {
                        if (buttonprime95.equals("yes")) {                             button95.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button95.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue96.equals(butIdSelectedval1) && idSelected1 != button96.getId()) {
                        if (buttonprime96.equals("yes")) {                             button96.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button96.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue97.equals(butIdSelectedval1) && idSelected1 != button97.getId()) {
                        if (buttonprime97.equals("yes")) {                             button97.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button97.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue98.equals(butIdSelectedval1) && idSelected1 != button98.getId()) {
                        if (buttonprime98.equals("yes")) {                             button98.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button98.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    if (oldvalue99.equals(butIdSelectedval1) && idSelected1 != button99.getId()) {
                        if (buttonprime99.equals("yes")) {                             button99.setBackgroundResource(R.drawable.field_unit_mark);
                            but1.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                        else {
                            button99.setBackgroundResource(R.drawable.field_unit_mistake);
                        }
                    }
                    break;
            }


        }
    }

    public void OneNineButtonClick(View view) {

        Button ONButt = (Button) view;
        PressedONButton = ONButt.getText().toString();
        SharedPrefs = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor PrefEditor = SharedPrefs.edit();
        PrefEditor.putString("PRESSED_BUTTON", PressedONButton);
        PrefEditor.apply();

        //TextView ONBPressedButton = findViewById(R.id.textViewONButtonPressed);
        //ONBPressedButton.setText(PressedONButton);





        if (idSelected1 != 0) {
            Button butt1 = findViewById(idSelected1);
            if (butt1.isSelected()) {
                if (memoint==0) {
                    if (cancelActionInt==1){
                        historyActions();

                    }

                    butt1.setTextColor(getResources().getColor(R.color.black));
                    butt1.setText(PressedONButton);

                    SharedPrefs = getPreferences(MODE_PRIVATE);
                    SharedPreferences.Editor PrefsEditor = SharedPrefs.edit();
                    String idSelected1String = Integer.toString(idSelected1);
                    PrefsEditor.putString(idSelected1String, PressedONButton);
                    PrefsEditor.apply();

                    if (lightUpSimilar==1){
                        greencheck();
                    }
                    if (redUnitInt==1){
                        tablesunits();
                        checkRed();
                    }


                }
                else if (memoint==1){
                    SharedPreferences.Editor PrefsEditor = SharedPrefs.edit();
                    String idSelected1String = Integer.toString(idSelected1);
                    PrefsEditor.putString(idSelected1String, "");
                    PrefsEditor.apply();

                    butt1.setTextColor(getResources().getColor(R.color.grey));
                    butt1.setText(PressedONButton);
                    if (lightUpSimilar==1){
                        greencheck();
                    }
                    if (redUnitInt==1){
                        tablesunits();
                        checkRed();
                    }


                }
            }
        }


        String oldvalue11 = SharedPrefs.getString(buttonstring11, "");
        String oldvalue12 = SharedPrefs.getString(buttonstring12, "");
        String oldvalue13 = SharedPrefs.getString(buttonstring13, "");
        String oldvalue14 = SharedPrefs.getString(buttonstring14, "");
        String oldvalue15 = SharedPrefs.getString(buttonstring15, "");
        String oldvalue16 = SharedPrefs.getString(buttonstring16, "");
        String oldvalue17 = SharedPrefs.getString(buttonstring17, "");
        String oldvalue18 = SharedPrefs.getString(buttonstring18, "");
        String oldvalue19 = SharedPrefs.getString(buttonstring19, "");

        String oldvalue21 = SharedPrefs.getString(buttonstring21, "");
        String oldvalue22 = SharedPrefs.getString(buttonstring22, "");
        String oldvalue23 = SharedPrefs.getString(buttonstring23, "");
        String oldvalue24 = SharedPrefs.getString(buttonstring24, "");
        String oldvalue25 = SharedPrefs.getString(buttonstring25, "");
        String oldvalue26 = SharedPrefs.getString(buttonstring26, "");
        String oldvalue27 = SharedPrefs.getString(buttonstring27, "");
        String oldvalue28 = SharedPrefs.getString(buttonstring28, "");
        String oldvalue29 = SharedPrefs.getString(buttonstring29, "");

        String oldvalue31 = SharedPrefs.getString(buttonstring31, "");
        String oldvalue32 = SharedPrefs.getString(buttonstring32, "");
        String oldvalue33 = SharedPrefs.getString(buttonstring33, "");
        String oldvalue34 = SharedPrefs.getString(buttonstring34, "");
        String oldvalue35 = SharedPrefs.getString(buttonstring35, "");
        String oldvalue36 = SharedPrefs.getString(buttonstring36, "");
        String oldvalue37 = SharedPrefs.getString(buttonstring37, "");
        String oldvalue38 = SharedPrefs.getString(buttonstring38, "");
        String oldvalue39 = SharedPrefs.getString(buttonstring39, "");

        String oldvalue41 = SharedPrefs.getString(buttonstring41, "");
        String oldvalue42 = SharedPrefs.getString(buttonstring42, "");
        String oldvalue43 = SharedPrefs.getString(buttonstring43, "");
        String oldvalue44 = SharedPrefs.getString(buttonstring44, "");
        String oldvalue45 = SharedPrefs.getString(buttonstring45, "");
        String oldvalue46 = SharedPrefs.getString(buttonstring46, "");
        String oldvalue47 = SharedPrefs.getString(buttonstring47, "");
        String oldvalue48 = SharedPrefs.getString(buttonstring48, "");
        String oldvalue49 = SharedPrefs.getString(buttonstring49, "");

        String oldvalue51 = SharedPrefs.getString(buttonstring51, "");
        String oldvalue52 = SharedPrefs.getString(buttonstring52, "");
        String oldvalue53 = SharedPrefs.getString(buttonstring53, "");
        String oldvalue54 = SharedPrefs.getString(buttonstring54, "");
        String oldvalue55 = SharedPrefs.getString(buttonstring55, "");
        String oldvalue56 = SharedPrefs.getString(buttonstring56, "");
        String oldvalue57 = SharedPrefs.getString(buttonstring57, "");
        String oldvalue58 = SharedPrefs.getString(buttonstring58, "");
        String oldvalue59 = SharedPrefs.getString(buttonstring59, "");

        String oldvalue61 = SharedPrefs.getString(buttonstring61, "");
        String oldvalue62 = SharedPrefs.getString(buttonstring62, "");
        String oldvalue63 = SharedPrefs.getString(buttonstring63, "");
        String oldvalue64 = SharedPrefs.getString(buttonstring64, "");
        String oldvalue65 = SharedPrefs.getString(buttonstring65, "");
        String oldvalue66 = SharedPrefs.getString(buttonstring66, "");
        String oldvalue67 = SharedPrefs.getString(buttonstring67, "");
        String oldvalue68 = SharedPrefs.getString(buttonstring68, "");
        String oldvalue69 = SharedPrefs.getString(buttonstring69, "");

        String oldvalue71 = SharedPrefs.getString(buttonstring71, "");
        String oldvalue72 = SharedPrefs.getString(buttonstring72, "");
        String oldvalue73 = SharedPrefs.getString(buttonstring73, "");
        String oldvalue74 = SharedPrefs.getString(buttonstring74, "");
        String oldvalue75 = SharedPrefs.getString(buttonstring75, "");
        String oldvalue76 = SharedPrefs.getString(buttonstring76, "");
        String oldvalue77 = SharedPrefs.getString(buttonstring77, "");
        String oldvalue78 = SharedPrefs.getString(buttonstring78, "");
        String oldvalue79 = SharedPrefs.getString(buttonstring79, "");

        String oldvalue81 = SharedPrefs.getString(buttonstring81, "");
        String oldvalue82 = SharedPrefs.getString(buttonstring82, "");
        String oldvalue83 = SharedPrefs.getString(buttonstring83, "");
        String oldvalue84 = SharedPrefs.getString(buttonstring84, "");
        String oldvalue85 = SharedPrefs.getString(buttonstring85, "");
        String oldvalue86 = SharedPrefs.getString(buttonstring86, "");
        String oldvalue87 = SharedPrefs.getString(buttonstring87, "");
        String oldvalue88 = SharedPrefs.getString(buttonstring88, "");
        String oldvalue89 = SharedPrefs.getString(buttonstring89, "");

        String oldvalue91 = SharedPrefs.getString(buttonstring91, "");
        String oldvalue92 = SharedPrefs.getString(buttonstring92, "");
        String oldvalue93 = SharedPrefs.getString(buttonstring93, "");
        String oldvalue94 = SharedPrefs.getString(buttonstring94, "");
        String oldvalue95 = SharedPrefs.getString(buttonstring95, "");
        String oldvalue96 = SharedPrefs.getString(buttonstring96, "");
        String oldvalue97 = SharedPrefs.getString(buttonstring97, "");
        String oldvalue98 = SharedPrefs.getString(buttonstring98, "");
        String oldvalue99 = SharedPrefs.getString(buttonstring99, "");





        if (!oldvalue11.isEmpty()&& !oldvalue12.isEmpty()&& !oldvalue13.isEmpty()&& !oldvalue14.isEmpty()&& !oldvalue15.isEmpty() && !oldvalue16.isEmpty() && !oldvalue17.isEmpty() && !oldvalue18.isEmpty() && !oldvalue19.isEmpty()){
            //TextView testvar=findViewById(R.id.testvar);
            //testvar.setText("NTEMPT");



            int oldvalueint11=	Integer.parseInt(oldvalue11	);
            int oldvalueint12=	Integer.parseInt(oldvalue12	);
            int oldvalueint13=	Integer.parseInt(oldvalue13	);
            int oldvalueint14=	Integer.parseInt(oldvalue14	);
            int oldvalueint15=	Integer.parseInt(oldvalue15	);
            int oldvalueint16=	Integer.parseInt(oldvalue16	);
            int oldvalueint17=	Integer.parseInt(oldvalue17	);
            int oldvalueint18=	Integer.parseInt(oldvalue18	);
            int oldvalueint19=	Integer.parseInt(oldvalue19	);

            if (oldvalueint11+oldvalueint12+oldvalueint13+oldvalueint14+oldvalueint15+oldvalueint16+oldvalueint17+oldvalueint18+oldvalueint19==45){
                //testvar.setText("==45");
            }




            if (!oldvalue21.isEmpty()&& !oldvalue22.isEmpty()&& !oldvalue23.isEmpty()&& !oldvalue24.isEmpty()&& !oldvalue25.isEmpty() && !oldvalue26.isEmpty() && !oldvalue27.isEmpty() && !oldvalue28.isEmpty() && !oldvalue29.isEmpty()){



                int oldvalueint21=	Integer.parseInt(oldvalue21	);
                int oldvalueint22=	Integer.parseInt(oldvalue22	);
                int oldvalueint23=	Integer.parseInt(oldvalue23	);
                int oldvalueint24=	Integer.parseInt(oldvalue24	);
                int oldvalueint25=	Integer.parseInt(oldvalue25	);
                int oldvalueint26=	Integer.parseInt(oldvalue26	);
                int oldvalueint27=	Integer.parseInt(oldvalue27	);
                int oldvalueint28=	Integer.parseInt(oldvalue28	);
                int oldvalueint29=	Integer.parseInt(oldvalue29	);

                if (oldvalueint21+oldvalueint22+oldvalueint23+oldvalueint24+oldvalueint25+oldvalueint26+oldvalueint27+oldvalueint28+oldvalueint29==45){
                    //testvar.setText("2=45");
                }
                if (!oldvalue31.isEmpty()&& !oldvalue32.isEmpty()&& !oldvalue33.isEmpty()&& !oldvalue34.isEmpty()&& !oldvalue35.isEmpty() && !oldvalue36.isEmpty() && !oldvalue37.isEmpty() && !oldvalue38.isEmpty() && !oldvalue39.isEmpty()){


                    int oldvalueint31=	Integer.parseInt(oldvalue31	);
                    int oldvalueint32=	Integer.parseInt(oldvalue32	);
                    int oldvalueint33=	Integer.parseInt(oldvalue33	);
                    int oldvalueint34=	Integer.parseInt(oldvalue34	);
                    int oldvalueint35=	Integer.parseInt(oldvalue35	);
                    int oldvalueint36=	Integer.parseInt(oldvalue36	);
                    int oldvalueint37=	Integer.parseInt(oldvalue37	);
                    int oldvalueint38=	Integer.parseInt(oldvalue38	);
                    int oldvalueint39=	Integer.parseInt(oldvalue39	);

                    if (oldvalueint11+oldvalueint12+oldvalueint13+oldvalueint21+oldvalueint22+oldvalueint23+oldvalueint31+oldvalueint32+oldvalueint33==45){
                        //testvar.setText("1L=45");
                    }

                    if (!oldvalue41.isEmpty()&& !oldvalue42.isEmpty()&& !oldvalue43.isEmpty()&& !oldvalue44.isEmpty()&& !oldvalue45.isEmpty() && !oldvalue46.isEmpty() && !oldvalue47.isEmpty() && !oldvalue48.isEmpty() && !oldvalue49.isEmpty()){



                        int oldvalueint41=	Integer.parseInt(oldvalue41	);
                        int oldvalueint42=	Integer.parseInt(oldvalue42	);
                        int oldvalueint43=	Integer.parseInt(oldvalue43	);
                        int oldvalueint44=	Integer.parseInt(oldvalue44	);
                        int oldvalueint45=	Integer.parseInt(oldvalue45	);
                        int oldvalueint46=	Integer.parseInt(oldvalue46	);
                        int oldvalueint47=	Integer.parseInt(oldvalue47	);
                        int oldvalueint48=	Integer.parseInt(oldvalue48	);
                        int oldvalueint49=	Integer.parseInt(oldvalue49	);
                        if (!oldvalue51.isEmpty()&& !oldvalue52.isEmpty()&& !oldvalue53.isEmpty()&& !oldvalue54.isEmpty()&& !oldvalue55.isEmpty() && !oldvalue56.isEmpty() && !oldvalue57.isEmpty() && !oldvalue58.isEmpty() && !oldvalue59.isEmpty()){




                            int oldvalueint51=	Integer.parseInt(oldvalue51	);
                            int oldvalueint52=	Integer.parseInt(oldvalue52	);
                            int oldvalueint53=	Integer.parseInt(oldvalue53	);
                            int oldvalueint54=	Integer.parseInt(oldvalue54	);
                            int oldvalueint55=	Integer.parseInt(oldvalue55	);
                            int oldvalueint56=	Integer.parseInt(oldvalue56	);
                            int oldvalueint57=	Integer.parseInt(oldvalue57	);
                            int oldvalueint58=	Integer.parseInt(oldvalue58	);
                            int oldvalueint59=	Integer.parseInt(oldvalue59	);
                            if (!oldvalue61.isEmpty()&& !oldvalue62.isEmpty()&& !oldvalue63.isEmpty()&& !oldvalue64.isEmpty()&& !oldvalue65.isEmpty() && !oldvalue66.isEmpty() && !oldvalue67.isEmpty() && !oldvalue68.isEmpty() && !oldvalue69.isEmpty()){


                                int oldvalueint61=	Integer.parseInt(oldvalue61	);
                                int oldvalueint62=	Integer.parseInt(oldvalue62	);
                                int oldvalueint63=	Integer.parseInt(oldvalue63	);
                                int oldvalueint64=	Integer.parseInt(oldvalue64	);
                                int oldvalueint65=	Integer.parseInt(oldvalue65	);
                                int oldvalueint66=	Integer.parseInt(oldvalue66	);
                                int oldvalueint67=	Integer.parseInt(oldvalue67	);
                                int oldvalueint68=	Integer.parseInt(oldvalue68	);
                                int oldvalueint69=	Integer.parseInt(oldvalue69	);
                                if (!oldvalue71.isEmpty()&& !oldvalue72.isEmpty()&& !oldvalue73.isEmpty()&& !oldvalue74.isEmpty()&& !oldvalue75.isEmpty() && !oldvalue76.isEmpty() && !oldvalue77.isEmpty() && !oldvalue78.isEmpty() && !oldvalue79.isEmpty()){


                                    int oldvalueint71=	Integer.parseInt(oldvalue71	);
                                    int oldvalueint72=	Integer.parseInt(oldvalue72	);
                                    int oldvalueint73=	Integer.parseInt(oldvalue73	);
                                    int oldvalueint74=	Integer.parseInt(oldvalue74	);
                                    int oldvalueint75=	Integer.parseInt(oldvalue75	);
                                    int oldvalueint76=	Integer.parseInt(oldvalue76	);
                                    int oldvalueint77=	Integer.parseInt(oldvalue77	);
                                    int oldvalueint78=	Integer.parseInt(oldvalue78	);
                                    int oldvalueint79=	Integer.parseInt(oldvalue79	);
                                    if (!oldvalue81.isEmpty()&& !oldvalue82.isEmpty()&& !oldvalue83.isEmpty()&& !oldvalue84.isEmpty()&& !oldvalue85.isEmpty() && !oldvalue86.isEmpty() && !oldvalue87.isEmpty() && !oldvalue88.isEmpty() && !oldvalue89.isEmpty()){


                                        int oldvalueint81=	Integer.parseInt(oldvalue81	);
                                        int oldvalueint82=	Integer.parseInt(oldvalue82	);
                                        int oldvalueint83=	Integer.parseInt(oldvalue83	);
                                        int oldvalueint84=	Integer.parseInt(oldvalue84	);
                                        int oldvalueint85=	Integer.parseInt(oldvalue85	);
                                        int oldvalueint86=	Integer.parseInt(oldvalue86	);
                                        int oldvalueint87=	Integer.parseInt(oldvalue87	);
                                        int oldvalueint88=	Integer.parseInt(oldvalue88	);
                                        int oldvalueint89=	Integer.parseInt(oldvalue89	);
                                        if (!oldvalue91.isEmpty()&& !oldvalue92.isEmpty()&& !oldvalue93.isEmpty()&& !oldvalue94.isEmpty()&& !oldvalue95.isEmpty() && !oldvalue96.isEmpty() && !oldvalue97.isEmpty() && !oldvalue98.isEmpty() && !oldvalue99.isEmpty()){

                                            int oldvalueint91=	Integer.parseInt(oldvalue91	);
                                            int oldvalueint92=	Integer.parseInt(oldvalue92	);
                                            int oldvalueint93=	Integer.parseInt(oldvalue93	);
                                            int oldvalueint94=	Integer.parseInt(oldvalue94	);
                                            int oldvalueint95=	Integer.parseInt(oldvalue95	);
                                            int oldvalueint96=	Integer.parseInt(oldvalue96	);
                                            int oldvalueint97=	Integer.parseInt(oldvalue97	);
                                            int oldvalueint98=	Integer.parseInt(oldvalue98	);
                                            int oldvalueint99=	Integer.parseInt(oldvalue99	);



                                            if (oldvalueint11+oldvalueint12+oldvalueint13+oldvalueint14+oldvalueint15+oldvalueint16+oldvalueint17+oldvalueint18+oldvalueint19==45
                                                    &&oldvalueint21+oldvalueint22+oldvalueint23+oldvalueint24+oldvalueint25+oldvalueint26+oldvalueint27+oldvalueint28+oldvalueint29==45
                                                    &&oldvalueint31+oldvalueint32+oldvalueint33+oldvalueint34+oldvalueint35+oldvalueint36+oldvalueint37+oldvalueint38+oldvalueint39==45
                                                    &&oldvalueint41+oldvalueint42+oldvalueint43+oldvalueint44+oldvalueint45+oldvalueint46+oldvalueint47+oldvalueint48+oldvalueint49==45
                                                    &&oldvalueint51+oldvalueint52+oldvalueint53+oldvalueint54+oldvalueint55+oldvalueint56+oldvalueint57+oldvalueint58+oldvalueint59==45
                                                    &&oldvalueint61+oldvalueint62+oldvalueint63+oldvalueint64+oldvalueint65+oldvalueint66+oldvalueint67+oldvalueint68+oldvalueint69==45
                                                    &&oldvalueint71+oldvalueint72+oldvalueint73+oldvalueint74+oldvalueint75+oldvalueint76+oldvalueint77+oldvalueint78+oldvalueint79==45
                                                    &&oldvalueint81+oldvalueint82+oldvalueint83+oldvalueint84+oldvalueint85+oldvalueint86+oldvalueint87+oldvalueint88+oldvalueint89==45
                                                    &&oldvalueint91+oldvalueint92+oldvalueint93+oldvalueint94+oldvalueint95+oldvalueint96+oldvalueint97+oldvalueint98+oldvalueint99==45){
                                                if (oldvalueint11+oldvalueint12+oldvalueint13+oldvalueint21+oldvalueint22+oldvalueint23+oldvalueint31+oldvalueint32+oldvalueint33==45
                                                        &&oldvalueint14+oldvalueint15+oldvalueint16+oldvalueint24+oldvalueint25+oldvalueint26+oldvalueint34+oldvalueint35+oldvalueint36==45
                                                        &&oldvalueint17+oldvalueint18+oldvalueint19+oldvalueint27+oldvalueint28+oldvalueint29+oldvalueint37+oldvalueint38+oldvalueint39==45

                                                        &&oldvalueint41+oldvalueint42+oldvalueint43+oldvalueint51+oldvalueint52+oldvalueint53+oldvalueint61+oldvalueint62+oldvalueint63==45
                                                        &&oldvalueint44+oldvalueint45+oldvalueint46+oldvalueint54+oldvalueint55+oldvalueint56+oldvalueint64+oldvalueint65+oldvalueint66==45
                                                        &&oldvalueint47+oldvalueint48+oldvalueint49+oldvalueint57+oldvalueint58+oldvalueint59+oldvalueint67+oldvalueint68+oldvalueint69==45


                                                        &&oldvalueint71+oldvalueint72+oldvalueint73+oldvalueint81+oldvalueint82+oldvalueint83+oldvalueint91+oldvalueint92+oldvalueint93==45
                                                        &&oldvalueint74+oldvalueint75+oldvalueint76+oldvalueint84+oldvalueint85+oldvalueint86+oldvalueint94+oldvalueint95+oldvalueint96==45
                                                        &&oldvalueint77+oldvalueint78+oldvalueint79+oldvalueint87+oldvalueint88+oldvalueint89+oldvalueint97+oldvalueint98+oldvalueint99==45){

                                                    SharedPreferences variantdone=getSharedPreferences("Variantdone", Context.MODE_PRIVATE);
                                                    SharedPreferences.Editor shareeditor=variantdone.edit();
                                                    shareeditor.putString(variantstring,"done");
                                                    shareeditor.apply();
                                                    //passedlevels();

                                                    SharedPreferences sharesavegame=getSharedPreferences("SaveGame", Context.MODE_PRIVATE);
                                                    SharedPreferences.Editor sharesaveeditor=sharesavegame.edit();
                                                    sharesaveeditor.putString("Save","0");
                                                    sharesaveeditor.apply();

                                                    Intent intentyeay=new Intent(this,YeayActivity.class);
                                                    startActivity(intentyeay);

                                                }
                                            }

                                        }
                                    }
                                }
                            }
                        }

                    }
                }
            }
        }

        //int check= oldvalue11!=oldvalue12&& oldvalue11!=oldvalue13 && oldvalue11!=oldvalue14 && oldvalue11!=oldvalue15 && oldvalue11!=oldvalue16 && oldvalue11!=oldvalue17 && oldvalue11!=oldvalue18 && oldvalue11!=oldvalue19
        //        && oldvalue12!=oldvalue13 && oldvalue12!=oldvalue14 && oldvalue12!=oldvalue15 && oldvalue12!=oldvalue16 && oldvalue12!=oldvalue17 && oldvalue12!=oldvalue18 && oldvalue12!=oldvalue19
        //        && oldvalue13!=oldvalue14? 1:0;


        //if (oldvalue11!=oldvalue12 && oldvalue11!=oldvalue13 && oldvalue11!=oldvalue14 && oldvalue11!=oldvalue15 && oldvalue11!=oldvalue16 && oldvalue11!=oldvalue17 && oldvalue11!=oldvalue18 && oldvalue11!=oldvalue19){
        //if (oldvalue12!=oldvalue13 && oldvalue12!=oldvalue14&& oldvalue12!=oldvalue15){

        //}


        //}

        numberscount();
    }


    public void Memo(View view){
        Button memo=findViewById(R.id.Memo);
        if (memo.isSelected()){
            memo.setSelected(false);
            memoint=0;
        }
        else{
            memo.setSelected(true);
            memoint=1;

        }
    }
    public void historyActions(){
        Button butt1=findViewById(idSelected1);
        String buttstring1=butt1.getText().toString();


        actionSelected36=actionSelected35;
        actionSelected35=actionSelected34;
        actionSelected34=actionSelected33;
        actionSelected33=actionSelected32;
        actionSelected32=actionSelected31;
        actionSelected31=actionSelected30;
        actionSelected30=actionSelected29;
        actionSelected29=actionSelected28;
        actionSelected28=actionSelected27;
        actionSelected27=actionSelected26;
        actionSelected26=actionSelected25;
        actionSelected25=actionSelected24;
        actionSelected24=actionSelected23;
        actionSelected23=actionSelected22;
        actionSelected22=actionSelected21;
        actionSelected21=actionSelected20;
        actionSelected20=actionSelected19;
        actionSelected19=actionSelected18;
        actionSelected18=actionSelected17;
        actionSelected17=actionSelected16;
        actionSelected16=actionSelected15;
        actionSelected15=actionSelected14;
        actionSelected14=actionSelected13;
        actionSelected13=actionSelected12;
        actionSelected12=actionSelected11;
        actionSelected11=actionSelected10;
        actionSelected10=actionSelected9;
        actionSelected9=actionSelected8;
        actionSelected8=actionSelected7;
        actionSelected7=actionSelected6;
        actionSelected6=actionSelected5;
        actionSelected5=actionSelected4;
        actionSelected4=actionSelected3;
        actionSelected3=actionSelected2;
        actionSelected2=actionSelected1;
        actionSelected1=idSelected1;

        actionString36=actionString35;
        actionString35=actionString34;
        actionString34=actionString33;
        actionString33=actionString32;
        actionString32=actionString31;
        actionString31=actionString30;
        actionString30=actionString29;
        actionString29=actionString28;
        actionString28=actionString27;
        actionString27=actionString26;
        actionString26=actionString25;
        actionString25=actionString24;
        actionString24=actionString23;
        actionString23=actionString22;
        actionString22=actionString21;
        actionString21=actionString20;
        actionString20=actionString19;
        actionString19=actionString18;
        actionString18=actionString17;
        actionString17=actionString16;
        actionString16=actionString15;
        actionString15=actionString14;
        actionString14=actionString13;
        actionString13=actionString12;
        actionString12=actionString11;
        actionString11=actionString10;
        actionString10=actionString9;
        actionString9=actionString8;
        actionString8=actionString7;
        actionString7=actionString6;
        actionString6=actionString5;
        actionString5=actionString4;
        actionString4=actionString3;
        actionString3=actionString2;
        actionString2=actionString1;
        actionString1=PressedONButton;

        actionStringOld36=actionStringOld35;
        actionStringOld35=actionStringOld34;
        actionStringOld34=actionStringOld33;
        actionStringOld33=actionStringOld32;
        actionStringOld32=actionStringOld31;
        actionStringOld31=actionStringOld30;
        actionStringOld30=actionStringOld29;
        actionStringOld29=actionStringOld28;
        actionStringOld28=actionStringOld27;
        actionStringOld27=actionStringOld26;
        actionStringOld26=actionStringOld25;
        actionStringOld25=actionStringOld24;
        actionStringOld24=actionStringOld23;
        actionStringOld23=actionStringOld22;
        actionStringOld22=actionStringOld21;
        actionStringOld21=actionStringOld20;
        actionStringOld20=actionStringOld19;
        actionStringOld19=actionStringOld18;
        actionStringOld18=actionStringOld17;
        actionStringOld17=actionStringOld16;
        actionStringOld16=actionStringOld15;
        actionStringOld15=actionStringOld14;
        actionStringOld14=actionStringOld13;
        actionStringOld13=actionStringOld12;
        actionStringOld12=actionStringOld11;
        actionStringOld11=actionStringOld10;
        actionStringOld10=actionStringOld9;
        actionStringOld9=actionStringOld8;
        actionStringOld8=actionStringOld7;
        actionStringOld7=actionStringOld6;
        actionStringOld6=actionStringOld5;
        actionStringOld5=actionStringOld4;
        actionStringOld4=actionStringOld3;
        actionStringOld3=actionStringOld2;
        actionStringOld2=actionStringOld1;
        actionStringOld1=buttstring1;
        if (buttstring1.isEmpty()){
            actionStringOld1="";
        }

    }
    public void CancelAction(View view){
        if (actionSelected1!=0) {
            primordialunits();
            normalunits();
            Button butt1=findViewById(idSelected1);
            butt1.setSelected(true);

            //TextView uni=findViewById(R.id.unitsize);
            //String uni1=Integer.toString(actionSelected1);
            //uni.setText(uni1+actionStringOld1);


            SharedPrefs = getPreferences(MODE_PRIVATE);
            SharedPreferences.Editor PrefsEditor = SharedPrefs.edit();
            String actionSelectedString1 = Integer.toString(actionSelected1);
            PrefsEditor.putString(actionSelectedString1, actionStringOld1);
            PrefsEditor.apply();


            Button buttoncancel = findViewById(actionSelected1);

            //if (actionStringOld1.isEmpty()){
            //    buttoncancel.setText("");
            //}

            buttoncancel.setText(actionStringOld1);

            actionStringOld1=actionStringOld2;
            actionStringOld2=actionStringOld3;
            actionStringOld3=actionStringOld4;
            actionStringOld4=actionStringOld5;
            actionStringOld5=actionStringOld6;
            actionStringOld6=actionStringOld7;
            actionStringOld7=actionStringOld8;
            actionStringOld8=actionStringOld9;
            actionStringOld9=actionStringOld10;
            actionStringOld10=actionStringOld11;
            actionStringOld11=actionStringOld12;
            actionStringOld12=actionStringOld13;
            actionStringOld13=actionStringOld14;
            actionStringOld14=actionStringOld15;
            actionStringOld15=actionStringOld16;
            actionStringOld16=actionStringOld17;
            actionStringOld17=actionStringOld18;
            actionStringOld18=actionStringOld19;
            actionStringOld19=actionStringOld20;
            actionStringOld20=actionStringOld21;
            actionStringOld21=actionStringOld22;
            actionStringOld22=actionStringOld23;
            actionStringOld23=actionStringOld24;
            actionStringOld24=actionStringOld25;
            actionStringOld25=actionStringOld26;
            actionStringOld26=actionStringOld27;
            actionStringOld27=actionStringOld28;
            actionStringOld28=actionStringOld29;
            actionStringOld29=actionStringOld30;
            actionStringOld30=actionStringOld31;
            actionStringOld31=actionStringOld32;
            actionStringOld32=actionStringOld33;
            actionStringOld33=actionStringOld34;
            actionStringOld34=actionStringOld35;
            actionStringOld35=actionStringOld36;
            actionStringOld36="";
            actionSelected1=actionSelected2;
            actionSelected2=actionSelected3;
            actionSelected3=actionSelected4;
            actionSelected4=actionSelected5;
            actionSelected5=actionSelected6;
            actionSelected6=actionSelected7;
            actionSelected7=actionSelected8;
            actionSelected8=actionSelected9;
            actionSelected9=actionSelected10;
            actionSelected10=actionSelected11;
            actionSelected11=actionSelected12;
            actionSelected12=actionSelected13;
            actionSelected13=actionSelected14;
            actionSelected14=actionSelected15;
            actionSelected15=actionSelected16;
            actionSelected16=actionSelected17;
            actionSelected17=actionSelected18;
            actionSelected18=actionSelected19;
            actionSelected19=actionSelected20;
            actionSelected20=actionSelected21;
            actionSelected21=actionSelected22;
            actionSelected22=actionSelected23;
            actionSelected23=actionSelected24;
            actionSelected24=actionSelected25;
            actionSelected25=actionSelected26;
            actionSelected26=actionSelected27;
            actionSelected27=actionSelected28;
            actionSelected28=actionSelected29;
            actionSelected29=actionSelected30;
            actionSelected30=actionSelected31;
            actionSelected31=actionSelected32;
            actionSelected32=actionSelected33;
            actionSelected33=actionSelected34;
            actionSelected34=actionSelected35;
            actionSelected35=actionSelected36;
            actionSelected36=0;

        }
    }

    public void numberscount(){
        String oldvalue11 = SharedPrefs.getString(buttonstring11, "");
        String oldvalue12 = SharedPrefs.getString(buttonstring12, "");
        String oldvalue13 = SharedPrefs.getString(buttonstring13, "");
        String oldvalue14 = SharedPrefs.getString(buttonstring14, "");
        String oldvalue15 = SharedPrefs.getString(buttonstring15, "");
        String oldvalue16 = SharedPrefs.getString(buttonstring16, "");
        String oldvalue17 = SharedPrefs.getString(buttonstring17, "");
        String oldvalue18 = SharedPrefs.getString(buttonstring18, "");
        String oldvalue19 = SharedPrefs.getString(buttonstring19, "");

        String oldvalue21 = SharedPrefs.getString(buttonstring21, "");
        String oldvalue22 = SharedPrefs.getString(buttonstring22, "");
        String oldvalue23 = SharedPrefs.getString(buttonstring23, "");
        String oldvalue24 = SharedPrefs.getString(buttonstring24, "");
        String oldvalue25 = SharedPrefs.getString(buttonstring25, "");
        String oldvalue26 = SharedPrefs.getString(buttonstring26, "");
        String oldvalue27 = SharedPrefs.getString(buttonstring27, "");
        String oldvalue28 = SharedPrefs.getString(buttonstring28, "");
        String oldvalue29 = SharedPrefs.getString(buttonstring29, "");

        String oldvalue31 = SharedPrefs.getString(buttonstring31, "");
        String oldvalue32 = SharedPrefs.getString(buttonstring32, "");
        String oldvalue33 = SharedPrefs.getString(buttonstring33, "");
        String oldvalue34 = SharedPrefs.getString(buttonstring34, "");
        String oldvalue35 = SharedPrefs.getString(buttonstring35, "");
        String oldvalue36 = SharedPrefs.getString(buttonstring36, "");
        String oldvalue37 = SharedPrefs.getString(buttonstring37, "");
        String oldvalue38 = SharedPrefs.getString(buttonstring38, "");
        String oldvalue39 = SharedPrefs.getString(buttonstring39, "");

        String oldvalue41 = SharedPrefs.getString(buttonstring41, "");
        String oldvalue42 = SharedPrefs.getString(buttonstring42, "");
        String oldvalue43 = SharedPrefs.getString(buttonstring43, "");
        String oldvalue44 = SharedPrefs.getString(buttonstring44, "");
        String oldvalue45 = SharedPrefs.getString(buttonstring45, "");
        String oldvalue46 = SharedPrefs.getString(buttonstring46, "");
        String oldvalue47 = SharedPrefs.getString(buttonstring47, "");
        String oldvalue48 = SharedPrefs.getString(buttonstring48, "");
        String oldvalue49 = SharedPrefs.getString(buttonstring49, "");

        String oldvalue51 = SharedPrefs.getString(buttonstring51, "");
        String oldvalue52 = SharedPrefs.getString(buttonstring52, "");
        String oldvalue53 = SharedPrefs.getString(buttonstring53, "");
        String oldvalue54 = SharedPrefs.getString(buttonstring54, "");
        String oldvalue55 = SharedPrefs.getString(buttonstring55, "");
        String oldvalue56 = SharedPrefs.getString(buttonstring56, "");
        String oldvalue57 = SharedPrefs.getString(buttonstring57, "");
        String oldvalue58 = SharedPrefs.getString(buttonstring58, "");
        String oldvalue59 = SharedPrefs.getString(buttonstring59, "");

        String oldvalue61 = SharedPrefs.getString(buttonstring61, "");
        String oldvalue62 = SharedPrefs.getString(buttonstring62, "");
        String oldvalue63 = SharedPrefs.getString(buttonstring63, "");
        String oldvalue64 = SharedPrefs.getString(buttonstring64, "");
        String oldvalue65 = SharedPrefs.getString(buttonstring65, "");
        String oldvalue66 = SharedPrefs.getString(buttonstring66, "");
        String oldvalue67 = SharedPrefs.getString(buttonstring67, "");
        String oldvalue68 = SharedPrefs.getString(buttonstring68, "");
        String oldvalue69 = SharedPrefs.getString(buttonstring69, "");

        String oldvalue71 = SharedPrefs.getString(buttonstring71, "");
        String oldvalue72 = SharedPrefs.getString(buttonstring72, "");
        String oldvalue73 = SharedPrefs.getString(buttonstring73, "");
        String oldvalue74 = SharedPrefs.getString(buttonstring74, "");
        String oldvalue75 = SharedPrefs.getString(buttonstring75, "");
        String oldvalue76 = SharedPrefs.getString(buttonstring76, "");
        String oldvalue77 = SharedPrefs.getString(buttonstring77, "");
        String oldvalue78 = SharedPrefs.getString(buttonstring78, "");
        String oldvalue79 = SharedPrefs.getString(buttonstring79, "");

        String oldvalue81 = SharedPrefs.getString(buttonstring81, "");
        String oldvalue82 = SharedPrefs.getString(buttonstring82, "");
        String oldvalue83 = SharedPrefs.getString(buttonstring83, "");
        String oldvalue84 = SharedPrefs.getString(buttonstring84, "");
        String oldvalue85 = SharedPrefs.getString(buttonstring85, "");
        String oldvalue86 = SharedPrefs.getString(buttonstring86, "");
        String oldvalue87 = SharedPrefs.getString(buttonstring87, "");
        String oldvalue88 = SharedPrefs.getString(buttonstring88, "");
        String oldvalue89 = SharedPrefs.getString(buttonstring89, "");

        String oldvalue91 = SharedPrefs.getString(buttonstring91, "");
        String oldvalue92 = SharedPrefs.getString(buttonstring92, "");
        String oldvalue93 = SharedPrefs.getString(buttonstring93, "");
        String oldvalue94 = SharedPrefs.getString(buttonstring94, "");
        String oldvalue95 = SharedPrefs.getString(buttonstring95, "");
        String oldvalue96 = SharedPrefs.getString(buttonstring96, "");
        String oldvalue97 = SharedPrefs.getString(buttonstring97, "");
        String oldvalue98 = SharedPrefs.getString(buttonstring98, "");
        String oldvalue99 = SharedPrefs.getString(buttonstring99, "");

        if (PressedONButton.equals("1")) {
            onecount=0;
            if (oldvalue11.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue12.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue13.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue14.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue15.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue16.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue17.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue18.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue19.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue21.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue22.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue23.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue24.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue25.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue26.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue27.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue28.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue29.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue31.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue32.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue33.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue34.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue35.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue36.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue37.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue38.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue39.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue41.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue42.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue43.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue44.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue45.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue46.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue47.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue48.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue49.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue51.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue52.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue53.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue54.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue55.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue56.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue57.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue58.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue59.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue61.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue62.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue63.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue64.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue65.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue66.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue67.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue68.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue69.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue71.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue72.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue73.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue74.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue75.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue76.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue77.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue78.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue79.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue81.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue82.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue83.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue84.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue85.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue86.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue87.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue88.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue89.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue91.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue92.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue93.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue94.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue95.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue96.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue97.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue98.equals("1")) {
                onecount = onecount + 1;
            }
            if (oldvalue99.equals("1")) {
                onecount = onecount + 1;
            }
        }

        if (PressedONButton.equals("2")) {
            twocount=0;
            if (oldvalue11.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue12.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue13.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue14.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue15.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue16.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue17.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue18.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue19.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue21.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue22.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue23.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue24.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue25.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue26.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue27.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue28.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue29.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue31.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue32.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue33.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue34.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue35.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue36.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue37.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue38.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue39.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue41.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue42.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue43.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue44.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue45.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue46.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue47.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue48.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue49.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue51.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue52.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue53.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue54.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue55.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue56.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue57.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue58.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue59.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue61.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue62.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue63.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue64.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue65.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue66.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue67.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue68.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue69.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue71.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue72.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue73.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue74.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue75.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue76.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue77.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue78.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue79.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue81.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue82.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue83.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue84.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue85.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue86.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue87.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue88.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue89.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue91.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue92.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue93.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue94.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue95.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue96.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue97.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue98.equals("2")) {
                twocount = twocount + 1;
            }
            if (oldvalue99.equals("2")) {
                twocount = twocount + 1;
            }
        }

        if (PressedONButton.equals("3")) {
            threecount=0;
            if (oldvalue11.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue12.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue13.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue14.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue15.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue16.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue17.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue18.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue19.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue21.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue22.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue23.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue24.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue25.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue26.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue27.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue28.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue29.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue31.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue32.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue33.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue34.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue35.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue36.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue37.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue38.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue39.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue41.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue42.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue43.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue44.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue45.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue46.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue47.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue48.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue49.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue51.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue52.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue53.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue54.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue55.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue56.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue57.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue58.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue59.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue61.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue62.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue63.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue64.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue65.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue66.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue67.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue68.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue69.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue71.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue72.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue73.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue74.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue75.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue76.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue77.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue78.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue79.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue81.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue82.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue83.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue84.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue85.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue86.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue87.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue88.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue89.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue91.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue92.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue93.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue94.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue95.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue96.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue97.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue98.equals("3")) {
                threecount = threecount + 1;
            }
            if (oldvalue99.equals("3")) {
                threecount = threecount + 1;
            }
        }

        if (PressedONButton.equals("4")) {
            fourcount=0;
            if (oldvalue11.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue12.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue13.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue14.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue15.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue16.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue17.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue18.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue19.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue21.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue22.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue23.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue24.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue25.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue26.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue27.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue28.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue29.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue31.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue32.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue33.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue34.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue35.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue36.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue37.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue38.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue39.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue41.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue42.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue43.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue44.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue45.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue46.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue47.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue48.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue49.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue51.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue52.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue53.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue54.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue55.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue56.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue57.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue58.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue59.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue61.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue62.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue63.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue64.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue65.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue66.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue67.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue68.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue69.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue71.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue72.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue73.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue74.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue75.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue76.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue77.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue78.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue79.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue81.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue82.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue83.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue84.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue85.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue86.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue87.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue88.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue89.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue91.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue92.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue93.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue94.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue95.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue96.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue97.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue98.equals("4")) {
                fourcount = fourcount + 1;
            }
            if (oldvalue99.equals("4")) {
                fourcount = fourcount + 1;
            }
        }

        if (PressedONButton.equals("5")) {
            fivecount=0;
            if (oldvalue11.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue12.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue13.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue14.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue15.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue16.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue17.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue18.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue19.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue21.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue22.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue23.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue24.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue25.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue26.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue27.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue28.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue29.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue31.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue32.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue33.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue34.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue35.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue36.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue37.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue38.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue39.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue41.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue42.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue43.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue44.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue45.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue46.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue47.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue48.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue49.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue51.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue52.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue53.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue54.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue55.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue56.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue57.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue58.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue59.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue61.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue62.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue63.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue64.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue65.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue66.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue67.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue68.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue69.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue71.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue72.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue73.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue74.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue75.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue76.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue77.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue78.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue79.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue81.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue82.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue83.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue84.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue85.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue86.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue87.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue88.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue89.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue91.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue92.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue93.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue94.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue95.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue96.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue97.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue98.equals("5")) {
                fivecount = fivecount + 1;
            }
            if (oldvalue99.equals("5")) {
                fivecount = fivecount + 1;
            }
        }

        if (PressedONButton.equals("6")) {
            sixcount=0;
            if (oldvalue11.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue12.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue13.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue14.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue15.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue16.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue17.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue18.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue19.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue21.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue22.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue23.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue24.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue25.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue26.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue27.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue28.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue29.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue31.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue32.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue33.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue34.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue35.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue36.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue37.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue38.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue39.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue41.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue42.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue43.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue44.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue45.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue46.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue47.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue48.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue49.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue51.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue52.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue53.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue54.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue55.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue56.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue57.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue58.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue59.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue61.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue62.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue63.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue64.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue65.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue66.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue67.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue68.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue69.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue71.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue72.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue73.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue74.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue75.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue76.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue77.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue78.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue79.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue81.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue82.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue83.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue84.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue85.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue86.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue87.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue88.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue89.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue91.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue92.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue93.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue94.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue95.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue96.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue97.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue98.equals("6")) {
                sixcount = sixcount + 1;
            }
            if (oldvalue99.equals("6")) {
                sixcount = sixcount + 1;
            }
        }

        if (PressedONButton.equals("7")) {
            sevencount = 0;
            if (oldvalue11.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue12.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue13.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue14.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue15.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue16.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue17.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue18.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue19.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue21.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue22.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue23.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue24.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue25.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue26.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue27.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue28.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue29.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue31.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue32.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue33.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue34.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue35.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue36.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue37.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue38.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue39.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue41.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue42.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue43.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue44.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue45.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue46.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue47.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue48.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue49.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue51.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue52.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue53.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue54.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue55.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue56.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue57.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue58.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue59.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue61.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue62.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue63.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue64.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue65.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue66.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue67.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue68.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue69.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue71.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue72.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue73.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue74.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue75.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue76.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue77.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue78.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue79.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue81.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue82.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue83.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue84.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue85.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue86.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue87.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue88.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue89.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue91.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue92.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue93.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue94.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue95.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue96.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue97.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue98.equals("7")) {
                sevencount = sevencount + 1;
            }
            if (oldvalue99.equals("7")) {
                sevencount = sevencount + 1;
            }
        }

        if (PressedONButton.equals("8")) {
            eightcount = 0;
            if (oldvalue11.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue12.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue13.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue14.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue15.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue16.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue17.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue18.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue19.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue21.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue22.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue23.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue24.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue25.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue26.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue27.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue28.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue29.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue31.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue32.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue33.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue34.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue35.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue36.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue37.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue38.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue39.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue41.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue42.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue43.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue44.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue45.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue46.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue47.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue48.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue49.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue51.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue52.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue53.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue54.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue55.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue56.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue57.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue58.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue59.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue61.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue62.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue63.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue64.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue65.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue66.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue67.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue68.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue69.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue71.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue72.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue73.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue74.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue75.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue76.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue77.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue78.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue79.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue81.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue82.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue83.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue84.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue85.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue86.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue87.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue88.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue89.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue91.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue92.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue93.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue94.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue95.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue96.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue97.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue98.equals("8")) {
                eightcount = eightcount + 1;
            }
            if (oldvalue99.equals("8")) {
                eightcount = eightcount + 1;
            }
        }

        if (PressedONButton.equals("9")) {
            ninecount = 0;
            if (oldvalue11.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue12.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue13.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue14.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue15.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue16.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue17.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue18.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue19.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue21.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue22.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue23.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue24.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue25.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue26.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue27.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue28.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue29.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue31.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue32.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue33.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue34.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue35.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue36.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue37.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue38.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue39.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue41.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue42.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue43.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue44.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue45.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue46.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue47.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue48.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue49.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue51.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue52.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue53.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue54.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue55.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue56.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue57.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue58.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue59.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue61.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue62.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue63.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue64.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue65.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue66.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue67.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue68.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue69.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue71.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue72.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue73.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue74.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue75.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue76.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue77.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue78.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue79.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue81.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue82.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue83.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue84.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue85.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue86.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue87.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue88.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue89.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue91.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue92.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue93.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue94.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue95.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue96.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue97.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue98.equals("9")) {
                ninecount = ninecount + 1;
            }
            if (oldvalue99.equals("9")) {
                ninecount = ninecount + 1;
            }
        }
        if (PressedONButton.equals("")){

        }


        if (onecount==9){
            numberticketbutton1.setEnabled(false);
        }
        else if (onecount<9){
            numberticketbutton1.setEnabled(true);
        }
        if (twocount==9){
            numberticketbutton2.setEnabled(false);
        }
        else if (twocount<9){
            numberticketbutton2.setEnabled(true);
        }
        if (threecount==9){
            numberticketbutton3.setEnabled(false);
        }
        else if (threecount<9){
            numberticketbutton3.setEnabled(true);
        }
        if (fourcount==9){
            numberticketbutton4.setEnabled(false);
        }
        else if (fourcount<9){
            numberticketbutton4.setEnabled(true);
        }
        if (fivecount==9){
            numberticketbutton5.setEnabled(false);
        }
        else if (fivecount<9){
            numberticketbutton5.setEnabled(true);
        }
        if (sixcount==9){
            numberticketbutton6.setEnabled(false);
        }
        else if (sixcount<9){
            numberticketbutton6.setEnabled(true);
        }
        if (sevencount==9){
            numberticketbutton7.setEnabled(false);
        }
        else if (sevencount<9){
            numberticketbutton7.setEnabled(true);
        }
        if (eightcount==9){
            numberticketbutton8.setEnabled(false);
        }
        else if (eightcount<9){
            numberticketbutton8.setEnabled(true);
        }
        if (ninecount==9){
            numberticketbutton9.setEnabled(false);
        }
        else if (ninecount<9){
            numberticketbutton9.setEnabled(true);
        }
    }


    public void ticketclick(View v) {
        if (v.isSelected()) {
            v.setSelected(false);
            primordialunits();
            normalunits();
        } else {


            String oldvalue11 = SharedPrefs.getString(buttonstring11, "");
            String oldvalue12 = SharedPrefs.getString(buttonstring12, "");
            String oldvalue13 = SharedPrefs.getString(buttonstring13, "");
            String oldvalue14 = SharedPrefs.getString(buttonstring14, "");
            String oldvalue15 = SharedPrefs.getString(buttonstring15, "");
            String oldvalue16 = SharedPrefs.getString(buttonstring16, "");
            String oldvalue17 = SharedPrefs.getString(buttonstring17, "");
            String oldvalue18 = SharedPrefs.getString(buttonstring18, "");
            String oldvalue19 = SharedPrefs.getString(buttonstring19, "");

            String oldvalue21 = SharedPrefs.getString(buttonstring21, "");
            String oldvalue22 = SharedPrefs.getString(buttonstring22, "");
            String oldvalue23 = SharedPrefs.getString(buttonstring23, "");
            String oldvalue24 = SharedPrefs.getString(buttonstring24, "");
            String oldvalue25 = SharedPrefs.getString(buttonstring25, "");
            String oldvalue26 = SharedPrefs.getString(buttonstring26, "");
            String oldvalue27 = SharedPrefs.getString(buttonstring27, "");
            String oldvalue28 = SharedPrefs.getString(buttonstring28, "");
            String oldvalue29 = SharedPrefs.getString(buttonstring29, "");

            String oldvalue31 = SharedPrefs.getString(buttonstring31, "");
            String oldvalue32 = SharedPrefs.getString(buttonstring32, "");
            String oldvalue33 = SharedPrefs.getString(buttonstring33, "");
            String oldvalue34 = SharedPrefs.getString(buttonstring34, "");
            String oldvalue35 = SharedPrefs.getString(buttonstring35, "");
            String oldvalue36 = SharedPrefs.getString(buttonstring36, "");
            String oldvalue37 = SharedPrefs.getString(buttonstring37, "");
            String oldvalue38 = SharedPrefs.getString(buttonstring38, "");
            String oldvalue39 = SharedPrefs.getString(buttonstring39, "");

            String oldvalue41 = SharedPrefs.getString(buttonstring41, "");
            String oldvalue42 = SharedPrefs.getString(buttonstring42, "");
            String oldvalue43 = SharedPrefs.getString(buttonstring43, "");
            String oldvalue44 = SharedPrefs.getString(buttonstring44, "");
            String oldvalue45 = SharedPrefs.getString(buttonstring45, "");
            String oldvalue46 = SharedPrefs.getString(buttonstring46, "");
            String oldvalue47 = SharedPrefs.getString(buttonstring47, "");
            String oldvalue48 = SharedPrefs.getString(buttonstring48, "");
            String oldvalue49 = SharedPrefs.getString(buttonstring49, "");

            String oldvalue51 = SharedPrefs.getString(buttonstring51, "");
            String oldvalue52 = SharedPrefs.getString(buttonstring52, "");
            String oldvalue53 = SharedPrefs.getString(buttonstring53, "");
            String oldvalue54 = SharedPrefs.getString(buttonstring54, "");
            String oldvalue55 = SharedPrefs.getString(buttonstring55, "");
            String oldvalue56 = SharedPrefs.getString(buttonstring56, "");
            String oldvalue57 = SharedPrefs.getString(buttonstring57, "");
            String oldvalue58 = SharedPrefs.getString(buttonstring58, "");
            String oldvalue59 = SharedPrefs.getString(buttonstring59, "");

            String oldvalue61 = SharedPrefs.getString(buttonstring61, "");
            String oldvalue62 = SharedPrefs.getString(buttonstring62, "");
            String oldvalue63 = SharedPrefs.getString(buttonstring63, "");
            String oldvalue64 = SharedPrefs.getString(buttonstring64, "");
            String oldvalue65 = SharedPrefs.getString(buttonstring65, "");
            String oldvalue66 = SharedPrefs.getString(buttonstring66, "");
            String oldvalue67 = SharedPrefs.getString(buttonstring67, "");
            String oldvalue68 = SharedPrefs.getString(buttonstring68, "");
            String oldvalue69 = SharedPrefs.getString(buttonstring69, "");

            String oldvalue71 = SharedPrefs.getString(buttonstring71, "");
            String oldvalue72 = SharedPrefs.getString(buttonstring72, "");
            String oldvalue73 = SharedPrefs.getString(buttonstring73, "");
            String oldvalue74 = SharedPrefs.getString(buttonstring74, "");
            String oldvalue75 = SharedPrefs.getString(buttonstring75, "");
            String oldvalue76 = SharedPrefs.getString(buttonstring76, "");
            String oldvalue77 = SharedPrefs.getString(buttonstring77, "");
            String oldvalue78 = SharedPrefs.getString(buttonstring78, "");
            String oldvalue79 = SharedPrefs.getString(buttonstring79, "");

            String oldvalue81 = SharedPrefs.getString(buttonstring81, "");
            String oldvalue82 = SharedPrefs.getString(buttonstring82, "");
            String oldvalue83 = SharedPrefs.getString(buttonstring83, "");
            String oldvalue84 = SharedPrefs.getString(buttonstring84, "");
            String oldvalue85 = SharedPrefs.getString(buttonstring85, "");
            String oldvalue86 = SharedPrefs.getString(buttonstring86, "");
            String oldvalue87 = SharedPrefs.getString(buttonstring87, "");
            String oldvalue88 = SharedPrefs.getString(buttonstring88, "");
            String oldvalue89 = SharedPrefs.getString(buttonstring89, "");

            String oldvalue91 = SharedPrefs.getString(buttonstring91, "");
            String oldvalue92 = SharedPrefs.getString(buttonstring92, "");
            String oldvalue93 = SharedPrefs.getString(buttonstring93, "");
            String oldvalue94 = SharedPrefs.getString(buttonstring94, "");
            String oldvalue95 = SharedPrefs.getString(buttonstring95, "");
            String oldvalue96 = SharedPrefs.getString(buttonstring96, "");
            String oldvalue97 = SharedPrefs.getString(buttonstring97, "");
            String oldvalue98 = SharedPrefs.getString(buttonstring98, "");
            String oldvalue99 = SharedPrefs.getString(buttonstring99, "");
            switch (v.getId()) {
                case R.id.numberticket1:
                    primordialunits();
                    normalunits();
                    numberticketbutton1.setSelected(true);
                    numberticketbutton2.setSelected(false);
                    numberticketbutton3.setSelected(false);
                    numberticketbutton4.setSelected(false);
                    numberticketbutton5.setSelected(false);
                    numberticketbutton6.setSelected(false);
                    numberticketbutton7.setSelected(false);
                    numberticketbutton8.setSelected(false);
                    numberticketbutton9.setSelected(false);
                    if (oldvalue11.equals("1")) {
                        button11.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue12.equals("1")    ) {
                        button12.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue13.equals("1")    ) {
                        button13.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue14.equals("1")    ) {
                        button14.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue15.equals("1")    ) {
                        button15.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue16.equals("1")    ) {
                        button16.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue17.equals("1")   ) {
                        button17.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue18.equals("1")    ) {
                        button18.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue19.equals("1")    ) {
                        button19.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue21.equals("1")    ) {
                        button21.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue22.equals("1")    ) {
                        button22.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue23.equals("1")    ) {
                        button23.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue24.equals("1")    ) {
                        button24.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue25.equals("1")) {
                        button25.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue26.equals("1")) {
                        button26.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue27.equals("1")) {
                        button27.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue28.equals("1")) {
                        button28.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue29.equals("1")) {
                        button29.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue31.equals("1")) {
                        button31.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue32.equals("1")) {
                        button32.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue33.equals("1")) {
                        button33.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue34.equals("1")) {
                        button34.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue35.equals("1")) {
                        button35.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue36.equals("1")) {
                        button36.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue37.equals("1")) {
                        button37.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue38.equals("1")) {
                        button38.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue39.equals("1")) {
                        button39.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue41.equals("1")) {
                        button41.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue42.equals("1")) {
                        button42.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue43.equals("1")) {
                        button43.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue44.equals("1")) {
                        button44.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue45.equals("1")) {
                        button45.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue46.equals("1")) {
                        button46.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue47.equals("1")) {
                        button47.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue48.equals("1")) {
                        button48.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue49.equals("1")) {
                        button49.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue51.equals("1")) {
                        button51.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue52.equals("1")) {
                        button52.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue53.equals("1")) {
                        button53.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue54.equals("1")) {
                        button54.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue55.equals("1")) {
                        button55.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue56.equals("1")) {
                        button56.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue57.equals("1")) {
                        button57.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue58.equals("1")) {
                        button58.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue59.equals("1")) {
                        button59.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue61.equals("1")) {
                        button61.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue62.equals("1")) {
                        button62.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue63.equals("1")) {
                        button63.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue64.equals("1")) {
                        button64.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue65.equals("1")) {
                        button65.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue66.equals("1")) {
                        button66.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue67.equals("1")) {
                        button67.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue68.equals("1")) {
                        button68.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue69.equals("1")) {
                        button69.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue71.equals("1")) {
                        button71.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue72.equals("1")) {
                        button72.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue73.equals("1")) {
                        button73.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue74.equals("1")) {
                        button74.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue75.equals("1")) {
                        button75.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue76.equals("1")) {
                        button76.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue77.equals("1")) {
                        button77.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue78.equals("1")) {
                        button78.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue79.equals("1")) {
                        button79.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue81.equals("1")) {
                        button81.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue82.equals("1")) {
                        button82.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue83.equals("1")) {
                        button83.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue84.equals("1")) {
                        button84.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue85.equals("1")) {
                        button85.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue86.equals("1")) {
                        button86.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue87.equals("1")) {
                        button87.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue88.equals("1")) {
                        button88.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue89.equals("1")) {
                        button89.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue91.equals("1")) {
                        button91.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue92.equals("1")) {
                        button92.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue93.equals("1")) {
                        button93.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue94.equals("1")) {
                        button94.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue95.equals("1")) {
                        button95.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue96.equals("1")) {
                        button96.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue97.equals("1")) {
                        button97.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue98.equals("1")) {
                        button98.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue99.equals("1")) {
                        button99.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    break;
                case R.id.numberticket2:
                    primordialunits();
                    normalunits();
                    numberticketbutton1.setSelected(false);
                    numberticketbutton2.setSelected(true);
                    numberticketbutton3.setSelected(false);
                    numberticketbutton4.setSelected(false);
                    numberticketbutton5.setSelected(false);
                    numberticketbutton6.setSelected(false);
                    numberticketbutton7.setSelected(false);
                    numberticketbutton8.setSelected(false);
                    numberticketbutton9.setSelected(false);
                    if (oldvalue11.equals("2")  ) {
                        button11.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue12.equals("2")    ) {
                        button12.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue13.equals("2")    ) {
                        button13.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue14.equals("2")    ) {
                        button14.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue15.equals("2")    ) {
                        button15.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue16.equals("2")    ) {
                        button16.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue17.equals("2")   ) {
                        button17.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue18.equals("2")    ) {
                        button18.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue19.equals("2")    ) {
                        button19.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue21.equals("2")    ) {
                        button21.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue22.equals("2")    ) {
                        button22.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue23.equals("2")    ) {
                        button23.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue24.equals("2")    ) {
                        button24.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue25.equals("2")) {
                        button25.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue26.equals("2")) {
                        button26.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue27.equals("2")) {
                        button27.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue28.equals("2")) {
                        button28.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue29.equals("2")) {
                        button29.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue31.equals("2")) {
                        button31.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue32.equals("2")) {
                        button32.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue33.equals("2")) {
                        button33.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue34.equals("2")) {
                        button34.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue35.equals("2")) {
                        button35.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue36.equals("2")) {
                        button36.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue37.equals("2")) {
                        button37.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue38.equals("2")) {
                        button38.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue39.equals("2")) {
                        button39.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue41.equals("2")) {
                        button41.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue42.equals("2")) {
                        button42.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue43.equals("2")) {
                        button43.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue44.equals("2")) {
                        button44.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue45.equals("2")) {
                        button45.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue46.equals("2")) {
                        button46.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue47.equals("2")) {
                        button47.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue48.equals("2")) {
                        button48.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue49.equals("2")) {
                        button49.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue51.equals("2")) {
                        button51.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue52.equals("2")) {
                        button52.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue53.equals("2")) {
                        button53.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue54.equals("2")) {
                        button54.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue55.equals("2")) {
                        button55.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue56.equals("2")) {
                        button56.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue57.equals("2")) {
                        button57.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue58.equals("2")) {
                        button58.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue59.equals("2")) {
                        button59.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue61.equals("2")) {
                        button61.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue62.equals("2")) {
                        button62.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue63.equals("2")) {
                        button63.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue64.equals("2")) {
                        button64.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue65.equals("2")) {
                        button65.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue66.equals("2")) {
                        button66.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue67.equals("2")) {
                        button67.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue68.equals("2")) {
                        button68.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue69.equals("2")) {
                        button69.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue71.equals("2")) {
                        button71.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue72.equals("2")) {
                        button72.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue73.equals("2")) {
                        button73.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue74.equals("2")) {
                        button74.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue75.equals("2")) {
                        button75.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue76.equals("2")) {
                        button76.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue77.equals("2")) {
                        button77.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue78.equals("2")) {
                        button78.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue79.equals("2")) {
                        button79.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue81.equals("2")) {
                        button81.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue82.equals("2")) {
                        button82.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue83.equals("2")) {
                        button83.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue84.equals("2")) {
                        button84.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue85.equals("2")) {
                        button85.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue86.equals("2")) {
                        button86.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue87.equals("2")) {
                        button87.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue88.equals("2")) {
                        button88.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue89.equals("2")) {
                        button89.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue91.equals("2")) {
                        button91.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue92.equals("2")) {
                        button92.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue93.equals("2")) {
                        button93.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue94.equals("2")) {
                        button94.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue95.equals("2")) {
                        button95.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue96.equals("2")) {
                        button96.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue97.equals("2")) {
                        button97.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue98.equals("2")) {
                        button98.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue99.equals("2")) {
                        button99.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    break;
                case R.id.numberticket3:
                    primordialunits();
                    normalunits();
                    numberticketbutton1.setSelected(false);
                    numberticketbutton2.setSelected(false);
                    numberticketbutton3.setSelected(true);
                    numberticketbutton4.setSelected(false);
                    numberticketbutton5.setSelected(false);
                    numberticketbutton6.setSelected(false);
                    numberticketbutton7.setSelected(false);
                    numberticketbutton8.setSelected(false);
                    numberticketbutton9.setSelected(false);
                    if (oldvalue11.equals("3")  ) {
                        button11.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue12.equals("3")    ) {
                        button12.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue13.equals("3")    ) {
                        button13.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue14.equals("3")    ) {
                        button14.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue15.equals("3")    ) {
                        button15.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue16.equals("3")    ) {
                        button16.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue17.equals("3")   ) {
                        button17.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue18.equals("3")    ) {
                        button18.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue19.equals("3")    ) {
                        button19.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue21.equals("3")    ) {
                        button21.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue22.equals("3")    ) {
                        button22.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue23.equals("3")    ) {
                        button23.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue24.equals("3")    ) {
                        button24.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue25.equals("3")) {
                        button25.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue26.equals("3")) {
                        button26.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue27.equals("3")) {
                        button27.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue28.equals("3")) {
                        button28.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue29.equals("3")) {
                        button29.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue31.equals("3")) {
                        button31.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue32.equals("3")) {
                        button32.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue33.equals("3")) {
                        button33.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue34.equals("3")) {
                        button34.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue35.equals("3")) {
                        button35.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue36.equals("3")) {
                        button36.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue37.equals("3")) {
                        button37.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue38.equals("3")) {
                        button38.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue39.equals("3")) {
                        button39.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue41.equals("3")) {
                        button41.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue42.equals("3")) {
                        button42.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue43.equals("3")) {
                        button43.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue44.equals("3")) {
                        button44.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue45.equals("3")) {
                        button45.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue46.equals("3")) {
                        button46.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue47.equals("3")) {
                        button47.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue48.equals("3")) {
                        button48.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue49.equals("3")) {
                        button49.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue51.equals("3")) {
                        button51.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue52.equals("3")) {
                        button52.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue53.equals("3")) {
                        button53.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue54.equals("3")) {
                        button54.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue55.equals("3")) {
                        button55.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue56.equals("3")) {
                        button56.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue57.equals("3")) {
                        button57.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue58.equals("3")) {
                        button58.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue59.equals("3")) {
                        button59.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue61.equals("3")) {
                        button61.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue62.equals("3")) {
                        button62.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue63.equals("3")) {
                        button63.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue64.equals("3")) {
                        button64.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue65.equals("3")) {
                        button65.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue66.equals("3")) {
                        button66.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue67.equals("3")) {
                        button67.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue68.equals("3")) {
                        button68.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue69.equals("3")) {
                        button69.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue71.equals("3")) {
                        button71.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue72.equals("3")) {
                        button72.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue73.equals("3")) {
                        button73.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue74.equals("3")) {
                        button74.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue75.equals("3")) {
                        button75.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue76.equals("3")) {
                        button76.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue77.equals("3")) {
                        button77.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue78.equals("3")) {
                        button78.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue79.equals("3")) {
                        button79.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue81.equals("3")) {
                        button81.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue82.equals("3")) {
                        button82.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue83.equals("3")) {
                        button83.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue84.equals("3")) {
                        button84.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue85.equals("3")) {
                        button85.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue86.equals("3")) {
                        button86.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue87.equals("3")) {
                        button87.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue88.equals("3")) {
                        button88.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue89.equals("3")) {
                        button89.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue91.equals("3")) {
                        button91.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue92.equals("3")) {
                        button92.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue93.equals("3")) {
                        button93.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue94.equals("3")) {
                        button94.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue95.equals("3")) {
                        button95.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue96.equals("3")) {
                        button96.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue97.equals("3")) {
                        button97.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue98.equals("3")) {
                        button98.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue99.equals("3")) {
                        button99.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    break;
                case R.id.numberticket4:
                    primordialunits();
                    normalunits();
                    numberticketbutton1.setSelected(false);
                    numberticketbutton2.setSelected(false);
                    numberticketbutton3.setSelected(false);
                    numberticketbutton4.setSelected(true);
                    numberticketbutton5.setSelected(false);
                    numberticketbutton6.setSelected(false);
                    numberticketbutton7.setSelected(false);
                    numberticketbutton8.setSelected(false);
                    numberticketbutton9.setSelected(false);
                    if (oldvalue11.equals("4")  ) {
                        button11.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue12.equals("4")    ) {
                        button12.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue13.equals("4")    ) {
                        button13.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue14.equals("4")    ) {
                        button14.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue15.equals("4")    ) {
                        button15.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue16.equals("4")    ) {
                        button16.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue17.equals("4")   ) {
                        button17.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue18.equals("4")    ) {
                        button18.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue19.equals("4")    ) {
                        button19.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue21.equals("4")    ) {
                        button21.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue22.equals("4")    ) {
                        button22.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue23.equals("4")    ) {
                        button23.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue24.equals("4")    ) {
                        button24.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue25.equals("4")) {
                        button25.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue26.equals("4")) {
                        button26.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue27.equals("4")) {
                        button27.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue28.equals("4")) {
                        button28.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue29.equals("4")) {
                        button29.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue31.equals("4")) {
                        button31.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue32.equals("4")) {
                        button32.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue33.equals("4")) {
                        button33.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue34.equals("4")) {
                        button34.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue35.equals("4")) {
                        button35.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue36.equals("4")) {
                        button36.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue37.equals("4")) {
                        button37.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue38.equals("4")) {
                        button38.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue39.equals("4")) {
                        button39.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue41.equals("4")) {
                        button41.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue42.equals("4")) {
                        button42.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue43.equals("4")) {
                        button43.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue44.equals("4")) {
                        button44.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue45.equals("4")) {
                        button45.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue46.equals("4")) {
                        button46.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue47.equals("4")) {
                        button47.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue48.equals("4")) {
                        button48.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue49.equals("4")) {
                        button49.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue51.equals("4")) {
                        button51.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue52.equals("4")) {
                        button52.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue53.equals("4")) {
                        button53.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue54.equals("4")) {
                        button54.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue55.equals("4")) {
                        button55.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue56.equals("4")) {
                        button56.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue57.equals("4")) {
                        button57.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue58.equals("4")) {
                        button58.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue59.equals("4")) {
                        button59.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue61.equals("4")) {
                        button61.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue62.equals("4")) {
                        button62.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue63.equals("4")) {
                        button63.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue64.equals("4")) {
                        button64.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue65.equals("4")) {
                        button65.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue66.equals("4")) {
                        button66.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue67.equals("4")) {
                        button67.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue68.equals("4")) {
                        button68.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue69.equals("4")) {
                        button69.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue71.equals("4")) {
                        button71.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue72.equals("4")) {
                        button72.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue73.equals("4")) {
                        button73.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue74.equals("4")) {
                        button74.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue75.equals("4")) {
                        button75.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue76.equals("4")) {
                        button76.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue77.equals("4")) {
                        button77.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue78.equals("4")) {
                        button78.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue79.equals("4")) {
                        button79.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue81.equals("4")) {
                        button81.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue82.equals("4")) {
                        button82.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue83.equals("4")) {
                        button83.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue84.equals("4")) {
                        button84.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue85.equals("4")) {
                        button85.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue86.equals("4")) {
                        button86.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue87.equals("4")) {
                        button87.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue88.equals("4")) {
                        button88.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue89.equals("4")) {
                        button89.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue91.equals("4")) {
                        button91.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue92.equals("4")) {
                        button92.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue93.equals("4")) {
                        button93.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue94.equals("4")) {
                        button94.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue95.equals("4")) {
                        button95.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue96.equals("4")) {
                        button96.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue97.equals("4")) {
                        button97.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue98.equals("4")) {
                        button98.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue99.equals("4")) {
                        button99.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    break;
                case R.id.numberticket5:
                    primordialunits();
                    normalunits();
                    numberticketbutton1.setSelected(false);
                    numberticketbutton2.setSelected(false);
                    numberticketbutton3.setSelected(false);
                    numberticketbutton4.setSelected(false);
                    numberticketbutton5.setSelected(true);
                    numberticketbutton6.setSelected(false);
                    numberticketbutton7.setSelected(false);
                    numberticketbutton8.setSelected(false);
                    numberticketbutton9.setSelected(false);
                    if (oldvalue11.equals("5")  ) {
                        button11.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue12.equals("5")    ) {
                        button12.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue13.equals("5")    ) {
                        button13.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue14.equals("5")    ) {
                        button14.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue15.equals("5")    ) {
                        button15.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue16.equals("5")    ) {
                        button16.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue17.equals("5")   ) {
                        button17.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue18.equals("5")    ) {
                        button18.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue19.equals("5")    ) {
                        button19.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue21.equals("5")    ) {
                        button21.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue22.equals("5")    ) {
                        button22.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue23.equals("5")    ) {
                        button23.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue24.equals("5")    ) {
                        button24.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue25.equals("5")) {
                        button25.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue26.equals("5")) {
                        button26.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue27.equals("5")) {
                        button27.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue28.equals("5")) {
                        button28.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue29.equals("5")) {
                        button29.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue31.equals("5")) {
                        button31.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue32.equals("5")) {
                        button32.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue33.equals("5")) {
                        button33.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue34.equals("5")) {
                        button34.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue35.equals("5")) {
                        button35.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue36.equals("5")) {
                        button36.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue37.equals("5")) {
                        button37.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue38.equals("5")) {
                        button38.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue39.equals("5")) {
                        button39.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue41.equals("5")) {
                        button41.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue42.equals("5")) {
                        button42.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue43.equals("5")) {
                        button43.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue44.equals("5")) {
                        button44.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue45.equals("5")) {
                        button45.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue46.equals("5")) {
                        button46.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue47.equals("5")) {
                        button47.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue48.equals("5")) {
                        button48.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue49.equals("5")) {
                        button49.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue51.equals("5")) {
                        button51.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue52.equals("5")) {
                        button52.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue53.equals("5")) {
                        button53.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue54.equals("5")) {
                        button54.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue55.equals("5")) {
                        button55.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue56.equals("5")) {
                        button56.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue57.equals("5")) {
                        button57.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue58.equals("5")) {
                        button58.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue59.equals("5")) {
                        button59.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue61.equals("5")) {
                        button61.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue62.equals("5")) {
                        button62.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue63.equals("5")) {
                        button63.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue64.equals("5")) {
                        button64.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue65.equals("5")) {
                        button65.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue66.equals("5")) {
                        button66.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue67.equals("5")) {
                        button67.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue68.equals("5")) {
                        button68.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue69.equals("5")) {
                        button69.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue71.equals("5")) {
                        button71.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue72.equals("5")) {
                        button72.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue73.equals("5")) {
                        button73.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue74.equals("5")) {
                        button74.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue75.equals("5")) {
                        button75.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue76.equals("5")) {
                        button76.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue77.equals("5")) {
                        button77.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue78.equals("5")) {
                        button78.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue79.equals("5")) {
                        button79.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue81.equals("5")) {
                        button81.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue82.equals("5")) {
                        button82.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue83.equals("5")) {
                        button83.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue84.equals("5")) {
                        button84.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue85.equals("5")) {
                        button85.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue86.equals("5")) {
                        button86.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue87.equals("5")) {
                        button87.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue88.equals("5")) {
                        button88.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue89.equals("5")) {
                        button89.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue91.equals("5")) {
                        button91.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue92.equals("5")) {
                        button92.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue93.equals("5")) {
                        button93.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue94.equals("5")) {
                        button94.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue95.equals("5")) {
                        button95.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue96.equals("5")) {
                        button96.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue97.equals("5")) {
                        button97.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue98.equals("5")) {
                        button98.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue99.equals("5")) {
                        button99.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    break;
                case R.id.numberticket6:
                    primordialunits();
                    normalunits();
                    numberticketbutton1.setSelected(false);
                    numberticketbutton2.setSelected(false);
                    numberticketbutton3.setSelected(false);
                    numberticketbutton4.setSelected(false);
                    numberticketbutton5.setSelected(false);
                    numberticketbutton6.setSelected(true);
                    numberticketbutton7.setSelected(false);
                    numberticketbutton8.setSelected(false);
                    numberticketbutton9.setSelected(false);
                    if (oldvalue11.equals("6")  ) {
                        button11.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue12.equals("6")    ) {
                        button12.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue13.equals("6")    ) {
                        button13.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue14.equals("6")    ) {
                        button14.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue15.equals("6")    ) {
                        button15.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue16.equals("6")    ) {
                        button16.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue17.equals("6")   ) {
                        button17.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue18.equals("6")    ) {
                        button18.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue19.equals("6")    ) {
                        button19.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue21.equals("6")    ) {
                        button21.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue22.equals("6")    ) {
                        button22.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue23.equals("6")    ) {
                        button23.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue24.equals("6")    ) {
                        button24.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue25.equals("6")) {
                        button25.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue26.equals("6")) {
                        button26.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue27.equals("6")) {
                        button27.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue28.equals("6")) {
                        button28.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue29.equals("6")) {
                        button29.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue31.equals("6")) {
                        button31.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue32.equals("6")) {
                        button32.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue33.equals("6")) {
                        button33.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue34.equals("6")) {
                        button34.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue35.equals("6")) {
                        button35.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue36.equals("6")) {
                        button36.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue37.equals("6")) {
                        button37.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue38.equals("6")) {
                        button38.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue39.equals("6")) {
                        button39.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue41.equals("6")) {
                        button41.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue42.equals("6")) {
                        button42.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue43.equals("6")) {
                        button43.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue44.equals("6")) {
                        button44.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue45.equals("6")) {
                        button45.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue46.equals("6")) {
                        button46.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue47.equals("6")) {
                        button47.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue48.equals("6")) {
                        button48.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue49.equals("6")) {
                        button49.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue51.equals("6")) {
                        button51.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue52.equals("6")) {
                        button52.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue53.equals("6")) {
                        button53.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue54.equals("6")) {
                        button54.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue55.equals("6")) {
                        button55.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue56.equals("6")) {
                        button56.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue57.equals("6")) {
                        button57.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue58.equals("6")) {
                        button58.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue59.equals("6")) {
                        button59.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue61.equals("6")) {
                        button61.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue62.equals("6")) {
                        button62.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue63.equals("6")) {
                        button63.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue64.equals("6")) {
                        button64.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue65.equals("6")) {
                        button65.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue66.equals("6")) {
                        button66.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue67.equals("6")) {
                        button67.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue68.equals("6")) {
                        button68.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue69.equals("6")) {
                        button69.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue71.equals("6")) {
                        button71.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue72.equals("6")) {
                        button72.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue73.equals("6")) {
                        button73.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue74.equals("6")) {
                        button74.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue75.equals("6")) {
                        button75.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue76.equals("6")) {
                        button76.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue77.equals("6")) {
                        button77.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue78.equals("6")) {
                        button78.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue79.equals("6")) {
                        button79.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue81.equals("6")) {
                        button81.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue82.equals("6")) {
                        button82.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue83.equals("6")) {
                        button83.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue84.equals("6")) {
                        button84.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue85.equals("6")) {
                        button85.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue86.equals("6")) {
                        button86.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue87.equals("6")) {
                        button87.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue88.equals("6")) {
                        button88.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue89.equals("6")) {
                        button89.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue91.equals("6")) {
                        button91.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue92.equals("6")) {
                        button92.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue93.equals("6")) {
                        button93.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue94.equals("6")) {
                        button94.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue95.equals("6")) {
                        button95.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue96.equals("6")) {
                        button96.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue97.equals("6")) {
                        button97.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue98.equals("6")) {
                        button98.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue99.equals("6")) {
                        button99.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    break;
                case R.id.numberticket7:
                    primordialunits();
                    normalunits();
                    numberticketbutton1.setSelected(false);
                    numberticketbutton2.setSelected(false);
                    numberticketbutton3.setSelected(false);
                    numberticketbutton4.setSelected(false);
                    numberticketbutton5.setSelected(false);
                    numberticketbutton6.setSelected(false);
                    numberticketbutton7.setSelected(true);
                    numberticketbutton8.setSelected(false);
                    numberticketbutton9.setSelected(false);
                    if (oldvalue11.equals("7")  ) {
                        button11.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue12.equals("7")    ) {
                        button12.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue13.equals("7")    ) {
                        button13.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue14.equals("7")    ) {
                        button14.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue15.equals("7")    ) {
                        button15.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue16.equals("7")    ) {
                        button16.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue17.equals("7")   ) {
                        button17.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue18.equals("7")    ) {
                        button18.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue19.equals("7")    ) {
                        button19.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue21.equals("7")    ) {
                        button21.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue22.equals("7")    ) {
                        button22.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue23.equals("7")    ) {
                        button23.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue24.equals("7")    ) {
                        button24.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue25.equals("7")) {
                        button25.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue26.equals("7")) {
                        button26.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue27.equals("7")) {
                        button27.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue28.equals("7")) {
                        button28.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue29.equals("7")) {
                        button29.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue31.equals("7")) {
                        button31.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue32.equals("7")) {
                        button32.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue33.equals("7")) {
                        button33.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue34.equals("7")) {
                        button34.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue35.equals("7")) {
                        button35.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue36.equals("7")) {
                        button36.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue37.equals("7")) {
                        button37.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue38.equals("7")) {
                        button38.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue39.equals("7")) {
                        button39.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue41.equals("7")) {
                        button41.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue42.equals("7")) {
                        button42.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue43.equals("7")) {
                        button43.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue44.equals("7")) {
                        button44.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue45.equals("7")) {
                        button45.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue46.equals("7")) {
                        button46.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue47.equals("7")) {
                        button47.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue48.equals("7")) {
                        button48.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue49.equals("7")) {
                        button49.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue51.equals("7")) {
                        button51.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue52.equals("7")) {
                        button52.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue53.equals("7")) {
                        button53.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue54.equals("7")) {
                        button54.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue55.equals("7")) {
                        button55.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue56.equals("7")) {
                        button56.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue57.equals("7")) {
                        button57.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue58.equals("7")) {
                        button58.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue59.equals("7")) {
                        button59.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue61.equals("7")) {
                        button61.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue62.equals("7")) {
                        button62.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue63.equals("7")) {
                        button63.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue64.equals("7")) {
                        button64.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue65.equals("7")) {
                        button65.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue66.equals("7")) {
                        button66.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue67.equals("7")) {
                        button67.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue68.equals("7")) {
                        button68.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue69.equals("7")) {
                        button69.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue71.equals("7")) {
                        button71.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue72.equals("7")) {
                        button72.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue73.equals("7")) {
                        button73.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue74.equals("7")) {
                        button74.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue75.equals("7")) {
                        button75.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue76.equals("7")) {
                        button76.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue77.equals("7")) {
                        button77.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue78.equals("7")) {
                        button78.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue79.equals("7")) {
                        button79.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue81.equals("7")) {
                        button81.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue82.equals("7")) {
                        button82.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue83.equals("7")) {
                        button83.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue84.equals("7")) {
                        button84.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue85.equals("7")) {
                        button85.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue86.equals("7")) {
                        button86.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue87.equals("7")) {
                        button87.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue88.equals("7")) {
                        button88.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue89.equals("7")) {
                        button89.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue91.equals("7")) {
                        button91.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue92.equals("7")) {
                        button92.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue93.equals("7")) {
                        button93.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue94.equals("7")) {
                        button94.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue95.equals("7")) {
                        button95.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue96.equals("7")) {
                        button96.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue97.equals("7")) {
                        button97.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue98.equals("7")) {
                        button98.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue99.equals("7")) {
                        button99.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    break;
                case R.id.numberticket8:
                    primordialunits();
                    normalunits();
                    numberticketbutton1.setSelected(false);
                    numberticketbutton2.setSelected(false);
                    numberticketbutton3.setSelected(false);
                    numberticketbutton4.setSelected(false);
                    numberticketbutton5.setSelected(false);
                    numberticketbutton6.setSelected(false);
                    numberticketbutton7.setSelected(false);
                    numberticketbutton8.setSelected(true);
                    numberticketbutton9.setSelected(false);
                    if (oldvalue11.equals("8")  ) {
                        button11.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue12.equals("8")    ) {
                        button12.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue13.equals("8")    ) {
                        button13.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue14.equals("8")    ) {
                        button14.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue15.equals("8")    ) {
                        button15.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue16.equals("8")    ) {
                        button16.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue17.equals("8")   ) {
                        button17.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue18.equals("8")    ) {
                        button18.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue19.equals("8")    ) {
                        button19.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue21.equals("8")    ) {
                        button21.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue22.equals("8")    ) {
                        button22.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue23.equals("8")    ) {
                        button23.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue24.equals("8")    ) {
                        button24.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue25.equals("8")) {
                        button25.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue26.equals("8")) {
                        button26.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue27.equals("8")) {
                        button27.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue28.equals("8")) {
                        button28.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue29.equals("8")) {
                        button29.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue31.equals("8")) {
                        button31.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue32.equals("8")) {
                        button32.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue33.equals("8")) {
                        button33.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue34.equals("8")) {
                        button34.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue35.equals("8")) {
                        button35.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue36.equals("8")) {
                        button36.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue37.equals("8")) {
                        button37.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue38.equals("8")) {
                        button38.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue39.equals("8")) {
                        button39.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue41.equals("8")) {
                        button41.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue42.equals("8")) {
                        button42.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue43.equals("8")) {
                        button43.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue44.equals("8")) {
                        button44.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue45.equals("8")) {
                        button45.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue46.equals("8")) {
                        button46.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue47.equals("8")) {
                        button47.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue48.equals("8")) {
                        button48.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue49.equals("8")) {
                        button49.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue51.equals("8")) {
                        button51.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue52.equals("8")) {
                        button52.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue53.equals("8")) {
                        button53.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue54.equals("8")) {
                        button54.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue55.equals("8")) {
                        button55.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue56.equals("8")) {
                        button56.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue57.equals("8")) {
                        button57.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue58.equals("8")) {
                        button58.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue59.equals("8")) {
                        button59.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue61.equals("8")) {
                        button61.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue62.equals("8")) {
                        button62.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue63.equals("8")) {
                        button63.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue64.equals("8")) {
                        button64.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue65.equals("8")) {
                        button65.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue66.equals("8")) {
                        button66.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue67.equals("8")) {
                        button67.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue68.equals("8")) {
                        button68.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue69.equals("8")) {
                        button69.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue71.equals("8")) {
                        button71.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue72.equals("8")) {
                        button72.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue73.equals("8")) {
                        button73.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue74.equals("8")) {
                        button74.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue75.equals("8")) {
                        button75.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue76.equals("8")) {
                        button76.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue77.equals("8")) {
                        button77.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue78.equals("8")) {
                        button78.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue79.equals("8")) {
                        button79.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue81.equals("8")) {
                        button81.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue82.equals("8")) {
                        button82.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue83.equals("8")) {
                        button83.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue84.equals("8")) {
                        button84.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue85.equals("8")) {
                        button85.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue86.equals("8")) {
                        button86.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue87.equals("8")) {
                        button87.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue88.equals("8")) {
                        button88.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue89.equals("8")) {
                        button89.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue91.equals("8")) {
                        button91.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue92.equals("8")) {
                        button92.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue93.equals("8")) {
                        button93.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue94.equals("8")) {
                        button94.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue95.equals("8")) {
                        button95.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue96.equals("8")) {
                        button96.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue97.equals("8")) {
                        button97.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue98.equals("8")) {
                        button98.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue99.equals("8")) {
                        button99.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    break;
                case R.id.numberticket9:
                    primordialunits();
                    normalunits();
                    numberticketbutton1.setSelected(false);
                    numberticketbutton2.setSelected(false);
                    numberticketbutton3.setSelected(false);
                    numberticketbutton4.setSelected(false);
                    numberticketbutton5.setSelected(false);
                    numberticketbutton6.setSelected(false);
                    numberticketbutton7.setSelected(false);
                    numberticketbutton8.setSelected(false);
                    numberticketbutton9.setSelected(true);
                    if (oldvalue11.equals("9")  ) {
                        button11.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue12.equals("9")    ) {
                        button12.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue13.equals("9")    ) {
                        button13.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue14.equals("9")    ) {
                        button14.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue15.equals("9")    ) {
                        button15.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue16.equals("9")    ) {
                        button16.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue17.equals("9")   ) {
                        button17.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue18.equals("9")    ) {
                        button18.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue19.equals("9")    ) {
                        button19.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue21.equals("9")    ) {
                        button21.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue22.equals("9")    ) {
                        button22.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue23.equals("9")    ) {
                        button23.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue24.equals("9")    ) {
                        button24.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue25.equals("9")) {
                        button25.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue26.equals("9")) {
                        button26.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue27.equals("9")) {
                        button27.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue28.equals("9")) {
                        button28.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue29.equals("9")) {
                        button29.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue31.equals("9")) {
                        button31.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue32.equals("9")) {
                        button32.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue33.equals("9")) {
                        button33.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue34.equals("9")) {
                        button34.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue35.equals("9")) {
                        button35.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue36.equals("9")) {
                        button36.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue37.equals("9")) {
                        button37.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue38.equals("9")) {
                        button38.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue39.equals("9")) {
                        button39.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue41.equals("9")) {
                        button41.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue42.equals("9")) {
                        button42.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue43.equals("9")) {
                        button43.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue44.equals("9")) {
                        button44.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue45.equals("9")) {
                        button45.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue46.equals("9")) {
                        button46.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue47.equals("9")) {
                        button47.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue48.equals("9")) {
                        button48.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue49.equals("9")) {
                        button49.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue51.equals("9")) {
                        button51.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue52.equals("9")) {
                        button52.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue53.equals("9")) {
                        button53.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue54.equals("9")) {
                        button54.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue55.equals("9")) {
                        button55.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue56.equals("9")) {
                        button56.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue57.equals("9")) {
                        button57.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue58.equals("9")) {
                        button58.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue59.equals("9")) {
                        button59.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue61.equals("9")) {
                        button61.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue62.equals("9")) {
                        button62.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue63.equals("9")) {
                        button63.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue64.equals("9")) {
                        button64.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue65.equals("9")) {
                        button65.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue66.equals("9")) {
                        button66.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue67.equals("9")) {
                        button67.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue68.equals("9")) {
                        button68.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue69.equals("9")) {
                        button69.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue71.equals("9")) {
                        button71.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue72.equals("9")) {
                        button72.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue73.equals("9")) {
                        button73.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue74.equals("9")) {
                        button74.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue75.equals("9")) {
                        button75.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue76.equals("9")) {
                        button76.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue77.equals("9")) {
                        button77.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue78.equals("9")) {
                        button78.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue79.equals("9")) {
                        button79.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue81.equals("9")) {
                        button81.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue82.equals("9")) {
                        button82.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue83.equals("9")) {
                        button83.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue84.equals("9")) {
                        button84.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue85.equals("9")) {
                        button85.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue86.equals("9")) {
                        button86.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue87.equals("9")) {
                        button87.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue88.equals("9")) {
                        button88.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue89.equals("9")) {
                        button89.setBackgroundResource(R.drawable.field_unit_similar);
                    }

                    if (oldvalue91.equals("9")) {
                        button91.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue92.equals("9")) {
                        button92.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue93.equals("9")) {
                        button93.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue94.equals("9")) {
                        button94.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue95.equals("9")) {
                        button95.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue96.equals("9")) {
                        button96.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue97.equals("9")) {
                        button97.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue98.equals("9")) {
                        button98.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    if (oldvalue99.equals("9")) {
                        button99.setBackgroundResource(R.drawable.field_unit_similar);
                    }
                    break;

            }
        }
    }

    public void showVariant(){
        TextView variantShowText=findViewById(R.id.variantShowText);
        String variantShowString;
        if (variantInt<10){
            variantShowString= getResources().getString(R.string.Easy)+" "+variantInt;
            variantShowText.setText(variantShowString);
        }
        if (variantInt>10&&variantInt<500){
            variantShowString= getResources().getString(R.string.Normal)+" "+(variantInt-10);
            variantShowText.setText(variantShowString);
        }
        if (variantInt>500&&variantInt<1000){
            variantShowString= getResources().getString(R.string.Hard)+" "+(variantInt-500);
            variantShowText.setText(variantShowString);
        }
        if (variantInt>1000){
            variantShowString= getResources().getString(R.string.RealHard)+" "+(variantInt-1000);
            variantShowText.setText(variantShowString);
        }

    }

    public void pause(View view){
        showVariant();
        primordialunits();
        normalunits();
        if (idSelected1 != 0) {
            Button but1 = findViewById(idSelected1);
            but1.setSelected(false);
        }
        SharedPreferences shareoptions=getSharedPreferences("Options", Context.MODE_PRIVATE);
        handstring=shareoptions.getString("handed","");
        if (handstring.equals("left")){
            ConstraintLayout layoutpause =  findViewById(R.id.gameactivity);
            ConstraintSet setconspause= new ConstraintSet();
            setconspause.clone(this,R.layout.activity_game_pause_left);
            TransitionManager.beginDelayedTransition(layoutpause);
            setconspause.applyTo(layoutpause);
        }
        else {
            ConstraintLayout layoutpause =  findViewById(R.id.gameactivity);
            ConstraintSet setconspause= new ConstraintSet();
            setconspause.clone(this,R.layout.activity_game_pause);
            TransitionManager.beginDelayedTransition(layoutpause);
            setconspause.applyTo(layoutpause);
        }
        //Intent intentoptions=new Intent(this,OptionsActivity.class);
        //startActivity(intentoptions);
        //Button pausebut=findViewById(R.id.pausebut1);



        Chronometer chronometer=findViewById(R.id.chronometer);
        chronometer.stop();
        Button b1=findViewById(R.id.B1);
        Button b2=findViewById(R.id.B2);
        Button b3=findViewById(R.id.B3);
        Button b4=findViewById(R.id.B4);
        Button b5=findViewById(R.id.B5);
        Button b6=findViewById(R.id.B6);
        Button b7=findViewById(R.id.B7);
        Button b8=findViewById(R.id.B8);
        Button b9=findViewById(R.id.B9);
        Button bE=findViewById(R.id.BE);
        Button bpause=findViewById(R.id.pause);
        Button bmemo=findViewById(R.id.Memo);
        Button cancelAction=findViewById(R.id.cancelActionButton);
        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);
        b5.setEnabled(false);
        b6.setEnabled(false);
        b7.setEnabled(false);
        b8.setEnabled(false);
        b9.setEnabled(false);
        bE.setEnabled(false);
        bpause.setEnabled(false);
        bmemo.setEnabled(false);
        cancelAction.setEnabled(false);
        numberticketbutton1.setEnabled(false);
        numberticketbutton2.setEnabled(false);
        numberticketbutton3.setEnabled(false);
        numberticketbutton4.setEnabled(false);
        numberticketbutton5.setEnabled(false);
        numberticketbutton6.setEnabled(false);
        numberticketbutton7.setEnabled(false);
        numberticketbutton8.setEnabled(false);
        numberticketbutton9.setEnabled(false);
    }


    public void restart(View view){

        SharedPreferences.Editor PrefEditor = SharedPrefs.edit();
        PrefEditor.putString(buttonstring11	, "");
        PrefEditor.putString(buttonstring12	, "");
        PrefEditor.putString(buttonstring13	, "");
        PrefEditor.putString(buttonstring14	, "");
        PrefEditor.putString(buttonstring15	, "");
        PrefEditor.putString(buttonstring16	, "");
        PrefEditor.putString(buttonstring17	, "");
        PrefEditor.putString(buttonstring18	, "");
        PrefEditor.putString(buttonstring19	, "");

        PrefEditor.putString(buttonstring21	, "");
        PrefEditor.putString(buttonstring22	, "");
        PrefEditor.putString(buttonstring23	, "");
        PrefEditor.putString(buttonstring24	, "");
        PrefEditor.putString(buttonstring25	, "");
        PrefEditor.putString(buttonstring26	, "");
        PrefEditor.putString(buttonstring27	, "");
        PrefEditor.putString(buttonstring28	, "");
        PrefEditor.putString(buttonstring29	, "");

        PrefEditor.putString(buttonstring31	, "");
        PrefEditor.putString(buttonstring32	, "");
        PrefEditor.putString(buttonstring33	, "");
        PrefEditor.putString(buttonstring34	, "");
        PrefEditor.putString(buttonstring35	, "");
        PrefEditor.putString(buttonstring36	, "");
        PrefEditor.putString(buttonstring37	, "");
        PrefEditor.putString(buttonstring38	, "");
        PrefEditor.putString(buttonstring39	, "");

        PrefEditor.putString(buttonstring41	, "");
        PrefEditor.putString(buttonstring42	, "");
        PrefEditor.putString(buttonstring43	, "");
        PrefEditor.putString(buttonstring44	, "");
        PrefEditor.putString(buttonstring45	, "");
        PrefEditor.putString(buttonstring46	, "");
        PrefEditor.putString(buttonstring47	, "");
        PrefEditor.putString(buttonstring48	, "");
        PrefEditor.putString(buttonstring49	, "");

        PrefEditor.putString(buttonstring51	, "");
        PrefEditor.putString(buttonstring52	, "");
        PrefEditor.putString(buttonstring53	, "");
        PrefEditor.putString(buttonstring54	, "");
        PrefEditor.putString(buttonstring55	, "");
        PrefEditor.putString(buttonstring56	, "");
        PrefEditor.putString(buttonstring57	, "");
        PrefEditor.putString(buttonstring58	, "");
        PrefEditor.putString(buttonstring59	, "");

        PrefEditor.putString(buttonstring61	, "");
        PrefEditor.putString(buttonstring62	, "");
        PrefEditor.putString(buttonstring63	, "");
        PrefEditor.putString(buttonstring64	, "");
        PrefEditor.putString(buttonstring65	, "");
        PrefEditor.putString(buttonstring66	, "");
        PrefEditor.putString(buttonstring67	, "");
        PrefEditor.putString(buttonstring68	, "");
        PrefEditor.putString(buttonstring69	, "");

        PrefEditor.putString(buttonstring71	, "");
        PrefEditor.putString(buttonstring72	, "");
        PrefEditor.putString(buttonstring73	, "");
        PrefEditor.putString(buttonstring74	, "");
        PrefEditor.putString(buttonstring75	, "");
        PrefEditor.putString(buttonstring76	, "");
        PrefEditor.putString(buttonstring77	, "");
        PrefEditor.putString(buttonstring78	, "");
        PrefEditor.putString(buttonstring79	, "");

        PrefEditor.putString(buttonstring81	, "");
        PrefEditor.putString(buttonstring82	, "");
        PrefEditor.putString(buttonstring83	, "");
        PrefEditor.putString(buttonstring84	, "");
        PrefEditor.putString(buttonstring85	, "");
        PrefEditor.putString(buttonstring86	, "");
        PrefEditor.putString(buttonstring87	, "");
        PrefEditor.putString(buttonstring88	, "");
        PrefEditor.putString(buttonstring89	, "");

        PrefEditor.putString(buttonstring91	, "");
        PrefEditor.putString(buttonstring92	, "");
        PrefEditor.putString(buttonstring93	, "");
        PrefEditor.putString(buttonstring94	, "");
        PrefEditor.putString(buttonstring95	, "");
        PrefEditor.putString(buttonstring96	, "");
        PrefEditor.putString(buttonstring97	, "");
        PrefEditor.putString(buttonstring98	, "");
        PrefEditor.putString(buttonstring99	, "");

        PrefEditor.apply();

        //newgamestring="1";
        recreate();
        //restartstring="yes";
        SharedPreferences shareoptions=getSharedPreferences("Options", Context.MODE_PRIVATE);
        Chronometer chronometer=findViewById(R.id.chronometer);
        String timerstring=shareoptions.getString("timer","");
        if (timerstring.equals("yes")){

            chronometer.setBase(SystemClock.elapsedRealtime());
            chronometer.start();
        }

    }
    public void options(View view){
        Intent intentoptions=new Intent(this,OptionsActivity.class);
        startActivity(intentoptions);
    }
    public void menu(View view) {
        Intent intentmenu = new Intent(this, MainMenuActivity.class);

        startActivity(intentmenu);
    }

    public void resume(View view){


        SharedPreferences shareoptions=getSharedPreferences("Options", Context.MODE_PRIVATE);

        String lightupsimilarstring=shareoptions.getString("lightsimilar","");
        if (lightupsimilarstring.equals("yes")||lightupsimilarstring.equals("")){
            lightUpSimilar=1;
        }
        else if (lightupsimilarstring.equals("no")){
            lightUpSimilar=0;
        }
        cancelActionstring=shareoptions.getString("cancelAction","");
        if (cancelActionstring.equals("yes")){
            cancelActionInt=1;
        }
        else if(cancelActionstring.equals("no")||cancelActionstring.equals("")){
            cancelActionInt=0;
        }

        redUnitstring=shareoptions.getString("redUnit","");
        if (redUnitstring.equals("yes")||redUnitstring.equals("")){
            redUnitInt=1;
        }
        else if(redUnitstring.equals("no")){
            redUnitInt=0;
        }

        handstring=shareoptions.getString("handed","");
        if (handstring.equals("left")){
            ConstraintLayout layoutpause =  findViewById(R.id.gameactivity);
            ConstraintSet setconspause= new ConstraintSet();
            setconspause.clone(this,R.layout.activity_game_left);
            TransitionManager.beginDelayedTransition(layoutpause);
            setconspause.applyTo(layoutpause);
        }
        else {
            ConstraintLayout layoutpause =  findViewById(R.id.gameactivity);
            ConstraintSet setconspause= new ConstraintSet();
            setconspause.clone(this,R.layout.activity_game);
            TransitionManager.beginDelayedTransition(layoutpause);
            setconspause.applyTo(layoutpause);
        }
        Chronometer chronometer=findViewById(R.id.chronometer);
        String timerstring=shareoptions.getString("timer","");
        if (timerstring.equals("yes")){
            chronometer.setVisibility(View.VISIBLE);
            chronometer.start();
        }
        else if(timerstring.equals("no")||timerstring.equals("")){
            chronometer.setVisibility(View.INVISIBLE);
        }
        Button b1=findViewById(R.id.B1);
        Button b2=findViewById(R.id.B2);
        Button b3=findViewById(R.id.B3);
        Button b4=findViewById(R.id.B4);
        Button b5=findViewById(R.id.B5);
        Button b6=findViewById(R.id.B6);
        Button b7=findViewById(R.id.B7);
        Button b8=findViewById(R.id.B8);
        Button b9=findViewById(R.id.B9);
        Button bE=findViewById(R.id.BE);
        Button bpause=findViewById(R.id.pause);
        Button bmemo=findViewById(R.id.Memo);
        Button cancelAction=findViewById(R.id.cancelActionButton);
        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
        b6.setEnabled(true);
        b7.setEnabled(true);
        b8.setEnabled(true);
        b9.setEnabled(true);
        bE.setEnabled(true);
        bpause.setEnabled(true);
        bmemo.setEnabled(true);
        if (cancelActionInt==1){
            cancelAction.setEnabled(true);

        }
        else if (cancelActionInt==0){
            cancelAction.setEnabled(false);
        }
        numberticketbutton1.setEnabled(true);
        numberticketbutton2.setEnabled(true);
        numberticketbutton3.setEnabled(true);
        numberticketbutton4.setEnabled(true);
        numberticketbutton5.setEnabled(true);
        numberticketbutton6.setEnabled(true);
        numberticketbutton7.setEnabled(true);
        numberticketbutton8.setEnabled(true);
        numberticketbutton9.setEnabled(true);
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
}
