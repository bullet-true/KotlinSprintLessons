package org.example.lesson_19

fun main() {
    println("Можно добавить следующих рыб:")
    for (fish in Fish.entries) {
        println(fish.getFishName())
    }
}

enum class Fish(private val displayName: String) {
    GUPPY("Guppy"),
    ANGELFISH("Angelfish"),
    GOLDFISH("Goldfish"),
    SIAMESE_FIGHTING_FISH("Siamese fighting fish");

    fun getFishName(): String = displayName
}