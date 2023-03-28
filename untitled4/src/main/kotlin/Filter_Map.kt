fun main(){
    var list1 = listOf<Int>(1,2,3,4,5,6,7)
     println(filterOdd(2))
     println(filterOdd(3))

    var list  = list1.filter (::filterOdd )
    println(list)

    var list2 = listOf(1,2,3,4,5,6,7,8,9)

    val oddNumber = list2.filter { a: Int -> a%2 == 1 }
    println(oddNumber)

    var list3 = listOf(1,2,3,4,5,6,7,8,9)
    val evenNumber = list3.filter { it -> it%2 == 0 }
    println(evenNumber)


    /**
     * map meaning forming one to another form
     */

    var list4 = listOf(1,2,3,4,5,6,7,8,9)
    var multipicaton  = list4.map { it -> it*it }
    println(multipicaton)


    val userList  = listOf(
        User(1, "VIKASH"),
        User(2, "DEEP"),
        User(3, "SURAJ")
    )


    val paidUserList = userList.map {
        PaidUser(it.id , it.name ,"Paid")
    }

    println(paidUserList)


    /**
     * foreach
     */

    var list5 = listOf<Int>(1,2,3,4,5,6,7,8,9)


    list5.forEach{ println(it) }

}

fun filterOdd(a:Int) : Boolean{
        return a%2 == 1
}

class User(var id: Int , var name: String)
class PaidUser(var name: Int, var id: String, val type: String)