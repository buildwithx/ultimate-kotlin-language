# Testing and Debugging

**Level:** Intermediate

## Learning objectives

Write unit tests, use assertions, and debug with reproducible examples.

## Example

```kotlin
// Example test using kotlin.test in a configured Gradle project.
import kotlin.test.Test
import kotlin.test.assertEquals

class CalculatorTest {
    private fun add(a: Int, b: Int) = a + b

    @Test
    fun addsTwoNumbers() {
        assertEquals(7, add(3, 4))
    }
}
```

> **Setup note:** Some examples require the Gradle dependencies or multiplatform source sets noted in the comments. They are not all standalone single-file programs.

## Exercises

1. Add tests for valid and invalid inputs to one earlier exercise.
2. Test both normal behavior and boundary cases.
3. Use a debugger breakpoint to inspect a variable's value.

## Further reading

[Kotlin testing](https://kotlinlang.org/docs/jvm-test-using-junit.html)
