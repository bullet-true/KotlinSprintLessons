package org.example.lesson_12

const val KELVIN_TO_CELSIUS = 273

fun main() {
    val mondayWeather = WeatherDataThird(295, 286, true)
    mondayWeather.printWeather()
}

class WeatherDataThird(
    dayTempKelvin: Int,
    nighTempKelvin: Int,
    _hasPrecipitation: Boolean
) {
    val dayTemp = dayTempKelvin - KELVIN_TO_CELSIUS
    val nighTemp = nighTempKelvin - KELVIN_TO_CELSIUS
    val hasPrecipitation = _hasPrecipitation

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