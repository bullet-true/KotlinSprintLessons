package org.example.lesson_11

fun main() {
    val forum = Forum()

    val bender = forum.createUser("Bender")
    val fry = forum.createUser("Fry")

    forum.createNewMessage(bender.userId, "Kill all humans!")
    forum.createNewMessage(bender.userId, "Who wants to get drunk?")

    forum.createNewMessage(fry.userId, "Hi, I'm Fry! I'm from the 20th century!")
    forum.createNewMessage(fry.userId, "Where can I get some Slurm cola?")

    forum.createNewMessage(12, "----------------")

    forum.printThread()
}

data class Member(
    val userId: Int,
    val userName: String,
)

data class Message(
    val authorId: Int,
    val message: String,
)

class Forum {
    private var userId = 0
    private val members = mutableListOf<Member>()
    private val messages = mutableListOf<Message>()

    private class MemberBuilder {
        private var userId: Int = 0
        private var userName: String = ""

        fun getUserId(userId: Int) = apply { this.userId = userId }
        fun getUserName(userName: String) = apply { this.userName = userName }

        fun build() = Member(userId, userName)
    }

    private class MessageBuilder {
        private var authorId: Int = 0
        private var message: String = ""

        fun getAuthorId(authorId: Int) = apply { this.authorId = authorId }
        fun getMessage(message: String) = apply { this.message = message }

        fun build() = Message(authorId, message)
    }

    fun createUser(userName: String): Member {
        val newUser = MemberBuilder()
            .getUserId(userId++)
            .getUserName(userName)
            .build()
        members.add(newUser)
        return newUser
    }

    fun createNewMessage(userId: Int, message: String): Message? {
        if (members.any { it.userId == userId }) {
            val newMessage = MessageBuilder()
                .getAuthorId(userId)
                .getMessage(message)
                .build()
            messages.add(newMessage)
            return newMessage
        } else return null
    }

    fun printThread() {
        messages.forEach { message ->
            val user = members.find { it.userId == message.authorId }
            val userName = user?.userName
            println("$userName [id: ${user?.userId}]: ${message.message}")
        }
    }
}