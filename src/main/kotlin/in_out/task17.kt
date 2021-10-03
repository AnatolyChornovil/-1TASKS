package main.kotlin.in_out
import kotlin.math.abs
import kotlin.math.sqrt
fun main() {
    print("Entry x1= ")
    val x1 = readLine()!!.toDouble()
    print("Entry y1= ")
    val y1 = readLine()!!.toDouble()
    print("Entry x2= ")
    val x2 = readLine()!!.toDouble()
    print("Entry y2= ")
    val y2 = readLine()!!.toDouble()

    val p1 = abs (y1-y2)
    val p2 = abs (x1-x2)
    val sq1 = sqrt( p1+p2)
    println("Long= " + sq1)

}