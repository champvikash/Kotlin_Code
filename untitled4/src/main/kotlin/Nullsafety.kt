fun main(){
    var gender1 : String = "Male"
    var gender2 : String? =  null
    var gender3 : String? = null

    if(gender1 != null){
        println("this is not null")
    }

    if (gender2 != null){
        println("this is not null geneder2")

    }
    println(gender2?.toUpperCase())

    gender2?.let {
        println("line number 1")
        println("line number 2")
        println("line number 3 $gender2")
        println("line number 4 $it")
    }

    var selectedVal  = gender2 ?: "Na"
    /**
     * "?:" is called elvish operator
     * if geneder2 val is not null then
     * print the val , if null then put the "NA" string
     *
     */
    println(selectedVal)

    /**
     * Asserted operator it is using for the
     * run the nullable val
     *  sign using for the asserted operator -->  !!
     *  if val is not null or not null function call
     */

    var selectedVal2  = gender2!!.toUpperCase()
}

