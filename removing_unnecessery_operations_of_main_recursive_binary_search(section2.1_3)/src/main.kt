fun main() {

    var array = arrayOf(12, 34, 45, 57, 82, 99, 120, 134)
    println(recursiveBinarySearch(array, 0, array.size - 1, 12))
}

// I just remove comparing low<high
fun recursiveBinarySearch(array: Array<Int>, low: Int, high: Int, x: Int): Int {
    val avg = (low + high) / 2
    if (x == array[avg])
        return avg
    if (x < array[avg])
        return recursiveBinarySearch(array, low, avg - 1, x)

    return recursiveBinarySearch(array, avg + 1, high, x)
}