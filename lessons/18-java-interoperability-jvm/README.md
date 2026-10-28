# Java Interoperability and JVM

**Level:** Advanced

## Learning objectives

Understand JVM compilation and call Java and Kotlin code across language boundaries.

## Example

```kotlin
// Kotlin: Greeting.kt
class Greeting {
    fun message(name: String): String = "Hello, $name"
}

// Java callers can use: new Greeting().message("Kotlin")
// In a Gradle JVM project, compile Kotlin and Java sources together.
```

> **Setup note:** Some examples require the Gradle dependencies or multiplatform source sets noted in the comments. They are not all standalone single-file programs.

## Exercises

1. Call a Java utility from a Kotlin project.
2. Inspect generated JVM signatures in your IDE.
3. Explain platform types and why Java nullability annotations matter.

## Further reading

[Java interoperability](https://kotlinlang.org/docs/java-interop.html)
