fun main(){
    var A =  object : Clonable {
        override fun runningAway() {
            TODO("Not yet implemented")
        }

    }
    /**
     * Here we are making a interface
     * we know interface body difined in class
     * but one more property know in kotlin you can directly made
     * object without implementing of the class
     *     var A =  object : Clonable {
           override fun runningAway() {
           TODO("Not yet implemented")
            }

    }
     */
    A.runningAway();



    var obj3 = object : Ground("edenGarden"){
        override fun Kolkatta(){
            println("Good")
        }
    }

  println(obj3.Kolkatta())

}


interface Clonable {
    fun runningAway()
}


/**
 * Another Example of the sington pattern
 */

open class Ground(var name: String){
    open fun Kolkatta(){
        println("is good ground")
    }
}