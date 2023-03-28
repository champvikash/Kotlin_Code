fun main(){
    var value = 5
    while (value >0)
    {
        println("hello")
        value--
    }

    // table of 2
    var value1 = 2
    var index =1
    while (index <=10 )
    {
        println(index*value1)
        index++
    }


    /***?
     *Do while loop
     */

    val num = 5

    do {
        println("hello")
    } while (num>5)


    var tableof2 = 2
    var idx =  1

    do {
        println(tableof2 * idx)
        idx++
    } while (idx <=10)

    /**
     * for loop
     */

    for (i in 1..5){
        println(i)
    }

    for (i in 1..5 step 2){
        println(i)
    }

    println("Until")
    for (i in 1 until 5){
        println(i)
    }

    // from end

    for (i in 10 downTo 1){
        println(i)
    }

    for (i in 10 downTo 1 step 2){
        println(i)
    }

    var num2 = 2
    for (i in 1..10){
        println(num2*i)
        println(num2.toString() +"*"+ i + "=" +num2*i )
       println("$num2* $i = $(num2*i)")
    }

}