fun fibonacci(n: Int): Int {
    var f1 = 0
    var f2 = 1
    var f3 = 0
    if (n == 0)
        return f1
    else if (n == 1)
        return f2
    else {
        for (i in 0..n) {
            f3 = f1 + f2
            f1 = f2
            f2 = f3
        }
        return f3
    }
}

fun main (){
    println(fibonacci(3))
    println(fibonacci(4))
    println(fibonacci(5))
    println(fibonacci(2))
}