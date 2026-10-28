# Idiomatic Kotlin and Design

**Level:** Advanced

## Learning objectives

Prefer clear immutable models, expressive standard-library operations, and small testable functions.

## Example

```kotlin
data class CartItem(val name: String, val price: Double, val quantity: Int)

fun total(items: List<CartItem>): Double = items.sumOf { it.price * it.quantity }

fun main() {
    val items = listOf(CartItem("Notebook", 2.5, 2), CartItem("Pen", 1.0, 3))
    println("Total: ${total(items)}")
}
```

> **Setup note:** Some examples require the Gradle dependencies or multiplatform source sets noted in the comments. They are not all standalone single-file programs.

## Exercises

1. Refactor a mutable loop into map/filter/sumOf where clarity improves.
2. Replace magic strings with an enum or sealed type.
3. Review a class for single responsibility and testability.

## Further reading

[Idioms](https://kotlinlang.org/docs/idioms.html)
