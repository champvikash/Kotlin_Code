fun main(){
     var phone = Phone("Nokia" , "Simple" , 1200)
    println(phone.price)
    phone.price = 1300
    println(phone.price)
    phone.price=-122

}

class Vehicle{
    /***
     * lateinit is a keyword you can initilize the property after some time later instead of now
     *
     */
    lateinit var name:String

    fun getVal(){
        println("get val")
    }

    fun getName(){
        println("get name")
    }
}


class Phone(nameParam:String, modeleParam: String , priceParam:Int){
    var name:String = nameParam
    get() {
        return field.toUpperCase()
    }
    var model:String = modeleParam
    var price: Int = priceParam
    set(value) {
        if(value>0){
            field = value
        } else {
            print("this is val is not possible")
        }
    }
}