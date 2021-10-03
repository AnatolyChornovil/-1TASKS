package main.kotlin.conditional

fun main() {
    print("Entry X = ")
    val x = readLine()!!.toInt()

    if ((x< -2) || (x>2)) {
        print("fX = " + (x * 2))
    }
    else
        println ("fX = " + (x * -3))
}