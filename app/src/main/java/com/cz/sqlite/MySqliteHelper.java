package com.cz.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

public class MySqliteHelper extends SQLiteOpenHelper {

    static final String TAG = "MySqliteHelper";
    public MySqliteHelper(@Nullable Context context, @Nullable String name,
                          @Nullable SQLiteDatabase.CursorFactory factory,
                          int version) {
        super(context, name, factory, version);
        Log.i(TAG, "MySqliteHelper: 1");
    }


    public MySqliteHelper(@Nullable Context context) {
        super(context, Constant.DATABASE_NAME, null, Constant.VERSION);
        Log.i(TAG, "MySqliteHelper: 2");
    }

    //数据库创建
    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.i(TAG, "onCreate: ");
        String sql = "create table person" +
                "(id Integer primary key," +
                " name varchar(20)," +
                " age Integer," +
                "context text)";

        Log.i(TAG, "createTable: sql=" + sql);
        db.execSQL(sql);

    }

    // 数据库版本更新
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Log.i(TAG, "onUpgrade: ");

    }

    // 数据库打开
    @Override
    public void onOpen(SQLiteDatabase db) {
        super.onOpen(db);
        Log.i(TAG, "onOpen: ");

    }

    public void createTable() {
        Log.i(TAG, "createTable: ");
    }
}
