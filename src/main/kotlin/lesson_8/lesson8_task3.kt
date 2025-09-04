package org.example.lesson_8

fun main() {
    val ingredients = arrayOf("beetroot", "cabbage", "potato", "carrot", "onion")
    println(ingredients.joinToString(","))

    println("Какой ингредиент найти:")
    val userInput = readln().lowercase()
    val isExist = ingredients.contains(userInput)

    println(if (isExist) "Ингредиент $userInput в рецепте есть" else "Такого ингредиента в рецепте нет")
}