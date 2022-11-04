package com.cz.sqlite;

import android.content.Context;
import android.util.Log;

public class DbManger {
    static String TAG = "DbManger";
    static MySqliteHelper mySqliteHelper;
    public static MySqliteHelper getInstance(Context context) {
        Log.i(TAG, "getInstance: enter");
        if(mySqliteHelper == null) {
            Log.i(TAG, "getInstance: not null!");
            mySqliteHelper = new MySqliteHelper(context);
        }
        return mySqliteHelper;
    }
}
