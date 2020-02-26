package com.example.pushkittest;

import android.util.Log;

import com.huawei.hms.push.HmsMessageService;
import com.huawei.hms.push.RemoteMessage;

//Receiving a Token
//A token is received in the following scenarios:
//If the EMUI version is 10.0 or later on a Huawei device, a token 
//is returned through the HmsInstanceId.getInstance.getToken method described in the step of applying for a token.

//If the EMUI version is earlier than 10.0 on a Huawei device,
//after the HmsInstanceId.getInstance.getToken method is called, 
//the onNewToken method in the MyPushService class is called to obtain a token.

public class MyPushService extends HmsMessageService {
    private static final String TAG = "PushDemoLog";

    @Override
    public void onNewToken(String s) {
        super.onNewToken(s);
        Log.i(TAG, "receive token:" + s);

    }
    
//The MyPushService class is used to:

//1-Return the token applied for using a Huawei device where the EMUI version is earlier than 10.0.
//2-Receive an updated token from the HUAWEI Push Kit server.
//3-Return a token that is successfully applied for upon retry.



    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);

        if (remoteMessage.getData().length() > 0) {
            Log.i(TAG, "Message data payload: " + remoteMessage.getData());
        }
        if (remoteMessage.getNotification() != null) {
            Log.i(TAG, "Message Notification Body: " + remoteMessage.getNotification().getBody());
        }
    }

    @Override
    public void onMessageSent(String s) {
    }

    @Override
    public void onSendError(String s, Exception e) {
    }
}
