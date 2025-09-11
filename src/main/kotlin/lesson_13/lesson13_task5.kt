package org.example.lesson_13

fun main() {
    val phoneBook = TelephoneBook()
    phoneBook.addContact()
    phoneBook.printAllContacts()
}

class TelephoneBook() {
    private val contacts = mutableListOf<Contact>()

    fun addContact() {
        println("Добавляю контакт в телефонную книгу")
        println("Введите имя:")
        val name = readlnOrNull() ?: "<не указано>"

        println("Введите номер телефона:")
        val phoneNumber: Long? = try {
            readln().toLong()
        } catch (e: Exception) {
            println("Исключение: $e")
            null
        }

        println("Введите название компании:")
        val company = readlnOrNull()?.takeIf { it.isNotBlank() }

        if (phoneNumber == null) {
            println("Неверный формат номера телефона. Запись не добавлена")
        } else {
            contacts.add(Contact(name, phoneNumber, company))
        }
    }

    fun printAllContacts() {
        contacts.forEach {
            it.printContact()
        }
    }
}

class Contact(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
    fun printContact() {
        println("Имя: $name\nНомер: $phoneNumber\nКомпания: ${company ?: "<не указано>"}")
    }
}