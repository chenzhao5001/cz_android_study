package com.cz.study.services

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

class MyService1(intent: Intent) : Service() {
    private val TAG = "MyService1"
    override fun onCreate() {
        Log.i(TAG,"onCreate");
        super.onCreate()
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.i(TAG,"onStartCommand");
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onBind(intent: Intent): IBinder? {
        Log.i(TAG,"onBind");
//        TODO("Return the communication channel to the service.")
        return null;
    }

    override fun onDestroy() {
        Log.i(TAG,"onBind");
        super.onDestroy()
    }
}