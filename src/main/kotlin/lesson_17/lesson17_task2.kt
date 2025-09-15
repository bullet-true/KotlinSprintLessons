package org.example.lesson_17

fun main() {
    val ship = Ship("Flying Dutchman", 10, "portless")
    ship.name = "New name"
}

class Ship(
    _name: String,
    val averageSpeed: Int,
    val homePort: String,
) {
    var name: String = _name
        set(value) {
            println("Попытка изменить на: ${value}. Имя корабля изменять нельзя!")
        }
}