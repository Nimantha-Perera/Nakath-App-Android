package com.nakath.aurudu_nakath;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import com.nakath.aurudu_nakath.R;

import java.util.Calendar;

public class MainActivity3 extends AppCompatActivity {
    private boolean isFinished = false;
    TextView days;
    TextView hour;
    TextView minu;
    TextView sec;
    TextView days1;
    TextView hour1;
    TextView minu1;
    TextView sec1;
    CardView one;
    CardView two;
    CardView tree;
    CardView four;
    CardView five;
    CardView six;
    Handler handler = new Handler();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        days1 = findViewById(R.id.days1);
        hour1 = findViewById(R.id.hourx1);
        minu1 = findViewById(R.id.minu1);
        sec1 = findViewById(R.id.sec1);
        one = findViewById(R.id.tw2);
        two = findViewById(R.id.tw7);
        tree = findViewById(R.id.tw3);
        four = findViewById(R.id.tw4);
        five = findViewById(R.id.tw5);
        six = findViewById(R.id.tw6);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String myValue = "mqKH ld,h"; // the value you want to pass
                String arc = "wfma%,a ui 14 jk isl=rdod mQ¾j Nd. 08'35 isg tÈk wmr Nd. 9'23 olajd mqKH ld,h neúka wfma%,a ui 14 jk isl=rdod Èk mQ¾j Nd. 08'35 g m<uqj wdydr mdk f.k ish¨ jev w;ayer wd.ñl j;dj;aj, fh§u o mqKH ld,fha wmr fldgi ;=< tkï\" 14 jk isl=rdod Èk wmr Nd. 2'59 isg wmr Nd. 9'23 olajd ld,h ;=< wdydr msiSu\" jev we,a,Su\" .kqfokq lsÍu yd wdydr wkqNjh wd§ kel;a pdß;% úê bgq lsÍu o uekú¡";

                Intent intent = new Intent(MainActivity3.this, MainActivity5.class);
                intent.putExtra("MY_VALUE", myValue);
                intent.putExtra("My_con",arc);
                startActivity(intent);

            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String myValue1 = "mrK wjqreoao i|yd iakdkhg"; // the value you want to pass
                String arc1 = "wfma%,a ui 2jk nodod Èk fldfydUm;a hqI ñY% kdyq yd ia;dkh fldg bIag foaj;d wkqiaurKfhys fh§ jdih uekú¡";

                Intent intent = new Intent(MainActivity3.this, MainActivity5.class);
                intent.putExtra("MY_VALUE", myValue1);
                intent.putExtra("My_con",arc1);
                startActivity(intent);

            }
        });
        tree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String myValue2 = "wdydr msiSu"; // the value you want to pass
                String arc2 = "wdfma%,a ui 14 fjks isl=rdod wmr Nd. 3'29 úÑ;% j¾K meye;s jia;%dNrKfhka ieriS ol=Kq ÈYdj n,d <sma ne| .sks fud<jd\" §lsß ñY% ls¾n;la o ;, iy ú<| ñY% leú,s j¾.hla o ms<sfh, lr.ekSu uekõ";

                Intent intent = new Intent(MainActivity3.this, MainActivity5.class);
                intent.putExtra("MY_VALUE", myValue2);
                intent.putExtra("My_con",arc2);
                startActivity(intent);

            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String myValue3 = "jev we,a,Su\" .kqfokq lsÍu yd wdydr wkqNjh"; // the value you want to pass
                String arc3 = "wfma%,a ui 14 fjks isl=rdod wmr Nd. 5'05g úÑ;% j¾K meye;s jia;%dNrKfhka ieriS ol=Kq ÈYdj n,d ish¨ jev w,a,d .kqfokq fldg wdydr wkqNjh uekj";

                Intent intent = new Intent(MainActivity3.this, MainActivity5.class);
                intent.putExtra("MY_VALUE", myValue3);
                intent.putExtra("My_con",arc3);
                startActivity(intent);

            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String myValue4 = "ysif;,a .Eu"; // the value you want to pass
                String arc4 = "wfma%,a ui 16 fjks b¾od Wfoa 09'41 g r;= iy ly ñY% j¾K ^;U meye;s& jia;%dNrKfhka ieriS\" ol=Kq ÈYdj n,d ysig bUq,a m;a o mhg kq. m;a o ;nd bUq,a m;a hqI ñY% kdkq o f;,a o yd iakdkh lsÍu uekj";

                Intent intent = new Intent(MainActivity3.this, MainActivity5.class);
                intent.putExtra("MY_VALUE", myValue4);
                intent.putExtra("My_con",arc4);
                startActivity(intent);

            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String myValue5 = "/lSrlaId i|yd msg;aj heu"; // the value you want to pass
                String arc5 = "wfma%,a ui 17 jk i÷od Wfoa 06'28g iqÿ meye;s jia;%dNrKfhka ieriS\" §lsß ñY% ls¾n;la iy leú,s j¾.hla wkqNj lr ol=Kq ÈYdj n,d msg;aj hEu uekù";

                Intent intent = new Intent(MainActivity3.this, MainActivity5.class);
                intent.putExtra("MY_VALUE", myValue5);
                intent.putExtra("My_con",arc5);
                startActivity(intent);

            }
        });



//        updateCountDown();
        updateCountDown1();

    }


//    private void updateCountDown() {
//        Calendar calendar = Calendar.getInstance();
//        calendar.set(Calendar.YEAR, 2023);
//        calendar.set(Calendar.MONTH, Calendar.MARCH);
//        calendar.set(Calendar.DATE, 23);
//        calendar.set(Calendar.HOUR_OF_DAY, 0);
//        calendar.set(Calendar.MINUTE, 0);
//        calendar.set(Calendar.SECOND, 0);
//        long currentTime = System.currentTimeMillis();
//        long dawnTime = calendar.getTimeInMillis();
//        long timeLeftInMillis = dawnTime - currentTime;
//        int daysLeft = (int) (timeLeftInMillis / (1000L * 60 * 60 * 24) % 365);
//        int hoursLeft = (int) ((timeLeftInMillis / (1000L * 60 * 60)) % 24);
//        int minutesLeft = (int) ((timeLeftInMillis / (1000L * 60)) % 60);
//        int secondsLeft = (int) ((timeLeftInMillis / 1000) % 60);
//        days.setText(String.valueOf(daysLeft));
//        hour.setText(String.valueOf(hoursLeft));
//        minu.setText(String.valueOf(minutesLeft));
//        sec.setText(String.valueOf(secondsLeft));
//        handler.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                updateCountDown();
//            }
//        }, 1000);
//        if(daysLeft<=0){
//            days.setVisibility(View.INVISIBLE);
//        }
//        if(hoursLeft<=0){
//            hour.setVisibility(View.INVISIBLE);
//        }
//        if(minutesLeft<=0){
//            minu.setVisibility(View.INVISIBLE);
//        }
//
//
//    }
    private void updateCountDown1() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2023);
        calendar.set(Calendar.MONTH, Calendar.APRIL);
        calendar.set(Calendar.DATE, 14);
        calendar.set(Calendar.HOUR_OF_DAY, 14);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 0);
        long currentTime = System.currentTimeMillis();
        long targetTime = calendar.getTimeInMillis();
        long timeLeftInMillis = targetTime - currentTime;
        int daysLeft = (int) (timeLeftInMillis / (1000L * 60 * 60 * 24));
        int hoursLeft = (int) ((timeLeftInMillis / (1000L * 60 * 60)) % 24);
        int minutesLeft = (int) ((timeLeftInMillis / (1000L * 60)) % 60);
        int secondsLeft = (int) ((timeLeftInMillis / 1000) % 60);
        days1.setText(String.valueOf(daysLeft));
        hour1.setText(String.valueOf(hoursLeft));
        minu1.setText(String.valueOf(minutesLeft));
        sec1.setText(String.valueOf(secondsLeft));
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                updateCountDown1();
            }
        }, 1000);
        TextView dina, paya, mini, thath;
        dina = findViewById(R.id.dina);
        paya = findViewById(R.id.paya);
        mini = findViewById(R.id.minit);
        thath = findViewById(R.id.thaht);
        TextView subaalu;
        subaalu = findViewById(R.id.suba_aluth);
        if (daysLeft <= 0) {
            days1.setVisibility(View.INVISIBLE);
            dina.setVisibility(View.INVISIBLE);
        }
        if (hoursLeft <= 0) {
            hour1.setVisibility(View.INVISIBLE);
            paya.setVisibility(View.INVISIBLE);
        }
        if (hoursLeft <= 0) {
            minu1.setVisibility(View.INVISIBLE);
            mini.setVisibility(View.INVISIBLE);
        }

        if (daysLeft <= 0 && hoursLeft <= 0 && hoursLeft <= 0 && secondsLeft <= 0) {
                subaalu.setVisibility(View.VISIBLE);
            }
        }
    }

