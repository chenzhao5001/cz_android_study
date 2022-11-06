package com.cz.ndktest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    final String TAG = "MainActivity_abc";
    static {
       System.loadLibrary("ndktest");
       System.loadLibrary("newTest");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String str =  stringFromJni();
        Log.i(TAG, "onCreate: " + str);
        Log.i(TAG, "onCreate: " + this.getIntfromJNI());
    }

    public native String stringFromJni();
    public native int getIntfromJNI();
    public native void setString(String str);
}