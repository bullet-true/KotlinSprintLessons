package org.example.lesson_7

const val PASS_LENGTH = 6

fun main() {
    val numberRange = 0..9
    val charRange = 'a'..'z'
    var password = ""

    for (i in 0 until PASS_LENGTH) {
        password += if (i % 2 == 0) {
            charRange.random()
        } else {
            numberRange.random()
        }
    }
    println(password)
}