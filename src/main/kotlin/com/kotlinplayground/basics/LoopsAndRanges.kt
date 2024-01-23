package com.kotlinplayground.basics

fun main() {
    val range = 1..6
    for (i in range) {
        println("i : $i")
    }

    val rangeDesc = 6 downTo 1
    for (j in rangeDesc) {
        println("desc : $j")
    }

    for (j in rangeDesc step 2) {
        println("desc with skip : $j")
    }

    exploreWhile()
    explodeDoWhile()
}

fun explodeDoWhile() {
    var i = 0;
    do {
        println("value of i is: $i")
        i++
    } while (i < 5)
}

fun exploreWhile() {
    var x = 1
    while (x < 5) {
        println("value of x is: $x")
        x++
    }
}
