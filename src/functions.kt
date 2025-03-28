fun main(){
    /*
    functions are block of reversable code that perfoms specific tasks
     */

    println("hello from the main function")
    //calling the function
    greet()
    greet()
    myfunction("Luke")
    myfunction("Jane")
    sayhello("Alice",25)
    sayhello("Bob",30)

}
//creating function
fun greet() {
    println("hello good morning")
}
//a function with parameters
//parameters are way of passing information to a function
fun myfunction(fname:String) {
    println("hello good morning $fname")
}
//a function with multiple parameters
fun sayhello(name:String,age:Int){
    println("hello my name is $name and i am $age years old")
}
//function with a return keyword
fun addtwonumbers(a:Int,b:Int):Int{
    return a+b
}
//function that multiplies two numbers
//shorter syntax for return values
fun multiply(x:Int,y:Int)=x*y
//function that returns true if the number is  even else false
//function that finds the largest of three numbers