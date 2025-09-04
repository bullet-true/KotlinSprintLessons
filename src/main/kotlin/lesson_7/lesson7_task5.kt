package org.example.lesson_7

const val MIN_LENGTH_PASS = 6
const val CHAR_TYPE_COUNT = 3

fun main() {
    val listOfCharRanges = listOf('0'..'9', 'a'..'z', 'A'..'Z')
    var userInput: Int
    val password = mutableListOf<Char>()

    println("Введите длину пароля для генерации (не меньше $MIN_LENGTH_PASS символов):")

    do {
        userInput = readln().toIntOrNull() ?: -1
        if (userInput < MIN_LENGTH_PASS) println("Минимальное число символов для пароля: $MIN_LENGTH_PASS:")
    } while (userInput < MIN_LENGTH_PASS)

    listOfCharRanges.forEach { password.add(it.random()) }

    repeat(userInput - CHAR_TYPE_COUNT) {
        password.add(listOfCharRanges.random().random())
    }

    password.shuffle()
    println(password.joinToString(""))
}