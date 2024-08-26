package com.mbialowas.demonstrartion1_278

fun main(){

    // single line comment

    /*
    multi line comment
     */

    println("Hello World")

    // variable declaration
    val num = 10 // read  only variable
    println(num)

    //num = 230 // val cannot be reassigned
    println(num)

    var num2:Int = 33 // writable variable aka mutable

    var title:String = "The Hobitt"
    /*
    DATA TYPES  -
    Primitives
        Integer, Double, Boolean
   Non-primitive
    String, Array Classes
     */
    val multiLineString = """
            This is line 1
            This is line 2
            This is line 3
        """
    print(multiLineString)

    val PI =3.1452
    println(PI)



}