package com.cz.okhttp;

import android.util.Log;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class OkHttpManager {
    String TAG = "OkHttpManager";
    static OkHttpManager okHttpManager = null;
    OkHttpClient okHttpClient = null;
    OkHttpManager() {
        okHttpClient = new OkHttpClient();
    }

    public static OkHttpManager getInstance() {
        if(okHttpManager == null) {
            okHttpManager = new OkHttpManager();
        }
        return okHttpManager;
    };

    public String getUrl(String url) {
        Log.i(TAG, "getUrl: ");
        String retStr = "";
        Request request = new Request.Builder()
                .url(url)
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
}
