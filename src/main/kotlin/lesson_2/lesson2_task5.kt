package org.example.lesson_2

import java.util.Locale
import kotlin.math.pow

fun main() {
    val initialDeposit = 70_000
    val interestRate = 16.7
    val investmentDuration = 20

    val finalAmount = initialDeposit * (1 + interestRate / 100).pow(investmentDuration)
    val formatedFinalAmount = String.format(Locale.US, "%.3f", finalAmount)
    println("Размер вклада через $investmentDuration лет:  $formatedFinalAmount руб.")
}