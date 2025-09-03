package org.example.lesson_7

import kotlin.random.Random

const val PASS_LENGTH = 6

fun main() {
    val numberRange = 1..9
    val charRange = 'a'..'z'
    var password = ""

    repeat(PASS_LENGTH) {
        password += if (Random.nextBoolean()) numberRange.random() else charRange.random()
    }
    println(password)
}