package org.example.lesson_7

fun main() {
    println("На сколько секунд установить таймер?:")
    var userInput: Int

    do {
        userInput = readln().toIntOrNull() ?: -1
        if (userInput <= 0) println("Введите число больше 0:")
    } while (userInput <= 0)

    for (second in userInput downTo 1) {
        println("До конца осталось $second сек")
        Thread.sleep(1000)
    }
    println("Время вышло")
}