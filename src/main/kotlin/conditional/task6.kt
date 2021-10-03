package main.kotlin.conditional

fun main() {
    print("Entry number A = ")
    val x = readLine()!!.toInt()
    print("Entry number B = ")
    val y = readLine()!!.toInt()
    if (x != y)
    {
        print("Sum = " + (x + y))
    }
    else
    {
        println("A = o" )
        print("B = o" )
    }
}