package org.example.lesson_19

fun main() {
    val spaceship = Spaceship("Planet Express Ship")
    spaceship.flyUp()
    spaceship.land()
}

class Spaceship(val name: String) {

    fun flyUp() {
        // TODO("здесь нужна информация о дополнительной логике")
        println("$name взлетает")
    }

    fun land() {
        TODO("нужна реализация")
    }

    fun shootAsteroid() {}
}