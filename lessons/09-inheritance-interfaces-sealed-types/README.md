# Inheritance, Interfaces, and Sealed Types

**Level:** Intermediate

## Learning objectives

Use open classes, overrides, interfaces, abstract classes, and sealed hierarchies.

## Example

```kotlin
sealed interface Result
 data class Success(val value: String) : Result
 data class Failure(val message: String) : Result

fun describe(result: Result): String = when (result) {
    is Success -> "Success: ${result.value}"
    is Failure -> "Failure: ${result.message}"
}

fun main() = println(describe(Success("Ready")))
```

## Exercises

1. Create an interface that defines a payment method.
2. Override a base-class method in two subclasses.
3. Model loading, success, and error states with a sealed hierarchy.

## Further reading

[Inheritance](https://kotlinlang.org/docs/inheritance.html)
