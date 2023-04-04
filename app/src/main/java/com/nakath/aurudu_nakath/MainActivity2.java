package com.nakath.aurudu_nakath;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.ActivityOptions;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity2 extends AppCompatActivity {
    CardView nakath;
    CardView litha;
    CardView wish;
    CardView info;
    CardView exit;
    TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.backmusic);
        Button playStopButton = findViewById(R.id.play_stop_button);
        mediaPlayer.start();
        //Going Awurudu Nakath
        playStopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer.isPlaying()) {
                    mediaPlayer.stop();
                    mediaPlayer.prepareAsync();
                    Drawable icon = getResources().getDrawable(R.drawable.baseline_play_arrow_24);
                    playStopButton.setCompoundDrawablesWithIntrinsicBounds(icon, null, null, null);
                    playStopButton.setText("kej; jhkak");
                } else {
                    mediaPlayer.start();
                    Drawable icon = getResources().getDrawable(R.drawable.baseline_stop_24);
                    playStopButton.setCompoundDrawablesWithIntrinsicBounds(icon, null, null, null);
                    playStopButton.setText(".S;h kj;ajkak");
                }
            }
        });
        nakath = findViewById(R.id.nakath);
        nakath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity2.this,MainActivity3.class );
                // Set up a shared element transition animation using a bundle
                Bundle optionsBundle = ActivityOptions.makeSceneTransitionAnimation(MainActivity2.this).toBundle();

                // Start the MainActivity6 activity with the specified animation options bundle
                startActivity(intent, optionsBundle);
            }
        });
        //Exit App
        exit = findViewById(R.id.exit);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        title = findViewById(R.id.title);
//        title = findViewById(R.id.com);
        title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity2.this,MainActivity4.class );
                // Set up a shared element transition animation using a bundle
                Bundle optionsBundle = ActivityOptions.makeSceneTransitionAnimation(MainActivity2.this).toBundle();

                // Start the MainActivity6 activity with the specified animation options bundle
                startActivity(intent, optionsBundle);
            }
        });
        // Find the "subapathum" View object
        View subapathumView = findViewById(R.id.subapathum);

// Set a click listener on the View
        subapathumView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new Intent to start the MainActivity6 activity
                Intent intent = new Intent(MainActivity2.this, MainActivity6.class);

                // Set up a shared element transition animation using a bundle
                Bundle optionsBundle = ActivityOptions.makeSceneTransitionAnimation(MainActivity2.this).toBundle();

                // Start the MainActivity6 activity with the specified animation options bundle
                startActivity(intent, optionsBundle);
            }
        });
        litha = findViewById(R.id.litha);
        litha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity2.this,MainActivity7.class );
                // Set up a shared element transition animation using a bundle
                Bundle optionsBundle = ActivityOptions.makeSceneTransitionAnimation(MainActivity2.this).toBundle();

                // Start the MainActivity6 activity with the specified animation options bundle
                startActivity(intent, optionsBundle);
            }
        });
        info = findViewById(R.id.com);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to open the Gmail app
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:"));

                // Set the recipient email address
                intent.putExtra(Intent.EXTRA_EMAIL, new String[] {"nmadushanka867@gmail.com"});

                // Set the subject of the email
                intent.putExtra(Intent.EXTRA_SUBJECT, "අවුරුදු App Report");

                // Start the activity to compose a new email
                startActivity(intent);
            }
        });


    }
}