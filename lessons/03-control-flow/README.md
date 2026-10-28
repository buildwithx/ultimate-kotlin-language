# Control Flow

**Level:** Beginner

## Learning objectives

Use if, when, loops, ranges, and early returns to control execution.

## Example

```kotlin
fun main() {
    val score = 82
    val grade = when {
        score >= 90 -> "A"
        score >= 80 -> "B"
        score >= 70 -> "C"
        else -> "Needs improvement"
    }
    println(grade)
    for (number in 1..5) println(number)
}
```

## Exercises

1. Write a when expression for a day number.
2. Print numbers from 10 down to 1.
3. Use a loop to calculate the sum of 1 through 100.

## Further reading

[Control flow](https://kotlinlang.org/docs/control-flow.html)
