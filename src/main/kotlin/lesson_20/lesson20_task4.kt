package org.example.lesson_20

fun main() {
    val listOfStrings = listOf("First", "Second", "Third", "Fourth", "Fifth", "Sixth")

    val transformToLambdas: (List<String>) -> (List<Unit>) = { list ->
        list.map { string -> println("Нажат элемент [$string]") }
    }

    transformToLambdas(listOfStrings.filterIndexed { index, _ -> index % 2 == 0 })
}