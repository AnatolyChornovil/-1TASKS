package main.kotlin.in_out

fun main() {
    print("Speed of first car kmph= ")
    val v1 = readLine()!!.toDouble()
    print("Speed of second car kmph= ")
    val v2 = readLine()!!.toDouble()
    print("Distance betveen cars km= ")
    val s = readLine()!!.toDouble()
    print("Time on road h= ")
    val t = readLine()!!.toDouble()

    //val v12 = v1+v2
    //val s2= s + (v12/t)
    val s2= s + ((v1+v2)/t)

    print("Distance after some time km= " +s2)

}