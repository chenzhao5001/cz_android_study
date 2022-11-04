package com.cz.study;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.cz.pic.ImageResource;
import com.cz.study.view.PicData;
import com.cz.study.view.PicItemAdapter;
import com.cz.study.view.PicList;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


public class Image_activity extends AppCompatActivity {


    @BindView(R.id.pic_list)
    PicList mListView;

    List<PicData> mListPicData = null;
    private PicItemAdapter mAdapter = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        ButterKnife.bind(this);

        List<PicData> mListPicData = new ArrayList<>();
        List<String> list = ImageResource.getInstance().getResourceList();
        for (String item: list) {
            mListPicData.add(new PicData(item,"test"));
        }
        mAdapter = new PicItemAdapter(mListPicData,this);
        mListView.setAdapter(mAdapter);
    }
}