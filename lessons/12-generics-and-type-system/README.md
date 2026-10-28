# Generics and Type System

**Level:** Intermediate–Advanced

## Learning objectives

Create reusable generic functions and classes; understand variance and type constraints.

## Example

```kotlin
class Box<T>(val value: T)

fun <T : Comparable<T>> maxOfTwo(a: T, b: T): T = if (a >= b) a else b

fun main() {
    println(Box("Kotlin").value)
    println(maxOfTwo(8, 12))
}
```

## Exercises

1. Create a generic PairBox holding two values of potentially different types.
2. Add a type constraint to a generic function.
3. Research out and in variance and explain a use case for each.

## Further reading

[Generics](https://kotlinlang.org/docs/generics.html)
