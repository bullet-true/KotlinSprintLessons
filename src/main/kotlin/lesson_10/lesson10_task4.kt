package org.example.lesson_10

import kotlin.random.Random

fun main() {
    var numberOfPlayerWins = 0
    var roundCount = 1
    var playerAnswer: String

    do {
        println("Раунд $roundCount")

        val winner = playRound()
        println(getMessage(winner))

        if (winner == "player") numberOfPlayerWins++

        do {
            println("Хотите бросить кости еще раз? (да/нет):")
            playerAnswer = readln().trim().lowercase()
            val isIncorrectAnswer = playerAnswer !in listOf("да", "нет")

            if (isIncorrectAnswer) {
                println("Введите только 'да' или 'нет'.")
            }
        } while (isIncorrectAnswer)

        roundCount++

    } while (playerAnswer == "да")
    println("Игрок выиграл $numberOfPlayerWins раз(а)")
}

fun playRound(): String {
    val playerNumber = getNumber()
    val aiNumber = getNumber()
    println("Игрок бросает число: $playerNumber\nСкайнет бросает число: $aiNumber")

    return when {
        playerNumber > aiNumber -> "player"
        playerNumber < aiNumber -> "ai"
        else -> "draw"
    }
}

fun getNumber() = Random.nextInt(1, 7)

fun getMessage(winner: String) = when (winner) {
    "player" -> "Победило человечество"
    "ai" -> "Победила машина"
    else -> "Победила дружба"
}