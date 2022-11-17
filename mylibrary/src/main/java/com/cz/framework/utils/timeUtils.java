package com.cz.framework.utils;

public class timeUtils {
    public static String formatDuring(long ms) {
        long hours = (ms % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60);
        long minutes = (ms % (1000 * 60 * 60)) / (1000 * 60);
        long seconds = (ms % (1000 * 60)) / 1000;
        return hours + ":" + minutes + ":" + seconds;
    }
}
