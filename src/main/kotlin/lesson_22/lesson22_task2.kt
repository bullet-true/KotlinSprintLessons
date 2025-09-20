package org.example.lesson_22

fun main() {
    val book1 = RegularBook1("Dune", "Frank Herbert")
    val book2 = DataBook1("Head First Kotlin", "Dawn Griffiths")

    /* У data class метод toString() переопределяется автоматически в читаемый вариант
    *  У обычного класса вывод в виде clasName@hashCode объекта */
    println(book1)
    println(book2)
}

class RegularBook1(val name: String, val author: String)

data class DataBook1(val name: String, val author: String)