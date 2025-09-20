package org.example.lesson_22

fun main() {
    val bender = Robot("Bender Bending Rodríguez", 2716057, "Bending Unit 22")

    val (name, serialNumber, model) = bender
    println("$name\n$serialNumber\n$model")
}

data class Robot(val name: String, val serialNumber: Int, val model: String)