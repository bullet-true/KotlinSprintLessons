package org.example.lesson_16

fun main() {
    val player = Player("warrior", 8, 5)
    player.takeDamage(6)
    player.heal(2)
    player.takeDamage(8)
    player.takeDamage(10)
    player.heal(3)
}

class Player(
    val name: String,
    private var health: Int,
    private var attackPower: Int,
) {
    private var isAlive: Boolean = health > 0

    fun takeDamage(damage: Int) {
        if (!isAlive) {
            println("Игрок уже мертв. Урон не прошел")
            return
        }

        health -= damage
        println("Игрок получает $damage урона. Текущее здоровье: ${maxOf(health, 0)}")

        if (health <= 0) die()
    }

    fun heal(healAmount: Int) {
        if (!isAlive) {
            println("Игрок уже мертв. Лечение не возможно")
            return
        }

        health += healAmount
        println("Восстановлено: $healAmount здоровья. Текущее здоровье: $health")
    }

    private fun die() {
        health = 0
        attackPower = 0
        isAlive = false
        println("Потрачено.")
    }
}