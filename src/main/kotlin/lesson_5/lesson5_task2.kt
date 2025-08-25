package org.example.lesson_5

import java.time.LocalDate

const val AGE_OF_MAJORITY = 18

fun main() {
    val currentYear = LocalDate.now().year
    println("Введите ваш год рождения:")

    val userInput = readln().toInt()
    println(
        if (currentYear - userInput >= AGE_OF_MAJORITY) "Показать экран со скрытым контентом"
        else "Выход на главный экран"
    )
}