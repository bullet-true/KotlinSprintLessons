package org.example.lesson_17

fun main() {
    val bender = User("bender", "kill_all_humans!")
    bender.password = "1010100111"
    println(bender.password)
    bender.login = "bender rodriguez"
}

class User(_login: String, _password: String) {

    var login = _login
        set(value) {
            field = value
            println("Логин изменен на: \"$value\"")
        }

    var password = _password
        get() = "*".repeat(field.length)
        set(value) {
            println("Вы не можете изменить пароль!")
        }
}