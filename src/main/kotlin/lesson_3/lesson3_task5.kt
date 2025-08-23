package org.example.lesson_3

fun main() {
    val str = "D2-D4;0"
    val (from, to, moveNumber) = str.split("-", ";")
    println("$from\n$to\n$moveNumber")
}