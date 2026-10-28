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