package com.kotlinplayground.collections

import com.kotlinplayground.dataset.CourseCategory
import com.kotlinplayground.dataset.Course
import com.kotlinplayground.dataset.KAFKA
import com.kotlinplayground.dataset.courseList

fun main() {
    val courseList = courseList()
    val devPredicate = { course: Course -> course.category == CourseCategory.DEVELOPEMENT }
    val designPredicate = { course: Course -> course.category == CourseCategory.DESIGN }

    val list = listOf(listOf(1, 2, 3), listOf(4, 5, 6))
    /* val mapResult = list.map { outerList ->
         outerList.map {
             it.toDouble()
         }
     }
     println("mapResult: $mapResult")

     val flatMapResult = list.flatMap { outerList ->
         outerList.map {
             it.toDouble()
         }
     }
     println("flatMapResult: $flatMapResult") */

    //exploreFilter(courseList, designPredicate)

    //exploreMap(courseList, devPredicate)

    val courses = exploreFlatMap(courseList, KAFKA)
    println("flatMap: $courses")

    exploreHashMap()
    collections_nullability()
}

fun collections_nullability() {

    var list: MutableList<String>? = null;

    list = mutableListOf()
    list.add("Pedro")
    list.forEach{
        println("value is $it")
    }

    val list1: List<String?> = listOf("Pedro", null, "Francisco");
    list1.forEach {
        println("value length is ${it?.length} ")
    }
}

fun exploreHashMap() {
    val nameAgeMutableMap = mutableMapOf("Pedro" to 34, "Francisco" to 1)
    nameAgeMutableMap.forEach { (key, value) ->
        println("key is $key and value is $value")
    }

    val value = nameAgeMutableMap.getOrElse("Joana") { 0 }
    println("value: $value")

    val exist = nameAgeMutableMap.containsKey("Joana")
    println("contains? $exist")

    val filteredMap = nameAgeMutableMap.filterKeys { it.length > 5 }
        .map { it.key.uppercase() }
    println("filteredMap: $filteredMap")

    val maxAge = nameAgeMutableMap.maxByOrNull { it.value }
    println("maxAge: $maxAge")
}

fun exploreFlatMap(courseList: MutableList<Course>, kafka: String): List<String> {
    val kafkaCourses = courseList.flatMap { course ->
        val courseName = course.name
        course.topicsCovered.filter {
            it == kafka
        }.map {
            courseName
        }
    }

    return kafkaCourses;
}

fun exploreMap(courseList: MutableList<Course>, predicate: (Course) -> Boolean) {

    val courses = courseList
        .filter(predicate)
        .map { "${it.name} - ${it.category}" }
        .forEach {
            println(it)
        }
    println("courses: $courses")
}

fun exploreFilter(
    courseList: MutableList<Course>,
    predicate: (Course) -> Boolean
) {

    courseList
        //.filter { it.category == CourseCategory.DEVELOPEMENT }
        .filter { predicate.invoke(it) }
        .forEach {
            println("Courses : $it")
        }
}
