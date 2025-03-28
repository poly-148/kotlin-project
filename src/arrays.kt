//array is a collection of items
fun main() {
    val labs = arrayOf("chrome", "firefox", "moxilla", "safari")
//accessing array elements
    println(labs[0])     //displays chrome
    println(labs[2])
    //changing an array element
    labs[1]="safari"
    println(labs[1])
    //checking an array element
    println(labs.size)
    //looping through an array
    for ( lab in labs) {
        println(lab)
    }
    println("looping using forEach")
    //forEach function
    labs.forEach { x ->
        println(x)
    }
    val prices= arrayOf(20,37,29,56)
    prices.forEach {
        println(it)
    }
    //indices property
    val fruits= arrayOf("apples","bananas","pears","mangoes")
    for(x in fruits.indices){
        println("INDEX $x :$fruits[x]")
    }
    //iterating with withIndex()
    val cars= arrayOf("bmw","volvo","toyota")
    for( (index,value) in cars.withIndex())
        println("At index $index is $value")
}