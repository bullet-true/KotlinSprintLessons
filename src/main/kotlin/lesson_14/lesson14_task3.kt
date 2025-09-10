package org.example.lesson_14

const val BLACK_COLOR = "black"
const val WHITE_COLOR = "white"

fun main() {
    val listOfFigures = listOf(
        Circle(BLACK_COLOR, 2.0),
        Rectangle(WHITE_COLOR, 2.0, 3.0),
        Circle(WHITE_COLOR, 4.0),
        Rectangle(BLACK_COLOR, 5.0, 10.0)
    )

    val blackFigurePerimeterSum = listOfFigures
        .filter { it.color == BLACK_COLOR }
        .sumOf { it.calculatePerimeter() }

    val whiteFigureAreaSum = listOfFigures
        .filter { it.color == WHITE_COLOR }
        .sumOf { it.calculateArea() }

    println("Сумму периметров всех черных фигур: ${"%.1f".format(blackFigurePerimeterSum)}")
    println("Сумму площадей всех белых фигур: ${"%.1f".format(whiteFigureAreaSum)}")
}

abstract class Figure(val color: String) {
    abstract fun calculateArea(): Double
    abstract fun calculatePerimeter(): Double
}

class Circle(color: String, val radius: Double) : Figure(color) {
    override fun calculateArea(): Double = Math.PI * radius * radius

    override fun calculatePerimeter(): Double = 2 * Math.PI * radius
}

class Rectangle(color: String, val width: Double, val height: Double) : Figure(color) {
    override fun calculateArea(): Double = width * height

    override fun calculatePerimeter(): Double = (width + height) * 2
}