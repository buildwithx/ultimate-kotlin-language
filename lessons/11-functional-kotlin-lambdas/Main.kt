fun calculate(values: List<Int>, operation: (Int) -> Int): List<Int> = values.map(operation)

fun main() {
    val doubled = calculate(listOf(1, 2, 3)) { it * 2 }
    println(doubled)
    val name = "kotlin".replaceFirstChar(Char::uppercase)
    println(name)
}