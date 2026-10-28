fun String.initials(): String = split(" ").mapNotNull { it.firstOrNull()?.uppercase() }.joinToString("")

class Logger(private val sink: (String) -> Unit) {
    fun info(message: String) = sink("INFO: $message")
}

fun main() {
    println("Kotlin Language".initials())
    Logger(::println).info("Ready")
}