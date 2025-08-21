package org.example.lesson_1

const val TOTAL_SECONDS_IN_SPACE = 6480

fun main() {
    val hours = TOTAL_SECONDS_IN_SPACE / 3600
    val minutes = (TOTAL_SECONDS_IN_SPACE % 3600) / 60
    val seconds = TOTAL_SECONDS_IN_SPACE % 60

    val time = "%02d:%02d:%02d".format(hours, minutes, seconds)
    println(time)
}