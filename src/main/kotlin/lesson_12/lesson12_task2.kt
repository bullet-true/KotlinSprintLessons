package org.example.lesson_12

fun main() {
    val mondayWeather = WeatherDataSecond(22.3, 12.2, true)
    mondayWeather.printWeather()
}

class WeatherDataSecond(
    val dayTemp: Double,
    val nighTemp: Double,
    val hasPrecipitation: Boolean
) {
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