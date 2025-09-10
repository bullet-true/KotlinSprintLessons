package org.example.lesson_13

fun main() {
    val futuramaPhoneBook = listOf(
        ContactInfo("Bender Bending Rodriguez", 79150010001, "Planet Express"),
        ContactInfo("Mom", 79150010010, "Mom's Friendly Robot Company"),
        ContactInfo("Dr. John Zoidberg", 79150010003, null),
        ContactInfo("Robot Devil", 79150010666, null),
        ContactInfo("Scruffy", 79150010012, "null"),
    )

    futuramaPhoneBook.forEach { contact ->
        contact.company?.let { company ->
            println(company)
        }
    }
}

class ContactInfo(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
    fun printContact() {
        println("Имя: $name\nНомер: $phoneNumber\nКомпания: ${company ?: "<не указано>"}")
    }
}