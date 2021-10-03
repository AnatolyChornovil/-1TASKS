package main.kotlin.conditional

fun main() {
    print("Entry number1 = ")
    val x = readLine()!!.toInt()
    print("Entry number2= ")
    val y = readLine()!!.toInt()
    if (x>y){
        print(x)
        print(y)}
    else
        print(y)
        print(x)
}