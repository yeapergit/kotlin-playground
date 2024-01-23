package com.kotlinplayground.cast

import com.kotlinplayground.classes.Course

fun checkType(type: Any) {

    when(type){
        is Course -> {
            println(type)
        }
        is String -> {
            println(type.lowercase())
        }
    }
}

fun castNumber(any: Any) {
    when(any){
        any as? Double -> println("Value is Double") // ? if its possible
        any as? Int -> println("Value is Int") // ? if its possible

    }
}

fun main() {
    val course = Course(1, "oi", "tonho");

    checkType(course)
    checkType("OI")

    castNumber(1.0)
    castNumber(1)

    val number = 1;
    val numberDouble  = number.toDouble()
    println(numberDouble)

}



