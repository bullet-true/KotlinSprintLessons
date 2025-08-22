package org.example.lesson_2

const val MINUTES_PER_HOUR = 60

fun main() {
    val departureHour = 9
    val departureMinute = 39
    val travelTimeInMinutes = 457

    val arrivalTimeInMinutes = departureHour * MINUTES_PER_HOUR + departureMinute + travelTimeInMinutes
    val totalArrivalTime =
        "%02d:%02d".format(arrivalTimeInMinutes / MINUTES_PER_HOUR, arrivalTimeInMinutes % MINUTES_PER_HOUR)
    println("The train will arrive at $totalArrivalTime")
}