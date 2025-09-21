package org.example.lesson_21

fun main() {
    val skills: Map<String, Int> = mapOf(
        "Attack power" to 6,
        "Crit chance" to 4,
        "Crit damage" to 6,
        "Dodge chance" to 3,
    )

    println(skills.maxCategory())
}

fun Map<String, Int>.maxCategory(): String? {
    return maxByOrNull { it.value }?.key
}