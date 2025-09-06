package org.example.lesson_11

fun main() {
    val bender = User(
        id = 0,
        login = "BenderRodriguez",
        password = "kill_all_humans",
        email = "shiny_metal_ass@planetexpress.com",
    )
    val fry = User(
        id = 1,
        login = "PhillipJ.Fry",
        password = "i<3Lela",
        email = "fry@planetexpress.com",
    )

    bender.printInfo()
    fry.printInfo()
}

class User(
    val id: Int,
    val login: String,
    val password: String,
    val email: String,
) {

    fun printInfo() {
        println("""
        User: $login
        ID: $id
        Password: $password
        Email: $email
    """.trimIndent()
        )
    }
}