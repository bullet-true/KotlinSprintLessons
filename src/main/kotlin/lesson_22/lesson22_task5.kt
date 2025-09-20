package org.example.lesson_22

import java.util.Calendar
import java.util.Date

fun main() {
    val alphaCentauri = GalacticGuide(
        name = "Альфа Центавра",
        description = "Ближайшая к Солнечной система из трех звезд",
        distance = 4.367
    )

    val (name, description, dateTime, distance) = alphaCentauri
    println("Название места: $name")
    println("Описание места: $description")
    println("Дата и время события: $dateTime")
    println("Расстояние от Земли: $distance световых лет")
}

data class GalacticGuide(
    val name: String,
    val description: String,
    val dateTime: Date = Calendar.getInstance().time,
    val distance: Double,
)