package org.example.lesson_17

fun main() {
    val parcel = Parcel(102, "Ufa")
    parcel.currentLocation = "Kazan"
    parcel.currentLocation = "Spb"
}

class Parcel(val number: Int, _currentLocation: String) {
    private var moveCounter: Int = 0
    var currentLocation = _currentLocation
        set(value) {
            field = value
            moveCounter++
            println("Счетчик: $moveCounter")
        }
}