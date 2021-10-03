package main.kotlin.in_out
import javax.print.attribute.Size2DSyntax
import kotlin.math.sqrt
fun main() {
    print("RAD r1= ")
    val r1 = readLine()!!.toDouble()
    print("RAD r2= ")
    val r2 = readLine()!!.toDouble()
    if (r1>r2) {
        val S1 = (r1*r1)*3.14
        val S2 = (r2*r2)*3.14
        val S3 = S1-S2
        println("S1= " + S1)
        println("S2= " + S2)
        println("S ring= " + S3)
    }
   else
    println("wrong radiuses")


}