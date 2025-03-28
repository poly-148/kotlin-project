fun main(){
    //when used for testing multiple conditions
    print("enter your marks:")
    val marks=readLine()?.toIntOrNull()
    if(marks!=null && marks in 1..100){
        when{
            marks>=90 -> println("Grade A")
            marks>=80 -> println("Grade B")
            marks>=70 -> println("Grade C")
            marks>=50 -> println("Grade D")
            else -> println("failed")
        }
    }else{
        println("enter a valid number btwn 1 and 100")
    }

    //write a program that asks user to enter a number (1-7) and prints the corresponding day of the week

        print("Enter a number (1-7): ")
        val number = readLine()?.toIntOrNull()  // Convert input to Int safely

        val day = when (number) {
            1 -> "Monday"
            2 -> "Tuesday"
            3 -> "Wednesday"
            4 -> "Thursday"
            5 -> "Friday"
            6 -> "Saturday"
            7 -> "Sunday"
            else -> "Invalid input! Please enter a number between 1 and 7."
        }
    /*write a program that asks the user for their age and determines the movie ticket price based on age
    (hint :age in 5...12 ->500)
    below 5 years:free
    5-12 years:500ksh
    13-60:1000
    above 60:700
     */
        println(day)

        print("Enter your age: ")
        val age = readLine()?.toIntOrNull()  // Convert input to Int safely

        val price = when {
            age == null -> "Invalid input! Please enter a valid number."
            age < 5 -> "Free"
            age in 5..12 -> "500 Ksh"
            age in 13..60 -> "1000 Ksh"
            age > 60 -> "700 Ksh"
            else -> "Invalid age!"
        }

        println("Ticket Price: $price")


}