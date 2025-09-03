package org.example.lesson_6

fun main() {
    println("На сколько секунд установить таймер?:")
    var userInput = readln().toIntOrNull()?.takeIf { it > 0 } ?: run {
        println("Вы ввели не положительное число секунд!")
        return
    }

    while (userInput > 0) {
        println("Осталось секунд: $userInput")
        Thread.sleep(1000)
        userInput--
    }

    println("Время вышло")
}