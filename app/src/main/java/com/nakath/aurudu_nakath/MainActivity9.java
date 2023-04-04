package com.nakath.aurudu_nakath;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.nakath.aurudu_nakath.R;

public class MainActivity9 extends AppCompatActivity {
    TextView title;
    TextView content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        title = findViewById(R.id.title_txt1);
         content = findViewById(R.id.contentd);
        String myValue = getIntent().getStringExtra("MY_VALUE");
        String arc = getIntent().getStringExtra("My_con");
        title.setText(myValue);
        content.setText(arc);
        String myValue1 = getIntent().getStringExtra("MY_VALUE");
        String arc1 = getIntent().getStringExtra("My_con");
        title.setText(myValue1);
        content.setText(arc1);
        String myValue2 = getIntent().getStringExtra("MY_VALUE");
        String arc2 = getIntent().getStringExtra("My_con");
        title.setText(myValue2);
        content.setText(arc2);
        String myValue3 = getIntent().getStringExtra("MY_VALUE");
        String arc3 = getIntent().getStringExtra("My_con");
        title.setText(myValue3);
        content.setText(arc3);
        String myValue4 = getIntent().getStringExtra("MY_VALUE");
        String arc4 = getIntent().getStringExtra("My_con");
        title.setText(myValue4);
        content.setText(arc4);
        String myValue5 = getIntent().getStringExtra("MY_VALUE");
        String arc5 = getIntent().getStringExtra("My_con");
        title.setText(myValue5);
        content.setText(arc5);
        String myValue6 = getIntent().getStringExtra("MY_VALUE");
        String arc6 = getIntent().getStringExtra("My_con");
        title.setText(myValue6);
        content.setText(arc6);
        String myValue7 = getIntent().getStringExtra("MY_VALUE");
        String arc7 = getIntent().getStringExtra("My_con");
        title.setText(myValue7);
        content.setText(arc7);
        String myValue8 = getIntent().getStringExtra("MY_VALUE");
        String arc8 = getIntent().getStringExtra("My_con");
        title.setText(myValue8);
        content.setText(arc8);
        String myValue9 = getIntent().getStringExtra("MY_VALUE");
        String arc9 = getIntent().getStringExtra("My_con");
        title.setText(myValue9);
        content.setText(arc9);
        String myValue10 = getIntent().getStringExtra("MY_VALUE");
        String arc10 = getIntent().getStringExtra("My_con");
        title.setText(myValue10);
        content.setText(arc10);
        String myValue11 = getIntent().getStringExtra("MY_VALUE");
        String arc11 = getIntent().getStringExtra("My_con");
        title.setText(myValue11);
        content.setText(arc11);
    }
}