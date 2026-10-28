fun main() {
    val score = 82
    val grade = when {
        score >= 90 -> "A"
        score >= 80 -> "B"
        score >= 70 -> "C"
        else -> "Needs improvement"
    }
    println(grade)
    for (number in 1..5) println(number)
}
