package com.kotlinplayground.collections

fun main() {
    val names = listOf("Pedro", "Francisco", "Joana")
    println("names: $names")

    val namesMutableList = mutableListOf("Pedro", "Francisco", "Joana")
    namesMutableList.add("Nico")
    println("Mutable names: $namesMutableList")

    val namesSet = setOf("Pedro", "Francisco", "Joana")
    val namesMutableSet = mutableSetOf("Pedro", "Francisco", "Joana")
    namesMutableSet.add("Nico")
    println("set: $namesSet")
    println("mutable set: $namesMutableSet")

    val namesMap = mapOf("Pedro" to 34, "Francisco" to 1, "Joana" to 33)
    val namesMultableMap = mutableMapOf("Pedro" to 34, "Francisco" to 1, "Joana" to 33)
    namesMultableMap.put("Nico", 3)
    namesMultableMap["Jorge"] = 6
    println("map: $namesMap")
    println("mutable map: $namesMultableMap")
}