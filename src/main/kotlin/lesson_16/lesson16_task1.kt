package org.example.lesson_16

fun main() {
    val dice = Dice()
    dice.printNumber()
}

class Dice {
    private val number: Int = (1..6).random()

    fun printNumber() {
        println("$number")
    }
}