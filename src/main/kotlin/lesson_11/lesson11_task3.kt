package org.example.lesson_11


fun main() {
    val room = Room(cover = "cover.jpg", title = "Planet Express")

    val bender = User3(username = "Bender", avatar = "bender_avatar.jpg", status = Status.SPEAKING)
    val fry = User3(username = "Fry", avatar = "fry_avatar.jpg", status = Status.MUTED)

    room.addMember(bender)
    room.addMember(fry)
    room.updateStatus("Fry", Status.MIC_OFF)
    room.printMembers()
}

data class User3(
    val username: String,
    val avatar: String?,
    var status: Status
)

class Room(
    val cover: String,
    val title: String
) {
    private val members = mutableListOf<User3>()

    fun addMember(user: User3) {
        members.add(user)
        println("Добавлен пользователь: ${user.username}")
    }

    fun updateStatus(userName: String, newStatus: Status) {
        val member = members.find { it.username == userName }
        if (member == null)
            println("Такого участника не существует")
        else {
            member.status = newStatus
            println("Статус участника $userName изменен на $newStatus")
        }
    }

    fun getMembers(): List<User3> {
        return members
    }

    fun printMembers() {
        println("Участники комнаты $title: \n$members")
    }
}

enum class Status {
    SPEAKING,
    MIC_OFF,
    MUTED
}