package main.kotlin.in_out

import kotlin.text.toInt as textToInt

fun main(){
    print("R= ")
    val r = readLine()!!.toFloat()
    val L = 2 * r * 3.14
    val S = 3.14 * (r*r)
    println (L)
    println (S)
}
