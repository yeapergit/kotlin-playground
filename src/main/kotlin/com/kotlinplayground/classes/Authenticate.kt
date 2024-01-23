package com.kotlinplayground.classes

object Authenticate { //singleton

    fun authenticate(userName: String, password: String) {
        println("User authenticate: $userName")
    }
}

fun main() {
    Authenticate.authenticate("pedro", "1904");
}