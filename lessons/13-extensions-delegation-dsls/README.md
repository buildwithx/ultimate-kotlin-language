# Extensions, Delegation, and DSLs

**Level:** Advanced

## Learning objectives

Extend existing types, delegate behavior, and recognize receiver lambdas used in DSLs.

## Example

```kotlin
fun String.initials(): String = split(" ").mapNotNull { it.firstOrNull()?.uppercase() }.joinToString("")

class Logger(private val sink: (String) -> Unit) {
    fun info(message: String) = sink("INFO: $message")
}

fun main() {
    println("Kotlin Language".initials())
    Logger(::println).info("Ready")
}
```

## Exercises

1. Write an extension that safely formats a phone number.
2. Use interface delegation with by.
3. Build a tiny configuration DSL using a lambda with receiver.

## Further reading

[Extensions](https://kotlinlang.org/docs/extensions.html)
