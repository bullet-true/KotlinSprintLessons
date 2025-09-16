package org.example.lesson_18

fun main() {
    val fox = Fox("Лиса")
    val dog = Dog("Собака")
    val cat = Cat("Кошка")

    val animals: List<Animal> = listOf(fox, dog, cat)
    animals.forEach { animal ->
        animal.eat()
    }
}

abstract class Animal(val name: String) {
    abstract fun eat()

    fun sleep() {
        println("$name -> спит")
    }
}

class Fox(name: String) : Animal(name) {
    override fun eat() {
        println("$name -> ест ягоды")
    }
}

class Dog(name: String) : Animal(name) {
    override fun eat() {
        println("$name -> ест кости")
    }
}

class Cat(name: String) : Animal(name) {
    override fun eat() {
        println("$name -> ест рыбу")
    }
}