package org.example.lesson_20

fun main() {
    val username = "Fry"

    val greetings: () -> String = { "С наступающим Новым Годом, $username!" }
    println(greetings())
}