import kotlin.math.min

fun binomialCoefficientInMyOpinion(n: Int, k: Int) {
    var k = k
    k -= 1
    var factK = 1
    var factN = 1
    var factK_N = 1
    for (i in 1..n){
        if (i <= k)
            factK *= i
        if (i <= n-k)
            factK_N *= i
        factN *= i
    }
    println(factN)
    println(factK)
    println(factK_N)
    println((factN)/(factK * factK_N))
}

fun binomialCoefficient(n: Int, k: Int){
    var k = k
    k --
    var array = Array(n+1){ IntArray(k+1) }
    //(ArrayList<Int>(), ArrayList<Int>())
    for (i in 0..n){
        for (j in 0..min(i , k)){
            if (j == 0 || j == i )
                array[i][j] = 1
            else
                array[i][j] = array[i-1][j-1] + array[i-1][j]
            print(array[i][j] )
            print("  ")
        }
        println()
    }
    println(array[n][k])
}

fun main(){
    binomialCoefficientInMyOpinion(4, 3)

    binomialCoefficient( 4, 3)
}
