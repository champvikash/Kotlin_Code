fun main(){
     var science = Science("Biology")
    println(science.chapter())

}


abstract class Subject{
     abstract var name : String
     abstract fun chapter() : Double
     abstract fun display()
}

class Science(var chap : String) : Subject(){
    override fun chapter(): Double {
        return 6*98.3
    }

    override fun display() {
        TODO("Not yet implemented")
    }

    override  var name: String = "Vikash"


}
