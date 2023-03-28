fun main() {
    dragObjects(arrayOf(Circle1(4)),Square1(7.44))
}

fun dragObjects(objects: Array<Draggable>, square1: Square1){

    for (obj: Draggable in objects){
        obj.drag()
    }
}


interface Draggable{
    fun drag()
}

abstract class Shape1 : Draggable{
   abstract fun area(): Double

}

class Circle1(var radius: Int ) : Shape1() {
    override fun area(): Double {
        return Math.PI*radius*radius
    }

    override fun drag() {
        TODO("Not yet implemented")
    }

}

class Square1(var side: Double) :Shape1(){
    override fun area(): Double {
        return side*side
    }

    override fun drag() {
        TODO("Not yet implemented")
    }
}