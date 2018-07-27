package com.ddstar.goodlibs;

import android.util.Log;

/**
 * Created by DDStar on 2018/7/27.
 */
public class TestUtil {
    public static void sayHello() {
        if (BuildConfig.libTest) {
            Log.e("sayHello", "debug-hello");
        } else {
            Log.e("sayHello", "release-hello");
        }
    }
}
