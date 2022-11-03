package com.cz.sqlite;

import android.content.Context;

public class DbManger {
    static MySqliteHelper mySqliteHelper;
    public static MySqliteHelper getInstance(Context context) {
        if(mySqliteHelper == null) {
            mySqliteHelper = new MySqliteHelper(context);
        }
        return mySqliteHelper;
    }
}
