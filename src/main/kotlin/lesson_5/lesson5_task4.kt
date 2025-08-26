package org.example.lesson_5

const val REGISTERED_USER_NAME = "Zaphod"
const val REGISTERED_USER_PASS = "PanGalactic"

fun main() {
    println("Введите ваше имя пользователя:")
    val userInputName = readln()

    if (userInputName != REGISTERED_USER_NAME) {
        println("Пользователь \"$userInputName\" не зарегистрирован. Пожалуйста зарегистрируйтесь.")
        return
    }

    println("Здравствуйте, $userInputName! Введите ваш пароль:")
    val userInputPassword = readln()
    if (userInputPassword == REGISTERED_USER_PASS) {
        println(
            """
            [вздыхает...] 
            Ваши данные проверены, и о, чудо, они верны... 
            Пользователь "$userInputName", вам разрешено входить на борт корабля "Heart of Gold". 
            Хотя мне всё равно... Ну вперед, войдите... Если вам так уж надо, в конце концов... 
            [меланхолический вздох...] 
            Надеюсь, вам понравится пребывание здесь больше, чем мне.
        """.trimIndent()
        )
    } else println("Неверный пароль. Доступ запрещен!")
}