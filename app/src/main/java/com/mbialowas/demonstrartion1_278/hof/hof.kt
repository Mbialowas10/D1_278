package com.mbialowas.demonstrartion1_278.hof

// higher order function (hof) - is simple a function that consume another

fun main(){
    val sub = {a:Int, b:Int -> a-b}
    hof(sub)

    capitalizeString("hello world", { s-> s.uppercase() })
}

fun hof(subtraction: (Int,Int) -> Int){
    val result = subtraction(10,5)
    println("10 - 5 = $result")
}

fun capitalizeString(str:String, fn:(String) -> String){
    var result = fn(str)
    println(result)
}