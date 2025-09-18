package org.example.lesson_20

fun main() {
    val healPotion: (Player) -> Unit = { player ->
        val healAmount = player.maxHealth - player.currentHealth
        player.currentHealth += healAmount
        println("Восстановлено $healAmount здоровья игроку ${player.name}")
    }

    val player = Player("Player", 10, 15)
    healPotion(player)
}

class Player(val name: String, var currentHealth: Int, val maxHealth: Int)