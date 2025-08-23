package org.example.lesson_4

fun main() {
    val trainingDay = 5
    val isArmsAndAbsDay = trainingDay % 2 == 1
    println("""
        Упражнения для рук:    ${isArmsAndAbsDay}
        Упражнения для ног:    ${!isArmsAndAbsDay}
        Упражнения для спины:  ${!isArmsAndAbsDay}
        Упражнения для пресса: ${isArmsAndAbsDay}      
    """.trimIndent()
    )
}