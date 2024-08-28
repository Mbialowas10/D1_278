package com.mbialowas.demonstrartion1.demo1.OOP

class Shark (override var name: String): Animal(name){
    init{
        println("Shark created")
    }
    fun swim(){
        println("$name is swimming")

    }
}

fun main() {
    val shark = Shark("Big Shark")
    shark.swim()

}