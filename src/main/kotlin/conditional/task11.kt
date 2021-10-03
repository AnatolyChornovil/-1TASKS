package main.kotlin.conditional

fun main() {
    println("f(x) = {x^2 , 0<=x<2")
    print("Entry X = ")
    val x = readLine()!!.toInt()

    if ((x <= 0) || (x>2))
        print("fX = " + (x*x))
    else
        print("0<=X<2")
}