package com.nakath.aurudu_nakath;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.nakath.aurudu_nakath.R;

public class MainActivity5 extends AppCompatActivity {
    TextView title;
    TextView content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        title = findViewById(R.id.title_txt);
        content = findViewById(R.id.content1);
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

    }
}