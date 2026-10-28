# Capstone Projects

**Level:** Practical

## Learning objectives

Combine language fundamentals into a documented, testable, maintainable application.

## Example

```kotlin
data class Task(val id: Int, val title: String, val completed: Boolean = false)

class TaskManager {
    private val tasks = mutableListOf<Task>()
    fun add(title: String): Task {
        require(title.isNotBlank()) { "Title cannot be blank" }
        val task = Task(id = tasks.size + 1, title = title.trim())
        tasks += task
        return task
    }
    fun all(): List<Task> = tasks.toList()
}

fun main() {
    val manager = TaskManager()
    manager.add("Study Kotlin")
    println(manager.all())
}
```

## Exercises

1. Choose one brief in the projects folder and write acceptance criteria.
2. Separate domain logic from input/output.
3. Add automated tests, input validation, a README, and a short design rationale.

## Further reading

[Getting started](https://kotlinlang.org/docs/getting-started.html)
