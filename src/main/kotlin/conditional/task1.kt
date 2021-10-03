package main.kotlin.conditional

fun main() {
    print("Entry number>0 =")
    val n = readLine()!!.toInt()
        if (n>0) {
        val n1 = n+1
        println("Number+1 = " + n1)
    }
    else
        println("Wrong number")

}