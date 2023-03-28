fun main(){

    var circle : Shape = Circle(5)
    var square: Shape = Square(10.0)

    println(circle.area())
    println(square.area())


}

/**
 * Parent can hold the reference to its child and called Method of
 * the child class
 */

open class Shape{
    open fun area() : Double{
        return 0.0
    }
}

class Square(var side:Double) : Shape(){
    override fun area(): Double {
        return side*side
    }

}

class Circle(var radius: Int) : Shape(){
    override fun area(): Double {
        return Math.PI*radius*radius
    }
}