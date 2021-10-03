package main.kotlin.in_out

fun main() {
    print("Entry A = ")
    val a = readLine()!!.toDouble()
    val b = a*a
    val c = b*b
    val d = c*c
    println("A^8 =" + d)
}