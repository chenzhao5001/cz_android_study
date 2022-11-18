package com.cz.studyproject.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

import com.cz.studyproject.MainActivity;
import com.cz.studyproject.R;

public class IndexActivity extends AppCompatActivity {

    private static final int SKIP_MAIN = 1000;

    private Handler mHandle = new Handler(new Handler.Callback() {
        @Override
        public boolean handleMessage(Message msg) {
            switch (msg.what) {
                case SKIP_MAIN:
                    startMain();
            }
            return false;
        }
    });

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
        mHandle.sendEmptyMessageDelayed(SKIP_MAIN,2*1000);
    }

    private void startMain() {
        boolean isFirstApp = true;
        Intent intent = new Intent();
        if(isFirstApp) {
            intent.setClass(this,GuideActivity.class);
        } else {
            String token = "";
            if(token != "") {
                intent.setClass(this, MainActivity.class);
            } else {
                intent.setClass(this,LoginActivity.class);
            }
        }
        startActivity(intent);
        finish();
    }
}