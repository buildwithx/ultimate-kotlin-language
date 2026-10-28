# Object Declarations and Data Classes

**Level:** Intermediate

## Learning objectives

Use data classes, object declarations, companion objects, and enums.

## Example

```kotlin
data class User(val id: Int, val name: String)

object IdGenerator {
    private var nextId = 1
    fun next(): Int = nextId++
}

fun main() {
    val first = User(IdGenerator.next(), "Dara")
    val renamed = first.copy(name = "Mina")
    println(first)
    println(renamed)
}
```

## Exercises

1. Compare two data-class instances for equality.
2. Use copy() to update one property.
3. Create an enum for order status.

## Further reading

[Data classes](https://kotlinlang.org/docs/data-classes.html)
