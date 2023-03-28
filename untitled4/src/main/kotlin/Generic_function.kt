fun main(){
     var obj1 = IntContainer(5)
     var obj2 = StrigContainer("Vikash")
     var obj3 = Container<String>("Suraj")
     var obj4 = Container<Int>(85)
     obj1.data
}

class Container<T>(var data:T){
    fun setValue(value: T): T {
        return value
    }

    fun getValue() : T{
        return data
    }
}


class IntContainer(var data: Int) {
    fun get(value : Int){
        data  = value

    }
}

class StrigContainer(var data: String) {
    fun get(value : String){
        data  = value

    }
}