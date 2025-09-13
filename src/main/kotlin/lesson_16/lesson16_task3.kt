package org.example.lesson_16

fun main() {
    val user = User("bender", "kill_all_humans")
    println("Пароль корректен: ${user.validatePassword("1010011101")}")
}

class User(
    val login: String,
    private val password: String,
) {
    fun validatePassword(userInput: String): Boolean {
        return userInput == password
    }
}