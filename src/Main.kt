//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Hello goodmorning")
    print("Hello")
    print("kotlin")
    //variables
    //val declares a variable whose value does not change
    //immutable /readonly variable
    val fname = "Pauline"
    val age = 20
    //var declares a variable whose value can change.mutable(changeble) variable
    var course = "cybersecurity"
    println(fname)
    println(age)
    println(course)
    course = "fullstack"
    print(course)
    //display string and variables
    print("my name is"  +  fname)
    println(" i am " + age + " years old")
    println("i am learning "+ course)
    //string interploation
    print("my name is $fname and i am $age years old")

}

