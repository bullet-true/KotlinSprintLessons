package org.example.lesson_6

const val NUMBER_FIRST = 1
const val NUMBER_LAST = 9
const val NUMBER_OF_ATTEMPT = 3

fun main() {
    println("Проверка на бота")
    var numberOfAttempts = NUMBER_OF_ATTEMPT
    var isUserAnswerCorrect = false

    do {
        val firstRandomNumber = (NUMBER_FIRST..NUMBER_LAST).random()
        val secondRandomNumber = (NUMBER_FIRST..NUMBER_LAST).random()
        val correctAnswer = firstRandomNumber + secondRandomNumber

        println("Вычислите результат сложения $firstRandomNumber + $secondRandomNumber :")
        val userInput = readln().toIntOrNull()

        if (userInput == correctAnswer) {
            println("Ответ верный")
            isUserAnswerCorrect = true
        } else {
            numberOfAttempts--
            println("Ответ не верный. Осталось попыток: $numberOfAttempts")
        }
    } while (numberOfAttempts > 0 && !isUserAnswerCorrect)

    println(if (isUserAnswerCorrect) "Добро пожаловать!" else "Доступ запрещен")
}