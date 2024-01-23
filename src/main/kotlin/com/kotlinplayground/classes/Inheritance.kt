package com.kotlinplayground.classes

open class User(val name: String) {
    open var isLoggedIn: Boolean = false;

    open fun login() {
        println("user login")
    }

    private fun secret() {
        println("secret function")
    }

    protected open fun logout() {
        println("protected function only visible to subclasses")
    }
}

class Student(name: String) : User(name) {
    override var isLoggedIn: Boolean = false;

    companion object { //static
        const val numberOfCourses = 10
        fun country() = "PT"
    }

    override fun login() {
        println("user login student")
        super.login()
    }

    public override fun logout() {
        super.logout()
        println("inside logout student")
    }
}

class Instructor(name: String) : User(name)

fun main() {
    val student = Student("jorge");
    println("name is ${student.name}")
    student.login()
    student.isLoggedIn = true;
    println("Student is logged? ${student.isLoggedIn}")

    val country = Student.country()
    println("Student country: $country")
    println("Student courses: ${Student.numberOfCourses}")

    val instructor = Instructor("manel")
    println("name is ${instructor.name}")
    instructor.login()

    student.logout()

}
