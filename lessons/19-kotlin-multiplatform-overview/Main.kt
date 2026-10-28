// Conceptual common-source example. A real KMP project needs platform-specific actual implementations.
expect fun platformName(): String

fun greeting(): String = "Hello from ${platformName()}!"