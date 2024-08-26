package com.mbialowas.demonstrartion1_278

fun main(){

    fun addNumbers(num1: Int, num2: Int): Int{
            return num1 + num2
    }

    fun newAndImprovedAddNumbers(num1: Int, num2: Int) = num1 + num2

    println(addNumbers(10,20))
    println(newAndImprovedAddNumbers(10,20))
}