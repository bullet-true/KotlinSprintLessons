package org.example.lesson_11

fun main() {
    val bender = User2(
        id = 0,
        login = "BenderRodriguez",
        pass = "kill_all_humans",
        email = "shiny_metal_ass@planetexpress.com",
    )

    bender.updateBio()
    bender.updatePass()
    bender.printInfo()
}


class User2(
    val id: Int,
    val login: String,
    var pass: String,
    val email: String,
    var bio: String = "",
) {

    fun printInfo() {
        println(
            """
        User: ${this.login}
        ID: ${this.id}
        Password: ${this.pass}
        Email: ${this.email}
        Bio: ${this.bio}
    """.trimIndent()
        )
    }

    fun updateBio() {
        println("Введите bio:")
        bio = readln()
    }

    fun updatePass() {
        println("Для изменения пароля введите текущий пароль:")
        if (readln() == pass) {
            println("Введите пароль, который хотите установить:")
            pass = readln()
        } else println("Пароль не верный")
    }
}