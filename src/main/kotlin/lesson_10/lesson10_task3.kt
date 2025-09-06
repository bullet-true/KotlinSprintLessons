package org.example.lesson_10

const val MIN_LENGTH_PASSWORD = 2

fun main() {
    println("Введите длину пароля:")
    val userInput = readln().toIntOrNull()?.coerceAtLeast(MIN_LENGTH_PASSWORD) ?: MIN_LENGTH_PASSWORD

    val password = generatePass(userInput)
    println(password)
}


fun generatePass(length: Int): String {
    val digits = ('0'..'9').toList()
    val specialChars = (('!'..'/') + ' ').toList()

    return (0 until length).joinToString("") {
        val charList = if (it % 2 == 0) digits else specialChars
        charList.random().toString()
    }
}