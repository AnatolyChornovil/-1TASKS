package main.kotlin.conditional

fun main() {
    print("Entry number A = ")
    val a = readLine()!!.toInt()
    print("Entry number B = ")
    val b = readLine()!!.toInt()
    print("Entry number C = ")
    val c = readLine()!!.toInt()
    if ((a>b) && (b>c))
    {
        print("Biggest = A = " + a)
    }
    else if ((b>c) && (c>a))
    {
        println("Biggest = B = " +b)
    }
    else {
        println("Biggest = C = " +c)
    }
}