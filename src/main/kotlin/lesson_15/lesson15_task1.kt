package org.example.lesson_15

fun main() {
    val crucian = Crucian()
    crucian.swim()

    val seagull = Seagull()
    seagull.fly()

    val duck = Duck()
    duck.swim()
    duck.fly()
}

interface Flyable {
    fun fly()
}

interface Swimmable {
    fun swim()
}

class Crucian : Swimmable {
    override fun swim() {
        println("Карась плывет")
    }
}

class Seagull : Flyable {
    override fun fly() {
        println("Чайка летит")
    }
}

class Duck : Swimmable, Flyable {
    override fun swim() {
        println("Утка плывет")
    }

    override fun fly() {
        println("Утка летит")
    }
}