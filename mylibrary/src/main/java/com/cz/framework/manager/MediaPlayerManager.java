package com.cz.framework.manager;

import android.media.MediaPlayer;
import android.os.Handler;

import com.cz.framework.utils.LogUtils;

import java.io.IOException;



public class MediaPlayerManager {

    public static final int MEDIA_STATUS_PLAY = 0;
    public static final int MEDIA_STATUS_PAUSE = 1;
    public static final int MEDIA_STATUS_STOP = 2;

    public int currentStatus = MEDIA_STATUS_STOP;

    private MediaPlayer mMediaPlayer;

    private static final int H_PROGRESS = 1000;
    private OnMusicProgressListener onMusicProgressListener;

    /***
     *  积算进度
     *  1.开始播放的时候开始积算时常
     *  2.将进度积算结果对外抛出
     */
    private Handler mHandle = new Handler()   {
    };

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

    public void setOnProgressListener(OnMusicProgressListener listener) {
        onMusicProgressListener = listener;
    }

    public interface OnMusicProgressListener{
        void onProgress();
    }
}
