package com.mbialowas.demonstrartion1.demo1.hof

fun main(){
    val sub = {a:Int, b:Int -> a-b}
    hof(sub)



    // capitilze a string
    capitilizeString("michael", { s-> s.uppercase() })
}

fun hof(subtraction: (Int, Int) -> Int){
    val result = subtraction(10, 5)
    println(result)
}

fun capitilizeString(str: String, fn:(String) -> String){
    var result = fn(str)
    println(result)
}

