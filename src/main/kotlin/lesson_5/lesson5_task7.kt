package org.example.lesson_5

import java.math.BigDecimal
import java.math.RoundingMode

const val KILOMETERS_PER_FUEL_CONSUMPTION = 100

fun main() {
    println("Расчет стоимости топлива для поездки")

    println("Введите расстояние поездки (в километрах), дробные значения через точку:")
    val distance = readln().toDouble()

    println("Введите расход топлива на 100 км (в литрах), дробные значения через точку:")
    val fuelConsumption = readln().toDouble()

    println("Введите текущую цену за литр топлива (в рублях), дробные значения через точку:")
    val fuelPricePerLiter = readln().toDouble()

    val totalFuel = BigDecimal((distance * fuelConsumption) / KILOMETERS_PER_FUEL_CONSUMPTION)
        .setScale(2, RoundingMode.HALF_UP)
        .toDouble()
    val totalFuelCost = BigDecimal(totalFuel * fuelPricePerLiter)
        .setScale(2, RoundingMode.HALF_UP)
        .toDouble()

    println("Общее количество необходимого топлива: $totalFuel л.")
    println("Итоговая стоимость поездки: $totalFuelCost руб.")
}