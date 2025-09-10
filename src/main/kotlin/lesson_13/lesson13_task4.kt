package org.example.lesson_13

fun main() {
    val phoneBook = PhoneBook()
    phoneBook.addContact()
    phoneBook.addContact()
    phoneBook.printAllContacts()
}

class PhoneBook() {
    private val contacts = mutableListOf<ContactDetails>()

    fun addContact() {
        println("Добавляю контакт в телефонную книгу")
        println("Введите имя:")
        val name = readlnOrNull() ?: "<не указано>"

        println("Введите номер телефона:")
        val phoneNumber = readln().toLongOrNull()

        println("Введите название компании:")
        val company = readlnOrNull()?.takeIf { it.isNotBlank() }

        if (phoneNumber == null) {
            println("Неверный формат номера телефона. Запись не добавлена")
        } else {
            contacts.add(ContactDetails(name, phoneNumber, company))
        }
    }

    fun printAllContacts() {
        contacts.forEach {
            it.printContact()
        }
    }
}

class ContactDetails(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
    fun printContact() {
        println("Имя: $name\nНомер: $phoneNumber\nКомпания: ${company ?: "<не указано>"}")
    }
}