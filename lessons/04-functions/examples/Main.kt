fun greet(name: String, punctuation: String = "!"): String = "Hello, $name$punctuation"

fun main() {
    println(greet(name = "Kotlin"))
    println(greet("World", "."))
}
