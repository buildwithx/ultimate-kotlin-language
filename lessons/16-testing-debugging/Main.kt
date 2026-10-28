fun add(a: Int, b: Int): Int = a + b

fun main() {
    check(add(3, 4) == 7) { "Addition result was incorrect" }
    println("All manual checks passed")
}