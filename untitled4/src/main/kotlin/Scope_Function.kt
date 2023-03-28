fun main(){
    var emp =  Employee("Viaksj" ,  55)
        emp.name = "SKKSKSK"
        emp.age = 55
//
//    var x: Employee = emp.also {
//        name =  "Suraj"
//        age  = 33
//    }

    emp.let {
        it.name = "sjkdkk"
        it.age = 34
    }

    with(emp){
        age  = 30
        name = "ajksk"
    }

    emp.run {
        age  = 34
        name = "dkdkdkdkdkdk"
    }

}

data class Employee(var name: String , var age: Int)