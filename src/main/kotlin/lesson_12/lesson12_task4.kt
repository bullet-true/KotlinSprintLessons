package org.example.lesson_12

const val KELVIN_TO_CELSIUS_OFFSET = 273

fun main() {
    val mondayWeather = WeatherDataFourth(295, 286, true)
}

class WeatherDataFourth(
    dayTempKelvin: Int,
    nighTempKelvin: Int,
    _hasPrecipitation: Boolean
) {
    val dayTemp = dayTempKelvin - KELVIN_TO_CELSIUS_OFFSET
    val nighTemp = nighTempKelvin - KELVIN_TO_CELSIUS_OFFSET
    val hasPrecipitation = _hasPrecipitation

    init {
        printWeather()
    }

    fun printWeather() {
        println(
            """
            Температура днем: $dayTemp °C
            Температура ночью: $nighTemp °C
            Осадки: ${if (hasPrecipitation) "есть" else "нет"}
        """.trimIndent()
        )
    }
}