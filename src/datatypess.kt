fun main() {
    //strings-represents a sequence pf characters
    val lname="mark"
    val hobbie:String="reading"

    print("my name is $lname and i like $hobbie")
    /*numeric datatypes-Byte,short,Int,long,float,double
    Int-whole numbers */
    val age:Int=19
    println("i am $age years old")
    //double-numbers with decimal places
    val tax:Double=10.35
    print("the tax rate is $tax")
    //FLOAT-must be declared with an f
    val x:Float=21.69f
    println("my float number $x")
    val mynum:Byte=124
    print(mynum)
    val myshortnum:Short=1200
    println(myshortnum)
    val mylongnum:Long=122000000L
    println(mylongnum)
//char-contains a single character
    val grade:Char='A'
    println("i achieved a grade $grade in maths")
    //boolean stores true or false
    val isstudent=true
    println("is Grace a student? $isstudent")
    //array -a fixed size collecion of elements
    val subjects= arrayOf("python","html","css","kotlin","bootstrap")
    print("my subjects include ${subjects.joinToString()}")
    //typeconversion toDouble(),tiInt(),toString(),toFloat()
    val a:Float=33.7889F
    println(a)
    val mynewint=a.toInt()
    print(mynewint)
}