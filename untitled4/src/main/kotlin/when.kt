fun main(){
    var animal = "dog"

//    if(animal == "cat"){
//        println("animal is dog")
//    } else if (animal == "dog"){
//        println("animal is dog")
//    } else if(animal == "horse"){
//        println("animal is horse")
//    } else{
//        print("animal is not bound")
//    }

    when(animal){
        "horsr" -> println("animal is horse")
        "dog" -> println("animal is dog")
        "cat" -> println("animal is cat")
        else -> println("animal in not bound")
    }


    /**
     * another way to write when condition
     *
     */


    var result =    when(animal){
        "horsr" -> "animal is horse"
        "dog" -> "animal is dog"
        "cat" -> "animal is cat"
        else -> "animal in not bound"
    }

    println(result)



    /**
     * another example of when
     * */
    var number = 10
    var result1 =    when(number){
        11 -> "the number is 11"
        12 -> "the number is 12"
        in 9..15 -> "the number teen"
        else -> "number is unbound"
    }

    println(result1)



}