package org.example.lesson_6

fun main() {
    println("На сколько секунд установить таймер?:")
    val userInput = readln().toIntOrNull()?.takeIf { it > 0 } ?: run {
        println("Вы ввели не положительное число секунд!")
        return
    }

    var counter = userInput
    while (counter > 0) {
        println("Осталось секунд: $counter")
        Thread.sleep(1000)
        counter--
    }

    println("Время вышло")
}