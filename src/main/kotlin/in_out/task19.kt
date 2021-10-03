package main.kotlin.in_out

fun main() {
    print("Entry A = ")
    val a = readLine()!!.toInt()
    print("Entry B = ")
    val b = readLine()!!.toInt()
    print("Entry C = ")
    val c = readLine()!!.toInt()
    val a1 = b
    val b1 = c
    val c1 = a

    print (a1)
    print (b1)
    print (c1)
}