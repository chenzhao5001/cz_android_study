package com.cz.okhttp;

import android.util.Log;

import androidx.annotation.NonNull;

import com.cz.test.NetCallback;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class OkHttpManager {
    String TAG = "OkHttpManager";
    static OkHttpManager okHttpManager = null;
    OkHttpClient okHttpClient = null;
    NetCallback mNetCallback = null;
    OkHttpManager() {
        okHttpClient = new OkHttpClient();
    }

    public static OkHttpManager getInstance() {
        if(okHttpManager == null) {
            okHttpManager = new OkHttpManager();
        }
        return okHttpManager;
    };

    public OkHttpManager callbackObject(NetCallback netCallback) {
        mNetCallback = netCallback;
        return okHttpManager;
    }

    public String getUrl(String url) {
        Log.i(TAG, "getUrl: ");
        String retStr = null;
        Request request = new Request.Builder()
                .url(url)
                .get() // 默认是get，可以不写
                .build();
        Response response = null;
        try {
            response = okHttpClient.newCall(request).execute();
            retStr = response.body().string();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return retStr;
    }

    public void getUrlAsync(String url) {
        Request request = new Request.Builder()
                .url(url)
                .get() // 默认是get，可以不写
                .build();
        Call call = okHttpClient.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(@NonNull Call call, @NonNull IOException e) {

            }
            @Override
            public void onResponse(@NonNull Call call, @NonNull Response response) throws IOException {
                String retStr = response.body().string();
                Log.i(TAG, "onResponse: async ret = " + retStr);
                if(mNetCallback != null) {
                    mNetCallback.callback(retStr);
//                    mNetCallback
                }
            }
        });
    }
}
