package main.kotlin.conditional

fun main() {
    print("Entry number A = ")
    val a = readLine()!!.toDouble()
    print("Entry number B = ")
    val b = readLine()!!.toDouble()
    print("Entry number C = ")
    val c = readLine()!!.toDouble()
    if (a in (b..c))
    {
        print("Middle = A = " + a)
    }
    else if (b in (c..a))
    {
        println("Middle = B = " +b)
    }
    else {
        println("Middle = C = " +c)
    }
}