package main.kotlin.in_out
import javax.print.attribute.Size2DSyntax
import kotlin.math.sqrt
fun main() {
    print("Area = ")
    val s = readLine()!!.toDouble()
    val r2 = s/ (3.14)
    val r = Math.sqrt (r2)
    val d = r*2
    val l = d*3.14

    println("Dia= " + d)
    println("Long= " + l)
}