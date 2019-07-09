package com.ms.apklistener;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;


public class ApkBroadcastReceiver extends BroadcastReceiver {

    private static final String TAG = "ApkBroadcastReceiver";


    @Override
    public void onReceive(Context context, Intent intent) {

        String action = intent.getAction();
        String data = intent.getDataString();//获取被安装，删除...的应用包名

        Log.e(TAG, "action : " + action);
        Log.e(TAG, "data : " + data);

        //package:com.longtang.ltss
        String[] split = data.split(":");

        String packgeName = split[1];


        // apk 被删除
        if ("android.intent.action.PACKAGE_REMOVED".equals(action)) {

        } else if ("android.intent.action.PACKAGE_ADDED".equals(action)) {

        } else if ("android.intent.action.PACKAGE_CHANGED".equals(action)) {

        } else if ("android.intent.action.PACKAGE_REPLACED".equals(action)) {

        } else if ("android.intent.action.PACKAGE_RESTARTED".equals(action)) {

        } else if ("android.intent.action.PACKAGE_INSTALL".equals(action)) {

        }
    }
}
