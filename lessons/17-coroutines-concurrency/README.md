# Coroutines and Concurrency

**Level:** Advanced

## Learning objectives

Understand suspending functions, structured concurrency, dispatchers, and cancellation.

## Example

```kotlin
// Requires kotlinx-coroutines-core in a configured Gradle project.
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
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
```

> **Setup note:** Some examples require the Gradle dependencies or multiplatform source sets noted in the comments. They are not all standalone single-file programs.

## Exercises

1. Explain the difference between suspending and blocking.
2. Run two independent suspend functions concurrently with async.
3. Explore cancellation and structured concurrency; avoid GlobalScope for normal application work.

## Further reading

[Coroutines guide](https://kotlinlang.org/docs/coroutines-guide.html)
