import java.lang.Integer.max

fun main() {
    val array = arrayOf(70, 250, 50, 80, 140, 12, 14)
    println(findMax(array, 0, array.size - 1))
}

fun findMax(array: Array<Int>, low: Int, high: Int): Int {
    return if (low == high)
        array[low]
    else {
        val avg = (high + low)/2
        (max(findMax(array, low, avg), findMax(array, avg+1 , high)))
    }
}

//fun DAC_Max(a: IntArray, index: Int, l: Int): Int {
//    val max: Int
//    if (l - 1 == 0) {
//        return a[index]
//    }
//    if (index >= l - 2) {
//        return if (a[index] > a[index + 1]) a[index] else a[index + 1]
//    }
//
//    // Logic to find the Maximum element
//    // in the given array.
//    max = DAC_Max(a, index + 1, l)
//    return if (a[index] > max) a[index] else max
//}
//
