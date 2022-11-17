package com.cz.framework;

public class Framework {
    private static volatile Framework mFramework;
    private Framework() {}

    public static Framework getUtils() {
        if(mFramework == null) {
            synchronized (Framework.class) {
                if(mFramework == null) {
                    mFramework = new Framework();
                }
            }
        }
        return mFramework;
    }
}
