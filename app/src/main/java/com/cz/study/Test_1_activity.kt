package com.cz.study

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class Test_1_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test1)
        var test: String? =  intent.getStringExtra("a")
        Toast.makeText(this,test,Toast.LENGTH_SHORT).show();
        getIntent()
//        var it: Intent = Intent.getIntentOld("a")
//        it.getStringExtra()
    }
}