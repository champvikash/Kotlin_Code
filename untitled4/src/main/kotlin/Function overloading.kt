fun main(){
    var result1 = add1(1,2)
    var result2=add1(1,2,3)
    println(result1)
    println(result2)



    // Name argument
    var result3 =  add1(num1 = 5 , num2 = 10)
    var result4 =  add1(num2 = 10 , num1 = 5)

    println(result3)
    println(result4)

    var result5 = :: addition
    result5(5, 10)

    println(result5)



}


fun add1(num1: Int , num2: Int) : Int{
    val result = num1 + num2
    return result
}

fun add1(num1: Int , num2: Int , num3: Int) : Int{
    val result = num1 + num2+ num3
    return result
}

fun addition(a: Int , b: Int){
    var sum = a+b

}

// you can also store function in var with the help of ::