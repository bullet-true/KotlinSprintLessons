package org.example.lesson_5

import kotlin.random.Random

fun main() {
    val randomNumbers = mutableSetOf<Int>()
    while (randomNumbers.size < 3) {
        randomNumbers.add(Random.nextInt(0, 43))
    }

    println("Введите 3 числа через Enter, каждое с новой строки:")
    val userNumbers = List(3) { readln().toInt() }

    val matchedNumbers = userNumbers.intersect(randomNumbers).size

    println(
        when (matchedNumbers) {
            3 -> "Вы угадали все три числа и выиграли джекпот!"
            2 -> "Вы угадали два числа и получаете крупный приз!"
            1 -> "Вы угадали одно число и получаете утешительный приз!"
            else -> "Вы не угадали ни одного числа."
        }
    )
    println("Выигрышные числа: ${randomNumbers.joinToString(", ")}")
}