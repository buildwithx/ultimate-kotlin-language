fun main() {
    val name = "Kotlin"
    println("${name.uppercase()} has ${name.length} letters")
    for (n in 2..10 step 2) print("$n ")
    println()
    val scores = intArrayOf(8, 9, 10)
    println(scores.sum())
}