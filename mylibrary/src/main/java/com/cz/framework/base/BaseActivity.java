package com.cz.framework.base;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.cz.framework.utils.SystemUI;

public class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SystemUI.fixSystemUI(this);
    }
}
