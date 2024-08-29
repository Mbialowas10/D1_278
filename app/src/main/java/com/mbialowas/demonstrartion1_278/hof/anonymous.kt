package com.mbialowas.demonstrartion1_278.hof

// anonymous function - function with an name

val addNumbers = fun(a:Int,b:Int):Int
{
    return a+b
}

fun main(){

    var name:String = "Michael Bialofwas"

    var lName:String? = null

    lName = "Bialowas"
    println(lName)

    println("10 + 5 = ${addNumbers(10,5)}")
}