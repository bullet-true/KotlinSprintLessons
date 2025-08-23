package org.example.lesson_4

fun main() {
    val minWeight = 35
    val maxWeight = 100
    val maxVolume = 100

    val firstItemWeight = 20
    val firstItemVolume = 80
    println(
        "Груз с весом $firstItemWeight кг и объемом $firstItemVolume л соответствует категории 'Average': ${
            (firstItemWeight > minWeight && firstItemWeight <= maxWeight) && firstItemVolume < maxVolume
        }"
    )

    val secondItemWeight = 50
    val secondItemVolume = 100
    println(
        "Груз с весом $secondItemWeight кг и объемом $secondItemVolume л соответствует категории 'Average': ${
            (secondItemWeight > minWeight && secondItemWeight <= maxWeight) && secondItemVolume < maxVolume
        }"
    )
}