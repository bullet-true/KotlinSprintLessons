package org.example.lesson_4

const val MIN_WEIGHT = 35
const val MAX_WEIGHT = 100
const val MAX_VOLUME = 100

fun main() {
    val firstItemWeight = 20
    val firstItemVolume = 80
    println(
        "Груз с весом $firstItemWeight кг и объемом $firstItemVolume л соответствует категории 'Average': ${
            (firstItemWeight > MIN_WEIGHT && firstItemWeight <= MAX_WEIGHT) && firstItemVolume < MAX_VOLUME
        }"
    )

    val secondItemWeight = 50
    val secondItemVolume = 100
    println(
        "Груз с весом $secondItemWeight кг и объемом $secondItemVolume л соответствует категории 'Average': ${
            (secondItemWeight > MIN_WEIGHT && secondItemWeight <= MAX_WEIGHT) && secondItemVolume < MAX_VOLUME
        }"
    )
}