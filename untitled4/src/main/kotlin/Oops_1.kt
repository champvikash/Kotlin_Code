fun main(){
   var mustang = Car("BMW", "Diesel" , 100)
    var mustang1 =  Car("Ciaz" , "petrol" , 200)

    mustang.drive();
    mustang1.applyBreak();
    println(mustang.kmRan)
    println(mustang.name)
    println(mustang.type)
    mustang1.drive()
}

class Car(val name: String , val type : String , var kmRan : Int){

    fun drive(){
        println("this is run 40km")
    }

    fun applyBreak(){
        println("appplied break")
    }
}