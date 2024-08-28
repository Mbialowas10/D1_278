package com.mbialowas.demonstrartion1.demo1.OOP

class Bird(override var name: String, val age: Int): Animal(name){
    init{
        println("Bird created")
    }
    fun fly(){
        println("$name is flying")
    }
}

fun main() {
    val bird = Bird("Sparrow", 2)
    bird.fly()
}