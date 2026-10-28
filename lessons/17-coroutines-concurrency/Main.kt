// Requires kotlinx-coroutines-core in a configured Gradle project.
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

suspend fun loadName(): String {
    delay(100)
    return "Kotlin"
}

fun main() = runBlocking {
    val name = async { loadName() }
    println("Hello, ${name.await()}")
}