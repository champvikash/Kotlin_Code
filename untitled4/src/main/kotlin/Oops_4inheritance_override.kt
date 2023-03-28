fun main(){
var student1 = Student1()
    student1.getDispley();


}

  open class Student{
      open var name  = "Vikash"
      open var rollnumber = "89"

     open fun getDispley(){
         println("5inch display")
       }
   }

   class Student1 : Student(){
       @Override
       override fun getDispley() {
           super.getDispley()
           println("Not 5 inch display 6 inch display")
       }

       override var name: String =  "Kumar"
       override var rollnumber: String = "90"




   }