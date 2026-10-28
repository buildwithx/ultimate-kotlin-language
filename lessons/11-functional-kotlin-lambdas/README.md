# Functional Kotlin and Lambdas

**Level:** Intermediate

## Learning objectives

Use lambdas, higher-order functions, function types, and scope functions deliberately.

## Example

```kotlin
fun calculate(values: List<Int>, operation: (Int) -> Int): List<Int> = values.map(operation)

fun main() {
    val doubled = calculate(listOf(1, 2, 3)) { it * 2 }
    println(doubled)
    val name = "kotlin".let { it.replaceFirstChar(Char::uppercase) }
    println(name)
}
```

## Exercises

1. Write a higher-order function that filters values by a predicate.
2. Compare let, run, apply, also, and with using short examples.
3. Pass a named function reference to map.

## Further reading

[Higher-order functions](https://kotlinlang.org/docs/lambdas.html)
