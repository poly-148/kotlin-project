/*if used to specify a block of code tobe executed if a given condition is true.
if (condition){
// block of code to be executed if condition is true
}
*/
fun main() {
    val age = 20
    if (age >= 18) {
        print("you are an adult")
    }

    /*
//if ...else
if (condition){
//block of code to be executed if the condition is true
}
else{
//block of code to be executed if condition is false
}
 */
        val correctUsername = "admin"
        val correctPassword = 1234  // Integer password

        print("Enter username: ")
        val username = readLine()

        print("Enter password: ")
        val password = readLine()?.toIntOrNull()  // Convert user input to Int safely

        if (username == correctUsername && password == correctPassword) {
            println("Login successful! Welcome $username")
        } else {
            println("Invalid username or password")
        }



    //program that checks if a user can drive.eligible drive
    /*age is greater than 18
    //?. (safe call operator) prevents operation on nullvalues
    //to IntOrNull()-converts string to interger safely (returns null if conversation fails)
    readline()-Reads user input as a string
      */

        print("Enter your age: ")
        val userAge = readLine()?.toIntOrNull()  // Convert input to Int safely

        if (userAge != null && userAge >= 18) {
            println("You can drive")
        } else {
            println("You are not eligible to drive")
        }


    //a program to ask user for a number then checks if its even or odd(number %2==0)
    print("Enter a number:")
    val number =readLine()?.toIntOrNull()

    if (number != null) {
        if (number % 2 == 0) {
            println("$number is even.")
        } else {
            println("$number is odd.")
        }
    }else{
        println("invalid input! Please enter a valid number.")
    }
}

