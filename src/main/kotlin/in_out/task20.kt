package main.kotlin.in_out

import kotlin.math.pow

fun main() {
    print("Entry x = ")
    val x = readLine()!!.toDouble()
    val y = (3 * x.pow(3)-6*x.pow(2)-7 )
    println("y = " + y)
}