# Strings, Ranges, and Arrays

**Level:** Beginner

## Learning objectives

Format strings, use ranges, and understand arrays.

## Example

```kotlin
fun main() {
    val name = "Kotlin"
    println("${name.uppercase()} has ${name.length} letters")
    for (n in 2..10 step 2) print("$n ")
    println()
    val scores = intArrayOf(8, 9, 10)
    println(scores.sum())
}
```

## Exercises

1. Create a multiline string and trim its indentation.
2. Print odd numbers from 1 through 19.
3. Find the minimum and maximum of an integer array.

## Further reading

[Basic syntax](https://kotlinlang.org/docs/basic-syntax.html)
