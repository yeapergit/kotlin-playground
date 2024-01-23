package com.kotlinplayground.classes

class Person(val name: String = "default name", val age: Int = 1904) {

    var email: String = ""
    var nameLength: Int = 0;

    init {
        println("inside init block")
        nameLength = name.length;
    }

    constructor(_email: String, _name: String = "", _age: Int = 0) : this(_name, _age) {
        email = _email;
    }

    fun action() {
        println("Person walks")
    }
}

fun main() {
    val person = Person("Pedro", 34);
    person.action()
    println("Name: ${person.name} and the age is ${person.age}")

    val person2 = Person();
    println("Name: ${person2.name} and the age is ${person2.age}")

    val person3 = Person(_email = "abc@gmail.com", "pedro", 34);
    println("Name: ${person3.name} and the age is ${person3.age} and email ${person3.email} + ${person.nameLength}")

}