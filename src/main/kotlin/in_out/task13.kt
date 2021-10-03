package main.kotlin.in_out
import javax.print.attribute.Size2DSyntax
import kotlin.math.sqrt
fun main() {
    print("Long = ")
    val l = readLine()!!.toDouble()
    val r = l/(2*3.14)
    val s = (r*r)*3.14

    println("Rad= " + r)
    println("Area= " + s)
}