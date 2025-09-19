package org.example.lesson_20

fun main() {
    val checkDoorAccess: (Player1) -> String = { player ->
        if (player.hasKey) "Игрок ${player.name} открыл дверь" else "Дверь заперта для игрока ${player.name}"
    }

    println(checkDoorAccess(Player1("Bender", true)))
    println(checkDoorAccess(Player1("Fry", false)))
}

class Player1(val name: String, val hasKey: Boolean)