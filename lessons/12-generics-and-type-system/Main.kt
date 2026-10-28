class Box<T>(val value: T)

fun <T : Comparable<T>> maxOfTwo(a: T, b: T): T = if (a >= b) a else b

fun main() {
    println(Box("Kotlin").value)
    println(maxOfTwo(8, 12))
}