class Greeting {
    fun message(name: String): String = "Hello, $name"
}

fun main() {
    println(Greeting().message("Kotlin"))
}