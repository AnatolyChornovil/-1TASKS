package main.kotlin.in_out

import kotlin.math.pow

fun main() {
    print("Entry degrees >0 & <2pi = ")
    val a = readLine()!!.toDouble()
    val b = 2*3.14
    if ((a>0) && (a<b)) {
        val c = (a * 3.14) / 180

        println("Radians = " +c)
    } else {
        println("Wrong degrees")
    }
}