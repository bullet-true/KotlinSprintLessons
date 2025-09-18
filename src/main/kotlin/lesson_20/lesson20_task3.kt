package org.example.lesson_20

fun main() {
    val closedDoor: (Player1) -> String = { player ->
        if (player.hasKey) "Игрок ${player.name} открыл дверь" else "Дверь заперта"
    }

    println(closedDoor(Player1("Bender", true)))
}

class Player1(val name: String, val hasKey: Boolean)