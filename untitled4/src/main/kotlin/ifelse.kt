fun main(){

    var a = 5
    var b = 10

    if(a>b){
        println("a is greater than b")
    } else if (a < b) {
        print("a is less than b")
    } else {
        println("a is equal to b")
    }

    /***
     * Another way to write this code
     *
     * ****/

    var x = 10
    var y = 20

    var result =  if (x>y){
        "x is greater than y"
    } else if (x<y) {
        "x is less than y"
    } else {
         "x is equal to y"
    }
    println(result)

    /***
     * Another way to write this code
     *
     * ****/

    var values = 21

    var result1 = if (values%2 == 0) "this is even"  else "this is odd number"

    println(result1)



}