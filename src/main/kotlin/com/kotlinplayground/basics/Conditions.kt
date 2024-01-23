package com.kotlinplayground.basics

fun main() {
    //if-else
    //when

    val name = "Pedro"

    val result = if (name.length == 5) {
        println("has 5 chars")
        name
    }else{
        println("don't have 5 chars")
        name
    }

    println("result: $result");

    var position = 1
    position = 5

    /*val medal = if(position == 1){
        "GOLD"
    }else if(position == 2) {
        "SILVER"
    }else if(position == 3){
        "BRONZE"
    }else{
        "NO MEDAL"
    }*/

    val medal = when (position) {
        1 -> "GOLD"
        2 -> "SILVER"
        3 -> "BRONZE"
        else -> "NO MEDAL"
    }

    println(medal)
}