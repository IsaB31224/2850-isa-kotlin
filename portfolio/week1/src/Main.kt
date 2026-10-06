// COMP2850 Portfolio: Week 1
// Program to compute area of a triangle

import kotlin.math.sqrt
import kotlin.system.exitProcess

fun main(args: Array<String>){

    if (args.size != 3){
        println("Error: values for a, b, c required on command line")
        exitProcess(1)
    }

    val a=args[0].toFloat()
    val b=args[1].toFloat()
    val c=args[2].toFloat()
    val s= 0.5*(a+b+c)

    val sum= s * (s-a) * (s-b) * (s-c)
    val answer= sqrt(sum)
    val old=(String.format("%.5f",answer))
    println("Area = $old")







}
