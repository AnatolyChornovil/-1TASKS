package main.kotlin.in_out
import kotlin.math.sqrt
fun main() {
    print("a= ")
    val a = readLine()!!.toDouble()
    print("b= ")
    val b = readLine()!!.toDouble()
    val SumSQRT = (a*a)+(b*b)
    val DifSQRT = (a*a)-(b*b)
    val MulSQRT = (a*a)*(b*b)
    println("SumSQRT= " + SumSQRT)
    println("DifSQRT= " + DifSQRT)
    println("MulSQRT= " + MulSQRT)
}