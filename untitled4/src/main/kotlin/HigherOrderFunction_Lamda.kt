fun main(){
//    println(sumation(5.5,5.5))
//    println(powerFun(5.3,6.2))

    var fn11:(a:Double , b:Double) ->Double = :: sumation
    println(calcullator1(1.2,3.4, :: sumation))
}


/**
 * Higher order function ->>> function that accept the
 * function or argument or return function or both.
 */

fun sumation(a: Double, b: Double): Double {
    return a+b
}



fun calcullator1(a: Double, b: Double, name111: (Double, Double) -> Double): Double {
    val result : Double = name111(a, b)
    return result
}
