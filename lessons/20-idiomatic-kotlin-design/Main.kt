data class CartItem(val name: String, val price: Double, val quantity: Int)

fun total(items: List<CartItem>): Double = items.sumOf { it.price * it.quantity }

fun main() {
    val items = listOf(CartItem("Notebook", 2.5, 2), CartItem("Pen", 1.0, 3))
    println("Total: ${total(items)}")
}