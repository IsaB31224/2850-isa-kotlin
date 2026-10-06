// Task 4.3: grade calculation using a when expression
import kotlin.math.round




fun main(args:Array<String>){
    if (args.size != 3){
        println("Give me 3 grades")
    }
    val average= round((args[0]+args[1]+args[2]).div(args.size))

    val grade = when (average) {
        in 0..39   -> "Fail"
        in 40..69  -> "Pass"
        in 70..100 -> "Distinction"
        else       -> "?"
    }

    println("Your Grade is $grade and your mark is $average")
}