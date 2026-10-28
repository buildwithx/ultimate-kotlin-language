fun parsePort(text: String): Int = try {
    text.toInt().also { require(it in 1..65535) { "Port out of range" } }
} catch (error: NumberFormatException) {
    throw IllegalArgumentException("Port must be a number", error)
}

fun main() {
    println(parsePort("8080"))
}