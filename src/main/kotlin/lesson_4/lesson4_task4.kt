package org.example.lesson_4

fun main() {
    val trainingDay = 5
    val isLegsAndBackDay = trainingDay % 2 == 0
    println(
        """
        Упражнения для рук:    ${!isLegsAndBackDay}
        Упражнения для ног:    ${isLegsAndBackDay}
        Упражнения для спины:  ${isLegsAndBackDay}
        Упражнения для пресса: ${!isLegsAndBackDay}      
    """.trimIndent()
    )
}