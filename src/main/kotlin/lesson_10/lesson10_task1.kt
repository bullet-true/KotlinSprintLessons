package org.example.lesson_10

import kotlin.random.Random

fun main() {
    val playerNumber = getRandomNumber()
    val aiNumber = getRandomNumber()

    println("Игрок бросает число: $playerNumber\nСкайнет бросает число: $aiNumber")
    println(getMessage(playerNumber, aiNumber))
}

fun getRandomNumber() = Random.nextInt(1, 7)

fun getMessage(player: Int, ai: Int) = when {
    player > ai -> "Победило человечество"
    player < ai -> "Победила машина"
    else -> "Победила дружба"
}