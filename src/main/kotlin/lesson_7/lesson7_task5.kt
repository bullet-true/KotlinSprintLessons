package org.example.lesson_7

import kotlin.random.Random

const val MIN_LENGTH_PASS = 6
const val CHAR_TYPE_COUNT = 3

fun main() {
    val numberRange = 0..9
    val lowerCharRange = 'a'..'z'
    val upperCharRange = 'A'..'Z'
    var userInput: Int
    var password = ""

    println("Введите длину пароля для генерации (не меньше $MIN_LENGTH_PASS символов):")

    do {
        userInput = readln().toIntOrNull() ?: -1
        if (userInput < MIN_LENGTH_PASS) println("Минимальное число символов для пароля: $MIN_LENGTH_PASS:")
    } while (userInput < MIN_LENGTH_PASS)

    // Гарантируем, что присутствуют все три вида символов
    password = password + lowerCharRange.random() + numberRange.random() + upperCharRange.random()

    // Остальные символы - рандомно
    repeat(userInput - CHAR_TYPE_COUNT) {
        password += when (Random.nextInt(CHAR_TYPE_COUNT)) {
            0 -> numberRange.random()
            1 -> lowerCharRange.random()
            else -> upperCharRange.random()
        }
    }

    password = password.toList().shuffled().joinToString("")
    println(password)
}