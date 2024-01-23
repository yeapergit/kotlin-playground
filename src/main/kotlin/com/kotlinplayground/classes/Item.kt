package com.kotlinplayground.classes

class Item() {
    var name: String = ""

    var price: Double = 0.0
        get() {
            println("getter")
            return field
        }
        set(value) {
            if (value >= 0.0) {
                println("setter")
                field = value
            } else {
                throw IllegalArgumentException("negative value")
            }
        }

    constructor(_name: String) : this() {
        name = _name;
    }
}

fun main() {
    val item = Item();
    item.name = "iphone"
    println("item name is ${item.name}")

    val item2 = Item(_name = "Iphone 14")
    println("item2 name is ${item2.name}")

    item.price = 1.1
    println(item.price)

}