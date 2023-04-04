package com.nakath.aurudu_nakath;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;

import com.nakath.aurudu_nakath.R;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class MainActivity7 extends AppCompatActivity {

    private TextView timeTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        // Get a reference to the TextView
        timeTextView = findViewById(R.id.timeTextView);

        // Start a handler to update the time every second
        Handler handler = new Handler(Looper.getMainLooper());
        handler.post(new Runnable() {
            @Override
            public void run() {
                // Get the current time
                Calendar calendar = Calendar.getInstance();
                SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss a", Locale.getDefault());
                String currentTime = timeFormat.format(calendar.getTime());

                // Update the TextView with the current time
                timeTextView.setText(currentTime);

                // Schedule the handler to run again after one second
                handler.postDelayed(this, 1000);
            }
        });
    }
}