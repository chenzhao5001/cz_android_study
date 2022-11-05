package com.cz.test;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.loader.content.AsyncTaskLoader;

import com.cz.okhttp.OkHttpManager;
import com.cz.study.R;


public class TestActivity extends Activity
        implements View.OnLongClickListener, View.OnClickListener,NetCallback<String>
{
    String TAG = "TestActivity";
    Button okhttpBtn;
    Handler mHandler = new Handler() {
        @Override
        public void handleMessage(@NonNull Message msg) {
            String a = msg.getData().getString("data");
            Log.i(TAG, "handleMessage: " + a);
            okhttpBtn.setText("call success!");
        }
    };
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

//        (new AsyncTask() {
//            @Override
//            protected Object doInBackground(Object... objects) {
//                OkHttpManager.getInstance().getUrlAsync("https://baidu.com");
//                return null;
//            }
//        }).execute();
        OkHttpManager.getInstance().callbackObject(this).getUrlAsync("https://baidu.com");
    }


    @Override
    public void callback(String s) {
        Log.i(TAG, "callback: = " + s);

        Message message = new Message();
        message.what = 1;
        Bundle bundle = new Bundle();
        bundle.putString("data",s);
        message.setData(bundle);
        mHandler.sendMessage(message);
//        okhttpBtn.setText("call success!");
    }
}
