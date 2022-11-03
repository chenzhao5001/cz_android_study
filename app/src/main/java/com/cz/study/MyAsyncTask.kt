package com.cz.study

import android.os.AsyncTask
import android.os.Parcel
import android.os.Parcelable
import android.util.Log

class MyAsyncTask : AsyncTask<Int,Int,String>() {
    var TAG: String = "MyAsyncTask";
    override fun doInBackground(vararg params: Int?): String {
        for (item in 1..3) {
            Log.i(TAG,item.toString())
        }
        return ""
    }

}