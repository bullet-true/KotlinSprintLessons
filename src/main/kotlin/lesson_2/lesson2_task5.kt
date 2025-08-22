package org.example.lesson_2

import kotlin.math.pow

const val DAYS_IN_YEAR = 365

fun main() {
    val initialDeposit = 70_000
    val interestRate = 16.7
    val investmentDuration = 20
    val interestAccrualPeriodDays = 365 // период начисления процентов - в конце года

    val finalAmount = initialDeposit * (1 + (interestRate * interestAccrualPeriodDays) / (DAYS_IN_YEAR * 100)).pow(
        investmentDuration
    )
    val formatedFinalAmount = "%.3f".format(finalAmount).replace(',', '.').toDouble()
    println("Размер вклада через $investmentDuration лет:  $formatedFinalAmount руб.")
}