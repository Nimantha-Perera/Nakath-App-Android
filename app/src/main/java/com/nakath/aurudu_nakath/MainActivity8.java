package com.nakath.aurudu_nakath;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.nakath.aurudu_nakath.R;


import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Collections;
import java.util.List;

public class MainActivity8 extends AppCompatActivity {
    EditText editText;
    Button button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        editText = findViewById(R.id.report);
        button = findViewById(R.id.report_btn);


//        addData = FirebaseDatabase.getInstance().getReference().child("Reports");
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
////                insertReportsdata();
////                editText.setText("");
//            }
//        });
    }
//    private void insertReportsdata() {
//        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
//        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
//        if (networkInfo == null || !networkInfo.isConnected()) {
//            Toast.makeText(MainActivity8.this, "අන්තර්ජාල සබදතාව බිඳී ඇත", Toast.LENGTH_SHORT).show();
//            return;
//        }
//
//
//        String report = editText.getText().toString();
//        String ip = getIPAddress();
//        if (report.isEmpty()) { // check if the report is empty
//            Toast.makeText(this, "කරුණාකර දෝශය කුමක්දැයි ඇතුලත්කර වාර්තා කරන්න", Toast.LENGTH_SHORT).show();
//        } else {
//            Report report1 = new Report(report, ip);
//            addData.push().setValue(report1);
//            Toast.makeText(this, "වාර්තා කිරීම සාර්තකයි", Toast.LENGTH_SHORT).show();
//            openDialod();
//        }
//    }

    //    Get User Ip Adderss
    public String getIPAddress() {
        try {
            List<NetworkInterface> interfaces = Collections.list(NetworkInterface.getNetworkInterfaces());
            for (NetworkInterface iface : interfaces) {
                List<InetAddress> addresses = Collections.list(iface.getInetAddresses());
                for (InetAddress address : addresses) {
                    if (!address.isLoopbackAddress() && address instanceof Inet4Address) {
                        return address.getHostAddress();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    private void openDialod() {
        dialog dialog = new dialog();
        dialog.show(getSupportFragmentManager(),"dialog");
    }
}