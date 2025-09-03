package org.example.lesson_7

fun main() {
    var isAuthorized = false

    do {
        val smsCode = (1000..9999).random()
        println("Ваш код авторизации: $smsCode \nВведите код:")

        when (readln().toIntOrNull()) {
            null -> println("Вы ввели не число! Введите заново:")

            smsCode -> {
                println("Код верный. Авторизация пройдена")
                isAuthorized = true
            }

            else -> println("Неверный код. Попробуйте снова:")
        }
    } while (!isAuthorized)
}