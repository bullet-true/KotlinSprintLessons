package org.example.lesson_5

import kotlin.random.Random

fun main() {
    val firstRandomNumber = Random.nextInt(1, 101)
    val secondRandomNumber = Random.nextInt(1, 101)
    println("Проверка на бота. Вычислите результат сложения $firstRandomNumber и $secondRandomNumber")

    val userInput = readln().toIntOrNull()
    val result = when (userInput) {
        null -> "Введено не число!"
        firstRandomNumber + secondRandomNumber -> "Добро пожаловать!"
        else -> "Доступ запрещен."
    }
    println(result)
}