import java.lang.Exception

fun main(){
    var arr:Array<Int> = arrayOf(1,2,3,4)
    try {
       println(arr[5])
    }
    catch (ex:NullPointerException){

    }

    catch (e: Exception){
         println("please chech the array index")
    }

    finally {
         println("i will excute no matter what will")
    }

    println("this is no run")
}