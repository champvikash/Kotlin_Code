fun main(){
     calculator1111(2,3) { a, b -> a + b }
}

fun math1(a:Int, b:Int): Int {
    return a+b
}

fun calculator1111(a:Int, b:Int ,op: (Int,Int) -> Int): Int {
    return op(1,2)
}