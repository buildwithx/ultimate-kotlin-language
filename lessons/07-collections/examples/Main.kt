fun main() {
    val names = listOf("Mina", "Dara", "Mina", "Sok")
    val uniqueSorted = names.distinct().sorted()
    println(uniqueSorted.filter { it.length > 3 })
    println(names.associateWith { it.length })
}