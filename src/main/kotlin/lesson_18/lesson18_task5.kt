package org.example.lesson_18

fun main() {
    val screen = Screen()

    val circle = Circle(2)
    val square = Square(5.5)
    val point = Point()

    println(screen.draw(3, 8, circle))
    println(screen.draw(4, 10, square))
    println(screen.draw(6, 11, point))

    println(screen.draw(3.3f, 8.5f, circle))
    println(screen.draw(4.6f, 10.8f, square))
    println(screen.draw(6.1f, 11.4f, point))
}

abstract class Figure

class Circle(val radius: Number) : Figure()

class Square(val side: Number) : Figure()

class Point : Figure()

class Screen {
    fun draw(x: Int, y: Int, figure: Figure): String {
        return when (figure) {
            is Circle -> "Нарисован круг с радиусом ${figure.radius} в координатах ($x, $y)"
            is Square -> "Нарисован квадрат со стороной ${figure.side} в координатах ($x, $y)"
            is Point -> "Нарисована точка в координатах ($x, $y)"
            else -> "Нарисована неизвестная фигура в координатах ($x, $y)"
        }
    }

    fun draw(x: Float, y: Float, figure: Figure): String {
        return when (figure) {
            is Circle -> "Нарисован круг с радиусом ${figure.radius} в координатах ($x, $y)"
            is Square -> "Нарисован квадрат со стороной ${figure.side} в координатах ($x, $y)"
            is Point -> "Нарисована точка в координатах ($x, $y)"
            else -> "Нарисована неизвестная фигура в координатах ($x, $y)"
        }
    }
}