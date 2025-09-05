package org.example.lesson_8

fun main() {
    var userInput: Int
    println("Сколько ингредиентов вы хотите добавить?:")

    do {
        userInput = readln().toIntOrNull() ?: -1
        if (userInput <= 0) println("Вы ввели не число. Введите заново:")
    } while (userInput <= 0)

    println("Введите названия ингредиентов через Enter: ")
    val ingredients = Array(userInput) { readln() }
    println(ingredients.joinToString(separator = ", "))
}