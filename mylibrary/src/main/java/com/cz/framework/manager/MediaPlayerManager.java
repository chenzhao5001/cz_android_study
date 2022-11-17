package com.cz.framework.manager;

import android.media.MediaPlayer;

import com.cz.framework.utils.LogUtils;

import java.io.IOException;

public class MediaPlayerManager {

    public static final int MEDIA_STATUS_PLAY = 0;
    public static final int MEDIA_STATUS_PAUSE = 1;
    public static final int MEDIA_STATUS_STOP = 2;

    public int currentStatus = MEDIA_STATUS_STOP;
    private MediaPlayer mMediaPlayer = null;

    public MediaPlayerManager() {
        mMediaPlayer = new MediaPlayer();
    }

    public void startPlay(String path) {
        try {
            mMediaPlayer.reset();
            mMediaPlayer.setDataSource(path);
            mMediaPlayer.prepare();
            mMediaPlayer.start();
            currentStatus = MEDIA_STATUS_PLAY;

        } catch (IOException e) {
            LogUtils.e(e.toString());
            e.printStackTrace();
        }
    }

    public boolean isPlaying() {
        return mMediaPlayer.isPlaying();
    }

    public void pausePlay() {
        if (isPlaying()) {
            mMediaPlayer.pause();
            currentStatus = MEDIA_STATUS_PAUSE;
        }
    }

    public void continuePlay() {
        mMediaPlayer.start();
        currentStatus = MEDIA_STATUS_PLAY;
    }

    public void stopPlay() {
        mMediaPlayer.stop();
        currentStatus = MEDIA_STATUS_STOP;
    }

    public int getCurrentPosition() {
        return mMediaPlayer.getCurrentPosition();
    }

    public int getDuration() {
        return mMediaPlayer.getDuration();
    }

    public void setLooping(boolean isLooping) {
        mMediaPlayer.setLooping(isLooping);
    }

    public void seekTo(int ms) {
        mMediaPlayer.seekTo(ms);
    }

    public void setOnCompletionListener(MediaPlayer.OnCompletionListener listener) {
        mMediaPlayer.setOnCompletionListener(listener);
    }

    public void setOnErrorListener(MediaPlayer.OnErrorListener listener) {
        mMediaPlayer.setOnErrorListener(listener);
    }

    public void setOnProgressListener(MediaPlayer.OnErrorListener listener) {

    }
}
