package org.example.lesson_12

fun main() {
    val mondayWeather = WeatherData()
    val tuesdayWeather = WeatherData()

    mondayWeather.apply {
        dayTemp = 22.3
        nighTemp = 12.2
        hasPrecipitation = true
    }.printWeather()

    tuesdayWeather.apply {
        dayTemp = 30.3
        nighTemp = 20.2
        hasPrecipitation = false
    }.printWeather()
}

class WeatherData() {
    var dayTemp = 0.0
    var nighTemp = 0.0
    var hasPrecipitation = false

    fun printWeather() {
        println(
            """
            Температура днем: $dayTemp
            Температура ночью: $nighTemp
            Осадки: ${if (hasPrecipitation) "есть" else "нет"}
        """.trimIndent()
        )
    }
}