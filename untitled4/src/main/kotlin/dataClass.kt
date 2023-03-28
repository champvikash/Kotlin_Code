fun main(){
    var obj = Playground("Patna" , "Boaringroad")
   println(obj.location)
   println(obj.name)
}



data class Playground(var name:String , var location : String ){

}