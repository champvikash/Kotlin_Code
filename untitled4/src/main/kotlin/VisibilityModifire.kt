


/** 1.Public
 * these are the public Visibility modifier
 * you can call from the other modifier
 *
 */
var a  = 5
fun gn(a: Double, b: Double): Double {
return 0.0
}

/**
 * 2.internal
 * internal behave like public but within the module
 *
 */

internal var b = 5
internal fun cn(){

}

/**
 * 3.Private
 *You can not access from the other file
 */

private var c = 20
private fun pn(){

}

private class A{

}

fun main(){
    val obj1 = X()
    val obj2 = Y()

    obj1.p
    obj2.q
    obj1.p
    obj2.q
}

open class X{
    public var p = 10
    internal var q= 20
    private var r = 30
    protected var s = 40
}

class Y : X(){
    fun test(){
        println(p)
        println(q)
//        println(r)
        println(s)
    }
}