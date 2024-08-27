package com.mbialowas.demonstrartion1_278.demo2

open class Animal(
    var name:String,
    private var sound:String
){
    fun makeSound() {
        println("The $name animal says $sound")
    }
}

fun main() {
    val dog = Animal("dog", "woof")
    dog.makeSound()
    val cat = Animal("cat", "meow")
    cat.makeSound()
    val fish = Animal("fish", "blub")
    fish.makeSound()
    val bird = Animal("bird", "tweet")
    bird.makeSound()
}

