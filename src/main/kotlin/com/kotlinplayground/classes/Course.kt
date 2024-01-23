package com.kotlinplayground.classes

data class Course( //dto, models, etc
    val id: Int,
    val name: String,
    val author: String
)

fun main() {
    val course = Course(1, "oi", "tonho");
    println(course)

    val course1 = Course(1, "oi", "tonho");

    //can do this checking if is a data object, otherwise need to check properties 1 by 1
    println("checking equality: ${course == course1}")

    val course2 = course1.copy(); //clone
}
