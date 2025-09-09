package org.example.lesson_13

fun main() {
    val bender = PhoneContact("Bender Rodríguez", 79150010001, "Planet Express")
    bender.printContact()
}

class PhoneContact(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
    fun printContact() {
        println("Имя: $name\nНомер: $phoneNumber\nКомпания: ${company ?: "<не указано>"}")
    }
}