package org.example.lesson_4

const val REQUIRED_HUMIDITY = 20
const val UNSUITABLE_SEASON = "зима"

fun main() {
    val isSunnyWeather = true
    val isTentOpen = true
    val currentHumidity = 20
    val currentSeason = "зима"

    val isConditionSuitable = isSunnyWeather && isTentOpen && currentHumidity == REQUIRED_HUMIDITY &&
            currentSeason != UNSUITABLE_SEASON
    println("Благоприятные ли условия сейчас для роста бобовых? $isConditionSuitable")
}