class BuggyKotlin {

    fun m(): String {
        return "Hello Buggy Kotlin! ${ad(4)}"
    }

    fun ad(i: Int): Int {
        var j = i
        j =+ 1
        return j
    }


}