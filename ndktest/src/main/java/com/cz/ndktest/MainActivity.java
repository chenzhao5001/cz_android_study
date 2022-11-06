package com.cz.ndktest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    final String TAG = "MainActivity_abc";
    static {
       System.loadLibrary("ndktest");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String str =  stringFromJni();
        Log.i(TAG, "onCreate: " + str);
    }

    public native String stringFromJni();
}