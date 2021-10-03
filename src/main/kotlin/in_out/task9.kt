package main.kotlin.in_out
import kotlin.math.sqrt
fun main() {
    print("a= ")
    val a = readLine()!!.toDouble()
    print("b= ")
    val b = readLine()!!.toDouble()
    val c = (a*b)
    val  Gmiddle = Math.sqrt (c)

    println("Gmiddle= " + Gmiddle)
}