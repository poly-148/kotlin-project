fun main() {
    //elseif-to tests for more conditions
    println("enter your marks")
    val marks=readLine()?.toIntOrNull()

    if(marks!=null && marks in 1..100){
        if(marks>=90){
            println("GRADE A")
        }else if(marks>=80){
            println("GRADE B")
        }else if(marks>=70){
            println("GRADE C")
        }else if(marks>=60){
            println("GRADE D")
        }else{
            println("failed")
        }
    }else{
        println("invalid input!enter a number btwn 1 and 100")
    }
}