package org.example.lesson_3

fun main() {
    val firstName = "Татьяна"
    var lastName = "Андреева"
    val middleName = "Сергеевна"
    var age = 20
    printUser(lastName, firstName, middleName, age)

    lastName = "Сидорова"
    age = 22
    printUser(lastName, firstName, middleName, age)
}

fun printUser(lastName: String, firstName: String, middleName: String, age: Int) {
    println("$lastName $firstName $middleName, возраст: $age")
}