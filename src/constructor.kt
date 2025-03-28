class Personb(var name: String, var age: Int, var gender: String) {
    fun printDetails() {
        println("name $name, age is $age and gender is $gender")
    }
}

fun main() {
    //initializing the object
    val person1 = Personb("jane",19,"female")
    val person2 = Personb("James",20,"Male")
    //calling the print details method
    person1.printDetails()
    person2.printDetails()
}
