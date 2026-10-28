# Kotlin Multiplatform Overview

**Level:** Advanced

## Learning objectives

Understand shared code, source sets, platform-specific implementations, and project trade-offs.

## Example

```kotlin
// Common source set: commonMain
expect fun platformName(): String

fun greeting(): String = "Hello from ${platformName()}!"

// Each target provides an actual implementation of platformName().
```

> **Setup note:** Some examples require the Gradle dependencies or multiplatform source sets noted in the comments. They are not all standalone single-file programs.

## Exercises

1. Compare sharing business logic with sharing UI.
2. Sketch commonMain and one platform-specific source set.
3. Follow the official quickstart to create a real KMP project.

## Further reading

[Kotlin Multiplatform](https://kotlinlang.org/docs/multiplatform.html)
