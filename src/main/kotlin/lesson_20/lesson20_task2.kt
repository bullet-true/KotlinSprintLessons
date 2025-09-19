package org.example.lesson_20

fun main() {
    val useHealingPotion: (Player) -> Unit = { player ->
        player.currentHealth = player.maxHealth
        println("Восстановлено полное здоровья игроку ${player.name}. Текущее здоровье: ${player.currentHealth}")
    }

    val player = Player("Player", 10, 15)
    useHealingPotion(player)
}

class Player(val name: String, var currentHealth: Int, val maxHealth: Int)