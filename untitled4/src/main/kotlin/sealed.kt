fun main(){

    var title : Title = Red("new" , 6)
    val points: Unit = when (title){
        is Red -> title.points = 3
        is Blue -> title.points = 5
    }
   println(points)
}

/**
 * Sealed classes are used for representing restricted
 * class hierarchies wherein the object or the value
 * can have value only among one of the types,
 * thus fixing your type hierarchies.
 * Sealed classes are commonly used in cases,
 * where you know what a given value to be
 * only among a given set of options.
 */

sealed class Title
class Red(val types: String, var points: Int) :Title()
class Blue(var points: Int) : Title()