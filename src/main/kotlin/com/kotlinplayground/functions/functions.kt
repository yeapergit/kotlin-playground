package com.kotlinplayground.functions

import java.time.LocalDate

fun printName(name: String) {
    println("Name is $name")
}

fun addition(x: Int, y: Int): Int {
    return x + y
}

fun additionApproach2(x: Int, y: Int) = x + y

fun printPersonDetails(name: String, email: String = "", dateOfBirth: LocalDate = LocalDate.now()) {
    println("Name is $name and the emails is $email and date of birth is $dateOfBirth")
}

fun main() {
    /* printName("Pedro")
     val result = addition(1, 2)
     println("Addition: $result")

     val result1 = additionApproach2(1, 2)
     println("Addition_approach: $result1")*/

    printPersonDetails("pedro", "asd@gmail.com", LocalDate.parse("2020-01-01"))
    printPersonDetails("pedro")
    printPersonDetails(name = "pedro", dateOfBirth = LocalDate.parse("1904-02-28"))


}



