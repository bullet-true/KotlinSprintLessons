package org.example.lesson_11

fun main() {
    val bender = User2(
        id = 0,
        login = "BenderRodriguez",
        password = "kill_all_humans",
        email = "shiny_metal_ass@planetexpress.com",
    )

    bender.updateBio()
    bender.updatePass()
    bender.printInfo()
}


class User2(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String = "",
) {

    fun printInfo() {
        println(
            """
        User: $login
        ID: $id
        Password: $password
        Email: $email
        Bio: $bio
    """.trimIndent()
        )
    }

    fun updateBio() {
        println("Введите bio:")
        bio = readln()
    }

    fun updatePass() {
        println("Для изменения пароля введите текущий пароль:")
        if (readln() == password) {
            println("Введите пароль, который хотите установить:")
            password = readln()
        } else println("Пароль не верный")
    }
}