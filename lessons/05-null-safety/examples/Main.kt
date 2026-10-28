fun displayLength(value: String?) {
    val length = value?.length ?: 0
    println("Length: $length")
}

fun main() {
    displayLength("Kotlin")
    displayLength(null)
}