package org.example.lesson_15

fun main() {
    val guitar = Instrument("Гитара", 12)
    val guitarStrings = Component("Струны для гитары", 22)

    guitar.searchComponents()
}

abstract class Product(
    val name: String,
    val quantity: Int
)

interface Searchable {
    fun searchComponents()
}

class Instrument(name: String, quantity: Int) : Product(name, quantity), Searchable {
    override fun searchComponents() {
        println("Выполняется поиск для инструмента \"$name\"")
    }
}

class Component(name: String, quantity: Int) : Product(name, quantity)