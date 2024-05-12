package com.personal.study.generic

class GenericStudy {
    fun <T> printArray(arr: Array<T>) {
        for (element in arr) {
            println(element)
        }
    }
}

fun main() {
    val arrayOf = arrayOf("정선우", "이찬영", "김유신")
    val genericStudy = GenericStudy()
    genericStudy.printArray(arrayOf)
}