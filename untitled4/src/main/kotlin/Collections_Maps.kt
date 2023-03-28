fun main(){
   var student = mutableMapOf<Int, String>()

    student.put(1, "Vikash")
    student.put(2,"suraj")
    student.put(3,"Deep7")

    println(student[1])
    println(student.get(2))

    for ((key,value ) in student){
        println("$key - $value")
    }

    student[8] = "Vikas"
    println(student[8])


}