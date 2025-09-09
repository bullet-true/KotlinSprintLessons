package org.example.lesson_12

import kotlin.random.Random

const val KELVIN_TO_CELSIUS = 273
const val DAYS_IN_MONTH = 30

fun main() {
    val monthlyWeatherList = mutableListOf<WeatherDaily>()

    repeat(DAYS_IN_MONTH) {
        val randomDayTemp = Random.nextInt(290, 320)
        val randomNightTemp = Random.nextInt(280, 290)
        val randomPrecipitation = Random.nextBoolean()
        monthlyWeatherList.add(WeatherDaily(randomDayTemp, randomNightTemp, randomPrecipitation))
    }

    printWeatherStatistics(monthlyWeatherList)
}

fun printWeatherStatistics(monthlyWeather: List<WeatherDaily>) {
    val dayTempInMonth = monthlyWeather.map { it.dayTemp }
    val nightTempInMonth = monthlyWeather.map { it.nighTemp }
    val precipitationDays = monthlyWeather.count { it.hasPrecipitation }

    val averageDayTemp = dayTempInMonth.average()
    val averageNightTemp = nightTempInMonth.average()

    println(
        """
        Средняя дневная температура: ${"%.1f".format(averageDayTemp)} °C
        Средняя ночная температура: ${"%.1f".format(averageNightTemp)} °C 
        Количество дней с осадками: $precipitationDays
    """.trimIndent()
    )
}

class WeatherDaily(
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