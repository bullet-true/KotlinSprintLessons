package org.example.lesson_14

fun main() {
    val futuramaChat = Chat()

    futuramaChat.addMessage("Fry", "This mission is so boring!")
    futuramaChat.addThreadMessage("Leela", "Focus, Fry!", 0)

    futuramaChat.addMessage("Bender", "I’m stealing the cargo!")
    futuramaChat.addThreadMessage("Amy", "Bender, don’t!", 2)

    futuramaChat.addThreadMessage("Zoidberg", "Can we stop for fish?", 0)

    futuramaChat.addThreadMessage("Bender", "Bite my shiny metal ass!", 2)

    futuramaChat.printChat()
}

open class Message(
    val id: Int,
    val author: String,
    val text: String,
) {
    open fun getMessage(): String = "[$author]: $text   *{id = $id}"
}

class ChildMessage(
    id: Int,
    author: String,
    text: String,
    val parentMessageId: Int,
) : Message(id, author, text) {

    override fun getMessage(): String = "\t[$author]: $text   *{id = $id, parentId = $parentMessageId}"
}

class Chat() {
    private val messages = mutableListOf<Message>()
    private var idCount = 0

    fun addMessage(author: String, text: String) {
        messages.add(Message(idCount++, author, text))
    }

    fun addThreadMessage(author: String, text: String, parentMessageId: Int) {
        if (messages.any { it.id == parentMessageId }) {
            messages.add(ChildMessage(idCount++, author, text, parentMessageId))
        }
    }

    fun printChat() {
        val groupedMessages = messages.groupBy { message ->
            when (message) {
                is ChildMessage -> message.parentMessageId
                is Message -> message.id
            }
        }

        groupedMessages.forEach { (_, child) ->
            child.forEach { message ->
                if (message is ChildMessage) {
                    println(message.getMessage())
                } else println(message.getMessage())
            }
        }
    }
}