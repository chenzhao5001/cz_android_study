package com.cz.studyproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.cz.framework.utils.LogUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LogUtils.i("hello world");
    }
}