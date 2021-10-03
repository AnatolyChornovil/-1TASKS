package main.kotlin.conditional

fun main() {
    print("Entry number A = ")
    val a = readLine()!!.toDouble()
    print("Entry number B = ")
    val b = readLine()!!.toDouble()
    print("Entry number C = ")
    val c = readLine()!!.toDouble()
    if ((a<b) && (a<c))
    {
        print("Sum = B+C = " + (b+c))
    }
    else if ((b<a) && (b<c))
    {
        println("Sum = A+C = " + (c+a))
    }
    else  {
        println("Sum = B+A = " + (b+a))
    }
}