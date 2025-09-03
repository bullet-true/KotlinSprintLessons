package org.example.lesson_7

fun main() {
    var userInput: Int
    println("Введите натуральное число:")

    do {
        userInput = readln().toIntOrNull() ?: -1
        if (userInput < 0) println("Вы ввели не натуральное число. Введите заново:")
    } while (userInput < 0)

    print("Все четные числа от 0 до $userInput: ")
    for (number in 0..userInput step 2) {
        print("$number ")
    }
}