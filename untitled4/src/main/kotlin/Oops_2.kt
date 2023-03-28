fun main(){
    var p1 = Person("Vikash" , 24)
    var p2 = Person("Raunak" , 9)

    p1.canVote();
    p2.canVote();
}


class Person(var name: String , var age : Int){   // properties

    fun canVote(){
        if (age >= 18){
            println("Congrats you can cast vote")
        } else{
            println("sorry! you can not cast vote ")
        }
    }
}