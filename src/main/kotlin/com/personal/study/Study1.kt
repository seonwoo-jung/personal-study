package com.personal.study

fun main() {
    val person = mutableListOf<Person>()
    person.add(Person("John", 30, "Seoul", "010-1234-5678", "John@gmail.com", "Developer"))
    person.add(Person("James", 23, "Seoul", "010-1234-5678", "James@gmail.com", "Developer"))
    person.add(Person("judy", 25, "Seoul", "010-1234-5678", "judy@gmail.com", "Developer"))
    person.add(Person("Poll", 28, "Seoul", "010-1234-5678", "Poll@gmail.com", "Developer"))
    person.add(Person("Seon", 39, "Seoul", "010-1234-5678", "Seon@gmail.com", "Developer"))
    person.add(Person("lee", 22, "Seoul", "010-1234-5678", "lee@gmail.com", "Developer"))
    person.add(Person("jun", 34, "Seoul", "010-1234-5678", "jun@gmail.com", "Developer"))
    person.add(Person("kim", 20, "Seoul", "010-1234-5678", "kim@gmail.com", "Developer"))
    person.add(Person("may", 29, "Seoul", "010-1234-5678", "may@gmail.com", "Developer"))

    person.forEach {
        println(it)
    }

    val mappingAges = person.map { it.age }.toMutableList()
    println("averageAge ${mappingAges}")

    person.map { it.age }.average().let {
        println("averageAge ${it}")
    }

    person.groupBy { it.job }.forEach {
        println(it)
    }
}

data class Person(
    val name: String,
    val age: Int,
    val address: String,
    val phoneNumber: String,
    val email: String,
    val job: String
)