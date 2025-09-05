package org.example.lesson_9

fun main() {
    var userInput: Int
    val amountPerServing = listOf(2, 50, 15)

    println("Сколько порций омлета хотите приготовить?:")
    do {
        userInput = readln().toIntOrNull() ?: -1
        if (userInput <= 0) println("Введите число порций!:")
    } while (userInput <= 0)

    val totalAmount = amountPerServing.map { it * userInput }
    println("На $userInput порций вам понадобится: Яиц – ${totalAmount[0]}, молока – ${totalAmount[1]}, сливочного масла – ${totalAmount[2]}")
}