package org.example.lesson_5

import kotlin.random.Random

fun main() {
    val firstRandomNumber = Random.nextInt(0, 43)
    val secondRandomNumber = Random.nextInt(0, 43)

    println("Нужно угадать два числа от 0 до 42 включительно. Введите первое число:")
    val userInputFirstNumber = readln().toInt()
    println("Введите второе число")
    val userInputSecondNumber = readln().toInt()

    val isFirstNumberMatched =
        userInputFirstNumber == firstRandomNumber ||
        userInputFirstNumber == secondRandomNumber

    val isSecondNumberMatched =
        userInputSecondNumber == firstRandomNumber ||
        userInputSecondNumber == secondRandomNumber

    val bothNumbersMatched =
        userInputFirstNumber to userInputSecondNumber == firstRandomNumber to secondRandomNumber ||
        userInputFirstNumber to userInputSecondNumber == secondRandomNumber to firstRandomNumber

    val result = when {
        bothNumbersMatched -> "Поздравляем! Вы выиграли главный приз!"
        isFirstNumberMatched || isSecondNumberMatched -> "Вы выиграли утешительный приз!"
        else -> "Неудача!"
    }
    println(result)
    println("Были загаданы числа: $firstRandomNumber и $secondRandomNumber")
}