package com.cz.framework.utils;

import android.text.TextUtils;
import android.util.Log;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LogUtils {
    final static String TAG = "UtilsLog";
    private static SimpleDateFormat mSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss" );
    public static void i(String text) {
        if(!TextUtils.isEmpty(text)) {
            Log.i(TAG, text);
            writeToFile(text);
        }
    }

    public static void e(String text) {
        if(!TextUtils.isEmpty(text)) {
            Log.e(TAG, text);
            writeToFile(text);

        }
    }

    private static void writeToFile(String text) {
        String filePath = "/sdcard/Meet/";
        String fileName = filePath + "Meet.log";
        String log = mSimpleDateFormat.format(new Date()) + " " + text + "\n";
        File path = new File(filePath);
        if(!path.exists()) {
            path.mkdir();
        }

        FileOutputStream fileOutputStream = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileOutputStream = new FileOutputStream(fileName,true);
            bufferedWriter = new BufferedWriter(
                    new OutputStreamWriter(fileOutputStream, Charset.forName("gbk"))
            );
            bufferedWriter.write(log);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
