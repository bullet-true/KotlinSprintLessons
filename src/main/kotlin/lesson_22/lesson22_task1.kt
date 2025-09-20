package org.example.lesson_22

fun main() {
    val book1 = RegularBook("Dune", "Frank Herbert")
    val book2 = RegularBook("Dune", "Frank Herbert")
    val book3 = DataBook("Head First Kotlin", "Dawn Griffiths")
    val book4 = DataBook("Head First Kotlin", "Dawn Griffiths")

    /* По умолчанию оператор сравнения для не примитивных типов сравнивает ссылки
    * У data class автоматически генерируется equals(), который сравнивает значения свойств */

    println(book1 == book2)
    println(book3 == book4)

    // по ссылкам все ок
    println(book1 === book2)
    println(book3 === book4)
}

class RegularBook(val name: String, val author: String)

data class DataBook(val name: String, val author: String)