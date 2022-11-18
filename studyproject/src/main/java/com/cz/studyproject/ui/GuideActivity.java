package com.cz.studyproject.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.cz.studyproject.R;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;

public class GuideActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private ImageView iv_music_switch;
    private TextView tv_guide_skip;
    private ImageView iv_guide_point_1;
    private ImageView iv_guide_point_2;
    private ImageView iv_guide_point_3;

    private View view1;
    private View view2;
    private View view3;

    private List<View> mPageList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
        initView();
    }

    private void initView() {
        mViewPager = (ViewPager) findViewById(R.id.mViewPager);
        iv_music_switch = (ImageView) findViewById(R.id.iv_music_switch);
        tv_guide_skip = (TextView) findViewById(R.id.tv_guide_skip);
        iv_guide_point_1 = (ImageView) findViewById(R.id.iv_guide_point_1);
        iv_guide_point_2 = (ImageView) findViewById(R.id.iv_guide_point_2);
        iv_guide_point_3 = (ImageView) findViewById(R.id.iv_guide_point_3);

        view1 = View.inflate(this,R.layout.layout_pager_guide_1,null);
        view2 = View.inflate(this,R.layout.layout_pager_guide_1,null);
        view3 = View.inflate(this,R.layout.layout_pager_guide_1,null);

        mPageList.add(view1);
        mPageList.add(view2);
        mPageList.add(view3);
    }
}