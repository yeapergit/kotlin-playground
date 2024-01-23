package com.kotlinplayground.nulls

data class Movie(
    val id: Int?,
    val name: String
)

fun printName(name: String) {
    println("name is $name")
}

fun printName1(name: String?) {
    println("name1 is $name")
}

fun main() {
    var nameNullable: String? = null

    //printName(nameNullable!!);
    nameNullable?.run { //scope function
        printName(this)
    }
    println("Value is ${nameNullable?.length}") //safe operator

    /*if(nameNullable != null){
        println("Value is ${nameNullable.length}")
    }*/

    nameNullable = "asdasdasd"
    println("Value is ${nameNullable?.length}") //no need of ?
    nameNullable = null;
    val length = nameNullable?.length ?: 0 //?: elvis operator
    println(length)

    var name: String = "armando"
    printName1(name);

    val movie = Movie(null, "Dark Knight")
    val savedMovie = saveMovie(movie)

    println(savedMovie.id!!) //non null assertions !!
    println(savedMovie)
}

fun saveMovie(movie: Movie): Movie {
    return movie.copy(id = 1);
    //return movie
}
