# Collections

**Level:** Beginner–Intermediate

## Learning objectives

Choose List, Set, and Map; use read-only and mutable interfaces and collection transformations.

## Example

```kotlin
fun main() {
    val names = listOf("Mina", "Dara", "Mina", "Sok")
    val uniqueSorted = names.distinct().sorted()
    println(uniqueSorted.filter { it.length > 3 })
    println(names.associateWith { it.length })
}
```

## Exercises

1. Remove duplicates from a list.
2. Group words by their first character.
3. Demonstrate map, filter, and fold.

## Further reading

[Collections overview](https://kotlinlang.org/docs/collections-overview.html)
