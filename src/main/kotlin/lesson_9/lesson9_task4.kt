package org.example.lesson_9

fun main() {
    println("Напиши 5 ингредиентов для омлета, перечисленных через \", \"  (запятая с пробелом):")
    val userInput = readln().split(", ")

    val sortedList = userInput.sorted()
    println(sortedList)
}