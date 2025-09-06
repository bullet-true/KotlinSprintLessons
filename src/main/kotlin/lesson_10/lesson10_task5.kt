package org.example.lesson_10

const val AUTH_LOGIN = "Bender"
const val AUTH_PASSWORD = "kill_all_humans"
const val NUMBER_CHARS_IN_TOKEN = 32


fun main() {
    val userLogin = "Bender"
    val userPass = "kill_all_humans"

    val token = authorize(userLogin, userPass)
    val userCart = getCart(token)

    if (userCart != null) {
        println("Авторизация пройдена. Список товаров:")
        println(userCart)
    } else {
        println("Неудачная авторизация")
    }
}

fun getToken(): String {
    val charsList = ('a'..'z') + ('A'..'Z') + ('0'..'9')
    return (1..NUMBER_CHARS_IN_TOKEN).joinToString("") {
        charsList.random().toString()
    }
}

fun getCart(token: String?): List<String>? {
    return if (token != null) listOf("first_item ", "second_item", "third_item") else null
}

fun authorize(userLogin: String, userPassword: String): String? {
    return if (userLogin == AUTH_LOGIN && userPassword == AUTH_PASSWORD) getToken() else null
}