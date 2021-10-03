package main.kotlin.conditional

fun main() {
    print("Entry number =")
    val n = readLine()!!.toInt()
    if (n>0) {
        val n1 = n+1
        println("Number+1 = " + n1)
    }else{
        if (n<0) {
            val n2 = n - 2
            println("Number-2 = " + n2)
        }
    }
}