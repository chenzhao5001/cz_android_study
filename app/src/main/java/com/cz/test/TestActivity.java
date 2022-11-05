package com.cz.test;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.loader.content.AsyncTaskLoader;

import com.cz.okhttp.OkHttpManager;
import com.cz.study.R;

public class TestActivity extends Activity implements View.OnLongClickListener, View.OnClickListener
{
    String TAG = "TestActivity";
    Button okhttpBtn;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        okhttpBtn = findViewById(R.id.ok_http_btn);
        okhttpBtn.setOnClickListener(this);
    }

    @Override
    public boolean onLongClick(View v) {
        return false;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ok_http_btn:
                okHttpTest();
                break;
        }
    }
    void okHttpTest() {

        (new AsyncTask() {
            @Override
            protected Object doInBackground(Object... objects) {
                String str = OkHttpManager.getInstance().getUrl("https://baidu.com");
                Log.i(TAG, "okHttpTest:  = " + str);
                return null;
            }
        }).execute();
    }
}
