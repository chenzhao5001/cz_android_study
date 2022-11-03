package com.cz.study;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import java.io.File;

import butterknife.BindView;
import butterknife.ButterKnife;

public class VideoActivity extends AppCompatActivity {

    final String TAG = "VideoActivity";
    
    @BindView(R.id.playerView)
    VideoView mVideoView;
    MediaController mMediaController;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if(ContextCompat.checkSelfPermission(this,Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
            Toast.makeText(this,"无权限",Toast.LENGTH_SHORT).show();
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},1);
        } else {
            Toast.makeText(this,"有权限",Toast.LENGTH_SHORT).show();
        }
        try {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_video);
            ButterKnife.bind(this);

            String path = Environment.getExternalStorageDirectory().getAbsolutePath();
            Log.i(TAG, "onCreate: " + path);
            path += "/a.mp4";
            Log.i(TAG, "onCreate2: " + path);
            File f = new File(path);
            boolean b = f.exists();

            mVideoView.setVideoPath(path);

//        mVideoView.setVideoURI(Uri.parse("https://v6-web.toutiaovod.com/1d7e46bdbde39bfee1baf9595eb2a56f/63639cfb/video/tos/cn/tos-cn-ve-31/bfe2465a136e404cba5fa9dc8b68a1dc/?a=24&ch=0&cr=0&dr=0&net=5&cd=0%7C0%7C0%7C0&cv=1&br=649&bt=649&cs=0&ds=3&ft=hGkwBy6LRR0sWrC12D12Nc0iPMgzbLGDy4lU_4HGdr2JNv7thb&mime_type=video_mp4&qs=0&rc=ZGdkOjVkM2U3NTs5Z2k8ZEBpamhvb2c6Zm83ZzMzNGkzM0BjNl8yNC0yNS4xLl42LWE2YSNwcXBucjRvYGVgLS1kLjBzcw%3D%3D&l=2022110317502101020914617207016CE1"));
            mMediaController = new MediaController(this);
            mVideoView.setMediaController(mMediaController);
            mMediaController.setMediaPlayer(mVideoView);


        } catch (Exception e) {
            Log.e(TAG, "onCreate3: " + e);
        }
    }
}