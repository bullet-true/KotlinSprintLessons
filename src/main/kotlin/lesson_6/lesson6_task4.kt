package org.example.lesson_6

const val NUMBER_FROM = 1
const val NUMBER_TO = 9
const val NUMBER_OF_ATTEMPTS = 5

fun main() {
    println("Угадайте целое число в промежутке от $NUMBER_FROM до $NUMBER_TO:")

    val randomNumber = (NUMBER_FROM..NUMBER_TO).random()
    var numberOfAttempts = NUMBER_OF_ATTEMPTS

    while (numberOfAttempts > 0) {
        val userInput = readln().toIntOrNull() ?: run {
            println("Вы ввели не целое число!")
        }
        if (userInput == randomNumber) {
            println("Это была великолепная игра!")
            return
        } else {
            numberOfAttempts--
            println("Неверно. Осталось попыток: $numberOfAttempts")
        }
    }
    println("Было загадано число $randomNumber")
}