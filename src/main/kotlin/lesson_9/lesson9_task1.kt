package org.example.lesson_9

fun main() {
    val ingredients = listOf("beetroot", "cabbage", "potato", "carrot", "onion")
    println("В рецепте есть следующие ингредиенты: $ingredients")
    ingredients.forEach { println(it) }
}