# Variables and Basic Types

**Level:** Beginner

## Learning objectives

Use val and var, infer types, and work with numbers, booleans, characters, and strings.

## Example

```kotlin
fun main() {
    val language = "Kotlin"
    var year = 2026
    year += 1
    val isFun: Boolean = true
    println("$language in $year: $isFun")
}
```

## Exercises

1. Declare an immutable val and a mutable var.
2. Try Int, Long, Double, Char, Boolean, and String values.
3. Explain why val does not make a referenced object deeply immutable.

## Further reading

[Types overview](https://kotlinlang.org/docs/types-overview.html)
