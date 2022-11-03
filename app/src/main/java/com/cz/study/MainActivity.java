package com.cz.study;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.io.File;
import java.io.IOException;

import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {
    static String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn1,R.id.btn2,R.id.btn3,R.id.btn4,R.id.player_test_btn,R.id.player_mk_dir,
            R.id.okhttp_btn,R.id.sqlite_btn})
//    @OnClick
    void onClick(View view) {
        switch(view.getId()) {
            case R.id.btn1: {
                Toast.makeText(this,"btn1",Toast.LENGTH_SHORT).show();
                Intent it = new Intent(this,Test_1_activity.class);
                it.putExtra("a","cz");
                startActivity(it);
                break;
            }
            case R.id.btn2: {
                Toast.makeText(this,"btn2",Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.btn3: {
                Toast.makeText(this,"btn3",Toast.LENGTH_SHORT).show();
                final Intent intent = new Intent();
                intent.setAction("com.cz.study.services.MyService1");
                startService(intent);
                break;
            }
            case R.id.btn4: {
                Toast.makeText(this,"btn4",Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.player_test_btn: {
                startActivity(new Intent(this,VideoActivity.class));
                break;
            }
            case R.id.player_mk_dir: {
                try {
                    String appHome = Environment.getExternalStorageDirectory().getAbsolutePath()+"/myApp";
                    File folder = new File(appHome);
                    if(!folder.exists()) {
                        folder.mkdir();//创建文件夹
                        //两种方式判断文件夹是否创建成功
                        //Folder.isDirectory()返回True表示文件路径是对的，即文件创建成功，false则相反
                        boolean isFilemaked1 = folder.isDirectory();
                        //Folder.mkdirs()返回true即文件创建成功，false则相反
                        boolean isFilemaked2 = folder.mkdirs();

                        if (isFilemaked1 || isFilemaked2) {
                            Log.i(TAG,"创建文件夹成功");
                        } else {
                            Log.i(TAG,"创建文件夹失败");
                        }

                    } else {
                        Log.i(TAG, "onClick: " + "文件夹以存在");
                    }

                } catch (Exception e) {
                    Log.e(TAG, "onClick: " + e.getMessage());
                }
            }
            case R.id.okhttp_btn: {
//                OkHttpClient client = new OkHttpClient();
                OkHttpClient client = new OkHttpClient();
                Request request = new Request.Builder()
                        .url("https://baidu.com")
                        .build();

                try {
                    Response response = client.newCall(request).execute();
                    Log.i(TAG, response.body().toString());
                } catch (Exception e) {

                }
            }
            case R.id.sqlite_btn: {

            }
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
