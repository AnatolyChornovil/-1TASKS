package main.kotlin.in_out
import kotlin.math.sqrt
fun main() {
    print("KATET a= ")
    val a = readLine()!!.toDouble()
    print("KATET b= ")
    val b = readLine()!!.toDouble()
    val c = (a*a)+(b*b)
    val GIPO = Math.sqrt (c)
    val P = a+b+ GIPO

    println("GIPO= " + GIPO)
    println("PERIM= " + P)

}