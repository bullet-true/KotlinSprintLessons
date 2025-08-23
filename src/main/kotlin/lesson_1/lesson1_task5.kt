package org.example.lesson_1

const val SECONDS_PER_HOUR = 3600
const val SECONDS_PER_MINUTE = 60

fun main() {
    val totalSecondsInSpace = 6480

    val hours = totalSecondsInSpace / SECONDS_PER_HOUR
    val minutes = (totalSecondsInSpace % SECONDS_PER_HOUR) / SECONDS_PER_MINUTE
    val seconds = totalSecondsInSpace % SECONDS_PER_MINUTE

    val time = "%02d:%02d:%02d".format(hours, minutes, seconds)
    println(time)
}