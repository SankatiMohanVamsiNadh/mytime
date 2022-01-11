package com.example.mytime;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ToggleButton;

public class SecondActivity extends AppCompatActivity {
    ToggleButton sleeping,atoffice,atgym;
    String msg1="The person you called  is currently sleeping";
    String msg2="The person you called  is currently At gym";
    String msg3="The person you called  is currently At Office";
    String phno="09494606633";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        sleeping=findViewById(R.id.sleeping);
        atgym=findViewById(R.id.atgym);
        atoffice=findViewById(R.id.atoffice);
        sleeping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sleeping.isChecked()){

                    if (ActivityCompat.checkSelfPermission(SecondActivity.this,Manifest.permission.SEND_SMS)!=PackageManager.PERMISSION_GRANTED){
                        return;
                    }
                    SmsManager sms=SmsManager.getDefault();
                    sms.sendTextMessage(phno,null,msg1,null,null);
                }

            }
        });
        atgym.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (atgym.isChecked()){
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this,Manifest.permission.SEND_SMS)!=PackageManager.PERMISSION_GRANTED){
                        return;
                    }

                }
                SmsManager sms=SmsManager.getDefault();
                sms.sendTextMessage(phno,null,msg2,null,null);
            }
        });
        atoffice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (atoffice.isChecked()){
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this,Manifest.permission.SEND_SMS)!=PackageManager.PERMISSION_GRANTED){
                        return;
                    }

                }
                SmsManager sms=SmsManager.getDefault();
                sms.sendTextMessage(phno,null,msg3,null,null);
            }
        });

    }
}