package main.kotlin.in_out

import kotlin.math.pow

fun main() {
    print("Entry x = ")
    val x = readLine()!!.toDouble()
    val y = 4*((x-3).pow(6)-7*(x-3).pow(3)+2)
    println("y = " + y)
}