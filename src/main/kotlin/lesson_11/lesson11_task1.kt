package org.example.lesson_11

fun main() {
    val bender = User(
        id = 0,
        login = "BenderRodriguez",
        pass = "kill_all_humans",
        email = "shiny_metal_ass@planetexpress.com",
    )
    val fry = User(
        id = 1,
        login = "PhillipJ.Fry",
        pass = "i<3Lela",
        email = "fry@planetexpress.com",
    )

    bender.printInfo()
    fry.printInfo()
}

class User(
    val id: Int,
    val login: String,
    val pass: String,
    val email: String,
)

fun User.printInfo() {
    println("""
        User: ${this.login}
        ID: ${this.id}
        Password: ${this.pass}
        Email: ${this.email}
    """.trimIndent()
    )
}