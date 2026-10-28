# Exceptions, Files, and I/O

**Level:** Intermediate

## Learning objectives

Handle failures with exceptions and use resource-safe file operations.

## Example

```kotlin
fun parsePort(text: String): Int = try {
    text.toInt().also { require(it in 1..65535) { "Port out of range" } }
} catch (error: NumberFormatException) {
    throw IllegalArgumentException("Port must be a number", error)
}

fun main() {
    println(parsePort("8080"))
}
```

## Exercises

1. Validate user input and report actionable errors.
2. Read a text file using useLines or readText in a local project.
3. Explain when to throw an exception versus returning a nullable/result value.

## Further reading

[Exceptions](https://kotlinlang.org/docs/exceptions.html)
