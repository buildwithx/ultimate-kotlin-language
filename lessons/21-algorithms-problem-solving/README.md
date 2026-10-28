# Algorithms and Problem Solving

**Level:** All levels

## Learning objectives

Build a repeatable problem-solving process and analyze time/space complexity.

## Example

```kotlin
fun binarySearch(values: List<Int>, target: Int): Int {
    var low = 0
    var high = values.lastIndex
    while (low <= high) {
        val mid = low + (high - low) / 2
        when {
            values[mid] == target -> return mid
            values[mid] < target -> low = mid + 1
            else -> high = mid - 1
        }
    }
    return -1
}

fun main() = println(binarySearch(listOf(1, 3, 5, 7, 9), 7))
```

## Exercises

1. Implement linear search and compare its complexity with binary search.
2. Solve two-sum using a map.
3. For each solution, state its time and space complexity and test empty/boundary inputs.

## Further reading

[Kotlin standard library](https://kotlinlang.org/api/)
