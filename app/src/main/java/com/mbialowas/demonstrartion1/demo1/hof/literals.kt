package com.mbialowas.demonstrartion1.demo1.hof

// lambda expression, note function has no name
var add = {a:Int, b:Int -> a+b}
var name = "Michael"

fun main(){
    println(add(10, 20))

}