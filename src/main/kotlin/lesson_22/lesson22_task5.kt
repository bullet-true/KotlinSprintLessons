package org.example.lesson_22

import java.util.Calendar
import java.util.Date

fun main() {
    val alphaCentauri = GalacticGuide(
        name = "Альфа Центавра",
        description = "Ближайшая к Солнечной система из трех звезд",
        distance = 4.367
    )

    println("Название места: ${alphaCentauri.component1()}")
    println("Описание места: ${alphaCentauri.component2()}n")
    println("Дата и время события: ${alphaCentauri.component3()}")
    println("Расстояние от Земли: ${alphaCentauri.component4()} световых лет")
}

data class GalacticGuide(
    val name: String,
    val description: String,
    val dateTime: Date = Calendar.getInstance().time,
    val distance: Double,
)