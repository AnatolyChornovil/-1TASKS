package main.kotlin.in_out

fun main() {
    print("a= ")
    val a = readLine()!!.toFloat()
    print("b= ")
    val b = readLine()!!.toFloat()
    val middle = (a + b) / 2

    println("middle= " + middle)
}
