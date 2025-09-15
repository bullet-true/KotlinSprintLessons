package org.example.lesson_16

fun main() {
    val circle = CircleFigure(3.0)
    println("Площадь: %.2f".format(circle.calculateArea()))
    println("Длина окружности: %.2f".format(circle.calculateCircumference()))
}

class CircleFigure(private val radius: Double) {
    private val PI = 3.14

    fun calculateArea(): Double = PI * radius * radius

    fun calculateCircumference(): Double = 2 * PI * radius
}