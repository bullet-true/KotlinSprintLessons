package org.example.lesson_9

fun main() {
    val ingredients = mutableListOf("meat", "salt", "pepper")
    println("В рецепте есть базовые ингредиенты:\n$ingredients")
    println("Желаете добавить еще?:")

    if (readln().equals("да", ignoreCase = true)) {
        println("Какой ингредиент вы хотите добавить?")
        ingredients.add(readln().lowercase())
        println("Теперь в рецепте есть следующие ингредиенты:\n$ingredients")
    }
}