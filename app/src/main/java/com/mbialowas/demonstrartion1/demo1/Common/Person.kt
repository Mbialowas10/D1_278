package com.mbialowas.demonstrartion1.demo1.Common

class Person{
    var name:String = "Michael"
    var age:Int = 30
    var gender:String = "Male"

    // getters and setters
    get() = field // getter

    set(value) {
        field = value // setter
    }
}

fun main(){
    var p1 = Person()
    println(p1.name)
    println(p1.age)
    println(p1.gender)

    p1.name = "Sam"
    println(p1.name)

    // Kotlin - null safety
    var can_not_ever_be_null = "Mike"

    var can_be_null:String? = null
    print(can_be_null)




}