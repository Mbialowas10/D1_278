package com.mbialowas.demonstrartion1_278.demo2

class Fish(name: String, sound: String) : Animal(name, sound){

    init{
        println("$name makes $sound sound")
    }
    fun swim(){
        println("$name is swimming")
    }
}
