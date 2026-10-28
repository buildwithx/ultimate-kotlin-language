# Functions

**Level:** Beginner

## Learning objectives

Declare functions, parameters, return types, default arguments, named arguments, and single-expression functions.

## Example

```kotlin
fun greet(name: String, punctuation: String = "!"): String = "Hello, $name$punctuation"

fun main() {
    println(greet(name = "Kotlin"))
    println(greet("World", "."))
}
```

## Exercises

1. Create a Celsius-to-Fahrenheit conversion function.
2. Create a function with a default parameter.
3. Write a function that returns the larger of two integers.

## Further reading

[Functions](https://kotlinlang.org/docs/functions.html)
