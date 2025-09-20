package org.example.lesson_21

fun main() {
    val player = Player("Player", 10, 15)
    println(player.isHealthy())

    val secondPlayer = Player("Player", 10, 10)
    println(secondPlayer.isHealthy())
}

class Player(val name: String, var currentHealth: Int, val maxHealth: Int)

fun Player.isHealthy(): Boolean {
    return currentHealth == maxHealth
}