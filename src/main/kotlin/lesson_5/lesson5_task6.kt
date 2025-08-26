package org.example.lesson_5

import java.math.BigDecimal
import java.math.RoundingMode

const val CENTIMETERS_PER_METER = 100

fun main() {
    println("Введите ваш вес в килограммах:")
    val weight = readln().toDouble()

    println("Введите ваш рост в сантиметрах:")
    val height = readln().toFloat()

    val heightInMeters = height / CENTIMETERS_PER_METER

    val bodyMassIndex = BigDecimal(weight / (heightInMeters * heightInMeters))
        .setScale(2, RoundingMode.HALF_UP)
        .toDouble()

    val category = when {
        bodyMassIndex < 18.5 -> "Недостаточная масса тела"
        bodyMassIndex < 25.0 -> "Нормальная масса тела"
        bodyMassIndex < 30.0 -> "Избыточная масса тела"
        else -> "Ожирение"
    }

    println("Ваш ИМТ: $bodyMassIndex")
    println("Категория веса: $category")
}