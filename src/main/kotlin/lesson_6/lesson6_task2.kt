package org.example.lesson_6

fun main() {
    println("На сколько секунд установить таймер?:")
    val userInput = readln().toIntOrNull()?.takeIf { it > 0 } ?: run {
        println("Вы ввели не положительное число секунд!")
        return
    }

    Thread.sleep(userInput * 1000L)
    println("Прошло $userInput секунд")
}