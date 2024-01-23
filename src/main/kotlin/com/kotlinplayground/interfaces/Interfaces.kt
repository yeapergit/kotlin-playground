package com.kotlinplayground.interfaces

import com.kotlinplayground.classes.Course

interface CourseRepository {

    val isCoursePersisted: Boolean

    fun getById(id: Int): Course //abstract function

    fun save(course: Course): Int {
        println("course: $course")
        return course.id;
    }
}

interface Repository {
    fun getAll(): Any
}

class SqlCourseRepository : CourseRepository, Repository {
    override val isCoursePersisted: Boolean = false

    override fun getById(id: Int): Course {
        return Course(id, "asd", "amilcar")
    }

    override fun getAll(): Any {
        TODO("Not yet implemented")
    }
}

class NoSqlCourseRepository : CourseRepository, Repository {
    override var isCoursePersisted: Boolean = false

    override fun getById(id: Int): Course {
        return Course(id, "asd", "amilcar")
    }

    override fun save(course: Course): Int {
        isCoursePersisted = true;
        println("course for noSQL: $course")
        return course.id;
    }

    override fun getAll(): Any {
        TODO("Not yet implemented")
    }
}

interface A {
    fun doSomething() {
        println("something A")
    }
}

interface B {
    fun doSomething() {
        println("something B")
    }
}

//avoid this
class AB : A, B {
    override fun doSomething() {
        super<A>.doSomething()
        super<B>.doSomething()
        println("do something AB")
    }

}

fun main() {
    val sqlCourseRepository = SqlCourseRepository();
    val course = sqlCourseRepository.getById(1)
    println(course);

    val courseId = sqlCourseRepository.save(Course(5, "iii", "klklk"));
    println(courseId);

    val noSqlCourseRepository = NoSqlCourseRepository();
    val course2 = noSqlCourseRepository.getById(1)
    println(course2);
    val courseId2 = noSqlCourseRepository.save(Course(6, "iii", "klklk"));
    println(courseId2);
    println("persisted? ${noSqlCourseRepository.isCoursePersisted}")

    val ab = AB()
    ab.doSomething();

}