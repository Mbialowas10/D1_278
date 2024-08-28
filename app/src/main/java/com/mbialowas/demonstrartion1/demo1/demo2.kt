package com.mbialowas.demonstrartion1.demo1

fun main() {

    // function usage


    println(addNumbers())
    println(newAndImprovedAddNumbers(10, 20))
    println(newerAndImprovedAddNumbers(100, 200))
}

fun addNumbers(): Int {
    return 10 + 20
}
fun newAndImprovedAddNumbers(num1: Int, num2: Int) :Int{
    return num1 + num2
}
fun newerAndImprovedAddNumbers(num1: Int, num2: Int) :Int = num1 + num2