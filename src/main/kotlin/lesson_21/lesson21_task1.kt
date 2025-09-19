package org.example.lesson_21

fun main() {
    val word = "Hello word"
    println(word.vowelCount())
}

fun String.vowelCount(): Int {
    val vowels = listOf('a', 'e', 'i', 'o', 'u')
    return this.lowercase().count { it in vowels }
}