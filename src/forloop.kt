/* for loop
for(item in collection){
//code to executed each item
}
 */
fun main() {
    //looping through a list
    val students= listOf("MARY","JACK","ALICE","JOSEPH")
    for (x in students){
        println(x)
    }
    //loop through an array
        val subjects= arrayOf("kotlin", "html", "css", "python","javascript")
        for(subject in subjects) {
            println(subject)
        }


    //loop through a range
        for (z in 5..10) {
            println(z)
        }

        // Loop through a range with a step 1..10 step 2
        for (i in 1..10 step 2) {
            println(i)
        }
    println("looping through a arange of characters")
    for(y in 'a' ..'e') {
        println(y)
    }
}