package org.example.lesson_4

const val TOTAL_TABLES = 13

fun main() {
    val reservedToday = 13
    val reservedTomorrow = 9

    println("Доступность столиков на сегодня: ${reservedToday < TOTAL_TABLES}")
    println("Доступность столиков на завтра: ${reservedTomorrow < TOTAL_TABLES}")
}