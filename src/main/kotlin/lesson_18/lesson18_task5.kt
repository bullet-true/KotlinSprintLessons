package org.example.lesson_18

fun main() {

}

abstract class Figure

class Circle(val radius: Number) : Figure()

class Square(val side: Number) : Figure()

class Point : Figure()

class Screen {
    fun draw(x: Int, y: Int, figure: Figure): String {
        return when(figure) {
            is Circle -> ""
            is Square -> ""
            is Point -> ""
            else -> ""
        }
    }

    fun draw(x: Float, y: Float, figure: Figure): String {
        return ""
    }
}