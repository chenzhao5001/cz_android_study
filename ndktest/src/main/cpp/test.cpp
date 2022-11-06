
#include <jni.h>

extern "C"
JNIEXPORT jint JNICALL
Java_com_cz_ndktest_MainActivity_getIntfromJNI(JNIEnv *env, jobject thiz) {
    return 200;
    // TODO: implement getIntfromJNI()
}
