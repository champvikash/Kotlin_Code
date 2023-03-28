fun main(){
    var num = mutableListOf(1,2,3)
    println(num)
    num[1] = 2
    num.add(2,2)
    num.remove(1)

    var list2  = listOf<Int>(1,2,3)
    num.addAll(list2)
    println(num)
}