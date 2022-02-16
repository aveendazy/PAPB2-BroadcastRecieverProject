package com.example.broadcastrecieverproject;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class CustomReciever extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.

        String msg = "";
        switch (intent.getAction()) {
            case Intent.ACTION_POWER_CONNECTED:
                msg = "the power is connected";
                break;
            case Intent.ACTION_POWER_DISCONNECTED:
                msg = "the power is disconnected";
                break;
            case "ACTION_CUSTOM_BROADCAST":
                //msg = "this is custom broadcast";
                msg = intent.getStringExtra("data");
                break;
            default:
                msg = "default message";
                break;
        }
        Toast.makeText(context, "this function is called", Toast.LENGTH_SHORT).show();
    }
}