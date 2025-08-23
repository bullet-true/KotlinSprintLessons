package org.example.lesson_4

fun main() {
    val isSunnyWeather = true
    val isTentOpen = true
    val currentHumidity = 20
    val currentSeason = "зима"

    val isConditionSuitable = isSunnyWeather && isTentOpen && currentHumidity == 20 && currentSeason != "зима"
    println("Благоприятные ли условия сейчас для роста бобовых? $isConditionSuitable")
}