package com.cz.sqlite;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

/***
 *
 */

public class MySqliteHelper extends SQLiteOpenHelper {
    public MySqliteHelper(@Nullable Context context, @Nullable String name,
                          @Nullable SQLiteDatabase.CursorFactory factory,
                          int version) {
        super(context, name, factory, version);
    }


    public MySqliteHelper(@Nullable Context context) {
        super(context,Constant.DATABASE_NAME,null,Constant.VERSION);
    }
    //数据库创建
    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    // 数据库版本更新
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    // 数据库打开
    @Override
    public void onOpen(SQLiteDatabase db) {
        super.onOpen(db);
    }
}
