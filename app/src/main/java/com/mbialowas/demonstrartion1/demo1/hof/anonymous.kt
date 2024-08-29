package com.mbialowas.demonstrartion1.demo1.hof

// anonymous function
val addNumbers = fun(num1: Int, num2: Int):Int{ return num1 + num2 }

val addNumbers2 = fun(num1: Int, num2: Int):Int {return num1+num2}

fun main() {
    println(addNumbers(99, 1))
    print(addNumbers2(99, 1))
}