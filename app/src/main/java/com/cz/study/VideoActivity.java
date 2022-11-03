package com.cz.study;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class VideoActivity extends AppCompatActivity {
    @BindView(R.id.playerView)
    VideoView mVideoView;
    MediaController mMediaController;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        ButterKnife.bind(this);

        mVideoView.setVideoPath("");
        mVideoView.setVideoURI(Uri.parse(""));
        mMediaController = new MediaController(this);
        mVideoView.setMediaController(mMediaController);
        mMediaController.setMediaPlayer(mVideoView);

    }
}