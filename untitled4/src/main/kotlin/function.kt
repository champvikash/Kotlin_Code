fun main(){

    val result=add(1,2)
    println(result)

    oddOreven(10)
    oddOreven(11)


    var result1 = sum1(1,2)
    var result2 = sum2(1,2)


    println(result1)
    println(result2)

    printMessage(5);
    printMessage()

}

fun add(num1:Int , num2:Int) : Int
{
    val  sum = num1+num2
    return sum

}

fun oddOreven(num1: Int)
{
    val result = if (num1%2 == 0) "num is even"  else "num is odd"
    println(result)
}

/**
 * Another way to defind the function
 * Inline Function
 */


fun sum1(number1 : Int , number2 : Int): Int  = number1 + number2

fun sum2(number3: Int , number4: Int)  = number3+number4


fun printMessage(count : Int = 3){
    for(i in 1..count)
        println("hello $i")
}