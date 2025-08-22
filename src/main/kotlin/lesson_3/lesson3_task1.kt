package org.example.lesson_3

fun main() {
    val userName = "Igor"
    var greetingText: String

    greetingText = "Good afternoon"
    printGreeting(greetingText, userName)

    greetingText = "Good evening"
    printGreeting(greetingText, userName)
}

fun printGreeting(greeting: String, name: String) {
    println("$greeting, $name!")
}