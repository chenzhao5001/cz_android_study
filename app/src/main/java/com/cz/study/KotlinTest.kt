import com.cz.study.Test

class Test2 {
    public fun getA(): String {
        return "abc"
    }
}

fun test() {
    Test().name
    Test2().getA()
}