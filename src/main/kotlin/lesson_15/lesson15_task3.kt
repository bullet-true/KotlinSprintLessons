package org.example.lesson_15

fun main() {
    val bender = StandardUser("Bender")
    val leela = Administrator("Leela")

    bender.read()
    val message = ForumMessage("Bite my shiny metal ass!")
    bender.write(message)

    leela.read()
    leela.write(ForumMessage("Bender, don’t!"))

    leela.deleteMessage(message)
    leela.deleteUser(bender)
}

abstract class ForumUser {
    abstract val username: String

    fun read() {
        println("$username читает форум")
    }

    fun write(message: ForumMessage) {
        println("$username написал(а) сообщение: \"${message.message}\"")
    }
}

class ForumMessage(val message: String)

class StandardUser(override val username: String) : ForumUser()

class Administrator(override val username: String) : ForumUser() {

    fun deleteMessage(message: ForumMessage) {
        println("$username удалил(а) сообщение: \"${message.message}\"")
    }

    fun deleteUser(user: ForumUser) {
        println("$username удалил(а) пользователя: \"${user.username}\"")
    }
}