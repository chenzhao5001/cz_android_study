package com.cz.study;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
        getIntent();
    }

    @OnClick(R.id.btn1)
    void onClick(View view) {
        Log.i(tag,"onClick");
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
                break;
            }
        }
        // TODO call server...
    }
}
