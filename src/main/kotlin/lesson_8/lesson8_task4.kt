package org.example.lesson_8

fun main() {
    val ingredients = arrayOf("beetroot", "cabbage", "potato", "carrot", "onion")
    println(ingredients.joinToString(separator = ",", prefix = "[", postfix = "]"))

    println("Какой ингредиент хотите заменить:")
    var isIngredientExist = false

    do {
        val userInput = readln().lowercase()
        if (ingredients.contains(userInput)) {
            isIngredientExist = true

            println("На какой ингредиент вы хотите заменить?:")
            val newIngredient = readln().lowercase()

            ingredients[ingredients.indexOf(userInput)] = newIngredient

            println(
                "Готово! Вы сохранили следующий список: ${
                    ingredients.joinToString(
                        separator = ", ",
                        prefix = "[",
                        postfix = "]"
                    )
                }"
            )
        } else {
            println("Такого ингредиента нет, введите заново:")
        }
    } while (!isIngredientExist)
}