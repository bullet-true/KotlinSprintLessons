package org.example.lesson_20

fun main() {
    val greetings: (String) -> String = { username -> "С наступающим Новым Годом, $username!" }
    println(greetings("Fry"))
}