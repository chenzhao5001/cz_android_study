#include <jni.h>
#include <stdio.h>


void foo() {
    printf("hello world!");
}

extern "C"
JNIEXPORT jstring JNICALL
Java_com_cz_ndktest_MainActivity_stringFromJni(JNIEnv *env, jobject thiz) {
    return env->NewStringUTF("hello world");
}

extern "C"
JNIEXPORT void JNICALL
Java_com_cz_ndktest_MainActivity_setString(JNIEnv *env, jobject thiz, jstring str) {
    const char* meStr = env->GetStringUTFChars(str,0);
    printf("%s", meStr);

    // TODO: implement setString()
}
extern "C"
JNIEXPORT jstring JNICALL
Java_com_cz_ndktest_MainActivity_fooObject(JNIEnv *env, jobject thiz, jobject main_activity) {
    // TODO: implement fooObject()
}