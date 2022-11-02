package com.cz.study;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    static String tag = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn1)
    void onClick(View view) {
        Log.i(tag,"onClick");
        if(view.getId() == R.id.btn1) {
            Toast.makeText(this,"test",Toast.LENGTH_SHORT).show();
        }
        // TODO call server...
    }
}
