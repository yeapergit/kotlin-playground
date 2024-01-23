package com.kotlinplayground.exceptions

fun returnNothing() : Nothing {
    throw RuntimeException("Exception e tal")
}

fun main() {

    println(nameLength("Pedro"))
    println(nameLength(null))
    returnNothing()
}

fun nameLength(name: String?) : Int? {
    val result = try {
        name!!.length
    }catch(ex: Exception){
        println("Exception is: $ex")
        null
    }

    return result
}
