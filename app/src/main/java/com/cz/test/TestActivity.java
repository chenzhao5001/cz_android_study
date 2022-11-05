package com.cz.test;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

import com.cz.study.R;

public class TestActivity extends Activity implements View.OnLongClickListener, View.OnClickListener
{
    Button okhttpBtn;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        okhttpBtn = findViewById(R.id.ok_http_btn);
        okhttpBtn.setOnClickListener(this);
    }

    @Override
    public boolean onLongClick(View v) {
        return false;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ok_http_btn:
                okHttpTest();
                break;
        }
    }
    void okHttpTest() {

    }
}
