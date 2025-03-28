fun main() {
    //lambda expression is an anonymous function that can eb assigned to a variable
    val sum:(Int,Int)->Int = { a,b -> a+b }
    println(sum(40,90))
    //lambda expression that multiplies two  numbers
    val prod:(Int,Int)->Int ={x,y -> x*y }

    println("the product of 5 and 4 is ${prod(5,4)}")
    val greet:(String)->String={name ->"hello $name"}
    println(greet("Paul"))
}