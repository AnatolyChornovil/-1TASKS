package main.kotlin.conditional

fun main() {
    print("Entry number1 = ")
    val x = readLine()!!.toDouble()
    print("Entry number2= ")
    val y = readLine()!!.toDouble()
    if (x>y)
        println("biggest first= " +x)
    else
        println("biggest second= " +y)
}