fun main(){
    var arr = arrayOf(1,2,3,4,5)
    var arr1 = arrayOf("Vikash","deep","Suraj")
    var arr2 = arrayOf<Char>('a','v','c')

    for (i:String in arr1){
        println(i)
    }

    for (i:Char in arr2){
        println(i)
    }

    for (i: Int in arr){
        println(i)
    }


    for ((i:Int , e:String) in arr1.withIndex()){
        println("$i -  $e")
    }

    //  Index

    println(arr1[0])
    println(arr1.get(0))

    arr1.set(0,"hello")
    println()
    println(arr1.get(0))

    println(arr1.size)





}