package com.kotlinplayground.basics

import com.kotlinplayground.functions.courseName
import com.kotlinplayground.functions.topLevelFunction

fun main() {

    val name: String = "Pedro"
    println(name);

    var age: Int = 33
    println(age)
    age = 34
    println(age)

    val salary = 30000L
    println(salary);

    val course = "Kotlin Spring"
    println("course : $course and the course length is ${course.length}")

    val multiLine = "ABC \n DEF"
    println(multiLine)

    val multiLine1 = """
        ABC
        DEF
    """.trimIndent()

    println(multiLine1)

    val num = topLevelFunction()
    println("Num is $num");
    println("course: $courseName")
}