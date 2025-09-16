package org.example.lesson_18

fun main() {
    val dice4 = Dice4()
    val dice6 = Dice6()
    val dice8 = Dice8()

    val listOfDices: List<Dice> = listOf(dice4, dice6, dice8)
    listOfDices.forEach { dice ->
        dice.roll()
    }
}

abstract class Dice(val numberOfSides: Int) {
    fun roll() {
        val result = (1..numberOfSides).random()
        println("Бросок кости с числом граней $numberOfSides : $result")
    }
}

class Dice4 : Dice(4)

class Dice6 : Dice(6)

class Dice8 : Dice(8)