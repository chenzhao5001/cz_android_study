package com.cz.study;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import butterknife.BindView;
import butterknife.ButterKnife;


public class Image_activity extends AppCompatActivity {

    @BindView(R.id.pic_list)
    ListView mListView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        ButterKnife.bind(this);
    }
}