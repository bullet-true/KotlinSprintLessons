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

class Member private constructor(
    val userId: Int,
    val userName: String,
) {
    class Builder {
        private var userId: Int = 0
        private var userName: String = ""

        fun userId(userId: Int) = apply { this.userId = userId }
        fun userName(userName: String) = apply { this.userName = userName }

        fun build() = Member(userId, userName)
    }
}

class Message private constructor(
    val authorId: Int,
    val message: String,
) {
    class Builder {
        private var authorId: Int = 0
        private var message = ""

        fun authorId(authorId: Int) = apply { this.authorId = authorId }
        fun message(message: String) = apply { this.message = message }

        fun build() = Message(authorId, message)
    }
}

class Forum {
    private var userId = 0
    private val members = mutableListOf<Member>()
    private val messages = mutableListOf<Message>()

    fun createUser(userName: String): Member {
        val newUser = Member.Builder()
            .userId(userId++)
            .userName(userName)
            .build()
        members.add(newUser)
        return newUser
    }

    fun createNewMessage(userId: Int, message: String): Message? {
        if (members.any { it.userId == userId }) {
            val newMessage = Message.Builder()
                .authorId(userId)
                .message(message)
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