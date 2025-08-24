package org.example.lesson_5

import kotlin.random.Random

fun main() {
    val a = Random.nextInt(1, 101)
    val b = Random.nextInt(1, 101)
    println("Проверка на бота. Вычислите результат сложения $a и $b")

    val userInput = readln().toIntOrNull()
    val result = when (userInput) {
        null -> "Введено не число!"
        a + b -> "Добро пожаловать!"
        else -> "Доступ запрещен."
    }
    println(result)
}
