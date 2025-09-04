package org.example.lesson_8

fun main() {
    val ingredients = arrayOf("beetroot", "cabbage", "potato", "carrot", "onion")
    println(ingredients.joinToString(","))

    println("Какой ингредиент найти:")
    val userInput = readln().lowercase()

    var isExist = false
    for (item in ingredients) {
        if (userInput == item) {
            isExist = true
            break
        }
    }

    println(if (isExist) "Ингредиент $userInput в рецепте есть" else "Такого ингредиента в рецепте нет")
}