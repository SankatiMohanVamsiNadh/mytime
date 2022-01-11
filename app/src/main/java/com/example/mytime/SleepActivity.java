package com.example.mytime;

import android.Manifest;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.widget.Toast;

import androidx.core.app.ActivityCompat;

public class SleepActivity extends BroadcastReceiver {

    String phno = "09440274130";
    String message = "Hello!! Static text message demo";

    public void onReceive(Context context, Intent intent) {

        try {
            if(ActivityCompat.checkSelfPermission(this, Manifest.permission.SEND_SMS) != PackageManager.PERMISSION_GRANTED)
                return;

            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(phno, null,message,null,null);
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}