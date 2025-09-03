package org.example.lesson_7

fun main() {
    while (true) {
        val smsCode = (1000..9999).random()
        println("Ваш код авторизации: $smsCode \nВведите код:")

        when (readln().toIntOrNull()) {
            null -> {
                println("Вы ввели не число! Введите заново:")
                continue
            }

            smsCode -> {
                println("Код верный. Авторизация пройдена")
                return
            }

            else -> println("Неверный код. Попробуйте снова:")
        }
    }
}