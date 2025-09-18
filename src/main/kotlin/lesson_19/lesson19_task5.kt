package org.example.lesson_19

const val TOTAL_PERSONS = 5

fun main() {
    val peopleCard = mutableListOf<Person>()

    println("Картотека\nВведите данные человека в формате: \"Имя Пол\" (например: Igor MALE)")
    println("Доступные значения полов: ${Gender.entries.joinToString { it.name }}")

    for (i in 1..TOTAL_PERSONS) {
        val person = validateInput()
        peopleCard.add(person)
        println("Пользователь $person добавлен")

        val remaining = TOTAL_PERSONS - i
        if (remaining > 0) {
            println("Осталось ввести $remaining человек(а)")
        }
    }

    println("\nСписок картотеки:")
    peopleCard.forEach { println(it) }
}

enum class Gender {
    MALE,
    FEMALE
}

data class Person(val name: String, val gender: Gender)

fun validateInput(): Person {
    var person: Person? = null
    do {
        val userInput = readlnOrNull()?.trim()

        if (userInput.isNullOrBlank()) {
            println("Вы ничего не ввели. Формат: Имя Пол (например: Igor MALE)")
            continue
        }

        val inputParts = userInput.split(" ")
        if (inputParts.size != 2) {
            println("Неверный формат. Нужно: Имя Пол (например: Igor MALE)")
            continue
        }

        val name = inputParts.first()
        if (name.length < 2) {
            println("Имя должно быть не короче 2 символов")
            continue
        }

        val genderInput = inputParts.last().uppercase()
        val gender = Gender.entries.find { it.name == genderInput }
        if (gender == null) {
            println("Неверный пол. Доступные значения: ${Gender.entries.joinToString { it.name }}")
            continue
        }

        person = Person(name, gender)

    } while (person == null)

    return person
}