package com.kotlinplayground.collections

import com.kotlinplayground.dataset.Course
import com.kotlinplayground.dataset.CourseCategory
import com.kotlinplayground.dataset.courseList

fun main() {

    val namesWithSequence = listOf("Pedro", "Francisco", "Joana")
        .asSequence()
        .filter { it.length > 5 }
        .map { it.uppercase() }
        .toList()

    println("namesWithSequence: $namesWithSequence")

    val devPredicate = { course: Course -> course.category == CourseCategory.DEVELOPEMENT }

    exploreFilterUsingSequence(courseList(), devPredicate)

    val range = 1..1000_000_000
    range
        .asSequence()
        .map { it.toDouble() }
        .take(5000)
        .forEach{
            println("$it")
        }
}

fun exploreFilterUsingSequence(
    courseList: MutableList<Course>,
    predicate: (Course) -> Boolean
) {

    courseList
        //.filter { it.category == CourseCategory.DEVELOPEMENT }
        .asSequence()
        .filter { predicate.invoke(it) }
        .forEach {
            println("Courses : $it")
        }
}