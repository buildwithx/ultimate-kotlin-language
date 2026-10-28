data class User(val id: Int, val name: String)

object IdGenerator {
    private var nextId = 1
    fun next(): Int = nextId++
}

fun main() {
    val first = User(IdGenerator.next(), "Dara")
    val renamed = first.copy(name = "Mina")
    println(first)
    println(renamed)
}