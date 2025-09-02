package org.example.lesson_6

fun main() {
    println("Для регистрации придумайте и введите имя пользователя:")
    val userLogin = readln()

    println("Придумайте и введите пароль для $userLogin:")
    val userPass = readln()

    println("Регистрация завершена!")

    println("Для входа в приложение введите свой логин и пароль")
    var isVerified = false

    do {
        println("Введите логин:")
        val userInputLogin = readln()

        println("Введите пароль:")
        val userInputPass = readln()

        if (userInputLogin == userLogin && userInputPass == userPass) {
            isVerified = true
            println("Авторизация прошла успешно")
        } else {
            println("Неверный логин или пароль. Попробуйте снова")
        }
    } while (!isVerified)
}