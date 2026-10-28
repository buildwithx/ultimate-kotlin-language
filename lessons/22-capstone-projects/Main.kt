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