package org.example.lesson_9

const val NUMBER_OF_INGREDIENTS = 5

fun main() {
    val ingredients = mutableListOf<String>()

    for (i in 1..NUMBER_OF_INGREDIENTS) {
        do {
            println("Введите $i-ый ингредиент:")
            val userInput = readln().lowercase()

            if (ingredients.contains(userInput) || userInput == "") {
                println("Такой ингредиент уже существует, либо вы ввели пустое значение")
                continue
            }

            ingredients.add(userInput)
            break

        } while (true)
    }

    ingredients.sort()
    ingredients[0] = ingredients[0].replaceFirstChar { it.uppercaseChar() }

    println("Список ингредиентов: ${ingredients.joinToString(", ")}")
}