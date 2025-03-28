class Car{
    //a class is a blueprint for creating objects
    //it can contain properties(variables) and functions (

    var brand:String=""
    var model:String=""
    var year:Int=0

}
fun main(){
    //creating an object
    //an object is an instance of a class
    val mycar=Car()
    mycar.brand="toyota"
    mycar.model="wish"
    mycar.year=2022

    println(mycar.brand)
    println(mycar.model)
    println(mycar.year)

    //another object
    val mysecondcar=Car()
    mysecondcar.brand="bmw"
    mysecondcar.model="volvo"
    mysecondcar.year=2023

    println(mysecondcar.brand)

}