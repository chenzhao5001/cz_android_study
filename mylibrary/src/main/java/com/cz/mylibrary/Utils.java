package com.cz.mylibrary;

public class Utils {
    private static volatile Utils mUtils;
    private Utils() {}

    public static Utils getUtils() {
        if(mUtils == null) {
            synchronized (Utils.class) {
                if(mUtils == null) {
                    mUtils = new Utils();
                }
            }
        }
        return mUtils;
    }
}
