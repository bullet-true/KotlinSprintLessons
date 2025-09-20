package org.example.lesson_21

import java.io.File

fun main() {
    val file = File("test.txt")
    file.writeTextAtStart("Hello world!")
    file.writeTextAtStart("Bye")
}

fun File.writeTextAtStart(text: String) {
    if (!exists()) {
        createNewFile()
    }

    val currentText = readText()
    writeText(text.lowercase() + " " + currentText)
}