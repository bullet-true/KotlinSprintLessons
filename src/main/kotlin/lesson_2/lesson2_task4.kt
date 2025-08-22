package org.example.lesson_2

fun main() {
    val crystalOreAmount = 7
    val ironOreAmount = 11
    val buffMultiplier = 0.2

    println("Bonus crystal ore: ${(crystalOreAmount * buffMultiplier).toInt()}")
    println("Bonus iron ore: ${(ironOreAmount * buffMultiplier).toInt()}")
}