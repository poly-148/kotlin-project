fun main(){
//operators
//arithmetic operators
    val a = 30
    val b = 20
    println("the sum of $a and $b is ${a + b}")
    println("the difference of $a and $b is ${a - b}")
    println("the product of $a and $b is ${a * b}")
    println("the division of $a and $b is ${a / b}")
    println("the modulus of $a and $b is ${a % b}")
    //comparison operators >,<,==,>=,<=,!=
    println("is $a equal to $b? ,${a==b}")
    println("is $a greater than $b? ,${a>b}")
    println("is $a less than $b? ,${a<b}")
    println("is $a not equal to $b? ,${a!=b}")
    //logical operators AND &&,OR ||,NOT !
    val x=true
    val y=false
    println(x&&y)
    println(x||y)
    println(!x)

    //increment and decrement ++ --
    var z=5
    z++
    println(z)
    //decrement
    z--
    println(z)
}