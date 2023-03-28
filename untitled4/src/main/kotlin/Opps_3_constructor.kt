fun main(){
    var automobile = Automobile("hero" , "Splender" , false)
    var person1 =   Person1("Vikash" , 18)

    automobile.name;
    person1.age;
    var person2 =  Person1("Vikash"  , 24)
}



class  Automobile(var name : String , var model :String , var isNew: Boolean){
    fun isnew(){

    }

    init {
        println("ysjjdjjdjdj")
    }

    fun isOld(){

    }

   constructor(nameParam: String , ageParam: Int) : this(nameParam ,"Vikash" , true)
}


/**
 * Another constructor
 */

class Person1(nameParam:String , ageParam:Int){
    var name:String = nameParam
    var age:Int = ageParam

}