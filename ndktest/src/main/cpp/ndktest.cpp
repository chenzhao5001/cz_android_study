#include <jni.h>

// Write C++ code here.
//
// Do not forget to dynamically load the C++ library into your application.
//
// For instance,
//
// In MainActivity.java:
//    static {
//       System.loadLibrary("ndktest");
//    }
//
// Or, in MainActivity.kt:
//    companion object {
//      init {
//         System.loadLibrary("ndktest")
//      }
//    }
#include <stdio.h>

void foo() {
    printf("hello world!");
}

extern "C"
JNIEXPORT jstring JNICALL
Java_com_cz_ndktest_MainActivity_stringFromJni(JNIEnv *env, jobject thiz) {
    return env->NewStringUTF("hello world");
}