import java.lang.IllegalArgumentException
import kotlin.concurrent.thread

fun main(){
     positiveNumber(5)
     positiveNumber(-1)
}

fun positiveNumber(count : Int){
    if(count<0){
        throw IllegalArgumentException("Count must be Greater than zero")
    } else{
        print("list created $count")
    }
}