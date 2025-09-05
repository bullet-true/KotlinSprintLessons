package org.example.lesson_10

const val MIN_LENGTH = 4

fun main() {
    println("Введите логин")
    val login = readln()

    println("Введите пароль")
    val pass = readln()

    println(
        if (isDataValid(login) && isDataValid(pass)) "Добро пожаловать, $login"
        else "Логин или пароль недостаточно длинные"
    )
}

fun isDataValid(string: String) = string.length >= MIN_LENGTH