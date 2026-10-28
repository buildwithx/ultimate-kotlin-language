class Rectangle(val width: Double, val height: Double) {
    val area: Double get() = width * height
    fun isSquare(): Boolean = width == height
}

fun main() {
    val shape = Rectangle(4.0, 4.0)
    println(shape.area)
    println(shape.isSquare())
}