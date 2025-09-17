package org.example.lesson_18

fun main() {
    val rectangularParcel = RectangularParcel(1, 2, 3)
    val cubeParcel = CubeParcel(2)

    listOf<Parcel>(rectangularParcel, cubeParcel).forEach { parcel ->
        println(parcel.calculateArea())
    }
}

abstract class Parcel {
    abstract fun calculateArea(): Int
}

class RectangularParcel(val length: Int, val width: Int, val height: Int) : Parcel() {
    override fun calculateArea(): Int = (length * width + length * height + width * height) * 2
}

class CubeParcel(val sideLength: Int) : Parcel() {
    override fun calculateArea() = sideLength * sideLength * 6
}