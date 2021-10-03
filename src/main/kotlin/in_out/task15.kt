package main.kotlin.in_out
import kotlin.math.sqrt
fun main() {
    print("point a= ")
    val a = readLine()!!.toDouble()
    print("point b= ")
    val b = readLine()!!.toDouble()
    print("point c= ")
    val c = readLine()!!.toDouble()
    if ((b in a..c) && (a in b..c)) {
           val d1 = (c-a)
           val d2 = (c-b)
           val d3 = d1+d2
        println("Distance AC= " + d1)
        println("Distance BC= " + d2)
        println("Distance AC+BC= " + d3)
        }
       else if ((c<a) && (c<b)) {
               val d1 = (a-c)
               val d2 = (b-c)
               val d3 = d1+d2
               println("Distance AC= " + d1)
               println("Distance BC= " + d2)
               println("Distance AC+BC= " + d3)
           }
}
