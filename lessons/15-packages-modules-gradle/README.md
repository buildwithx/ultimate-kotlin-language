# Packages, Modules, and Gradle

**Level:** Intermediate

## Learning objectives

Organize source files, declare packages, and understand the role of Gradle.

## Example

```kotlin
// File: src/main/kotlin/example/Greeting.kt
package example

fun greeting(name: String): String = "Hello, $name"

// In another file, import example.greeting and call greeting("Kotlin").
```

## Exercises

1. Split a small program across two packages.
2. Create a Kotlin/JVM project in IntelliJ IDEA.
3. Identify where dependencies, plugins, and test tasks are configured in build.gradle.kts.

## Further reading

[Gradle](https://kotlinlang.org/docs/gradle.html)
