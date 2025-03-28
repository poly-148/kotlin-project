/*while loop loops through a block of code a slong as the specified condition is true
while(condition){
//block of code to executed
}
 */
fun main() {
var x = 1
while(x <= 5){
    println("the value of x is:$x")
    x++
    }
    /*do ..while
    do{
    //block of code to be executed
    }while(condition)
      */
    //validating pin entry
    var pin: String
    do{
        println("please enter your 4 -digit pin:")
        pin= readln()
    }while(pin.length!=4|| pin.toIntOrNull()==null)
    println("pin accepted")
    //SIMPLE COUNTER
    var counter=1
    do {
        println("counter: $counter")
        counter++
    }while(counter<=5)
}