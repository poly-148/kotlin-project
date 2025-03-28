/*create a class person that has the following properties; name,age,gender,hobby,course
    create an object of the class and initialize it with its values
    add a method called printDetails() in person class that prints the details of the person
     */
class Person{
    var name: String=""
    var gender:String=""
    var age:Int=0
    var hobby:String=""
    var course:String=""
    fun displayinfo(){
        println("My name is $name, I am a  $gender, I am $age years old, my hobby is $hobby and i am undergoing a $course course.")
    }
}

fun main(){
    val myperson=Person()
    myperson.name="Pauline"
    myperson.gender="Female"
    myperson.age=20
    myperson.hobby="Dancing"
    myperson.course="cybersecurity"

    println(myperson.name)
    println(myperson.gender)
    println(myperson.age)
    println(myperson.hobby)
    println(myperson.course)
    //calling the method
    myperson.displayinfo()



}