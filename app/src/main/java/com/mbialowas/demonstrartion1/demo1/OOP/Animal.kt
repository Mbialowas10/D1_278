package com.mbialowas.demonstrartion1.demo1.OOP

open class Animal(open var name: String) {

    init{
        println("Animal IS created FIRST")
    }
    fun makeSound() {
        println("$name makes a sound")
    }

    fun eat() {
        println("$name is eating")
    }
}

fun main() {
    val dog = Animal("Buddy")
    dog.makeSound()
    dog.eat()

    val fish = Animal("Nemo")
    fish.makeSound()
    fish.eat()

}