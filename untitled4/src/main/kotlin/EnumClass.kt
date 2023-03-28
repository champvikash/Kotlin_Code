fun main(){
  val day  = Day.MONDAY
//    println(day)
//
//    for (i:Day in Day.values()){
//        println(i)
//    }
    day.printFormateDay()
}

/**
 * What is an enum in Kotlin?
Kotlin Android. Enums are special classes which limit the possible values of
an object for that class.
The possible values defined for that class are final or unchangeable.
The easiest way to define an enum is. enum class Direction {
 */
enum class Day(var number: Int){
    SUNDAY(1),
    MONDAY(1),
    TUESDAY(1),
    WEDNESDAY(1),
    THURSDAY(1),
    FRIDAY(1),
    SUTURADAY(1);

    fun printFormateDay(){
        println("this is $this")
    }
}