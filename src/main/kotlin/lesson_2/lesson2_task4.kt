package org.example.lesson_2

fun main() {
    val crystalOreAmount = 7
    val ironOreAmount = 11
    val percentageBuff = 20

    println("Bonus crystal ore: ${(crystalOreAmount * percentageBuff / 100)}")
    println("Bonus iron ore: ${(ironOreAmount * percentageBuff / 100)}")
}