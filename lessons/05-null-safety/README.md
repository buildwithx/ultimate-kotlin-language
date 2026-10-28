# Null Safety

**Level:** Beginner

## Learning objectives

Model optional values with nullable types, safe calls, Elvis operators, and smart casts.

## Example

```kotlin
fun displayLength(value: String?) {
    val length = value?.length ?: 0
    println("Length: $length")
}

fun main() {
    displayLength("Kotlin")
    displayLength(null)
}
```

## Exercises

1. Write a nullable String and safely print its length.
2. Parse text as an integer using toIntOrNull().
3. Explain ?., ?:, and !!; prefer safe handling over !!.

## Further reading

[Null safety](https://kotlinlang.org/docs/null-safety.html)
