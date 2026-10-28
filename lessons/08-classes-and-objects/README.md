# Classes and Objects

**Level:** Intermediate

## Learning objectives

Define classes, properties, constructors, methods, and computed properties.

## Example

```kotlin
class Rectangle(val width: Double, val height: Double) {
    val area: Double get() = width * height
    fun isSquare(): Boolean = width == height
}

fun main() {
    val shape = Rectangle(4.0, 4.0)
    println(shape.area)
    println(shape.isSquare())
}
```

## Exercises

1. Create a Book class with title and author.
2. Add a computed property to a class.
3. Explain primary constructors and property getters.

## Further reading

[Classes](https://kotlinlang.org/docs/classes.html)
