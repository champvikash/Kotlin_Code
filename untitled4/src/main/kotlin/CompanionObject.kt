fun main(){
    MyObject.MyObj.f()
    MyObject.f()

    MyObject.AnotherObj.g()

}

class MyObject{

    companion object MyObj{
        fun f(){

        }
    }


    object AnotherObj{
        fun g(){

        }

        @JvmStatic
        fun f() {

        }
    }
}















