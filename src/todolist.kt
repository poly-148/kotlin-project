fun main() {
    var tasks = arrayOf<String>() //EMPTY ARRAY To store tasks

    while (true) {
        println("to do list menu---")
        println("1.Add Task")
        println("2.View Tasks")
        println("3.Delete Task")
        println("4.Exit")
        print("choose an option:")
        when(readLine()?.toIntOrNull()){
            1->{
                print("enter a new task:")
                val task= readLine() ?:""
                tasks +=task //append to array
                println("task added")
            }
            2->{
                println("your tasks")
                tasks.forEachIndexed{index,task ->
                    println("${index+1} . $task")
                }
            }
            4->{
                println("goodbye")
                return
            }
        }
    }

}
